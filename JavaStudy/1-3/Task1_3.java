public class Task1_3 {

    public static void main(String[] args) {

        int plus = 0;
        plus = 5 + 10;

        int minus = 0;
        minus = 20 - 7;

        //10と2を乗算した値を代入する、変数multiplyを作成
        int multiply = 10 * 2;

        int remi = 0;
        remi = 20 % 6;

        //Stringクラスのtownという名前の変数を宣言し、値「有楽町」で初期化
        //Stringクラスのlineという名前の変数を宣言し、値「線」で初期化
        String town = "有楽町";
        String line = "線";

        String train = town + line;

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(remi);
        System.out.println(train);

    }
}