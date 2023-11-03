package dsa;

public class Max_Wealth {
    public static void main(String[] args) {
        int accounts[][] = {{1,2,3},{3,5,1}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts){
        int ans=0;

        for (int i=0;i<accounts.length;i++){ int add=0;
            for (int j=0;j<accounts[i].length;j++){
                add=add+accounts[i][j];
            }
            if (ans<add){
                ans=add;
            }
        }
    return ans;
    }

}
