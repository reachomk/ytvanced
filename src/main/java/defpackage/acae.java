package defpackage;

import android.opengl.GLES20;

/* renamed from: acae */
public final class acae {
    public final int a;

    public acae(String str, int i) {
        boolean z = true;
        int[] iArr = new int[1];
        i = GLES20.glCreateShader(i);
        this.a = i;
        if (i == 0) {
            z = false;
        }
        amqw.b(z);
        GLES20.glShaderSource(this.a, str);
        GLES20.glCompileShader(this.a);
        GLES20.glGetShaderiv(this.a, 35713, iArr, 0);
        if (iArr[0] == 0) {
            str = GLES20.glGetShaderInfoLog(this.a);
            GLES20.glDeleteShader(this.a);
            throw new acah(str);
        }
    }

    public final void a() {
        GLES20.glDeleteShader(this.a);
    }
}
