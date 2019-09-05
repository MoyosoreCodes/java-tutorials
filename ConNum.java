public class ConNum{
public static void main(String args[]) {
     int a = 1234;
        String b = "1234";

        int c = 555;
        
           String d = Con(a);
            Int e = Con(b);

            System.out.println("do you need proof?? well then: " + c+d, c+e);
}

    public static void Con(int a) {
        String str = Integer.toString(a);
        
        System.out.println(" '" + str +"' " + " as a String ");  
    }

    public static void Con(String b) {
        int num = Integer.parseInt(b);

        System.out.println( num + " as an integer");
    }
}