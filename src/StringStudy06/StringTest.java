package StringStudy06;

public class StringTest {
    public static void main(String[] args) {
        String text = "abc";
        text += "你好!";   //可以自串串接
        System.out.println(text);
        System.out.println(text.length());  //字串長度
        System.out.println("等於abc你好!"+text.equals("abc你好!"));  //比較字串中字元是否一樣
        System.out.println(text.toUpperCase());  //轉大寫
        System.out.println(text.toLowerCase());  //轉小寫
        //int int1 = Integer.parseInt(text);  //轉int格式，但不能亂用，最好是在String時，就是數字了

        String text1 = "中興通訊股份有限公司（簡稱中興通訊或中興；英語：\n"
                      +"Zhongxing Telecommunication Equipment Corporation，\n"
                      +"常簡稱為：ZTE；深交所：000063、港交所：763），是一家中國大陸\n"
                      +"跨國科技公司，於1985年成立。總部在廣東深圳。";
        System.out.println("字串內容:");
        for (int i = 0; i < text1.length(); i++) {    //傳回指定所引自元
            System.out.print(text1.charAt(i));
        }
        System.out.println();

        System.out.println(text1.indexOf("中興"));  //第一個找到位置
        System.out.println(text1.lastIndexOf("中興"));  //最後一個找到位置

        char[] charArr = text1.toCharArray();
        System.out.println("字元Array內容:");  //將字串轉成字元陣列
        for (int i = 0; i < charArr.length; i++) {
            System.out.print(charArr[i]);
        }
        System.out.println();

        String[] filenames = {"caterpillar.jpg", "cater.gif",
                "bush.jpg", "wuwu.jpg", "clockman.gif"};
        for (int i = 0; i < filenames.length; i++) {  //過濾出副檔名為jpg的檔案
            if (filenames[i].endsWith("jpg")){
                System.out.println(filenames[i]+", ");
            }
        }

        String  text2 = "";

        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            text2 += i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("執行時間:"+(endTime-beginTime));

        StringBuilder builder = new StringBuilder("");
        beginTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            builder.append(String.valueOf(i));   //可以不必寫這樣，用builder.append(i)可以大幅縮短執行時間
        }
        endTime = System.currentTimeMillis();
        System.out.println("執行時間:"+(endTime-beginTime));

//        System.out.println("讀入的引述:");
//        for(String arg:args){
//            System.out.println(arg+" ");
//        }
//        System.out.println();

        String[] text3 = {"中興通訊股份有限公司（簡稱中興通訊或中興；英語：",
                "Zhongxing Telecommunication Equipment Corporation，",
                "常簡稱為：ZTE；深交所：000063、港交所：763），是一家中國大陸",
                "跨國科技公司，於1985年成立。總部在廣東深圳。"};
        for (String i:text3){
            String[] tokens = i.split("，");
            for (String token:tokens){
                System.out.print(token+"，|");
            }
            System.out.println();
        }

    }
}
