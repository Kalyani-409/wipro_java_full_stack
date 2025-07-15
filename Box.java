import java.util.*;
public class Box {
    int width;
    int height;
    int depth;
    Box(int width,int height,int depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    public int getvolume(){ 
        return (width*height*depth);
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        
        int width=sc.nextInt();
        int height=sc.nextInt();
        int depth=sc.nextInt();
        Box myBox=new Box(width,height,depth);
        System.out.println(myBox.getvolume());
    }   
}
