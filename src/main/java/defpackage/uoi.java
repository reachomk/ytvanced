package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Looper;

/* renamed from: uoi */
final class uoi implements uol {
    uoi() {
    }

    public final SurfaceTexture a(int i) {
        uhy.b(Looper.myLooper() == null);
        return new SurfaceTexture(i);
    }
}
