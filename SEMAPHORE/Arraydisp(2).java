public class arraydisp
{
	public static void main(String[] args) {
		int[] array=new int[5];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		array[4]=50;
		System.out.println("Original array:");
		for(int i=0;i<array.length;i++){
		    System.out.println("Element at index"+i+":"+array[i]);
		}
	}
}
