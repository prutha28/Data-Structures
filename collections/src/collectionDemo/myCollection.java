package collectionDemo;

import java.util.Collection;
import java.util.Iterator;

public class myCollection<String> implements Collection<String>{

	@Override
	public boolean add(String arg0) {
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends String> arg0) {
		return false;
	}

	@Override
	public void clear() {
	
	}

	@Override
	public boolean contains(Object arg0) {
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public Iterator<String> iterator() {
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		return false;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public Object[] toArray() {
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		return null;
	}

}
