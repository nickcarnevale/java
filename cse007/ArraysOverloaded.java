/* Nick Carnevale
 * Mrs. Kalafut
 * CSE7
 * 4/5/22
 * 
 * This program helps me practice writing overloaded methods and increases my knowledge of arrays
 */

public class ArraysOverloaded {

	//this method determines if two arrays are equal
	public static boolean equals(int[] list1, int[]list2) {
		int counter = 0;
		if(list1.length == list2.length) {
			for(int i: list1) {
				for(int j: list2) {
					if(i == j) {
						counter++;
					}	
				}
			}
			if(counter == list1.length) {
				return true;
			}
			else return false;
		}
		else {
			return false;
		}
		
	}

	//this method determines if two 2d arrays are equal
	public static boolean equals(int[][] list1, int[][]list2) {
		int counter = 0;
		int counter2 = 0;
		if(list1.length == list2.length) {
			for(int i = 0; i < list1.length; i++) {
				if(list1[i].length == list2[i].length) {
					for(int a = 0; a<list1.length;a++) {
						for(int b = 0; b<list1[a].length;b++) {
							if(list1[a][b]==list2[a][b]) {
								counter++;
							}
						}
					}
				}
			}
		
			for(int i=0; i<list1.length; i++) {
			counter2 += list1[i].length;
		}
			counter2 *= list1.length;
			if(counter == counter2) {
				return true;
			}
		
		}
		return false;
	}
	
	//this method joins two arrays together
	public static int[] join(int[]list1, int[]list2) {
		int[] joined = new int[list1.length+list2.length];
		
		for(int i = 0; i < list1.length; i++) {
			joined[i] = list1[i];
		}
		for(int i = list1.length; i < (list1.length+list2.length);i++){
			joined[i]=list2[i-list1.length];
		}
		return joined;
	}
	
	//this method joins two 2d arrays together
	public static int[][] join(int[][]list1, int[][]list2) {
		int [] [] joined = new int[list1.length][];
        for(int i = 0; i < joined.length;i++){
            joined[i] = new int[list1[i].length+ list2[i].length];
            int index;
            for(index = 0; index< list1[i].length; index++){
                joined[i][index] = list1[i][index];
            }
            for(int index2 = 0; index2 < list2[i].length; index2++, index++){
                joined[i][index] = list2[i][index2];
            }
            }
            return joined;
		
	}

	//this method determines the index of a requested value in an array
	public static int indexOf(int[]list, int value) {
		int num = -1;
		for(int i = 0; i<list.length; i++) {
			if(list[i]==value) {
				i=num;
			}
		}
		return num;	
	}
	
	//this method determines the index of a requested value in a 2d array
	public static int[] indexOf(int[][]list, int value) {
		int in = -1;
		int ja = -1;
		for(int i= 0; i< list.length;i++) {
			for(int j=0;j<list[i].length;j++) {
				if(list[i][j]==value) {
					in=i;
					ja=j;
				}
					
			}
		}
		int[] numPos = new int[]{in,ja};
		return numPos;
	}
	
	//this method determines which number is at a requested index in an array
	public static int elementAt(int[]list, int index) {
		return list[index];
	}
	
	//this method determines which number is at a requested index in a 2d array
	public static int elementAt(int[][]list,int[]list1) {
		int num = -1;
		for(int i = 0; i < list.length;i++) {
			if(list[i] == list1) {
				num = i;
			}
		}
		return num;
	}
	
	public static void main(String[] args) {

		//delcare arrays to test the methods
		int[] listTest = {1,2,3,4,5,6};
		int[] list = {1,2,3};
		int[] list1 = {4,5,7};
		int[] joined = join(list,list1);
		int[][] list2 = {{1,2,3,4,5}, {1,2,3,4,5,6}};
		int[][] list3 = {{1,2,3,4,5}, {1,2,3,4,5,6}};
		int[][] list4 = join(list2,list3);
		
		//test the join method
		System.out.println("Joined Array: ");
		for(int i: joined) {
			System.out.print(i+ " ");
		}
		
		//tests the join method for 2d arrays
		System.out.println();
		System.out.println("Joined 2d Array: ");
		for(int i=0; i<list4.length;i++) {
			for(int j = 0; j<list4[i].length;j++) {
				System.out.print(list4[i][j] + "  ");
			}
			System.out.println();
		}
		
		//tests the equal method for arrays
		System.out.println("Do these arrays equal eachother?");
		boolean equals = equals(list,list1);
		System.out.println(equals);
		
		//tests the equal method for 2d arrays
		System.out.println("Do these 2d arrays equal eachother?");
		boolean equals2 = equals(list2,list3);
		System.out.println(equals2);
		
		//tests the indexof method for arrays
		System.out.println("Where is 4 in the array?");
		int where = indexOf(joined, 4);
		System.out.println("It is at pos " + where);
		
		//test the indexof method of 2d arrays
		System.out.println("Where is 4 in the array?");
		int[] where2 = indexOf(list4, 4);
		System.out.println("It is at pos " + where2);
		
		//test the elementAt method for arrays
		System.out.println("What is at spot 2 in the array?");
		int num = elementAt(list,2);
		System.out.println(num);
		
		//tests the indexof method for 2d arrays
		System.out.println("What is at spot 2,1 in the array?");
		int num2 = elementAt(list2,listTest);
		System.out.println(num);
		
	}

}
