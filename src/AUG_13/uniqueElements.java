package AUG_13;

public class uniqueElements {
	public static void main(String [] args){
		int a[] = { 4, 6, 3, 1, 5, 3, 6, 9};
		getUniqueElements(a);
	}
	public static void getUniqueElements(int a[]){
		for (int i=0; i<a.length; i++){
			int count = 0;
			if (a[i]!= -1){
				for (int j=i+1; j<a.length; j++){
					if (a[i] == a[j]){
						a[j]= -1;
						count++;
					}
				}
				if (count ==0)
					System.out.println(a[i]);
			}
		}
	}

}
