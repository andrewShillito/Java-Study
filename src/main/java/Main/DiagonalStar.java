package Main;

public class DiagonalStar {

    public static String printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return "Invalid Value";
        }
        String ans = "";
        String row;

        String commaSeparatedString = ""; // for testing

        for (int i = 1; i <= number; i++) { // i is rows
            row = ""; // build each row
            for (int j = 1; j <= number; j++) { // j is columns
                if (i == 1 || i == number) {
                    row += "*";
                } else if (j == 1 || j == number) {
                    row += "*";
                } else if (i == j) {
                    row += "*";
                } else if (j == (number - i + 1)) {
                    row += "*";
                } else {
                    row += " ";
                }
            }
            ans += row;
            commaSeparatedString += row;
            if (i != number) {
                ans += "\n";
                commaSeparatedString += ", ";
            }
        }
        System.out.println(ans);
        return commaSeparatedString;
    }
}
