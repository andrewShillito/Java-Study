package main;

/**
 *
 */
public class main
{
    public static void main( String[] args ) {
        testNumberToWords();
    }

    public static void testNumberToWords() {
//        System.out.println(NumberToWords.getDigitCount(123));
//        System.out.println(NumberToWords.getDigitCount(1));
//        System.out.println(NumberToWords.getDigitCount(12));
//        System.out.println(NumberToWords.reverse(123));
//        System.out.println(NumberToWords.reverse(1));
//        System.out.println(NumberToWords.reverse(120));
//        System.out.println(NumberToWords.reverse(102));
//        System.out.println(NumberToWords.reverse(-102));
        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1230);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(-1230);
    }

}
