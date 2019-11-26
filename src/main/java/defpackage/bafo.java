package defpackage;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;

/* renamed from: bafo */
final class bafo implements OnFrameAvailableListener {
    private final /* synthetic */ bafp a;

    bafo(bafp bafp) {
        this.a = bafp;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.a.d.getAndIncrement();
        synchronized (this.a.k) {
            if (!this.a.j) {
                bafr bafr = this.a.b;
                if (bafr != null) {
                    bafr.b();
                }
            }
        }
    }
}
