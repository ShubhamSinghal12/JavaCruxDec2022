package Lec56;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int minDistance(String word1, String word2) {

        // return editDist(word1,word2,0,0);
        return editBU(word1,word2);
        
    }


    public int editDist(String s,String t,int i,int j)
    {
        if(i == s.length())
        {
            return t.length()-j;
        }
        else if(j == t.length())
        {
            return s.length()-i;
        }
        else if(s.charAt(i) == t.charAt(j))
        {
            return editDist(s,t,i+1,j+1);
        }
        else
        {
            int insert = editDist(s,t,i,j+1) + 1;
            int replace = editDist(s,t,i+1,j+1) + 1;
            int delete = editDist(s,t,i+1,j) + 1;

            return Math.min(insert,Math.min(replace,delete));
        }
    }


    public int editBU(String s,String t)
    {
        int[][] dp = new int[s.length()+1][t.length()+1];
        
        for(int j = 0; j < t.length(); j++)
        {
            dp[s.length()][j] = t.length()-j;
        }
        for(int i = 0; i < s.length(); i++)
        {
            dp[i][t.length()] = s.length()-i;
        }

        for(int i = s.length()-1; i >= 0; i--)
        {
            for(int j = t.length()-1; j >= 0; j--)
            {
                if(s.charAt(i) == t.charAt(j))
                {
                    dp[i][j] =  dp[i+1][j+1];
                }
                else
                {
                    int insert = dp[i][j+1] + 1;
                    int replace = dp[i+1][j+1] + 1;
                    int delete = dp[i+1][j] + 1;

                    dp[i][j]  = Math.min(insert,Math.min(replace,delete));
                }
            }
        }
        return dp[0][0];
    }

}
