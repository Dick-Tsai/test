public class Test{

public static void main(String[] args){
	int[] arr = new int[]{8,2,1,0,3};
	int[] index = new int[]{2,0,3,2,4,0,1,3,2,3,3};
	System.out.println("arr = new int[]{8,2,1,0,3}");
	System.out.println("index = new int[]{2,0,3,2,4,0,1,3,2,3,3}");
        String tel = "";
	for (int i:index){
		System.out.println("I值：" +i);
		System.out.println(arr[i]);
		tel += arr[i];

} 

System.out.println("联系方式："+ tel+"123123");

}


}