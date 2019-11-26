package defpackage;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ILiveOverlayService;

/* renamed from: nba */
final class nba implements aict {
    public ILiveOverlayService a;

    public nba(ILiveOverlayService iLiveOverlayService) {
        this.a = (ILiveOverlayService) amqw.a((Object) iLiveOverlayService, (Object) "service cannot be null");
    }

    public final void a() {
        ILiveOverlayService iLiveOverlayService = this.a;
        if (iLiveOverlayService != null) {
            try {
                iLiveOverlayService.b();
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }

    public final void b() {
        ILiveOverlayService iLiveOverlayService = this.a;
        if (iLiveOverlayService != null) {
            try {
                iLiveOverlayService.b();
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }
}
