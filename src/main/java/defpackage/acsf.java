package defpackage;

import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Handler;
import android.view.Surface;

/* renamed from: acsf */
public final class acsf implements abzq {
    private final /* synthetic */ acrz a;

    public acsf(acrz acrz) {
        this.a = acrz;
    }

    public final void a(Surface surface) {
        this.a.g.a(surface);
    }

    public final void a(boolean z) {
        abzt abzt = this.a.g;
        if (abzt != null) {
            abzt.a(z);
        }
    }

    public final void b(boolean z) {
        acab acab = this.a.m;
        if (acab != null) {
            acab.a(z);
        }
    }

    public final void a(long j) {
        abzt abzt = this.a.g;
        EGLContext eGLContext = abzt != null ? abzt.a : null;
        if (eGLContext == null || !abzt.b()) {
            String valueOf = String.valueOf(eGLContext);
            this.a.g.b();
            valueOf.length();
            return;
        }
        this.a.g.a().a(eGLContext);
        acrz acrz = this.a;
        abyt abyt = acrz.h;
        int i = abyt != null ? abyt.b : 0;
        if (i != 0) {
            int c = acrz.g.c();
            int d = this.a.g.d();
            GLES20.glViewport(0, 0, c, d);
            this.a.j.a(i, c, d, c, d);
            this.a.g.a(j);
        }
    }

    public final void a(Runnable runnable, Handler handler) {
        this.a.d.a(runnable, handler);
    }
}
