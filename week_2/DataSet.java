public class DataSet
{
	public DataSet (Measurer pMeasurer)
	{
		_measurer = pMeasurer;
		_sum = 0;
		_count = 0;
		_max = null;
		_filter = null;
	}
	/*public DataSet(Filter pFilter)
	{
		_filter = pFilter;
		_sum = 0;
		_count = 0;
		_max = null;
		_measurer = null;
	}*/
	public DataSet(Measurer pMeasurer, Filter pFilter)
	{
		_filter = pFilter;
		_sum = 0;
		_count = 0;
		_max = null;
		_measurer = pMeasurer;
	}
	public void add(Object x)
  {
		if(_filter == null || (_filter != null && _filter.accept(x)))
		{
			_sum += _measurer.measure(x);
	    if (_count == 0 || _measurer.measure(_max) <_measurer.measure(x))
					_max = (Measurable)x;
			_count++;
	}

  }
	public float getAverage()
	{
		if(_count == 0)
		return 0;
		else
		return _sum / _count;
	}
  public Measurable getMaximum()
  {
		return _max;
  }
	public int getCount()
	{
		return _count;
	}
  private float _sum;
  private Measurer _measurer;
	private Filter _filter;
	private Measurable _max;
  private int _count;
}
