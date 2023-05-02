package Lec56;

public class distinctSubSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[][] dp = new int[s.length()][t.length()];
        // for(int[] v: dp)
        // {
        //     Arrays.fill(v,-1);
        // }
        // return dist(s,t,0,0,dp);
//        return distBUSE(s,t);

	}
	public int dist(String s,String t,int i,int j,int[][] dp)
    {
        if(j == t.length())
        {
            return 1;
        }
        if(i == s.length())
        {
            return 0;
        }
        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }
        
        int inc = 0;
        if(s.charAt(i) == t.charAt(j))
        {
            inc = dist(s,t,i+1,j+1,dp);
        }
        int exc = dist(s,t,i+1,j,dp);
        
        return dp[i][j] = inc+exc;   
    }
    
    public int distBU(String s,String t){
        
        int[][] dp = new int[s.length()+1][t.length()+1];
        for(int i = 0; i < s.length()+1; i++)
        {
            dp[i][t.length()] = 1;
        }
        
        for(int i = s.length()-1; i>= 0; i--)
        {
            for(int j = 0; j < t.length(); j++)
            {
                int inc = 0;
                if(s.charAt(i) == t.charAt(j))
                {
                    inc = dp[i+1][j+1];
                }
                int exc = dp[i+1][j];

                dp[i][j] = inc+exc;
            }
        }
        return dp[0][0];
    }
    
    
    
    public int distBUSE(String s,String t){
        
        int[] dp = new int[t.length()+1];
        dp[t.length()] = 1;
        
        for(int i = s.length()-1; i>= 0; i--)
        {
            for(int j = 0; j < t.length(); j++)
            {
                if(s.charAt(i) == t.charAt(j))
                {
                    dp[j] += dp[j+1];
                }
            }
        }
        return dp[0];
    }

}
