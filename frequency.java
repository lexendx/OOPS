public class frequency {
    public static void main(String[] args) {
        int [] arr={12,15,12,18,12,15,12};
        int[] frequency = new int[101];
        for(int i = 0; i<arr.length;i++){
frequency[arr[i]]++;





        }for(int i=0;i<frequency.length;i++){
if(frequency[i]>0){
System.out.println(i+" is "+ frequency[i]+" times ");

}



        }
    }
}
