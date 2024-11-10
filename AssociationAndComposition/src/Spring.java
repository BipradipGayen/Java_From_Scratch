public class Spring implements Icourse {

    @Override
    public Boolean getTheCourse(Double amount) {
        System.out.println("Spring course is purchased, fees payed is" + amount);
        return true;
    }
    
}
