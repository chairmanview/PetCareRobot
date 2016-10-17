package base;

/**
 * Created by Administrator on 2016/7/15 0015.
 */
public class FirstDemo {
    public static void main(String[] s){
        for(int j=0;j<10;j++){
            final int finalJ = j;
            new Thread(new Runnable(){
                public void run(){
                    BaseCell b = new BaseCell();
                    b.setFlag(finalJ);
                    for (int i=0;i<10000;i++){
                        b.moveing();
                    }
                    b.say();
                }
            }).start();
        }

    }
}
