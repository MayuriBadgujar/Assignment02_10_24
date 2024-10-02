/*
  Suppose a class 'A' has a static method to print "Parent". Its subclass 'B' also has a
  static method with the same name to print "Child". Now call this method by the objects of the two
  classes. Also,
   call this method by an object of the parent class referring to the child class i.e. A obj=new B()
 */
public class A {
    static void print() {
        System.out.println("Parent");
    }

    static class B extends A {
        static void print() {
            System.out.println("Child");
        }
    }

    public static class Main {
        public static void main(String[] args) {

            A.print(); //  Parent
            B.print(); //  Child


            A obj = new B();
            obj.print(); //  Parent
        }
    }
}
