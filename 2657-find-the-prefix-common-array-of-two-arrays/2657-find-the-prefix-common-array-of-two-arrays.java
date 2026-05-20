class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int count=0;
        int n=A.length;
        int j=0,k=0;
        int[] C = new int[n];
        for(int i=0;i<n;i++){
            count=0;
           for(j=0;j<=i;j++){
            for(k=0;k<=i;k++){
                if(A[j]==B[k]){
                    count++;
                }
            }
           }
           C[i]=count;
        }
        return C;
    }
}