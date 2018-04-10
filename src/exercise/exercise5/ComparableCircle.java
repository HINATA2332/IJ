package exercise.exercise5;

public class ComparableCircle extends Circle3 implements CompareObject{

    @Override
    public int compareTo(Object o) {
        if(this==o){
        return 0;
        }
        else if(o instanceof ComparableCircle){
            ComparableCircle c=(ComparableCircle) o;
                if(this.getRaduis()>c.getRaduis()){
                    return 1;
                }else if(this.getRaduis()<c.getRaduis()){
                    return  -1;
                }
                else {
                    return 0;
                }
        }
        else{

            throw new RuntimeException("传入数据错误");
        }

    }

}
