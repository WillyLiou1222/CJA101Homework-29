package AbstractStudy08;

public class RequestDemo {
    public static void doRequest(IRequest request){
        request.execute();
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int n = (int)(Math.random()*10)%2;
            switch (n){
                case 0:
                    doRequest(new HelloRequest("Willy Liou"));
                case 1:
                    doRequest(new WelcomeRequest("雅虎奇摩"));
            }
        }
    }
}
