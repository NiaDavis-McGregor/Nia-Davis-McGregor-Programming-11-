public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){

        int answer = 0;
        int index = s.length();

        for (int x = 0; index > 0; x++) {
            switch (s.substring(index - 1, index)) {
                case "a":
                    answer++;
                    break;
                case "e":
                    answer++;
                    break;
                case "i":
                    answer++;
                    break;
                case "o":
                    answer++;
                    break;
                case "u":
                    answer++;
                    break;
            }
            index--;
        }

        return answer;
    }

    //Code you problem number two here
    static int problemTwo(String s){

        int answer = 0;
        int index = s.length() - 3;
        int a = s.length() - 2;

        for (int x = 0; a > 0; x++) {
            if (s.substring(index, index + 3).equals("bob")) {
                answer++;
            }
            index--;
            a--;
        }

        return answer;
    }

    //Code your solution to problem number 3 here
    static String problemThree(String s){

        String answer = "";
        String changeAns = "";
        char charOne;
        char charTwo;
        int answerLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                charOne = s.charAt(i - 1);
                charTwo = s.charAt(i);
                if (changeAns.length() >= answerLength && charOne <= charTwo) {
                    answer = changeAns + charTwo;
                }
                break;
            }

            changeAns += s.substring(i, i + 1);
            charOne = s.charAt(i);
            charTwo = s.charAt(i + 1);
            if (charTwo >= charOne) {
                if (changeAns.length() > answerLength) {
                    answer = changeAns;
                    answerLength = changeAns.length();
                }
            } else if (answerLength < changeAns.length()) {
                answer = changeAns;
                answerLength = changeAns.length();
                changeAns = "";
            } else {
                changeAns = "";
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s = "hijklabcdefg";
        System.out.println(problemThree(s));
    }
}
