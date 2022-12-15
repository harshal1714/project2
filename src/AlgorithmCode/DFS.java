/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlgorithmCode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class DFS {
    
    public static boolean searchPath(int[][]maze,int x,int y,List<Integer>path)
    {
     if(maze[x][y]==9){
         System.out.println(x+","+y);
         return true;
    }
    if(maze[x][y]==0){
    maze[x][y]=2;
    
    int[]dx={1,0,-1,0};
    int[]dy={0,-1,0,1};
    
    for(int i=0;i<4;i++){
        int newx=x+dx[i];
        int newy=y+dy[i];
        //check coordinates not going outofbound & searchpath by recursively
    if(newx>=0 && newy>=0 && newx<maze.length && newy<maze[0].length && searchPath(maze,newx,newy,path)){
        System.out.println(newx+","+newy);
            path.add(x);
            path.add(y);

        return true;
    }
    }
    }
    return false;
}
  public static void main(String[]args)
  {
   DFS obj=new DFS();
    int[][]maze={
    {0,0,1},
    {0,1,9},
    {0,0,0},   
  };
List<Integer>path=new ArrayList<Integer>();
boolean reach=obj.searchPath(maze,0,0,path);
System.out.println(reach);
}
}
