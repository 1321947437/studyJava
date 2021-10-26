import java.io.*;
import java.net.URL;


public class urldemo {
    //设置要访问的url地址
    private  String  urladress="http://www.baidu.com";
    //代码比较简单，所以使用构造初始话进行调用
    public urldemo() throws IOException {
        //构造Url类
        URL url=new URL(urladress);
        //打开Url链接并得到输入流
        InputStream in =url.openConnection().getInputStream();
        //循环遍历流中的数据并打印到控制台上
        for (int c = in.read(); c != -1; c = in.read()) {
            System.out.write(c);
        }
        //关闭流
        in.close();

    }
}