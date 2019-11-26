package defpackage;

import android.opengl.EGLContext;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;

/* renamed from: abzt */
public final class abzt implements abzo {
    public EGLContext a;
    private abys b;
    private Surface c;
    private boolean d;

    public final void a(EGLContext eGLContext) {
        this.a = eGLContext;
    }

    public final synchronized abys a() {
        return this.b;
    }

    public final synchronized boolean b() {
        abys abys = this.b;
        if (abys != null) {
            Surface surface = abys.c;
            if (surface != null && surface.isValid() && this.d) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void a(boolean z) {
        this.d = z;
    }

    public final synchronized int c() {
        abys abys = this.b;
        if (abys == null) {
            return 0;
        }
        EGLSurface eGLSurface = abys.a;
        if (eGLSurface == null) {
            return 0;
        }
        return abys.b.a(eGLSurface, 12375);
    }

    public final synchronized int d() {
        abys abys = this.b;
        if (abys == null) {
            return 0;
        }
        EGLSurface eGLSurface = abys.a;
        if (eGLSurface == null) {
            return 0;
        }
        return abys.b.a(eGLSurface, 12374);
    }

    public final synchronized void a(long j) {
        abys abys = this.b;
        if (!(abys == null || abys.c == null)) {
            abyq abyq = abys.b;
            EGLExt.eglPresentationTimeANDROID(abyq.a, abys.a, j);
            abys.b.c(abys.a);
        }
    }

    public final synchronized void e() {
        f();
        this.c = null;
        this.a = null;
    }

    public final synchronized void a(Surface surface) {
        if (this.c != surface) {
            f();
            if (surface != null) {
                this.b = new abys(surface);
            }
            this.c = surface;
        }
    }

    private final void f() {
        abys abys = this.b;
        if (abys != null) {
            abys.a();
            this.b = null;
        }
    }
}
