package AbstractStudy08;

public abstract class AbstractGuessGame {
    private int number;

    public void setNumber(int number){
        this.number = number;
    }

    public void start(){
        System.out.println("歡迎:");
        int guess = 0;
        do{
            guess = getUserInput();
            if(guess>number){
                showMessage("輸入數字太大!");
            } else if (guess<number) {
                showMessage("輸入數字太小!");
            }else {
                showMessage("猜中");
            }
        }while (guess != number);
    }

    protected abstract void showMessage(String message);
    protected abstract int getUserInput();
}
