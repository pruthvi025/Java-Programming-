class A1{
    public static void main(String[] args){
        

         int[][] m1={
            {1,2,3},
            {2,3,4},
            {3,4,5}


        };
        // System.err.println(Arrays.deepToString(m1));

        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1.length;j++){
                System.out.print(m1[i][j]+" ");
            }
            System.out.println();
        }
    }
}