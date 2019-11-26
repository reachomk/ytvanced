package defpackage;

import android.graphics.Rect;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: abzs */
public final class abzs implements abzk {
    public final abzb a;
    public final Object b = new Object();
    public SurfaceHolder c;
    public int d;
    public int e;
    private final SurfaceView f;
    private EGLSurface g;
    private Set h = abzm.a;

    public abzs(SurfaceView surfaceView, abzb abzb) {
        this.f = surfaceView;
        this.a = abzb;
        Rect surfaceFrame = surfaceView.getHolder().getSurfaceFrame();
        int i = 0;
        this.d = surfaceFrame != null ? surfaceFrame.width() : 0;
        if (surfaceFrame != null) {
            i = surfaceFrame.height();
        }
        this.e = i;
    }

    public final void a(boolean z) {
        this.h = z ? EnumSet.of(abzp.a) : abzm.a;
    }

    /* JADX WARNING: Missing block: B:26:0x005b, code skipped:
            return true;
     */
    public final boolean a(boolean r5, defpackage.abzm r6, defpackage.abyq r7) {
        /*
        r4 = this;
        r0 = r4.f;
        r0 = r0.getVisibility();
        r1 = 0;
        if (r0 != 0) goto L_0x0064;
    L_0x0009:
        r0 = r4.b;
        monitor-enter(r0);
        r2 = defpackage.abzs.c(r7);	 Catch:{ all -> 0x0061 }
        if (r2 != 0) goto L_0x0014;
    L_0x0012:
        monitor-exit(r0);	 Catch:{ all -> 0x0061 }
        return r1;
    L_0x0014:
        r2 = r4.c;	 Catch:{ all -> 0x0061 }
        if (r2 != 0) goto L_0x001a;
    L_0x0018:
        monitor-exit(r0);	 Catch:{ all -> 0x0061 }
        return r1;
    L_0x001a:
        r3 = r4.g;	 Catch:{ all -> 0x0061 }
        if (r3 != 0) goto L_0x0028;
    L_0x001e:
        r2 = r2.getSurface();	 Catch:{ all -> 0x0061 }
        r2 = r7.a(r2);	 Catch:{ all -> 0x0061 }
        r4.g = r2;	 Catch:{ all -> 0x0061 }
    L_0x0028:
        r2 = r4.c;	 Catch:{ all -> 0x0061 }
        r2 = r2.getSurface();	 Catch:{ all -> 0x0061 }
        if (r2 == 0) goto L_0x005c;
    L_0x0030:
        r2 = r2.isValid();	 Catch:{ all -> 0x0061 }
        if (r2 != 0) goto L_0x0037;
    L_0x0036:
        goto L_0x005c;
    L_0x0037:
        r2 = r4.g;	 Catch:{ all -> 0x0061 }
        r7.b(r2);	 Catch:{ all -> 0x0061 }
        r2 = r4.d;	 Catch:{ all -> 0x0061 }
        r3 = r4.e;	 Catch:{ all -> 0x0061 }
        android.opengl.GLES20.glViewport(r1, r1, r2, r3);	 Catch:{ all -> 0x0061 }
        r1 = r4.d;	 Catch:{ all -> 0x0061 }
        r2 = r4.e;	 Catch:{ all -> 0x0061 }
        r3 = r4.h;	 Catch:{ all -> 0x0061 }
        r6.a(r5, r1, r2, r3);	 Catch:{ all -> 0x0061 }
        r5 = r4.g;	 Catch:{ all -> 0x0061 }
        r5 = r7.c(r5);	 Catch:{ all -> 0x0061 }
        if (r5 != 0) goto L_0x0059;
    L_0x0054:
        r5 = "WARNING: swapBuffers() failed";
        defpackage.xtl.d(r5);	 Catch:{ all -> 0x0061 }
    L_0x0059:
        monitor-exit(r0);	 Catch:{ all -> 0x0061 }
        r5 = 1;
        return r5;
    L_0x005c:
        r4.a(r7);	 Catch:{ all -> 0x0061 }
        monitor-exit(r0);	 Catch:{ all -> 0x0061 }
        return r1;
    L_0x0061:
        r5 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0061 }
        throw r5;
    L_0x0064:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abzs.a(boolean, abzm, abyq):boolean");
    }

    public final void a(abyq abyq) {
        synchronized (this.b) {
            b(abyq);
        }
    }

    public final void b(abyq abyq) {
        if (abzs.c(abyq)) {
            EGLSurface eGLSurface = this.g;
            if (eGLSurface != null) {
                abyq.a(eGLSurface);
                if (EGL14.eglMakeCurrent(abyq.a, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT)) {
                    this.g = null;
                } else {
                    throw new abyw("eglMakeCurrent failed");
                }
            }
        }
        this.c = null;
    }

    private static boolean c(abyq abyq) {
        return abyq != null && abyq.c;
    }
}
