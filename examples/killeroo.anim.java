import org.sunflow.SunflowAPI;
import org.sunflow.core.*;
import org.sunflow.core.camera.*;
import org.sunflow.core.primitive.*;
import org.sunflow.core.shader.*;
import org.sunflow.image.Color;
import org.sunflow.math.*;
import java.io.*;

public void build() {
	try {
	FileOutputStream fos = new FileOutputStream("killeroo.setting.sc");
	PrintWriter out = new PrintWriter(fos);

	out.println("camera {");
	out.println("type thinlens2");
	out.println("eye    -15 16 -50");
	out.println("target -2 4 0");
	out.println("up     0 1 0");
	out.println("flength " + (1.0+getCurrentFrame()/10.0f));
	out.println("fdistance 55");
	out.println("aspect 1.333");
	out.println("afstop 0.5");

	out.println("}");
	out.flush();
	out.close();
	}
	catch(Exception e) {
	}

	parse("killeroo.setting.sc");
	parse("killeroo.nocamera.sc");
}

