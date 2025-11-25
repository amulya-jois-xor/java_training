//encapsulation

public class Student {
    
    public String name;

    
    private int marks;
    public Student(String name) {
        this.name = name;
        this.marks = 0; 
    }

    
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
            System.out.println("Marks updated successfully.");
        } else {
            System.out.println("Invalid marks! Please enter between 0 and 100.");
        }
    }

    
    public int getMarks() {
        return this.marks;
    }

    public void checkResult() {
        if (marks >= 35) {
            System.out.println(name + " has passed with " + marks + " marks.");
        } else {
            System.out.println(name + " has failed with " + marks + " marks.");
        }
    }

    public static void main(String[] args) {
        
        Student s1 = new Student("Amulya");

        // Try direct access (will fail)
        // s1.marks = 90; // This will give an error because marks is private

        
        s1.setMarks(85);

        
        System.out.println("Marks of " + s1.name + ": " + s1.getMarks());

        
        s1.checkResult();
    }
}
