package defpackage;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.opengl.GLES20;
import android.os.Handler;
import android.view.Surface;

/* renamed from: ahpx */
public final class ahpx implements ahsr, OnFrameAvailableListener {
    public final int a;
    public final float[] b = new float[16];
    public SurfaceTexture c;
    public boolean d;
    public long e;
    private final ahsi f;
    private final ahpw g = new ahpw(this);
    private final Handler h;
    private final Surface i;

    public ahpx(Handler handler, ahsi ahsi) {
        this.h = (Handler) amqw.a((Object) handler);
        this.f = (ahsi) amqw.a((Object) ahsi);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        ahsl.a(iArr[0]);
        int i = iArr[0];
        this.a = i;
        this.c = new SurfaceTexture(i);
        this.c.setOnFrameAvailableListener(this);
        this.i = new Surface(this.c);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.a);
        ahsl.b();
    }

    public final boolean d() {
        return false;
    }

    public final int e() {
        return 0;
    }

    public final float f() {
        return 0.0f;
    }

    public final ahtn h() {
        return null;
    }

    public final void a() {
        if (this.d) {
            this.d = false;
            onFrameAvailable(null);
        }
    }

    public final void b() {
        this.h.obtainMessage(0, this.i).sendToTarget();
    }

    public final void c() {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.a);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        ahsl.b();
    }

    public final float[] g() {
        return this.b;
    }

    public final long i() {
        return this.e;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f.a(this.g);
    }
}
