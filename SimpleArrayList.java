package simpleArrayList;

//import java.util.Iterator;

public class SimpleArrayList implements ISimpleArrayList {
	private int size = 0;
	private Object[] objects = new Object[1];

	public SimpleArrayList() {

	}

	@Override
	public void add(Object object) {
		for (int i = 0; i < objects.length; i++) {
			if (objects[i] == null) {
				objects[i] = object;
			}
		}
		size++;
		objects = extendArraySize(objects);
	}

	@Override
	public void add(int index, Object element) {
		if (objects[index] == null) {
			objects[index] = element;
		}
		size++;
		objects = extendArraySize(objects);

	}

	private Object[] extendArraySize(Object[] array) {
		Object[] temp = array.clone();
		int extendSize = size() + 1;
		array = new Object[extendSize];
		System.arraycopy(temp, 0, array, 0, temp.length);
		return array;
	}

	@Override
	public Object get(int index) {
		return objects[index];
	}

	@Override
	public void remove(Object object) {

		if (object == null) {
			throw new IllegalStateException("Can't delete null element ");
		}
		if (contains(object)) {
			for (int i = 0; i < size(); i++) {
				if (objects[i].equals(object)) {
					objects = changedRemoveArray(objects, i);
					size--;
				}
			}
		}
	}

	private Object[] changedRemoveArray(Object[] array, int index) {
		Object[] tempBefore = new Object[index];
		System.arraycopy(array, 0, tempBefore, 0, index);
		System.out.println(tempBefore.length);

		Object[] tempAfter = new Object[size() - index];
		System.arraycopy(array, index, tempAfter, 0, tempAfter.length);
		System.out.println(tempAfter.length);

		array = new Object[size()];
		System.arraycopy(tempBefore, 0, array, 0, tempBefore.length);
		System.arraycopy(tempAfter, 0, array, index, tempAfter.length);
		return array;
	}

	@Override
	public boolean contains(Object object) {
		for (int i = 0; i < size(); i++) {
			if (object.equals(objects[i])) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

}
