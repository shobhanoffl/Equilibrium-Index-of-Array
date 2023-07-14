
public class Main {
    static int[] calculatePrefixSum(int[] array){
        int[] prefixSum = new int[array.length];
        prefixSum[0]=array[0];
        for(int i=1;i<array.length;i++){
            prefixSum[i]=prefixSum[i-1]+array[i];
        }
        return prefixSum;
    }

    public static int calculateEquilibriumIndex(int[] array){
        int[] prefixSumArray = calculatePrefixSum(array);
        int c=-1;

//        for (int i=0; i<array.length; i++){
//            System.out.println(prefixSumArray[i]);
//        }

        for(int i=1; i<array.length-1; i++){
            if(prefixSumArray[i-1]==prefixSumArray[array.length-1]-prefixSumArray[i]){
                c=i;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] array = new int[]{-7, 1, 5, 2, -4, 3, 0};
        System.out.println(calculateEquilibriumIndex(array));
    }
}