package grades;

//Create a Student class
//
//Create a class named Student. It should have private properties for the student's name, and grades. The grades property should be an list of integers--need to set up an ArrayList<Integer>


import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;





//The student class should have a constructor that sets name property, and initializes the grades property as an empty list.



    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

////The Student class should have the following methods:
////// returns the student's name
////public String getName();
////// adds the given grade to the grades property
////public void addGrade(int grade);
////// returns the average of the students grades
////public double getGradeAverage();

//    returns the student's name

    public String getName(){
        return name;
    }
//adding the given grade to the grades property no need for return.
    public void addGrade(int grade) {
        grades.add(grade);

    }
//returns the average of the students grades
    public double getGradeAverage() {
//        return 0;

        int sum = 0;
//        since we are finding the grade use in for student; loop thru grades sum +=
        for (int student : grades){
            sum += student;
        }
//        return the sum & divide by the array of grades---grades.size().
        return (sum/grades.size());
    }


 //Test your Student class by adding a main method and creating Student objects. Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.
//instiating when you are adding new student tom

//    public static void main(String[] args) {
////        can als use Student student = new Student();
//        Student tom = new Student("Tom");
//
////        can use student.addGrade(90);
//        tom.addGrade(85);
//        tom.addGrade(98);
//        tom.addGrade(75);
////        for Tom to get the array of Grades tom.grades
//        System.out.println(tom.grades);
////        calling out the average---tom.getGradeAverage.
//        System.out.println(tom.getGradeAverage());
//
//        Student sara = new Student("sara");
//        sara.addGrade(95);
//
//        Student matt = new Student("matt");
//        matt.addGrade(90);
//
//    }





}
