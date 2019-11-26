package defpackage;

import android.opengl.GLES20;

/* renamed from: ahwe */
public class ahwe extends ahwi {
    public final int a = b("uOpacity");
    private final int b = a("aPosition");
    private final int d = b("uMVP");

    public ahwe(String str, String str2) {
        super(str, str2);
    }

    public void a() {
        GLES20.glEnableVertexAttribArray(this.b);
        ahsl.b();
    }

    public void b() {
        GLES20.glDisableVertexAttribArray(this.b);
        ahsl.b();
    }

    public void a(ahsm ahsm) {
        ahsm.d.a(this.b);
        GLES20.glDrawArrays(ahsm.g, 0, ahsm.f);
        ahsl.b();
    }

    public final void a(float[] fArr) {
        GLES20.glUniformMatrix4fv(this.d, 1, false, fArr, 0);
        ahsl.b();
    }
}
