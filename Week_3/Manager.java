public class Manager extends Employee{
  private String _department;
  public Manager(String pName, double pSalary, String pDepartment)
  {
    super(pName,pSalary);
    _department = pDepartment;
  }
  public String toString()
  {
    return "Manager " + super.toString() + " in department "+ _department;
  }
}
