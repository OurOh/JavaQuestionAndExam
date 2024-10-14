package Chap02.Number07;

public class Member {

    private final String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = id;

    }

    public void changeDate(String id, String name) {
        //this.id = id
        this.name = name;
    }

    public void print(){
        System.out.println("id:" + id + ", name:" + name);

    }

}
