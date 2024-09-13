package c0913_refactoring;

public class CStyleLoops {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            System.out.println(i);
        }

        printSeperator();
        int j=1;
        for(; j<=10;) {
            System.out.println(j);
            j++;
        }

        printSeperator();
        int k=1;
        for(; ;) {
            if (k<=10) {
                System.out.println(k);
            }
            else {
                break;
            }
            k++;
        }
    }

    public static void printSeperator() {
        System.out.println();
        System.out.println("===== ===== =====");
    }
}
