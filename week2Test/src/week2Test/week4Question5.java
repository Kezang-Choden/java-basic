package week2Test;

class week4Question5 {
    public static void shuffle(int[] nums, int n) {
    	int[] a = new int[nums.length - n];
    	int[] b = new int[nums.length - n];
        for (int i = 0; i < nums.length; i++) {
			if (i<a.length) {
				a[i] = nums[i];
			}
			else {
				b[i-a.length] = nums[i];
			}
		}
        int[] newAB = new int[a.length+b.length];
        int j = 0, k =0;
        for (int i = 0; i < newAB.length; i++) {
			 if(i%2 == 0) {
				 newAB[i] = a[j];
			 j++;
			 }
			 else {
				 newAB[i] = b[k];
			 k++;
			 }
		}
        System.out.println("Array Mixed:");
       for (int i : newAB) {
		
		System.out.print(i);
	}
    }
    
    public static void main(String args[]) {
    	int[] num1 = {1,2,3,4,5,6,7,8,9,10};
    	shuffle(num1, 5);
    }  
}


