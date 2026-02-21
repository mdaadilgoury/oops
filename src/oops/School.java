package oops;

class Student {

    String name;
    int mark1, mark2, mark3;

    Student(String n, int m1, int m2, int m3){
        this.name = n;
        this.mark1 = m1;
        this.mark2 = m2;
        this.mark3 = m3;
        System.out.println("Your name is " + name);
    }

    int totalMarks(){
        return mark1 + mark2 + mark3;
    }

    double percentage(){
        return totalMarks() / 3.0;
    }

    void showResult(){
        System.out.println("Total Marks: " + totalMarks());
        System.out.println("Percentage: " + percentage());

        if (percentage() >= 40){
            System.out.println("Result: PASS");
        }
        else {
            System.out.println("Result: FAIL");
        }
    }
}

public class School {
    public static void main(String[] args) {

        Student s1 = new Student("Aadil", 78, 78, 45);
        s1.showResult();

    }
}