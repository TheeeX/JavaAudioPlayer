    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaaudioplayer;
import javax.swing.*;
import java.awt.*;
import javax.media.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.*; 
/**
 *
 * @author Paradox
 */
public class JavaAudioPlayer {

    /**
     * @param args the command line arguments
     */
//JFrame frame = new JFrame(" Hello JMF Player"); 
static Player JavaAudioPlayerPlayer = null;

public JavaAudioPlayer(){
	try{                                     // method using URL
	URL url=new URL("file",null,"hello.wav");//audio file that is present in the same directory wherein the HelloJMF.class file resides. 
	JavaAudioPlayerPlayer = Manager.createRealizedPlayer( url);
	}
	catch( IOException | NoPlayerException | CannotRealizeException e) {
	System.out.println(" Unable to create the audioPlayer :" + e );
	}
/*
Component control = helloJMFPlayer.getControlPanelComponent();
frame.getContentPane().add( control, BorderLayout.CENTER);
frame.addWindowListener( new WindowAdapter() {
 public void windowClosing(WindowEvent we) {
 HelloJMF.stop(); 
 System.exit(0);
 }
});
frame.pack();
frame.setSize( new Dimension(200,50) );
frame.setVisible(true); */
        
JavaAudioPlayerPlayer.start();

}
public static void stop(){
JavaAudioPlayerPlayer.stop();
 JavaAudioPlayerPlayer.close();
}
public static void main( String args[]){
JavaAudioPlayer JavaAudioPlayer = new JavaAudioPlayer();
}
}
