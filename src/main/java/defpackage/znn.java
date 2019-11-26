package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import java.util.Map;

/* renamed from: znn */
final class znn implements SurfaceTextureListener {
    private final String a;
    private final Map b;
    private final Map c;
    private final xsd d;

    znn(String str, Map map, Map map2, xsd xsd) {
        this.a = str;
        this.b = map;
        this.c = map2;
        this.d = xsd;
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        synchronized (this.b) {
            if (this.c.containsKey(this.a)) {
                if (!this.b.containsKey(this.a)) {
                    Map map = this.b;
                    String str = this.a;
                    map.put(str, (TextureView) this.c.get(str));
                }
                this.c.remove(this.a);
            }
            this.d.a(this.a);
        }
    }
}
