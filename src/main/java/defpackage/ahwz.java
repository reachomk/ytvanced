package defpackage;

import android.opengl.GLES20;

/* renamed from: ahwz */
public class ahwz extends ahwe {
    public final int h = a("aTextureCoords");
    public final int i = b("uBrightness");

    public ahwz(String str, String str2) {
        super(str, str2);
    }

    public final void a() {
        super.a();
        GLES20.glEnableVertexAttribArray(this.h);
        ahsl.b();
    }

    public final void b() {
        super.b();
        GLES20.glDisableVertexAttribArray(this.h);
        ahsl.b();
    }

    public final void a(ahsm ahsm) {
        ahsm.e.a(this.h);
        super.a(ahsm);
    }
}
