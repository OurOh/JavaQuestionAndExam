package Chap02.Number09.overridng;

public class Child extends Parent{

        public String value = "child";

        @Override
        public void method() {
            System.out.println("Child.method");
        }


}
