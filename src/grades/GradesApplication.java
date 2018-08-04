package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    public static Input input;

    public static void main(String[] args) {
        initApp();
    }

    public static void initApp() {

        HashMap<String, Student> students = populateData();

        for(Student student : students.values()) {
            System.out.println(student.getName());
            System.out.println(student.getGradeAverage());
        }

        input = new Input();
        boolean willContinue = true;

        while(true) {

                String choice = input.getString("What student would you like to see more information on?");
                System.out.println("Would you like to see another student?");

                if (!input.yesNo()) {
                    break;
                } else {
//                If the user key exists
                System.out.println(("Name: %s - Github Username: %s/n" +
                "Current Average: %f /n" + students.get(choice).getName() + " " + choice + " " + students.get(choice).getGradeAverage()));
            }

        System.out.println("Will you continue?");
        willContinue = input.yesNo();
        if(!willContinue){
            System.out.println("Goodbye, and have a wonderful day!");
        }

        }   while(willContinue);
    }



    public static String returnWelcomeMessage(HashMap<String, Student> students){
        String output = "";
        output += "Welcome!\n\n";
        output += "Here are the Github usernames of our students:\n\n";
        for (String key : students.keySet()) {
            output += "|" + key + "|";
        }
        return output.trim();
    }


    public static HashMap<String, Student> populateData() {

        HashMap<String, Student> students = new HashMap<>();

        Student s1 = new Student("Leigh");
        s1.addGrade(80);
        s1.addGrade(90);
        s1.addGrade(80);
        s1.addGrade(87);

        Student s2 = new Student("Luke");
        s2.addGrade(70);
        s2.addGrade(60);
        s2.addGrade(74);
        s2.addGrade(80);

        Student s3 = new Student("Han");
        s3.addGrade(80);
        s3.addGrade(89);
        s3.addGrade(87);
        s3.addGrade(90);

        Student s4 = new Student("Darth");
        s4.addGrade(89);
        s4.addGrade(90);
        s4.addGrade(95);
        s4.addGrade(99);

        students.put("earMuffs7", s1);
        students.put("whoismyfather09", s2);
        students.put("chewyBFF2", s3);
        students.put("whatForce78", s4);

        return students;

    }

}

//    public static void main(String[] args) {
//        HashMap<String, Student> students = new HashMap<>();
//
////        create student objects and add usernames.
//
//        Student chris = new Student ("chris", "chrisW123");
//        chris.addGrade(90);
//        chris.addGrade(60);
//        chris.addGrade(85);
//
//        Student leigh = new Student ("leigh", "leighPrin1212");
//        leigh.addGrade(75);
//        leigh.addGrade(75);
//        leigh.addGrade(75);
//
//        Student mark = new Student ("mark", "markHam2323");
//        mark.addGrade(89);
//        mark.addGrade(89);
//        mark.addGrade(89);
//
//        Student darth = new Student ("darth", "darthVad12");
//        darth.addGrade(90);
//        darth.addGrade(90);
//        darth.addGrade(90);
//
//        students.put("uerna789", chris);
//        students.put("uerna789", leigh);
//        students.put("uerna789", mark);
//        students.put("uerna789", darth);
//
//        return students;
//
//        System.out.println(students.get("userna789").getGradeAverage();
//
//    }
//
//
//    public static void initApp(){
//        HashMap<String, Student> students = populteData();
//        System.out.println(returnWelcomeMessge(students));
//    }
//
//    public static String returnWelcomeMessge(){
//        String ourput = "";
//        ourput += "Welcome!\n\n";
//
//        }
//
//}