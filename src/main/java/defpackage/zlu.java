package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView.SurfaceTextureListener;

/* renamed from: zlu */
final class zlu implements SurfaceTextureListener {
    private final String a;
    private final /* synthetic */ zld b;

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (!this.b.k) {
            zld zld = this.b;
            if (zld.b != null) {
                zld.i.a(this.a);
            } else if (zld.o()) {
                this.b.q();
            }
        }
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        synchronized (this.b.j) {
            zkd zkd = (zkd) this.b.j.get(surfaceTexture);
            if (zkd != null) {
                zkk.a(zkd);
                this.b.j.remove(surfaceTexture);
            }
        }
        return true;
    }

    /* synthetic */ zlu(zld zld, String str) {
        this.b = zld;
        this.a = str;
    }
}
