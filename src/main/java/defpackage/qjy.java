package defpackage;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;

@qlp
/* renamed from: qjy */
public final class qjy implements pdj, pdk, pdl {
    public pdn a;
    public pdt b;
    public pcn c;
    private final qjm d;

    public qjy(qjm qjm) {
        this.d = qjm;
    }

    public final void a(String str, String str2) {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.d.a(str, str2);
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void e() {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.d.a();
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void c() {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.d.b();
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void a(int i) {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.d.a(i);
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void d() {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.d.c();
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void b() {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.d.d();
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void a() {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.d.e();
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void j() {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.d.a();
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void h() {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.d.b();
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void b(int i) {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.d.a(i);
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void i() {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.d.c();
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void g() {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.d.d();
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void f() {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.d.e();
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void a(MediationNativeAdapter mediationNativeAdapter, pdn pdn) {
        pzr.b("#008 Must be called on the main UI thread.");
        this.a = pdn;
        this.b = null;
        qjy.a(mediationNativeAdapter);
        try {
            this.d.e();
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void a(MediationNativeAdapter mediationNativeAdapter, pdt pdt) {
        pzr.b("#008 Must be called on the main UI thread.");
        this.b = pdt;
        this.a = null;
        qjy.a(mediationNativeAdapter);
        try {
            this.d.e();
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    private static void a(MediationNativeAdapter mediationNativeAdapter) {
        if (!(mediationNativeAdapter instanceof AdMobAdapter)) {
            new pbl().a(new qjt());
        }
    }

    public final void a(pcn pcn) {
        Object a;
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            a = ((rpd) pcn).a.a();
        } catch (RemoteException e) {
            qml.a("", e);
            a = null;
        }
        String valueOf = String.valueOf(a);
        String str = "Adapter called onAdLoaded with template id ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            str.concat(valueOf);
        }
        this.c = pcn;
        try {
            this.d.e();
        } catch (RemoteException e2) {
            qml.c("#007 Could not call remote method.", e2);
        }
    }

    public final void a(pcn pcn, String str) {
        if (pcn instanceof rpd) {
            try {
                this.d.a(((rpd) pcn).a, str);
                return;
            } catch (RemoteException e) {
                qml.c("#007 Could not call remote method.", e);
                return;
            }
        }
        qml.b("Unexpected native custom template ad type.");
    }

    public final void c(int i) {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.d.a(i);
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void k() {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.d.d();
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void l() {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.d.b();
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void m() {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.d.c();
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void n() {
        pzr.b("#008 Must be called on the main UI thread.");
        pdn pdn = this.a;
        pdt pdt = this.b;
        String str = "#007 Could not call remote method.";
        if (this.c == null) {
            if (pdn == null && pdt == null) {
                qml.c(str, null);
                return;
            } else if (pdt != null && !pdt.n) {
                return;
            } else {
                if (!(pdn == null || pdn.j)) {
                    return;
                }
            }
        }
        try {
            this.d.a();
        } catch (RemoteException e) {
            qml.c(str, e);
        }
    }

    public final void o() {
        pzr.b("#008 Must be called on the main UI thread.");
        pdn pdn = this.a;
        pdt pdt = this.b;
        String str = "#007 Could not call remote method.";
        if (this.c == null) {
            if (pdn == null && pdt == null) {
                qml.c(str, null);
                return;
            } else if (pdt != null && !pdt.m) {
                return;
            } else {
                if (!(pdn == null || pdn.i)) {
                    return;
                }
            }
        }
        try {
            this.d.f();
        } catch (RemoteException e) {
            qml.c(str, e);
        }
    }
}
