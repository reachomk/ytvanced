package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;

@qlp
/* renamed from: qmd */
public final class qmd implements pef {
    private final qmc a;

    public qmd(qmc qmc) {
        this.a = qmc;
    }

    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.a.a(qct.a((Object) mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void b(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.a.b(qct.a((Object) mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void c(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.a.c(qct.a((Object) mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void d(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.a.d(qct.a((Object) mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void e(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.a.e(qct.a((Object) mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, ped ped) {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.a.a(qct.a((Object) mediationRewardedVideoAdAdapter), new qmg(ped));
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void a(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter, int i) {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.a.a(qct.a((Object) mediationRewardedVideoAdAdapter), i);
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void f(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.a.f(qct.a((Object) mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void g(MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter) {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.a.g(qct.a((Object) mediationRewardedVideoAdAdapter));
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }

    public final void a(Bundle bundle) {
        pzr.b("#008 Must be called on the main UI thread.");
        try {
            this.a.a(bundle);
        } catch (RemoteException e) {
            qml.c("#007 Could not call remote method.", e);
        }
    }
}
