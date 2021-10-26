import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**初始化构造方法 由于比较简单直接在构造中写程序
 * 该类是学习用java链接到服务器的demo
 * */
public class sockectdemo1 {
    //Socket处理异常
    public sockectdemo1 () throws IOException {
        //打开一个套接字，一旦套接字打开就会得到一个stream
       try(Socket s =new Socket("time-a.nist.gov",13);
           Scanner in =new Scanner(s.getInputStream(),"UTF-8"))
        {
           while(in.hasNextLine()){
               String line=in.nextLine();
               System.out.println(line);
           }
        }

    }
}
