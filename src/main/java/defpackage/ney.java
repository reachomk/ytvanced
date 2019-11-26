package defpackage;

import android.os.RemoteException;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurfaceHolderService;

/* renamed from: ney */
final class ney implements Callback {
    public ISurfaceHolderService a;
    public nex b;

    public ney(ISurfaceHolderService iSurfaceHolderService, nex nex) {
        this.a = (ISurfaceHolderService) amqw.a((Object) iSurfaceHolderService);
        this.b = (nex) amqw.a((Object) nex);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        ISurfaceHolderService iSurfaceHolderService = this.a;
        if (iSurfaceHolderService != null) {
            try {
                iSurfaceHolderService.a(surfaceHolder.getSurface());
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
            nex nex = this.b;
            surfaceHolder.getSurface();
            nex.g();
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ISurfaceHolderService iSurfaceHolderService = this.a;
        if (iSurfaceHolderService != null) {
            try {
                iSurfaceHolderService.a();
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
            this.b.h();
        }
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        ISurfaceHolderService iSurfaceHolderService = this.a;
        if (iSurfaceHolderService != null) {
            try {
                iSurfaceHolderService.a(i, i2, i3);
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }
}
