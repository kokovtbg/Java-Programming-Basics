package WhileLoopMore;


import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String codeWord = scan.nextLine();
        String wordPhrase = "";
        String codeNCO = "";
        int counterN = 0;
        int counterC = 0;
        int counterO = 0;
        while (!codeWord.equals("End")) {
            if (codeWord.equals("n")) {
                if (counterN >= 1 && (codeNCO.charAt(0) == 'n' || codeNCO.charAt(1) == 'n')) {
                    wordPhrase = wordPhrase + "n";
                }
                codeNCO = codeNCO + "n";
                counterN++;
            }
            if (codeWord.equals("c")) {
                if (counterC >= 1 && (codeNCO.charAt(0) == 'c' || codeNCO.charAt(1) == 'c')) {
                    wordPhrase = wordPhrase + "c";
                }
                codeNCO = codeNCO + "c";
                counterC++;
            }
            if (codeWord.equals("o")) {
                if (counterO >= 1 && (codeNCO.charAt(0) == 'o' || codeNCO.charAt(1) == 'o')) {
                    wordPhrase = wordPhrase + "o";
                }
                codeNCO = codeNCO + "o";
                counterO++;
            }
            if (counterN == 1 && counterC == 1 && counterO == 1) {

                counterN = 0;
                counterC = 0;
                counterO = 0;
                wordPhrase = " ";
                codeNCO = "";
            }
            if (!codeWord.equals("n") && !codeWord.equals("\\") && !codeWord.equals("c") && !codeWord.equals("o") && !codeWord.equals("`") && !codeWord.equals("~") && !codeWord.equals("!") && !codeWord.equals("@") && !codeWord.equals("#") && !codeWord.equals("$") && !codeWord.equals("%") && !codeWord.equals("^") && !codeWord.equals("&") && !codeWord.equals("*") && !codeWord.equals("(") && !codeWord.equals(")") && !codeWord.equals("_") && !codeWord.equals("-") && !codeWord.equals("+") && !codeWord.equals("=") && !codeWord.equals("[") && !codeWord.equals("]") && !codeWord.equals("{") && !codeWord.equals("}") && !codeWord.equals(";") && !codeWord.equals(":") && !codeWord.equals("'") && !codeWord.equals(".") && !codeWord.equals("/")) {
                wordPhrase = wordPhrase + codeWord;
            }

               // wordPhrase = wordPhrase + codeWord;
            codeWord = scan.nextLine();
        }
        System.out.println(wordPhrase);
    }
}
