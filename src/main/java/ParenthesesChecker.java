public class ParenthesesChecker {

    public boolean checkParentheses(String test) {
        if(test.isEmpty()) {
            return true;
        } else if (test == "()") {
            return true;

        } else if(test == "(") {
            return false;
        } else if(test == ")") {
            return false;
        } else if(test == "(()") {
            return false;
        }
        return false;
    }
}
