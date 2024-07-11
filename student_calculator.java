import java.util.Scanner;
public class student_calculator {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total number of subjects:");
        int numSubjects = sc.nextInt();
        int totalMarks = 0;
        for(int i=1; i<=numSubjects;i++){
            System.out.println("Enter marks for subject" + i +"(out of 100)");
            int marks = sc.nextInt();
            
        

        while(marks <0 || marks > 100){
            System.out.println("invalid marks. please  enter between 0 & 100");
            System.out.println("enter marks for subject "+ i + "out of 100");
            marks = sc.nextInt();

        }
        totalMarks += marks;
    }
    System.out.println("Student Result");
    System.out.println("Total marks obtained in all subjets:"+ totalMarks);
    int Averagepercentage = totalMarks/ numSubjects;
    System.out.println("Avergeparcentage is:"+ Averagepercentage);
   
    if(Averagepercentage >=90){
        System.out.println("your grade: A+");
        
    }
   else if(Averagepercentage >=80){
        System.out.println("your grade: B+");
        
    }
   else if(Averagepercentage >=70){
        System.out.println("your grade: B");
        
    }
   else if(Averagepercentage >=60){
        System.out.println("your grade: C+");
        
    }
   else if(Averagepercentage >=50){
        System.out.println("your grade: C");
        
    }
  else  if(Averagepercentage >=40){
        System.out.println("your grade: D+");
        
    }
   else if(Averagepercentage >=30){
        System.out.println("your grade: D");
        
    }
    else{
        System.out.println("your grade: E");
        
    }
    }
    
}
