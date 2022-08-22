import java.sql.*;

public class BookList {
    Connection con; // java.sql 의 Connection 객체

    public BookList() {
        String Driver = "";
        String url = "jdbc:mysql://localhost:3306/madang?&serverTimezone=Asia/Seoul"; // 자바 드라이버 이름, 호스트명, 포트번호
        String userid = "madang"; // 관리자
        String pwd = "madang"; // 비밀번호

        try { /* 드라이버 찾기 과정 */
            Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이버 이름을 입력하여 드라이버 로딩
            System.out.println("드라이버 로드 성공");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try { /* 드라이버 연결 과정 */
            System.out.println("데이터베이스 연결 준비..");
            con = DriverManager.getConnection(url, userid, pwd); // 1. DriverManager 이용하여 접속객체 con 생성
            System.out.println("데이터베이스 연결 성공");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void sqlRun() {
        String query = "SELECT * FROM Book"; // 수행할 sql문

        try { /* 데이터베이스에 질의 결과를 가져오는 과정 */
            Statement stmp = con.createStatement(); // 2. Statement 객체 생성
            ResultSet rs = stmp.executeQuery(query); // 3. ResultSet 객체 생성 - 실행결과 포함
            System.out.println("BOOK NO \tBOOK NAME \t\tPUBLISHER \tPRICE");
            while(rs.next()) {
                System.out.print("\t" + rs.getInt(1));
                System.out.print("\t" + rs.getString(2));
                System.out.print("\t\t" + rs.getString(3));
                System.out.println("\t" + rs.getInt(4));
            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BookList so = new BookList();
        so.sqlRun();
    }

}
