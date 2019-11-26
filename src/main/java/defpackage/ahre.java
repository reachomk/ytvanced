package defpackage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;

/* renamed from: ahre */
public class ahre extends ahmq {
    public Bitmap i;
    public boolean j = true;
    public float k = 0.3f;
    private final bcaa m;
    private final int[] n = new int[1];
    private boolean o;

    public ahre(Bitmap bitmap, ahsm ahsm, ahpn ahpn, bcaa bcaa) {
        super(ahsm, ahpn, bcaa);
        this.i = bitmap;
        this.m = (bcaa) amqw.a((Object) bcaa);
        GLES20.glGenTextures(1, this.n, 0);
        ahsl.a(this.n[0]);
        GLES20.glBindTexture(3553, this.n[0]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        ahsl.b();
        GLUtils.texImage2D(3553, 0, this.i, 0);
        ahsl.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean c() {
        return true;
    }

    public final void e() {
        this.o = true;
    }

    public final void d() {
        if (this.i != null && this.n[0] != 0) {
            GLES20.glActiveTexture(33984);
            GLES20.glBlendFunc(770, 771);
            GLES20.glUniform1f(((ahwz) this.m.get()).i, this.k);
            GLES20.glBindTexture(3553, this.n[0]);
            if (this.o) {
                if (this.j) {
                    GLUtils.texImage2D(3553, 0, this.i, 0);
                } else {
                    GLUtils.texSubImage2D(3553, 0, 0, 0, this.i);
                }
                this.o = false;
            }
            ahsl.b();
            this.f.e.a(((ahwz) this.m.get()).h);
        }
    }
}
