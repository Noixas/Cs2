public class Employee {
  private String _name;
  private double _salary;
  public Employee (String pName, double pSalary)
  {
    _name = pName;
    _salary = pSalary;
  }
  public String getName()
  {
    return _name;
  }
  public double getSalary()
  {
    return _salary;
  }
  public String toString()
  {
    return "Employee "  + getName() + " earns " + getSalary() + " euros";
  }
}
