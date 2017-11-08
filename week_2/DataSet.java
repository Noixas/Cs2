public class DataSet
{
	public DataSet (Measurer pMeasurer)
	{
		_measurer = pMeasurer;
		_sum = 0;
		_count = 0;
		_max = null;
		_filter = null;
		_minComp = null;
		_maxComp = null;
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
		_minComp = null;
		_maxComp = null;

	}
	public DataSet()
	{
		_filter = null;
		_sum = 0;
		_count = 0;
		_max = null;
		_measurer = null;
		_minComp = null;
		_maxComp = null;

	}
	public void add(Object x)
  {
		//If there is a filter then use it to see if we accept the object
		if((_measurer != null) && ( _filter == null || (_filter != null && _filter.accept(x))))
		{
			_sum += _measurer.measure(x);
	    if (_count == 0 || _measurer.measure(_max) <_measurer.measure(x))
					_max = (Measurable)x;
			_count++;
		}
		else//if no measurer then we use the comparable interface
		{
			if(x instanceof Comparable)
			{
				Comparable comp = (Comparable) x;
				if(_maxComp == null && _minComp == null){
					_maxComp = comp;
					_minComp = comp;
				}
				else{
					if(comp.compareTo(_maxComp)> 0) _maxComp = comp;//Check if new object is biggest
					if(comp.compareTo(_minComp) < 0) _minComp = comp;//Check if new object is the smallest one
				}
			}
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
	public Comparable getMaxComparable()
	{
		return _maxComp;
	}
	public Comparable getMinComparable()
	{
		return _minComp;
	}
  private float _sum;
  private Measurer _measurer;
	private Filter _filter;
	private Measurable _max;
  private int _count;
	private Comparable _minComp;
	private Comparable _maxComp;

}
