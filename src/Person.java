
    public class Person {
        private final String name="Mayuri";
        private final int age=26;



        public String getName() {

            return name;
        }

        public int getAge() {

            return age;
        }

        @Override
        public String toString() {

            return "Person [name=" + name + ", age=" + age + "]";

        }
        public static void main(String args[]) {
            Person person=new Person();
            System.out.println(person);
        }
    }
//output
//Person [name=Mayu, age=25]

