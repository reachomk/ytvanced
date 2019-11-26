package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IAdOverlayService;

/* renamed from: mxa */
final class mxa implements wae {
    public IAdOverlayService a;

    public mxa(IAdOverlayService iAdOverlayService) {
        this.a = (IAdOverlayService) amqw.a((Object) iAdOverlayService, (Object) "service cannot be null");
    }

    public final void a(float f) {
    }

    public final void a(boolean z) {
    }

    public final void d() {
    }

    public final void a() {
        IAdOverlayService iAdOverlayService = this.a;
        if (iAdOverlayService != null) {
            try {
                iAdOverlayService.a();
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }

    public final void a(Bundle bundle) {
        IAdOverlayService iAdOverlayService = this.a;
        if (iAdOverlayService != null) {
            try {
                iAdOverlayService.a(bundle);
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }

    public final void b() {
        IAdOverlayService iAdOverlayService = this.a;
        if (iAdOverlayService != null) {
            try {
                iAdOverlayService.b();
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }

    public final void a(int i, int i2) {
        IAdOverlayService iAdOverlayService = this.a;
        if (iAdOverlayService != null) {
            try {
                iAdOverlayService.a(i, i2);
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }

    public final void c() {
        IAdOverlayService iAdOverlayService = this.a;
        if (iAdOverlayService != null) {
            try {
                iAdOverlayService.c();
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }
}
