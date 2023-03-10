package Com.generic;

import java.lang.reflect.Array;
import java.util.function.Predicate;

public class CustomeList<E> implements IList<E> {
	private int initialCapacity = 6;
	private int size;
	private E[] elements;

	public CustomeList() {
		elements = createGenericArray(initialCapacity);
	}

	public CustomeList(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException("Length should be greater than 0");
		}
	}

	@Override
	public boolean add(E e) {
		if (size < initialCapacity) {
			elements[size++] = e;
			return true;
		}
		elements = grow(size + initialCapacity);
		elements[size++] = e;
		return true;
	}

	private E[] grow(int newSize) {
		E[] newElements = createGenericArray(newSize);
		for (int i = 0; i < size; i++) {
			newElements[i] = elements[i];
		}
		return null;
	}

	@Override
	public boolean remove(E e) {
		return false;
	}

	@Override
	public boolean remove(int i) {
		return false;
	}

	@Override
	public E get(int i) {
		if(i < 0 || i == size) {
			throw new ArrayIndexOutOfBoundsException("Length over " + size);
		}
		return elements[i];
	}

	@Override
	public E set(int i, E e) {
		return elements[i] = e;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}

	@SuppressWarnings("unchecked")
	private E[] createGenericArray(int size) {
		return (E[]) Array.newInstance(Object.class, size);

	}

	@Override
	public void show() {
		for (int i = 0; i < size; i++) {
			System.out.println(elements[i]);
		}
	}

	@SuppressWarnings("unused")
	@Override
	public int count(Predicate<E> predivate) {
		int count = 0;
		for(int i = 0; i < size; i++) {
			E element = elements[i];
			if(predivate.test(element)) {
				count++;
			}
			return 0;
		}
		return 0;
	}

}
