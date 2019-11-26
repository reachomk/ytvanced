package defpackage;

import android.opengl.GLES20;

/* renamed from: zkf */
final /* synthetic */ class zkf implements Runnable {
    private final zkg a;

    zkf(zkg zkg) {
        this.a = zkg;
    }

    public final void run() {
        zkg zkg = this.a;
        try {
            zkg.d = zkd.a(2, 2);
            zkg.d.b();
            zkd.a(zkg.d);
            zkg.e = GLES20.glGetString(7937);
            zkg.f = GLES20.glGetString(7938);
        } catch (RuntimeException e) {
            xtl.a("GlDeviceInfo", "Failed to init GL", e);
        }
        try {
            zkd.c();
        } catch (RuntimeException e2) {
            xtl.a("GlDeviceInfo", "focusNone failed: ", e2);
        }
        try {
            zkd zkd = zkg.d;
            if (zkd != null) {
                zkd.e();
            }
        } catch (RuntimeException e22) {
            xtl.a("GlDeviceInfo", "FilterRenderTarget.release failed: ", e22);
        }
        synchronized (zkg.b) {
            zkg.c = true;
            zkg.b.notifyAll();
            zkg.a.quit();
        }
    }
}
