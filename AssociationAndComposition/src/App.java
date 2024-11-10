public class App {
    public static void main(String[] args) throws Exception {
        ClassA c1= new ClassA();
        c1.setObject(new Spring());

        boolean status = c1.getTheCourse(54.87);

        if (status) {
            System.out.println("done");
        } else {
            System.out.println("not done");
        }
    }
}
