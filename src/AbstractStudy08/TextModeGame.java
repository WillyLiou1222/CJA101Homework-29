package AbstractStudy08;

import java.util.Scanner;

public class TextModeGame extends AbstractGuessGame{
    private Scanner src;

    public TextModeGame(){
        src = new Scanner(System.in);
    }

    @Override
    protected void showMessage(String message) {
        for (int i = 0; i < message.length()*2; i++) {
            System.out.print("*");
        }
        System.out.println("\n"+message);
        for (int i = 0; i < message.length()*2; i++) {
            System.out.print("*");
        }
    }

    @Override
    protected int getUserInput() {
        System.out.println("\n輸入數字:");
        return src.nextInt();
    }
}
