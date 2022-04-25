package mylist_Generic;

public class MyList<T> {
	private T[] array;

	public MyList() {
		this.array = (T[]) new Object[10];
	}

	public MyList(int capacity) {
		this.array = (T[]) new Object[capacity];
	}


	public int size() {
		int count=0;
		for (int i=0;i<this.array.length;i++) {
			if (this.array[i] != null) {
				count++;
			}
		}
		return count;
	}
	
	public int getCapacity() {
		return this.array.length;
	}
	
	public void add(T data) {
		int nullCounter=0;
		for (int i=0 ; i<this.array.length;i++) {
			if (this.array[i] == null) {
				this.array[i] = data;
				nullCounter++;
				break;
			}
		}
		if(nullCounter==0) {
			T[] temp = this.array;
			temp = (T[]) new Object[this.array.length*2];
			for (int i=0 ; i<this.array.length;i++) {
				temp[i] = this.array[i];
			}
			temp[this.array.length] = data;
			this.setArray(temp);
		}
		
	}
	
	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	public T get(int index) {
		return this.array[index];
	}
	
	public void remove(int index) {
		if(this.array[index] != null) {
			for(int i=index;i<this.array.length-1;i++) {
				this.array[i]=this.array[i+1];
			}
		}else {
			System.out.println("Null");
		}
	}
	
	public void set(int index,T data) {
		if(this.array[index] != null) {
			this.array[index] = data;
		}else {
			System.out.println("Null");
		}
	}
	
	public String toString() {
		
		String array="[";
		for(int i=0;i<this.array.length-1;i++) {
			if(this.array[i] != null) {
				array += this.array[i];
				if(this.array[i+1] != null) {
					array +=",";
				}
				
			}
			
		}
		if(this.isEmpty() != true && this.array[this.array.length-1] != null) {
			array+=this.array[this.array.length-1];
		}
		
		array+="]";
		
		return array;
	}
	
	public int indexOf(T data) {
		for(int i=0;i<this.array.length;i++) {
			if(this.array[i] == data) {
				return i;
			}
		}
		
		return -1;
	}
	
	public int lastIndexOf(T data) {
		int index=-1;
		for(int i=0;i<this.array.length;i++) {
			if(this.array[i] == data) {
				index = i;
			}
		}
		
		if(index == -1) {
			return -1;
		}
		
		return index;
		
	}
	
	public boolean isEmpty() {
		int nullCounter=0;
		for(int i=0;i<this.array.length;i++) {
			if(this.array[i] != null) {
				nullCounter++;
			}
		}
		
		if(nullCounter==0) {
			return true;
		}
		
		return false;
	}
	
	public T[] toArray() {
		return this.getArray();
	}
	
	public void clear() {
		T[] array = (T[]) new Object[this.array.length];
		this.setArray(array);
	}
	
	public boolean contains(T data) {
		for(int i=0;i<this.array.length;i++) {
			if(this.array[i] == data) {
				return true;
			}
		}
		
		return false;
	}
	
	public MyList<T> subList(int start,int finish){
		MyList<T> newMylist = new MyList<>();
		T[] newArray = (T[]) new Object[(finish-start)+1];
		for(int i=start; i<= finish ;i++) {
			newArray[i]=this.array[i];
		}
		
		newMylist.setArray(newArray);
		
		return newMylist;
	}
}
