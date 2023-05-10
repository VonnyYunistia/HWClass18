package HWClass18;

public class Teacher {

    String name;
    int workYear;
    String subject;

    public Teacher(String name, int workYear, String subject) {
        this.name = name;
        this.workYear = workYear;
        this.subject = subject;
    }

    void printInfo(){
        System.out.println("Teacher "+this.name+" has been working here "+workYear+" years and Subject is "+subject);
    }

    void gradeSubject(){
        System.out.println("Teacher "+this.name+"will grade the test of "+subject+"before end of semester");
    }

    void homeWork(){
        System.out.println("Teacher "+this.name+"will grade the "+subject+" homework before end of semester");
    }

    void quizWeekly(){
        System.out.println("Teacher "+this.name+"will give quiz for "+subject+" as per the teaching "+workYear+" experience ");
    }


   class MathTeacher extends Teacher{

       public MathTeacher(String name, int workYear, String subject) {
           super(name, workYear, subject);
       }

       @Override
       void printInfo() {
           super.printInfo();
       }
   }

      class ChemistryTeacher extends Teacher{


          public ChemistryTeacher(String name, int workYear, String subject) {
              super(name, workYear, subject);
          }

          @Override
          void gradeSubject() {
              super.gradeSubject();
          }
      }

      class PianoTeacher extends Teacher{


          public PianoTeacher(String name, int workYear, String subject) {
              super(name, workYear, subject);
          }

          @Override
          void quizWeekly() {
              super.quizWeekly();
          }
      }



   }







