package com.fsmvu.inspectionofclass;

import java.io.IOException;

import com.fsmvu.inspectionofclass.http.RFIDHandler;
import com.fsmvu.inspectionofclass.http.RFIDServer;

/**
 * 
 *
 */
public class ServerApp {
    public static void main( String[] args ) {
        try{
            RFIDServer.getInstance()
            .build(16290)
            .map("/", new RFIDHandler())
            .start();

        }catch(IOException ex) {
            System.err.println("Error occured " + ex.getMessage());
        }
        
    }
}
