public class Student {
    String name;
    int rollNo;
    double percent;
    final String schoolName = "BBPS";
    int numberOfStudent =100 ;


    //  public Student(String name, int rollNo, double percent) {
    //     this.name = name;
    //     this.rollNo = rollNo;
    //     this.percent = percent;
    //  }

    // getter and setter function
    // public int getAge(){
    //     return age;
    // }

    // public int setAge(int ageOfStu){
    //     age = ageOfStu;
    //     return age;
    // }


    // Contructor Function

    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Abhimanyu";
        s1.percent = 40;
        s1.rollNo = 10;
        System.out.println(s1.name);
        System.out.println(s1.schoolName);;
        System.out.println(s1.numberOfStudent);
    }



    // Static keyword
    

}
