package c0916_classes;

public class TosterDriver {
    public static void main(String[] args) {
        Toaster t1 = new Toaster(true, "red", 100);
        
        // t1.operationStaus = true;
        // t1.color = "red";
        // t1.setCurrentTemp(300);
        // System.out.println(t1.getOperationStatus());
        // System.out.println(t1.getColor());
        // System.out.println(t1.getCurrentTemp());
        
        System.out.println(t1);
        
        Toaster t2 = new Toaster(false, "orage", 60);
        System.out.println(t2);
    }
}
