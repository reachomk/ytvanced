package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: bche */
final class bche {
    private static final float[] j = new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
    public final FloatBuffer a = ByteBuffer.allocateDirect(j.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
    public final float[] b = new float[16];
    public final float[] c = new float[16];
    public int d;
    public int e = -12345;
    public int f;
    public int g;
    public int h;
    public int i;

    bche() {
        this.a.put(j).position(0);
        Matrix.setIdentityM(this.c, 0);
    }

    public static int a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        StringBuilder stringBuilder = new StringBuilder(31);
        stringBuilder.append("glCreateShader type=");
        stringBuilder.append(i);
        bcgr.a(stringBuilder.toString());
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder stringBuilder2 = new StringBuilder(37);
        stringBuilder2.append("Could not compile shader ");
        stringBuilder2.append(i);
        stringBuilder2.append(":");
        String stringBuilder3 = stringBuilder2.toString();
        str = "TextureRender";
        Log.e(str, stringBuilder3);
        stringBuilder3 = String.valueOf(GLES20.glGetShaderInfoLog(glCreateShader));
        String str2 = " ";
        if (stringBuilder3.length() == 0) {
            stringBuilder3 = new String(str2);
        } else {
            stringBuilder3 = str2.concat(stringBuilder3);
        }
        Log.e(str, stringBuilder3);
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }
}
