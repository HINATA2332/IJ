package exercise.exercise;

public class TestInterface
{
    public static void main(String[] args) {
IWorkFactory t=new StudentWorkFactory();
t.getWork().doWork();
    }
}
class StudentWorkFactory implements IWorkFactory{
    @Override
    public Work getWork(){
        return new StudentWork();
    }
}
class TeacherWorkFactory implements  IWorkFactory{
    @Override
    public Work getWork(){
        return new TeacherWork();
    }
}
interface IWorkFactory{
    Work getWork();
}

class TeacherWork implements Work{
    @Override
    public  void  doWork(){
        System.out.println("老师批改作业");
    }
}
class StudentWork implements Work{
@Override
 public    void doWork(){
    System.out.println("学生写作业");
}
}
 interface     Work{
void doWork();
}