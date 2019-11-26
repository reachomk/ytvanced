package defpackage;

import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IControlsOverlayService;

/* renamed from: myp */
final class myp implements aibe, aiff, aigf, aihy, muy {
    public IControlsOverlayService a;

    public myp(IControlsOverlayService iControlsOverlayService) {
        this.a = (IControlsOverlayService) amqw.a((Object) iControlsOverlayService);
    }

    public final void a(long j) {
    }

    public final void aJ_() {
        IControlsOverlayService iControlsOverlayService = this.a;
        if (iControlsOverlayService != null) {
            try {
                iControlsOverlayService.a();
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }

    public final void d() {
        IControlsOverlayService iControlsOverlayService = this.a;
        if (iControlsOverlayService != null) {
            try {
                iControlsOverlayService.b();
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }

    public final void e() {
        IControlsOverlayService iControlsOverlayService = this.a;
        if (iControlsOverlayService != null) {
            try {
                iControlsOverlayService.c();
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }

    public final void b(long j) {
        IControlsOverlayService iControlsOverlayService = this.a;
        if (iControlsOverlayService != null) {
            try {
                iControlsOverlayService.a(j);
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }

    public final void b() {
        IControlsOverlayService iControlsOverlayService = this.a;
        if (iControlsOverlayService != null) {
            try {
                iControlsOverlayService.d();
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }

    public final void a() {
        IControlsOverlayService iControlsOverlayService = this.a;
        if (iControlsOverlayService != null) {
            try {
                iControlsOverlayService.e();
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }

    public final void a(int i) {
        IControlsOverlayService iControlsOverlayService = this.a;
        if (iControlsOverlayService != null) {
            try {
                iControlsOverlayService.a(i);
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }

    public final void f() {
        IControlsOverlayService iControlsOverlayService = this.a;
        if (iControlsOverlayService != null) {
            try {
                iControlsOverlayService.f();
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }

    public final void g() {
        IControlsOverlayService iControlsOverlayService = this.a;
        if (iControlsOverlayService != null) {
            try {
                iControlsOverlayService.g();
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }

    public final void h() {
        IControlsOverlayService iControlsOverlayService = this.a;
        if (iControlsOverlayService != null) {
            try {
                iControlsOverlayService.h();
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }

    public final void b(boolean z) {
        IControlsOverlayService iControlsOverlayService = this.a;
        if (iControlsOverlayService != null) {
            try {
                iControlsOverlayService.a(z);
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }

    public final void i() {
        IControlsOverlayService iControlsOverlayService = this.a;
        if (iControlsOverlayService != null) {
            try {
                iControlsOverlayService.i();
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }

    public final void j() {
        IControlsOverlayService iControlsOverlayService = this.a;
        if (iControlsOverlayService != null) {
            try {
                iControlsOverlayService.j();
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }

    public final void a(ajis ajis) {
        IControlsOverlayService iControlsOverlayService = this.a;
        if (iControlsOverlayService != null) {
            try {
                iControlsOverlayService.a(ajis);
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }

    public final void k() {
        IControlsOverlayService iControlsOverlayService = this.a;
        if (iControlsOverlayService != null) {
            try {
                iControlsOverlayService.k();
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }

    public final void c() {
        IControlsOverlayService iControlsOverlayService = this.a;
        if (iControlsOverlayService != null) {
            try {
                iControlsOverlayService.l();
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
        }
    }
}
