package patterns.structural.adapter;

interface SocketAdapter {
    Voltage getIndiaSocket();

    Voltage getJapanSocket();

    Voltage getUSSocket();
}
