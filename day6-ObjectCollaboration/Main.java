public class Main {
    public static void main(String[] args) {
        Student student=new Student();
        School school =new School();
        Subject subject=new Subject();

        subject.setSub_code(105);
        subject.setSub_teacherName("Amit");

        school.setSubject(new Subject("Ashutosh",123));
        System.out.println(school.getSubject());


        System.out.println(subject.getSub_code()+" "+ subject.getSub_teacherName());


    }
}
