package org.packettracer.Model;

import java.util.ArrayList;
import org.packettracer.Model.RouterPorts;

public class Router {
    private String name;
    String[][] port;
    
    static ArrayList<RouterPorts> portObject = new ArrayList<RouterPorts>();
       
    public Router(){}
    
    public Router(String name, int port) {
        this.name = name;
        this.port = new String[port][port+2];
    }
    
    public Router(int port, String ip, String mascara, String conectado) {
        this.port = new String[2][4];
        this.port[port][0] = ip;
        this.port[port][1] = mascara;
        this.port[port][2] = conectado;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPort() {
        String retorno = "";
        for(int i = 0; port.length > i; i++){
            for(int j = 0; port.length > j; j++){
                retorno = retorno + " " + port[i][j];
            }
        }
        return retorno;
    }

    public void setPort(int port) {
        this.port = new String [port][port+2];
    }
    
    
}
