public class DevOps implements Icourse {

    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("Devops course is purchased, fees payed is " + amount);
        return true;
    }
    
}
