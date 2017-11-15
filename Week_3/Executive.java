public class Executive extends Manager {
  public Executive(String pName, double pSalary, String pDepartment)
  {
    super(pName,pSalary, pDepartment);
  }
  public String toString()
  {
    return "Executive "+ super.toString();
  }
}
