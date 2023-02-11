class Main {
    static boolean isBalanced (String s) {
        stack brackets = new stack();

        for (int i = 0; i < s.length(); i++) { 
            char current = s.charAt(i); 
            if (current == '{' || current == '[' || current == '(') { 
                brackets.push(current); 
            } 

            else if (current == '}' || current == ']' || current == ')') {
                if (brackets.isEmpty()) {
                    return false;
                }

                if (current == ')' && brackets.pop() != '(') {
                    return false;
                }

                else if (current == '}' && brackets.pop() != '{') {
                    return false;
                }

                else if (current == ']' && brackets.pop() != '[') {
                    return false;
                }
            }
        } 

        if (s.isEmpty()) {
            return true;
        }

        else {
            return false;
        }
        
    }

    static void checkLanguage(String s) {
        stack zeroes = new stack();

        for (int i = 0; i < s.length(); i++) { 
            char current = s.charAt(i); 
            if (current == '0') { 
                zeroes.push(current); 
            } 

            else if (current == '1') {
                if (zeroes.isEmpty()) {
                    System.out.println("No");
                    return; 
                }
            zeroes.pop();
            }
        } 

        if (zeroes.isEmpty()) {
            System.out.println("Yes");
            return;
        }

        else {
            System.out.println("No");
        }
    }

    public static void main(String []args) {
        /*System.out.println(isBalanced("(9*[3*{[(3+3)/5]*7}])"));
        System.out.println(isBalanced("((3*(9-(4*(6-5))))"));
        System.out.println(isBalanced("{3*(2+[3-[4/[6/9]]]})"));
        System.out.println(isBalanced("{2-{3*{6/[[[(((9-0)))]]]}}/7}"));
        System.out.println(isBalanced("{2-{3+4]]}}"));

        checkLanguage("01");
        checkLanguage("000111");
        checkLanguage("00000001111111");
        checkLanguage("0011");
        checkLanguage("10");
        checkLanguage("00");
        checkLanguage("00111");
        checkLanguage("0101");
        checkLanguage("00110");*/

        System.out.println(isBalanced("((((((((((()"));
    }
}