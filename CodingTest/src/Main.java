import lv0.Lv0;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {2, 4, 7};
        int answer = 0;
        answer = Lv0.lv0_1(a,b);
        answer = Lv0.lv0_2(a , 2);
        int[] answer2 = Lv0.lv0_3(2,10);
        for (int i : answer2) {
            System.out.println(i);
        }
        String rn = Lv0.lv0_4("ddrmrn");
    }
}