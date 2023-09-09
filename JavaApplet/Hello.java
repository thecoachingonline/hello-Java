package JavaApplet;

import java.applet.*;

import java.lang.*;

import java.awt.*;

public class Hello extends Applet {
    Font f;
    int   xpos,ypos;
    String  HelloString;
    FontMetrics  fm;

public void paint (Graphics g) {
    HelloString = "Hello World!";
    f = new Font("Helvetica", Font.BOLD+Font.ITALIC, 24);

    fm=getFontMetrics(f);
    g.setFont(f);
    g.setColor(Color.blue);
    xpos=(this.size().width-fm.stringWidth(HelloString))/2;
    ypos=(this.size().height-fm.stringWidth(HelloString))/2;
    g.drawString(HelloString,xpos,ypos);
}
}
