class stack {
    char [] s = new char[100];
    int top = -1;

    void push(char x) {
        String valid = "{}[]()0123456789+-*/";
        if (valid.indexOf(x) == -1) {
            System.out.println("Error: Invalid character.");
        }
        else if (top == 99) {
            System.out.println("Stack full");
        }
        else {
            s[++top] = x;
        }
    }

    int size() {
        return top + 1;
    }

    char top() {
        if (isEmpty()) {
            System.out.println("Empty Stack");
            return 0;
        }

        else {
            char element = s[top];
            return element;
        }
    }

    char pop() {
        if (isEmpty()) {
            return 0;
        }

        else {
            char element = s[top];
            top--;
            return element;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        
        else {
            return false;
        }
    }

    void print() { // used this to ensure the stack was working
        for (int i = 0; i <= size(); i++) {
                System.out.print(s[i]);
        }
    }

    

    public static void main(String []args) {
            stack s = new stack();

            // Test 1
            String str = "(9*[3*{[(3+3)/5]*7}])";

            for (int i = 0; i < str.length(); i++) {
                s.push(str.charAt(i));
            }

            s.print();

            for (int i = 0; i <= str.length(); i++) {
                s.pop();
            }

            // Test 2

            str = "((3*(9-(4*(6-5))))";

            for (int i = 0; i < str.length(); i++) {
                s.push(str.charAt(i));
            }

            s.print();

            for (int i = 0; i < str.length(); i++) {
                s.pop();
            }
     }
}


 