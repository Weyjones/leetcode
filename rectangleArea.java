public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1=(C-A)*(D-B);
        int area2=(G-E)*(H-F);
        int area=area1+area2;
        int left=Math.min(D,H)-Math.max(B,F);
        int top=Math.min(C,G)-Math.max(A,E);
        if(A >= G || B >= H || C <= E || D <= F){
            return area;
        }else{
            return area-left*top;
        }
    }
}