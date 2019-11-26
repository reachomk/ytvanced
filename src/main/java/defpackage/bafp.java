package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bafp */
public final class bafp {
    public final int a;
    public final bafr b;
    public final float[] c = new float[16];
    public final AtomicInteger d = new AtomicInteger(0);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final int[] f = new int[1];
    public volatile SurfaceTexture g;
    public volatile Surface h;
    public volatile boolean i = false;
    public volatile boolean j = false;
    public final Object k = new Object();
    private final bafu l;
    private final int m;
    private final int n;

    public bafp(int i, int i2, int i3, bafr bafr, bafu bafu) {
        this.a = i;
        this.m = i2;
        this.n = i3;
        this.b = bafr;
        this.l = bafu;
        Matrix.setIdentityM(this.c, 0);
    }

    public final void a() {
        if (!this.i) {
            GLES20.glGenTextures(1, this.f, 0);
            a(this.f[0]);
        }
    }

    public final void a(int i) {
        if (!this.i) {
            this.f[0] = i;
            if (this.g == null) {
                this.g = this.l.a(this.f[0]);
                if (this.m > 0 && this.n > 0) {
                    this.g.setDefaultBufferSize(this.m, this.n);
                }
                this.g.setOnFrameAvailableListener(new bafo(this), new Handler(Looper.getMainLooper()));
                this.h = new Surface(this.g);
            } else {
                this.g.attachToGLContext(this.f[0]);
            }
            this.i = true;
            bafr bafr = this.b;
            if (bafr != null) {
                bafr.a();
            }
        }
    }

    public final void a(bafx bafx) {
        synchronized (this.k) {
            this.j = true;
        }
        if (!this.e.getAndSet(true)) {
            bafr bafr = this.b;
            if (bafr != null) {
                bafr.c();
            }
            if (this.g != null) {
                this.g.release();
                this.g = null;
                if (this.h != null) {
                    this.h.release();
                }
                this.h = null;
            }
            bafx.a(this.a, 0, 0, this.c);
        }
    }
}
