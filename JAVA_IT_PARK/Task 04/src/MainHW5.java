public class MainHW5 {
    public static void main(String[] args) {
        int [] array = {2, 129, -158, -15, 65, 110};

        int maxNum = array [0];
        for (int i : array) {
            if (i > maxNum)
                maxNum = i;
            }
        int minNum = array [0];
        for (int i : array) {
            if (i < minNum)
                minNum = i;
            }
        System.out.println("Максимальное число = " + maxNum + "\n" + "Минимальное число = " + minNum);
    }
}
