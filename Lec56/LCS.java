package Lec56;

public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int longestCommonSubsequence(String text1, String text2) {
        // return lcs(text1,text2,0,0);
        return lcsBU(text1,text2);
    }

    public int lcs(String s,String t,int i,int j)
    {
        if(i == s.length() || j == t.length())
        {
            return 0;
        }

        if(s.charAt(i) == t.charAt(j))
        {
            return 1+lcs(s,t,i+1,j+1);
        }
        else
        {
            return Math.max(lcs(s,t,i+1,j),lcs(s,t,i,j+1));
        }
    }

    public int lcsBU(String s,String t)
    {
        int[][] dp = new int[s.length()+1][t.length()+1];

        for(int i = s.length()-1; i >= 0; i--)
        {
            for(int j = t.length()-1; j >= 0; j--)
            {
                if(s.charAt(i) == t.charAt(j))
                {
                    dp[i][j] =  1+dp[i+1][j+1];
                }
                else
                {
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
            
        }
        return dp[0][0];
    }

}
