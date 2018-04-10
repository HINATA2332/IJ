package kroos;
class Wolf2 extends Person {
    private int age;
    private String name;
private boolean smoking;
//    public Wolf2(){
//        super();
//    }
//    public Wolf2(boolean smoking){
//        super();
//        this.smoking=smoking;
//
//    }
    public Wolf2(int age,String name){
        this.age=age;
        this.name=name;
    }
    public void imWolf2(){
        System.out.println("Circle3'm wlof");
    }

    @Override
    public void eat(){
        System.out.println("wolf eat meet");
    }
    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

//    public static void main(String[] args) {
//        Wolf2 w=new Wolf2();
//    }
}

