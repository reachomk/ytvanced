package defpackage;

import android.opengl.GLES20;
import android.opengl.GLU;

/* renamed from: ahwi */
public class ahwi {
    private final boolean a;
    private final String b = getClass().getSimpleName();
    public int c;
    private boolean d;

    public ahwi(String str, String str2) {
        String valueOf = String.valueOf(this.b);
        String str3 = "Creating program ";
        if (valueOf.length() == 0) {
            valueOf = new String(str3);
        } else {
            str3.concat(valueOf);
        }
        int glCreateProgram = GLES20.glCreateProgram();
        this.c = glCreateProgram;
        ahsl.a(glCreateProgram);
        this.a = false;
        int a = a(35633, str);
        int a2 = a(35632, str2);
        GLES20.glAttachShader(this.c, a);
        GLES20.glAttachShader(this.c, a2);
        GLES20.glLinkProgram(this.c);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.c, 35714, iArr, 0);
        if (iArr[0] == 1) {
            GLES20.glDeleteShader(a);
            GLES20.glDeleteShader(a2);
            ahsl.b();
            return;
        }
        str = GLES20.glGetProgramInfoLog(this.c);
        str2 = this.b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 27) + String.valueOf(str).length());
        valueOf = "Failed to link GlProgram ";
        stringBuilder.append(valueOf);
        stringBuilder.append(str2);
        str2 = ": ";
        stringBuilder.append(str2);
        stringBuilder.append(str);
        xtl.c(stringBuilder.toString());
        str3 = this.b;
        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str3).length() + 27) + String.valueOf(str).length());
        stringBuilder2.append(valueOf);
        stringBuilder2.append(str3);
        stringBuilder2.append(str2);
        stringBuilder2.append(str);
        throw new ahsj(stringBuilder2.toString());
    }

    public final void c() {
        GLES20.glUseProgram(this.c);
        ahsl.b();
    }

    public final void d() {
        if (!this.d) {
            int[] iArr = new int[1];
            GLES20.glValidateProgram(this.c);
            GLES20.glGetProgramiv(this.c, 35715, iArr, 0);
            if (iArr[0] == 1) {
                this.d = true;
                return;
            }
            String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(this.c);
            String str = this.b;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 31) + String.valueOf(glGetProgramInfoLog).length());
            String str2 = "Failed to validate GlProgram ";
            stringBuilder.append(str2);
            stringBuilder.append(str);
            str = ": ";
            stringBuilder.append(str);
            stringBuilder.append(glGetProgramInfoLog);
            xtl.c(stringBuilder.toString());
            String str3 = this.b;
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str3).length() + 31) + String.valueOf(glGetProgramInfoLog).length());
            stringBuilder2.append(str2);
            stringBuilder2.append(str3);
            stringBuilder2.append(str);
            stringBuilder2.append(glGetProgramInfoLog);
            throw new ahsj(stringBuilder2.toString());
        }
    }

    public void e() {
        String valueOf = String.valueOf(this.b);
        String str = "Deleting program ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            str.concat(valueOf);
        }
        int i = this.c;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            ahsl.b();
            this.c = 0;
        }
    }

    private final int a(int i, String str) {
        i = GLES20.glCreateShader(i);
        ahsl.a(i);
        GLES20.glShaderSource(i, str);
        GLES20.glCompileShader(i);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(i, 35713, iArr, 0);
        ahsl.b();
        if (iArr[0] == 1) {
            return i;
        }
        String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(i);
        str = this.b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 41) + String.valueOf(glGetShaderInfoLog).length());
        String str2 = "Failed to compile shader for GlProgram ";
        stringBuilder.append(str2);
        stringBuilder.append(str);
        str = ": ";
        stringBuilder.append(str);
        stringBuilder.append(glGetShaderInfoLog);
        xtl.c(stringBuilder.toString());
        String str3 = this.b;
        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str3).length() + 41) + String.valueOf(glGetShaderInfoLog).length());
        stringBuilder2.append(str2);
        stringBuilder2.append(str3);
        stringBuilder2.append(str);
        stringBuilder2.append(glGetShaderInfoLog);
        throw new ahsj(stringBuilder2.toString());
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.c, str);
        b(glGetAttribLocation, str);
        return glGetAttribLocation;
    }

    /* Access modifiers changed, original: protected|final */
    public final int b(String str) {
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.c, str);
        b(glGetUniformLocation, str);
        return glGetUniformLocation;
    }

    private final void b(int i, String str) {
        if (i == -1) {
            while (true) {
                i = GLES20.glGetError();
                String valueOf;
                if (i != 0) {
                    valueOf = String.valueOf(GLU.gluErrorString(i));
                    String str2 = "GL error ";
                    xtl.c(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
                } else {
                    valueOf = this.b;
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 23) + String.valueOf(str).length());
                    stringBuilder.append("Invalid GL location: ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append(": ");
                    stringBuilder.append(str);
                    xtl.c(stringBuilder.toString());
                    return;
                }
            }
        }
    }
}
