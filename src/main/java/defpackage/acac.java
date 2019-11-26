package defpackage;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: acac */
public final class acac {
    private final acae a;
    private final acae b;
    private final int c;
    private final Map d = new HashMap();
    private final Map e = new HashMap();

    public acac(acaf acaf) {
        acae acae = new acae(acaf.a, 35633);
        acae acae2 = new acae(acaf.b, 35632);
        this.a = acae;
        this.b = acae2;
        int glCreateProgram = GLES20.glCreateProgram();
        this.c = glCreateProgram;
        amqw.b(glCreateProgram != 0);
        GLES20.glAttachShader(this.c, acae.a);
        GLES20.glAttachShader(this.c, acae2.a);
        GLES20.glLinkProgram(this.c);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.c, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(this.c);
            throw new acah("Program link failed");
        }
    }

    public final void a(String str, float f) {
        GLES20.glUniform1f(b(str), f);
    }

    public final void a(String str, float[] fArr) {
        GLES20.glUniformMatrix4fv(b(str), 1, false, fArr, 0);
    }

    public static void a(int i, int i2) {
        GLES20.glActiveTexture(33984);
        abyx.a("glActiveTexture");
        GLES20.glBindTexture(i, i2);
        abyx.a("glBindTexture");
    }

    public final void b(int i, int i2) {
        GLES20.glUseProgram(this.c);
        abyx.a("glUseProgram");
        GLES20.glBindTexture(i, i2);
        abyx.a("glBindTexture");
    }

    public static void a() {
        GLES20.glBindTexture(36197, 0);
        abyx.a("glBindTexture");
        GLES20.glUseProgram(0);
        abyx.a("glUseProgram");
    }

    private final int b(String str) {
        if (this.d.containsKey(str)) {
            return ((Integer) this.d.get(str)).intValue();
        }
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.c, str);
        abyx.a(glGetUniformLocation, str);
        abyx.a("glGetUniformLocation");
        this.d.put(str, Integer.valueOf(glGetUniformLocation));
        return glGetUniformLocation;
    }

    private final int c(String str) {
        if (this.e.containsKey(str)) {
            return ((Integer) this.e.get(str)).intValue();
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.c, str);
        abyx.a(glGetAttribLocation, str);
        abyx.a("glGetAttribLocation");
        this.e.put(str, Integer.valueOf(glGetAttribLocation));
        return glGetAttribLocation;
    }

    public final void a(String str, FloatBuffer floatBuffer) {
        int c = c(str);
        GLES20.glEnableVertexAttribArray(c);
        abyx.a("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(c, 2, 5126, false, 8, floatBuffer);
        abyx.a("glVertexAttribPointer");
    }

    public final void a(String str) {
        GLES20.glDisableVertexAttribArray(c(str));
        abyx.a("glDisableVertexAttribArray");
    }

    public final void b() {
        GLES20.glDeleteProgram(this.c);
        this.a.a();
        this.b.a();
    }
}
