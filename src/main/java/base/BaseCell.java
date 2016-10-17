package base;

import java.util.Random;

/**
 * Created by Administrator on 2016/9/29 0029.
 * Ԫ
 */
public class BaseCell {
    float x;
    float y;
    float z;
    float t;//

    float r;
    private int flag;

    BaseCell(){
        x=0;y=0;z=0;r=1;t=0;
    }

    private void go(float x_,float y_,float z_){
        this.x=this.x+x_;
        this.y=this.y+y_;
        this.z=this.z+z_;
    }

    public void say(){
        System.out.println("pit "+flag+" at :(" + this.x + "," + this.y + "," + this.z + ")");
    }

    public void moveing(){
        Random run = new Random();
        float x1 = run.nextInt(200)-100;
        float y1 = run.nextInt(200)-100;
        float z1 = run.nextInt(200)-100;
//        System.out.println("forword:(" + x1 + "," + y1 + "," + z1 + ")");
        float x_ = x1/100;
        float y_ = y1/100;
        float z_ = z1/100;
        go(x_,y_,z_);
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
