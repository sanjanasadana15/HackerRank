import java.util.Scanner;

public  class subjectMarks {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String language = scanner.next();
            int score = scanner.nextInt();
            System.out.printf("%-15s%03d%n", language, score);
        }
        System.out.println("================================");
        
       // scanner.close();
            
    }
}
#   H a c k e r R a n k  
 