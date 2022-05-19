package practise;

public class CollegeStudent extends Student {
   
    public void show(){
          System.out.println("college Student details.");
    }

    
    public static void main(String args[]){
     CollegeStudent obj = new CollegeStudent();
     obj.show();
     Student s = new Student();
     s.show();
    		 
    }
}