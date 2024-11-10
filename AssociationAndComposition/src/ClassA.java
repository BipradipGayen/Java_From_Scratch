public class ClassA {
    private Icourse ic;
    public void setObject(Icourse ic)
    {
        this.ic = ic;
    }
    public boolean getTheCourse(Double amt){
        // DevOps d = new DevOps();  this is tightly coupled because if that class is modified or deleted, this method will be directly affected
        
        // we should be able to call these classes without directly relying on them for loose coupling
        return(ic.getTheCourse(amt));
    }
}
