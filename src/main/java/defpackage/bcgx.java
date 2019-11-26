package defpackage;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;

/* renamed from: bcgx */
final /* synthetic */ class bcgx implements OnFrameAvailableListener {
    private final bcgy a;

    bcgx(bcgy bcgy) {
        this.a = bcgy;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        bcgy bcgy = this.a;
        synchronized (bcgy.f) {
            amrw.a(bcgy.g ^ 1, "frameAvailable already set, frame could be dropped", new Object[0]);
            bcgy.g = true;
            bcgy.f.notifyAll();
        }
    }
}
