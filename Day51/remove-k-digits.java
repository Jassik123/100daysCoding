class Solution {
    public String removeKdigits(String num, int k) {
         Stack<Character> st = new Stack<>();
        for (char digit : num.toCharArray()) {
            while (k > 0 && !st.isEmpty() && digit < st.peek()) {
                st.pop();
                k--;
            }
            st.push(digit);
        }
        while (k > 0 && !st.isEmpty())
        
            st.pop();
            k--;
        }
        StringBuilder temp = new StringBuilder();
        while (!st.isEmpty()) {
            temp.append(st.pop());
        }
        temp.reverse();
        int m = temp.length();
        StringBuilder result = new StringBuilder();
        int found = 0;
        for (int i = 0; i < m; i++) {
            if (temp.charAt(i) == '0' && found == 0) {
                continue;
            } else {
                result.append(temp.charAt(i));
                found = 1;
            }
        }
        if (result.length() == 0) {
            result.append('0');
        }
        return result.toString();
    }
}