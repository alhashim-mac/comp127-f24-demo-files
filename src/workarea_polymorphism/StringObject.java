package workarea_polymorphism;

public class StringObject {
    public static void main(String[] args) {
        String str1 = "str1";
        Object str2 = str1;
        System.out.println(str1);
        System.out.println(str2);
        
        Object str3 = "str3";
        String str4 = (String) str3;
        System.out.println(str3);
        System.out.println(str4);
    }
}
