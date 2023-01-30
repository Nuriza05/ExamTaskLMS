package peaksoft;

import peaksoft.entity.Course;
import peaksoft.entity.Instructor;
import peaksoft.entity.Lesson;
import peaksoft.entity.Task;
import peaksoft.services.*;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        CourseService course = new CourseServiceImpl();
        InstructorService instructor = new InstructorServiceImpl();
        LessonService lesson = new LessonServiceImpl();
        TaskService task = new TaskServiceImpl();

//            ~~~~~1~~~
//                    System.out.print("Write the course name: ");
//                    String name = sc.next();
//                    System.out.print("Write the duration: ");
//                    int dur = sc.nextInt();
//                    System.out.print("Write the create at date: ");
//                    LocalDate crt = LocalDate.of(sc.nextInt(),sc.nextInt(),sc.nextInt());
//                    System.out.print("Write the image link: ");
//                    String iLink = sc.next();
//                    System.out.print("Write the description: ");
//                    String desc = sc.next();
//                    System.out.println(course.saveCourse(new Course(name, dur, crt, iLink, desc)));
//               ~~2~~~~
//                    System.out.print("Write the course id: ");
//                    Long id = sc.nextLong();
//                    System.out.println(course.getCourseById(id));
//            ~~~~~~3~~~~~~~~
//                    System.out.print("Choose the asc or desc: ");
//                    String aod = sc.next();
//                    System.out.println(course.getAllCourse(aod));
//               ~~~~~~~~4~~~~~~
//                    System.out.print("Write the course id that you want change: ");
//                    Long id = sc.nextLong();
//                    System.out.print("Write the new course name: ");
//                    String name = sc.next();
//                    System.out.print("Write the new duration: ");
//                    int dur = sc.nextInt();
//                    System.out.print("Write the create new at date: ");
//                    LocalDate crt = LocalDate.of(sc.nextInt(),sc.nextInt(),sc.nextInt());
//                    System.out.print("Write the new image link: ");
//                    String iLink = sc.next();
//                    System.out.print("Write the new description: ");
//                    String desc = sc.next();
//                    System.out.println(course.updateCourse(id, new Course(name, dur, crt, iLink, desc)));
//              ~~~~~~~~~4~~~~~~`
//                    System.out.print("Write the course id: ");
//                    Long id = sc.nextLong();
//                    System.out.println(course.deleteCourseById(id));
 //              ~~~~~5~~~~
//                    System.out.print("Write the course name: ");
//                    String name = sc.next();
//                    System.out.println(course.getCourseByName(name));
//                ~~~~~7~~~
//                    System.out.print("Write the first name: ");
//                    String fName = sc.next();
//                    System.out.print("Write the last name: ");
//                    String lName = sc.next();
//                    System.out.print("Write the email: ");
//                    String email = sc.next();
//                    System.out.print("Write the phone number: ");
//                    String phn = sc.next();
//                    System.out.println(instructor.saveInstructor(new Instructor(fName, lName, email, phn)));
//                ~~~~8~~~~~~~
//                    System.out.print("Write the instructor id that you want change: ");
//                    Long id = sc.nextLong();
//                    System.out.print("Write the new first name: ");
//                    String fName = sc.next();
//                    System.out.print("Write the new last name: ");
//                    String lName = sc.next();
//                    System.out.print("Write the new email: ");
//                    String email = sc.next();
//                    System.out.print("Write the new phone number: ");
//                    String phn = sc.next();
//                    System.out.println(instructor.updateInstructor(id, new Instructor(fName, lName, email, phn)));
//             ~~~~~~9~~~~~~
//                    System.out.print("Write the instructor id: ");
//                    Long id = sc.nextLong();
//                    System.out.println(instructor.getInstructorById(id));
//              ~~~~~10~~~~``
//                    System.out.print("Write the course id: ");
//                    Long id = sc.nextLong();
//                    System.out.println(instructor.getInstructorsByCourseId(id));
//              ~~~~~11~~~~~
//                    System.out.print("Write the instructor id: ");
//                    Long id = sc.nextLong();
//                    System.out.println(instructor.deleteInstructorById(id));
//              ~~~~~12~~~~~~
//                    System.out.print("Write the course id: ");
//                    Long id = sc.nextLong();
//                    System.out.print("Write the instructor id: ");
//                    Long id1 = sc.nextLong();
//                    System.out.println(instructor.assignInstructorToCourse(id, id1));
//              ~~~~~13~~~~~`
//                    System.out.print("Write the course id: ");
//                    Long id = sc.nextLong();
//                    System.out.print("Write the lesson name: ");
//                    String name = sc.next();
//                    System.out.print("Write the video link: ");
//                    String vd = sc.next();
//                    System.out.println(lesson.saveLesson(id, new Lesson(name, vd)));
//               ~~~~~~14~~~~~~
//                    System.out.print("Write the lesson id that you want change: ");
//                    Long id = sc.nextLong();
//                    System.out.print("Write the new lesson name: ");
//                    String name = sc.next();
//                    System.out.print("Write the new video link: ");
//                    String vd = sc.next();
//                    System.out.println(lesson.updateLesson(id, new Lesson(name, vd)));
//               ~~~~~15~~~~~~
//                    System.out.print("Write the lesson id: ");
//                    Long id = sc.nextLong();
//                    System.out.println(lesson.getLessonById(id));
//               ~~~~16~~~~~~~
//                    System.out.print("Write the course id: ");
//                    Long id = sc.nextLong();
//                    System.out.println(lesson.getLessonsByCourseId(id));
//                ~~~~17~~~~
//                    System.out.print("Write the task name: ");
//                    String tas = sc.next();
//                    System.out.print("Write the deadline: ");
//                    LocalDate dd = LocalDate.of(sc.nextInt(),sc.nextInt(), sc.nextInt());
//                    System.out.print("Write the task: ");
//                    String tass = sc.next();
//                    System.out.println(task.saveTask(new Task(tas, dd, tass)));
//               ~~~~~~~18~~~~`
//                    System.out.print("Write the task id that you want change: ");
//                    Long id = sc.nextLong();
//                    System.out.print("Write the new task name: ");
//                    String name = sc.next();
//                    System.out.print("Write the new deadline: ");
//                    LocalDate dd = LocalDate.of(sc.nextInt(),sc.nextInt(), sc.nextInt());
//                    System.out.print("Write the new task: ");
//                    String tasks = sc.next();
//                    System.out.println(task.updateTask(id, new Task(name, dd, tasks)));
//              ~~~~~~~19~~~~
//                    System.out.print("Write the task id: ");
//                    Long  tId = sc.nextLong();
//                    System.out.print("Write the lesson id: ");
//                    Long  lId = sc.nextLong();
//                    System.out.println(task.assignTaskToLesson(lId, tId));
//              ~~~~~20~~~~~~`
//                    System.out.print("Write the lesson id: ");
//                    Long id = sc.nextLong();
//                    System.out.println(task.getAllTaskByLessonId(id));
//               ~~~~~21~~~~~~
//                    System.out.print("Write the task id: ");
//                    Long id = sc.nextLong();
//                    System.out.println(task.deleteTaskById(id));
    }
}
