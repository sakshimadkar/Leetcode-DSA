//1861. Rotating the Box

class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        
        int n =boxGrid.length;//3
        int m=boxGrid[0].length;//6

        //i need to go rowise
        for(int i=0;i<n;i++)
        {
            //start from the last column to first <---
            //traversing right to left 
            int last=m-1;
            for(int j=m-1;j>=0;j--)
            {
                if(boxGrid[i][j]=='.') continue;
                if(boxGrid[i][j]=='*')
                {
                    last=j-1;
                    continue;
                    //this is the obstacle so the left one will be next available place for stone to fall
                }
                //incase of stone
                if(last!=j)//values change so swap
                {
                    boxGrid[i][j]='.';
                    boxGrid[i][last]='#';
                }
                last--;
            }
        }

        char[][] ans=new char[m][n];
        int k=n-1;
        for(int j=0;j<n;j++)
        {
            for(int i=0;i<m;i++)
            {
                
                ans[i][j]=boxGrid[k][i];
            }
            k--;
        }

        return ans;

    }
}
