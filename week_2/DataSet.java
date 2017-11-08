public class DataSet
{
	public DataSet (Measurer pMeasurer)
	{
		_measurer = pMeasurer;
	}
	public void add(Object x)
  {
		_sum += _measurer.measure(x);
    if (_count == 0 || _measurer.measure(_max) <_measurer.measure(x))
				_max = (Measurable)x;
		_count++;

  }
	public float getAverage()
	{
		return _sum / _count;
	}
  public Measurable getMaximum()
  {
		return _max;
  }
  private float _sum;
  private Measurer _measurer;
	private Measurable _max;
  private int _count;
}
