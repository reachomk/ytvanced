package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.os.Build.VERSION;

/* renamed from: zkj */
final /* synthetic */ class zkj implements Runnable {
    private final zkk a;
    private final EGLContext b;

    zkj(zkk zkk, EGLContext eGLContext) {
        this.a = zkk;
        this.b = eGLContext;
    }

    public final void run() {
        zkk zkk = this.a;
        EGLContext eGLContext = this.b;
        Thread.currentThread().getId();
        synchronized (zkk.a) {
            if (eGLContext != null) {
                zkk.h = zkd.a(1, 1, eGLContext);
            } else {
                zkk.h = zkd.a(1, 1);
            }
            zkk.h.b();
            zkd.a(zkk.h);
            if (VERSION.SDK_INT >= 21) {
                zkk.i = EGL14.eglGetCurrentContext().getNativeHandle();
            } else {
                zkk.i = (long) EGL14.eglGetCurrentContext().getHandle();
            }
            zkk.a.notifyAll();
        }
    }
}
