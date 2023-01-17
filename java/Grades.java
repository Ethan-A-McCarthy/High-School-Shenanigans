/*Ethan McCarthy
Assignment J8
5/9/2022
Comp Sci 120*/
import java.io.*;
class Student{ //blueprint class for the method and student constructor
    String firstName;
    double quiz1, quiz2, quiz3, quiz4, quiz5, quizAve;
    double midtermMarks, midtermPercent;
    double finalExam, finalExamPercent;
    double finalMark;
    String letterGrade;

    Student(String sFirstIn, Integer sQuiz1In, Integer sQuiz2In, Integer sQuiz3In, Integer sQuiz4In, Integer sQuiz5In, Integer sMidIn, Integer sFinalIn){//constructor for student
        firstName = sFirstIn;
        quiz1 = sQuiz1In;
        quiz2 = sQuiz2In;
        quiz3 = sQuiz3In;
        quiz4 = sQuiz4In;
        quiz5 = sQuiz5In;
        midtermMarks = sMidIn;
        finalExam = sFinalIn;
    }

    void Math(){ //method to calculate the number and letter grades
        quizAve = (quiz1 + quiz2 + quiz3 + quiz4 + quiz5) / 50;//adds up the quizes and makes it a decimal
        midtermPercent = midtermMarks / 25;//makes the midterm grade a decimal
        finalExamPercent = finalExam / 25;//makes the final grade a decimal
        finalMark = ((quizAve * 0.5) + (midtermPercent * 0.25) + (finalExamPercent * 0.25)) * 100;//calculates the final mark in decimal then multiplies by 100 to make it a percent

        if (finalMark >= 90){//if the final mark is 90 or above its an A
            letterGrade = "A";
        }
        else if (finalMark >= 80 && finalMark < 90){//80-89 is a B
            letterGrade = "B";
        }
        else if (finalMark >= 70 && finalMark < 80){//70-79 is a C
            letterGrade = "C";
        }
        else if (finalMark >= 60 && finalMark < 70){//60-69 is a D
            letterGrade = "D";
        }
        else if (finalMark < 60){//less than 60 is an F
            letterGrade = "F";
        }

        System.out.println(firstName +"'s Number Grade: " + finalMark);
        System.out.println(firstName + "'s Letter Grade: " + letterGrade);
        //outputs the letter and number grade
    }
}

public class Grades{
    public static void main(String[] args){//main class


        Student Ethan = new Student("Ethan", 10, 10, 10, 10, 10, 25, 25);//constructs the students
        Student Majd = new Student("Majd", 9, 9, 9, 9, 9, 24, 24);
        Student Logan = new Student("Logan", 0, 9, 4, 8, 7, 25, 25);
        Student Lucy = new Student("Lucy", 10, 9, 10, 9, 10, 20, 20);
        Student Alex = new Student("Alex", 5, 2, 3, 5, 7, 10, 7);

        Ethan.Math();//calls on the Math method to calculate the grades
        Majd.Math();
        Logan.Math();
        Lucy.Math();
        Alex.Math();
    }
}