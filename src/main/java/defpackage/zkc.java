package defpackage;

import android.opengl.GLES20;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: zkc */
public final class zkc {
    private int a = 0;
    private int b = 5;
    private int c = 4;
    private int d = 33984;
    private float[] e = new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    private float[] f = new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    private HashMap g;
    private HashMap h = new HashMap();
    private final List i = new ArrayList();

    public zkc(String str) {
        int a = zkc.a(35633, "attribute vec4 a_position;\nattribute vec2 a_texcoord;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_Position = a_position;\n  v_texcoord = a_texcoord;\n}\n");
        if (a != 0) {
            int a2 = zkc.a(35632, str);
            if (a2 != 0) {
                int glCreateProgram = GLES20.glCreateProgram();
                if (glCreateProgram != 0) {
                    GLES20.glAttachShader(glCreateProgram, a);
                    String str2 = "glAttachShader";
                    zkh.a(str2);
                    GLES20.glAttachShader(glCreateProgram, a2);
                    zkh.a(str2);
                    GLES20.glLinkProgram(glCreateProgram);
                    int[] iArr = new int[1];
                    GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                    if (iArr[0] != 1) {
                        str = GLES20.glGetProgramInfoLog(glCreateProgram);
                        GLES20.glDeleteProgram(glCreateProgram);
                        str = String.valueOf(str);
                        String str3 = "Could not link program: ";
                        throw new RuntimeException(str.length() == 0 ? new String(str3) : str3.concat(str));
                    }
                }
                GLES20.glDeleteShader(a);
                GLES20.glDeleteShader(a2);
                this.a = glCreateProgram;
                int[] iArr2 = new int[1];
                GLES20.glGetProgramiv(glCreateProgram, 35718, iArr2, 0);
                a = iArr2[0];
                if (a > 0) {
                    this.g = new HashMap(a);
                    for (a = 0; a < iArr2[0]; a++) {
                        zkb zkb = new zkb(this.a, a);
                        this.g.put(zkb.a, zkb);
                    }
                    return;
                }
                return;
            }
            throw new RuntimeException("Could not create shader-program as fragment shader could not be compiled!");
        }
        throw new RuntimeException("Could not create shader-program as vertex shader could not be compiled!");
    }

    public static zkc a() {
        return new zkc("precision lowp float;\nuniform sampler2D tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n");
    }

    public final void a(ayx ayx, zkd zkd, int i, int i2) {
        ayx[] ayxArr = new ayx[]{ayx};
        zkh.a("Unknown Operation");
        if (this.a != 0) {
            zkd.b();
            GLES20.glViewport(0, 0, i, i2);
            zkh.a("glViewport");
            GLES20.glUseProgram(this.a);
            zkh.a("glUseProgram");
            zke a = a("a_texcoord");
            float[] fArr = this.e;
            if (!(fArr == null || a == null)) {
                a.a(fArr);
            }
            this.e = null;
            zke a2 = a("a_position");
            float[] fArr2 = this.f;
            if (!(fArr2 == null || a2 == null)) {
                a2.a(fArr2);
            }
            this.f = null;
            for (zke a22 : this.h.values()) {
                if (a22.e != null) {
                    GLES20.glBindBuffer(34962, 0);
                    GLES20.glVertexAttribPointer(a22.a, a22.c, a22.d, false, a22.b, a22.e);
                } else {
                    GLES20.glBindBuffer(34962, 0);
                    GLES20.glVertexAttribPointer(a22.a, a22.c, a22.d, false, a22.b, 0);
                }
                GLES20.glEnableVertexAttribArray(a22.a);
                zkh.a("Set vertex-attribute values");
            }
            zkh.a("Push Attributes");
            GLES20.glDisable(3042);
            zkh.a("Set render variables");
            GLES20.glActiveTexture(this.d);
            ayx ayx2 = ayxArr[0];
            GLES20.glBindTexture(ayx2.b, ayx2.a);
            ayv.a("glBindTexture");
            int glGetUniformLocation = GLES20.glGetUniformLocation(this.a, b());
            String str = "!";
            if (glGetUniformLocation >= 0) {
                GLES20.glUniform1i(glGetUniformLocation, 0);
                Integer valueOf = Integer.valueOf(0);
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    GLES20.glDrawArrays(this.b, 0, this.c);
                    zkh.a("glDrawArrays");
                    if (ayy.a) {
                        Trace.endSection();
                        return;
                    }
                    return;
                }
                String valueOf2 = String.valueOf(valueOf);
                String toHexString = Integer.toHexString(glGetError);
                int length = "Binding input texture".length();
                StringBuilder stringBuilder = new StringBuilder(((length + 31) + valueOf2.length()) + String.valueOf(toHexString).length());
                stringBuilder.append("GL Operation 'Binding input texture ");
                stringBuilder.append(valueOf2);
                stringBuilder.append("' caused error ");
                stringBuilder.append(toHexString);
                stringBuilder.append(str);
                throw new RuntimeException(stringBuilder.toString());
            }
            String b = b();
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(b).length() + 87);
            stringBuilder2.append("Shader does not seem to support 1 number of input textures! Missing uniform ");
            stringBuilder2.append(b);
            stringBuilder2.append(str);
            throw new RuntimeException(stringBuilder2.toString());
        }
        throw new RuntimeException("Attempting to execute invalid shader-program!");
    }

    public final void a(float[] fArr) {
        if (fArr.length == 16) {
            this.e = Arrays.copyOf(new float[]{fArr[12], fArr[13], fArr[0] + fArr[12], fArr[1] + fArr[13], fArr[4] + fArr[12], fArr[5] + fArr[13], (fArr[0] + fArr[4]) + fArr[12], (fArr[1] + fArr[5]) + fArr[13]}, 8);
            return;
        }
        throw new IllegalArgumentException("Expected 4x4 matrix for source transform!");
    }

    private final String b() {
        while (this.i.size() <= 0) {
            List list = this.i;
            int size = list.size();
            StringBuilder stringBuilder = new StringBuilder(23);
            stringBuilder.append("tex_sampler_");
            stringBuilder.append(size);
            list.add(stringBuilder.toString());
        }
        return (String) this.i.get(0);
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        GLES20.glDeleteProgram(this.a);
    }

    private static int a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                str = GLES20.glGetShaderInfoLog(glCreateShader);
                GLES20.glDeleteShader(glCreateShader);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 37);
                stringBuilder.append("Could not compile shader ");
                stringBuilder.append(i);
                stringBuilder.append(":");
                stringBuilder.append(str);
                throw new RuntimeException(stringBuilder.toString());
            }
        }
        return glCreateShader;
    }

    private final zke a(String str) {
        zke zke = (zke) this.h.get(str);
        if (zke != null) {
            return zke;
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.a, str);
        if (glGetAttribLocation < 0) {
            return zke;
        }
        zke = new zke(str, glGetAttribLocation);
        this.h.put(str, zke);
        return zke;
    }
}
