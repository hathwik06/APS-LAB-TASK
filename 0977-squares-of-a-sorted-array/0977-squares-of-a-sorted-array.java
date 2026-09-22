class Solution {
    public int[] sortedSquares(int[] a) {
        int i,r,l;
        int[] res = new int[a.length];

        i = res.length-1;
        l = 0;
             r = a.length - 1;
        while(l<=r){
            if(Math.abs(a[l]) >= Math.abs(a[r])){
                res[i] = a[l]*a[l];
                l++;
                i--;
            }
            else{
                res[i]=a[r]*a[r];
                r--;
                i--;
            }
        }
        return res;
    }
}