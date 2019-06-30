package Main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyRegex {
    private final String pattern = "^([0-2]?[0-5|(?<!2)6-9]?[0-5|(?<![2-9]\\D)6-9])\\.([0-2]?[0-5|(?<!2)6-9]?[0-5|(?<![2-9]\\D)6-9])\\.([0-2]?[0-5|(?<!2)6-9]?[0-5|(?<![2-9]\\D)6-9])\\.([0-2]?[0-5|(?<!2)6-9]?[0-5|(?<![2-9]\\D)6-9])$";
    private final String stringAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private final String[] testCases = {
            "000.12.12.034",
            "121.234.12.12",
            "23.45.12.56",
            "00.12.123.123123.123",
            "122.23",
            "Hello.IP"};

    private String generateValidIp() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(getRandomIntString());
            if (i < 3) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    private String getRandomIntString() {
        StringBuilder sb = new StringBuilder();

        // add pseudo-random num of leading zeros
        int padding = (int) (Math.random()*3);
        for (int i = 0; i < padding; i++) {
            sb.append("0");
        }
        sb.append((int) (Math.random()*255));
        return sb.toString();
    }

    private String generateInvalidIp() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i ++) {
            sb.append(generateString());
            if (i < 3) {
                sb.append("."); // still has correct # and placement of dots but other test cases will not always
            }
        }
        return sb.toString();
    }

    private String generateString() {
        StringBuilder sb = new StringBuilder();
        int length = (int) (Math.random()*5);
        for (int i = 0; i < length; i++) {
            char c = stringAlphabet.charAt((int) (Math.random() * stringAlphabet.length()));
            sb.append(c);
        }
        return sb.toString();
    }

    public void runTestCases() {
        for (String testCase : testCases) {
            runTestCase(testCase);
        }
    }

    public boolean runTestCase(String testCase) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(testCase);
        if (m.matches()) {
            System.out.println("match at " + testCase);
            System.out.println("true");
            return true;
        } else {
            System.out.println("no match at " + testCase);
            System.out.println("false");
            return false;
        }
    }

    public int getTestCaselength() {
        return testCases.length;
    }

    public String[] getTestCases() {
        return testCases;
    }
}
