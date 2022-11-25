package list;
import java.awt.Toolkit;

public class ToolkitTest {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0; i<10 ; i++){
            toolkit.beep();
            System.out.println("3초뒤 빕소리 남");

            try{
                Thread.sleep(3000);
                
            } catch(InterruptedException e){
                e.printStackTrace();;
            }
        }
    }
}
