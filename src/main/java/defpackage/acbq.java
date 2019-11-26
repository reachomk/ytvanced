package defpackage;

import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Handler;
import android.view.Surface;

/* renamed from: acbq */
final class acbq implements abzq {
    private final /* synthetic */ acay a;

    acbq(acay acay) {
        this.a = acay;
    }

    public final void a(Surface surface) {
        abzt abzt = this.a.u;
        if (abzt != null) {
            abzt.a(surface);
        }
    }

    public final void a(boolean z) {
        abzt abzt = this.a.u;
        if (abzt != null) {
            abzt.a(z);
        }
    }

    public final void b(boolean z) {
        acax acax = this.a.g;
        if (acax != null) {
            acax.a(z);
        }
    }

    public final void a(long j) {
        abzt abzt = this.a.u;
        EGLContext eGLContext = abzt.a;
        if (eGLContext == null || !abzt.b()) {
            String valueOf = String.valueOf(eGLContext);
            this.a.u.b();
            valueOf.length();
            return;
        }
        this.a.u.a().a(eGLContext);
        acay acay = this.a;
        int i = acay.v.b;
        if (i != 0) {
            int c = acay.u.c();
            int d = this.a.u.d();
            GLES20.glViewport(0, 0, c, d);
            this.a.t.a(i, c, d, c, d);
            this.a.u.a(j);
        }
    }

    public final void a(Runnable runnable, Handler handler) {
        this.a.f.a(runnable, handler);
    }
}
