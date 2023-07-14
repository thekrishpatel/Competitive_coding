class Solution {
    public int calPoints(String[] operations) {
        int sum=0;
    int[] arr = new int[operations.length];
    int count=0;

    for(int i=0;i<operations.length;i++){
        // System.out.println(count + " " + operations[i]);
        if(operations[i].equals("C")){
            arr[--count]=0;
        }
        else if(operations[i].equals("D")){
            arr[count] = 2 * arr[count-1];
            count++;
        }
        else if(operations[i].equals("+")){
            arr[count]= arr[count-1] + arr[count-2];
            count++;
        }
        else{
            // System.out.println(operations[i]);
            arr[count] = Integer.parseInt(operations[i]);
            count++;
        }   
    }
    for(int j=0;j<arr.length;j++){
        //System.out.println(arr[j]);
        sum += arr[j];
    }
    return sum;
    }
}