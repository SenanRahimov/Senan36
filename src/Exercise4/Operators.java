package Exercise4;

public class Operators {
    public static void main(String[] args) {
        int a = 8;
        a = ++a * ((a / 3 + 2) % 5);
        System.out.println(a);
        /*1ci moterizenin ici hesablanir 8/3 cvb2 +2 ,4 edir 4u 5e bolende qaliq 0 edir 0 vurulsun istenilen eded
        0 edir . yeni 0 vur 9  cvb 0
        */



        int x = 9, y = 4;
        x += ++x % (y-- / 2) + 7;
        System.out.println(x);
        /*
        x=x+ ++9 %(y--/2)+7 bura da ise 9+ 10%(4/2)+7
        sonra ise 9+ 10u 2 e boldukde qaliq 0 dusur bu zaman 9+0+7 qalir neticede cvb ise 16 edir


         */

    }
}
