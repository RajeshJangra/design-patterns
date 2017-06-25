package patterns.structural.adapter;

public class SocketExample {
    public static void main(String[] args) {

        //Class adapter
        System.out.println("USSocket = " + new SocketClassAdapter().getUSSocket());
        System.out.println("JapanSocket = " + new SocketClassAdapter().getJapanSocket());

        //Object adapter
        System.out.println("USSocket = " + new SocketObjectAdapter().getUSSocket());
        System.out.println("JapanSocket = " + new SocketObjectAdapter().getJapanSocket());
    }
}
