package Chap02.Number07;

public class MemberMain {
    public static void main(String[] args) {

        Member member = new Member("myId", "kim");
        member.print();
        member.changeDate("myId2", "seo");
        member.print();

    }
}