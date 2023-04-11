package com.example.csafianlproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import socketfx.Constants;
import socketfx.FxSocketServer;
import socketfx.SocketListener;

import java.lang.invoke.MethodHandles;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class HelloController implements Initializable {
    private final static Logger LOGGER =
            Logger.getLogger(MethodHandles.lookup().lookupClass().getName());
    public enum ConnectionDisplayState {
        DISCONNECTED, WAITING, CONNECTED, AUTOCONNECTED, AUTOWAITING
    }

    private FxSocketServer socket;
//    private void connect() {
//        socket = new FxSocketServer(new FxSocketListener(),
//                Integer.valueOf(portTextField.getText()),
//                Constants.instance().DEBUG_NONE);
//        socket.connect();
//    }

    private void displayState(ConnectionDisplayState state) {
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        displayState(ConnectionDisplayState.DISCONNECTED);
        Runtime.getRuntime().addShutdownHook(new ShutDownThread());
    }

    class ShutDownThread extends Thread {

        @Override
        public void run() {
            if (socket != null) {
                if (socket.debugFlagIsSet(Constants.instance().DEBUG_STATUS)) {
                    LOGGER.info("ShutdownHook: Shutting down Server Socket");
                }
                socket.shutdown();
            }
        }
    }
    class FxSocketListener implements SocketListener {

        @Override
        public void onMessage(String line) {
        }

        @Override
        public void onClosedStatus(boolean isClosed) {

        }
    }

    public HelloController(){
    }
}