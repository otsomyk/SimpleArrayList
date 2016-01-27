package simpleArrayList;

public interface ISimpleArrayList {

	public void add(Object object);

	public void add(int index, Object element);

	public Object get(int index);

	public void remove(Object object);

	public boolean contains(Object object);

	public int size();

	public boolean isEmpty();

}
