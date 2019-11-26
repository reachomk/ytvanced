package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.Matrix;

/* renamed from: zhb */
public final /* synthetic */ class zhb implements Runnable {
    private final zgz a;
    private final SurfaceTexture b;
    private final int c;

    public zhb(zgz zgz, SurfaceTexture surfaceTexture, int i) {
        this.a = zgz;
        this.b = surfaceTexture;
        this.c = i;
    }

    public final void run() {
        int i;
        int i2;
        zgz zgz = this.a;
        SurfaceTexture surfaceTexture = this.b;
        int i3 = this.c;
        zgz.b.a(0);
        if (zgz.s < 0) {
            zgz.s = surfaceTexture.getTimestamp();
        }
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        boolean z = true;
        float f = (fArr[0] * fArr[5]) - (fArr[1] * fArr[4]);
        Object obj = (zgz.x || f <= 0.0f) ? null : 1;
        if (f > 0.0f) {
            if (zgz.i < 0) {
                z = false;
            }
            amqw.b(z);
            i = zgz.i;
        } else {
            if (zgz.h < 0) {
                z = false;
            }
            amqw.b(z);
            i = zgz.h;
        }
        if (obj != null) {
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            Matrix.translateM(fArr, 0, -1.0f, 0.0f, 0.0f);
        }
        if (f > 0.0f) {
            i2 = ((zgz.k - i) + 360) % 360;
            if (obj != null) {
                i2 = (i2 + 180) % 360;
            }
        } else {
            i2 = (zgz.k + i) % 360;
        }
        i2 = i2 == 180 ? 270 : 90;
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setRotateM(fArr2, 0, (float) i2, 0.0f, 0.0f, 1.0f);
        zgz.e.a(i3, fArr2, fArr);
        long timestamp = surfaceTexture.getTimestamp();
        zgz.t = timestamp;
        ujl ujl = zgz.d;
        EGLExt.eglPresentationTimeANDROID(ujl.b, ujl.d, timestamp - zgz.s);
        ujl ujl2 = zgz.d;
        EGL14.eglSwapBuffers(ujl2.b, ujl2.d);
        zgz.c();
    }
}
