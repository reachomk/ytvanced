package defpackage;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IPlayerUiService;

/* renamed from: nbm */
final class nbm implements aiuj {
    public IPlayerUiService a;

    public nbm(IPlayerUiService iPlayerUiService) {
        this.a = (IPlayerUiService) amqw.a((Object) iPlayerUiService, (Object) "service cannot be null");
    }

    public final void a() {
        IPlayerUiService iPlayerUiService = this.a;
        if (iPlayerUiService != null) {
            try {
                iPlayerUiService.a();
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }
}
