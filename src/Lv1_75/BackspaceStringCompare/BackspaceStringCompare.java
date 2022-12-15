package Lv1_75.BackspaceStringCompare;

import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s_st = new Stack<>();
        Stack<Character> t_st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '#' && !s_st.isEmpty()) {
                s_st.pop();
            } else if(c != '#') {
                s_st.push(c);
            }
        }

        for (char c : t.toCharArray()) {
            if (c == '#' && !t_st.isEmpty()) {
                t_st.pop();
            } else if(c != '#') {
                t_st.push(c);
            }
        }

        return s_st.equals(t_st);
    }
}