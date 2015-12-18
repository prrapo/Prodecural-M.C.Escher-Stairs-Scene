import java.util.Random;
import java.io.*;

public void build() {
	try {
		FileOutputStream fos = new FileOutputStream("escher.procedural.sc");
		PrintWriter out = new PrintWriter(fos);

//		for(int i = 0; i < 6; i++) {
			out.println("object {");
			out.println("shader diffuse_gray");
			out.println("type file-mesh");
			out.println("name 6step");
			out.println("filename 6step.obj");
			out.println("smooth_normals true");
			out.println("}");
//		}

		out.flush();
		out.close();
	}
	catch(Exception e) {
	}
	parse("escher.setting.sc");
	parse("escher.procedural.sc");
}
