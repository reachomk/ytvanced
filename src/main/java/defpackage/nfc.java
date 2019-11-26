package defpackage;

import android.graphics.SurfaceTexture;
import android.os.RemoteException;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurfaceTextureService;

/* renamed from: nfc */
public final class nfc implements SurfaceTextureListener {
    public ISurfaceTextureService a;
    public nfb b;

    public nfc(ISurfaceTextureService iSurfaceTextureService, nfb nfb) {
        this.a = (ISurfaceTextureService) amqw.a((Object) iSurfaceTextureService);
        this.b = (nfb) amqw.a((Object) nfb);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.a != null) {
            try {
                this.a.a(new Surface(surfaceTexture));
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
            this.b.g();
        }
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        ISurfaceTextureService iSurfaceTextureService = this.a;
        if (iSurfaceTextureService != null) {
            try {
                iSurfaceTextureService.a(i, i2);
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ISurfaceTextureService iSurfaceTextureService = this.a;
        if (iSurfaceTextureService != null) {
            try {
                iSurfaceTextureService.a();
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ISurfaceTextureService iSurfaceTextureService = this.a;
        if (iSurfaceTextureService != null) {
            try {
                iSurfaceTextureService.b();
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
            this.b.h();
        }
        return true;
    }
}
