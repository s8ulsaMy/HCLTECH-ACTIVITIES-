//shift operator 


public class Activity_1 {
    public static void main(String[] args) {
        // Shifting by 32 (32 % 32 = 0)
        System.out.println("2 << 32:   " + (2 << 32));  
        System.out.println("2 >> 32:   " + (2 >> 32));   
        System.out.println("2 >>> 32:  " + (2 >>> 32));  

        // Shifting by 33 (33 % 32 = 1)
        System.out.println("2 << 33:   " + (2 << 33));   
        System.out.println("2 >> 33:   " + (2 >> 33));   
        System.out.println("2 >>> 33:  " + (2 >>> 33));  
    }
}