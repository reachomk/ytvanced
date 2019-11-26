package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;

/* renamed from: ozy */
public final class ozy extends Surface {
    private static int a;
    private static boolean b;
    private final ozx c;
    private boolean d;

    public static synchronized boolean a(Context context) {
        int i;
        synchronized (ozy.class) {
            if (!b) {
                if (ozp.a >= 24 && ((ozp.a >= 26 || !("samsung".equals(ozp.c) || "XT1650".equals(ozp.d))) && (ozp.a >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")))) {
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        i = eglQueryString.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                        a = i;
                        b = true;
                    }
                }
                i = 0;
                a = i;
                b = true;
            }
            i = a;
        }
        return i != 0;
    }

    public static ozy a(Context context, boolean z) {
        if (ozp.a >= 17) {
            int i = 0;
            boolean z2 = !z || ozy.a(context);
            oxz.b(z2);
            ozx ozx = new ozx();
            int i2 = z ? a : 0;
            ozx.start();
            ozx.b = new Handler(ozx.getLooper(), ozx);
            ozx.a = new oyi(ozx.b);
            synchronized (ozx) {
                ozx.b.obtainMessage(1, i2, 0).sendToTarget();
                while (ozx.e == null && ozx.d == null && ozx.c == null) {
                    try {
                        ozx.wait();
                    } catch (InterruptedException unused) {
                        i = 1;
                    }
                }
            }
            if (i != 0) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = ozx.d;
            if (runtimeException == null) {
                Error error = ozx.c;
                if (error == null) {
                    return (ozy) oxz.a(ozx.e);
                }
                throw error;
            }
            throw runtimeException;
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    public final void release() {
        super.release();
        synchronized (this.c) {
            if (!this.d) {
                ozx ozx = this.c;
                oxz.a(ozx.b);
                ozx.b.sendEmptyMessage(2);
                this.d = true;
            }
        }
    }

    /* synthetic */ ozy(ozx ozx, SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
        this.c = ozx;
    }
}
