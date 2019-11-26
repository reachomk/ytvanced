package defpackage;

import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;

/* renamed from: ahqm */
public class ahqm extends ahmq {
    public static final float[] m = new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};
    private final Surface i;
    private final SurfaceTexture j;
    private final bcaa k;
    public float n;
    private final int[] o = new int[1];
    private Canvas p;
    private boolean q;

    public ahqm(float f, float f2, ahsm ahsm, ahpn ahpn, bcaa bcaa) {
        super(ahsm, ahpn, bcaa);
        this.k = bcaa;
        GLES20.glActiveTexture(33984);
        GLES20.glGenTextures(1, this.o, 0);
        ahsl.a(this.o[0]);
        GLES20.glBindTexture(36197, this.o[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        ahsl.b();
        this.j = new SurfaceTexture(this.o[0]);
        this.j.setDefaultBufferSize(ahqm.b(f), ahqm.b(f2));
        this.i = new Surface(this.j);
        this.n = 1.0f;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean c() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a_(float f, float f2) {
        this.j.setDefaultBufferSize(ahqm.b(f), ahqm.b(f2));
    }

    public void d(ahnj ahnj) {
        super.d(ahnj);
        if (this.q) {
            this.j.updateTexImage();
            this.q = false;
        }
    }

    public final void d() {
        GLES20.glActiveTexture(33984);
        GLES20.glBlendFunc(770, 771);
        GLES20.glBindTexture(36197, this.o[0]);
        GLES20.glUniform1f(((ahwx) this.k.get()).i, this.n);
        GLES20.glUniform2f(((ahwx) this.k.get()).b, 1.0f, 1.0f);
        GLES20.glUniform2f(((ahwx) this.k.get()).d, 0.0f, 0.0f);
        ahsl.b();
    }

    public final Canvas e() {
        this.p = null;
        if (this.i.isValid()) {
            this.p = this.i.lockCanvas(null);
            this.p.drawColor(0, Mode.CLEAR);
        }
        return this.p;
    }

    public final void g() {
        Canvas canvas = this.p;
        if (canvas != null) {
            this.i.unlockCanvasAndPost(canvas);
            this.q = true;
        }
        this.p = null;
    }

    public void bd_() {
        this.i.release();
        this.j.release();
        super.bd_();
    }

    protected static int b(float f) {
        return Math.round(f / 0.1f);
    }
}
