public class Task1_5 {

    public static void main(String[] args) {

        String[] fluits = {"みかん","りんご","ぶどう","メロン"};
        for (int i = 0; i < fluits.length; i++) {
            System.out.println(fluits[i]);
        }

        //int型を宣言し、変数名 i で、値「1」で初期化
        //1から100までの数字を出力
        //100までの数字出力後、改行
        int i = 1;
        while(i <= 100) {
            System.out.print(i);
            i++;
        }
        System.out.println();


        for (int a = 1; a <= 9; a++) {
            System.out.print(a + " || ");
            
            for (int j =1; j <= 9; j++) {
            
                System.out.print((a*j) +" | ");
            }
            System.out.println();
            
        }
    }
}