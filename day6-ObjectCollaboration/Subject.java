public class Subject {

    private String sub_teacherName;
    private int sub_code;

    public Subject(){
    }

    public Subject(String sub_teacherName, int sub_code){
        this.sub_teacherName=sub_teacherName;
        this.sub_code=sub_code;
    }

    public String getSub_teacherName(){
        return sub_teacherName;
    }
    public void setSub_teacherName(String sub_teacherName){
        this.sub_teacherName=sub_teacherName;
    }

    public int getSub_code(){
        return sub_code;
    }
    public void setSub_code(int sub_code){
        this.sub_code=sub_code;
    }

    @Override
    public String toString(){
        return
                "subject's teacher_name "+ sub_teacherName+" "+
                        "subject's code"+ sub_code;
    }
}
