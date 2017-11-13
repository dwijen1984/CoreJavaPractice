package com.dwijen.leetCode;

public class IslandPerimeter {

        public int islandPerimeter(int[][] grid) {
            int result = 4;
            for(int i =0 ;i < grid.length; i++){
                for(int j = 0 ; j< grid[0].length ; j++){
                    if(grid[i][j] == 1){
                        result = result +4;
                        if((grid[i][j+1] == 1) && (grid[j+1][j] == 1)){
                            result = result -2;
                        }
                    }

                }
            }
            return  result;
        }
}
