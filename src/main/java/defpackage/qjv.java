package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.internal.zzaxl;
import com.google.android.gms.internal.zzaxm;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

@qlp
/* renamed from: qjv */
public final class qjv extends qjj {
    private final pdi a;
    private qjy b;

    public qjv(pdi pdi) {
        this.a = pdi;
    }

    public final qcs a() {
        pdi pdi = this.a;
        if (pdi instanceof MediationBannerAdapter) {
            try {
                return qct.a(((MediationBannerAdapter) pdi).getBannerView());
            } catch (Throwable th) {
                qml.a("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String valueOf = String.valueOf(pdi.getClass().getCanonicalName());
            String str = "Not a MediationBannerAdapter: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            qml.b(valueOf);
            throw new RemoteException();
        }
    }

    public final void a(qcs qcs, rkz rkz, rky rky, String str, qjm qjm) {
        a(qcs, rkz, rky, str, null, qjm);
    }

    public final void a(qcs qcs, rkz rkz, rky rky, String str, String str2, qjm qjm) {
        rkz rkz2 = rkz;
        rky rky2 = rky;
        pdi pdi = this.a;
        if (pdi instanceof MediationBannerAdapter) {
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) pdi;
                List list = rky2.c;
                Set hashSet = list != null ? new HashSet(list) : null;
                long j = rky2.a;
                qjw qjw = new qjw(j != -1 ? new Date(j) : null, rky2.b, hashSet, rky2.f, qjv.a(rky), rky2.e, rky2.h);
                Bundle bundle = rky2.g;
                mediationBannerAdapter.requestBannerAd((Context) qct.a(qcs), new qjy(qjm), a(str, rky2, str2), peg.a(rkz2.c, rkz2.b, rkz2.a), qjw, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
            } catch (Throwable th) {
                qml.a("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String valueOf = String.valueOf(pdi.getClass().getCanonicalName());
            String str3 = "Not a MediationBannerAdapter: ";
            qml.b(valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf));
            throw new RemoteException();
        }
    }

    public final Bundle j() {
        pdi pdi = this.a;
        if (pdi instanceof zzaxl) {
            return ((zzaxl) pdi).zznt();
        }
        String valueOf = String.valueOf(pdi.getClass().getCanonicalName());
        String str = "Not a v2 MediationBannerAdapter: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        qml.b(valueOf);
        return new Bundle();
    }

    public final void a(qcs qcs, rky rky, String str, qjm qjm) {
        a(qcs, rky, str, null, qjm);
    }

    public final void a(qcs qcs, rky rky, String str, String str2, qjm qjm) {
        rky rky2 = rky;
        pdi pdi = this.a;
        if (pdi instanceof MediationInterstitialAdapter) {
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) pdi;
                List list = rky2.c;
                Set hashSet = list != null ? new HashSet(list) : null;
                long j = rky2.a;
                qjw qjw = new qjw(j != -1 ? new Date(j) : null, rky2.b, hashSet, rky2.f, qjv.a(rky), rky2.e, rky2.h);
                Bundle bundle = rky2.g;
                mediationInterstitialAdapter.requestInterstitialAd((Context) qct.a(qcs), new qjy(qjm), a(str, rky2, str2), qjw, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
            } catch (Throwable th) {
                qml.a("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String valueOf = String.valueOf(pdi.getClass().getCanonicalName());
            String str3 = "Not a MediationInterstitialAdapter: ";
            qml.b(valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf));
            throw new RemoteException();
        }
    }

    public final Bundle k() {
        pdi pdi = this.a;
        if (pdi instanceof zzaxm) {
            return ((zzaxm) pdi).getInterstitialAdapterInfo();
        }
        String valueOf = String.valueOf(pdi.getClass().getCanonicalName());
        String str = "Not a v2 MediationInterstitialAdapter: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        qml.b(valueOf);
        return new Bundle();
    }

    public final void a(qcs qcs, rky rky, String str, String str2, qjm qjm, roh roh, List list) {
        rky rky2 = rky;
        pdi pdi = this.a;
        if (pdi instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) pdi;
                List list2 = rky2.c;
                Bundle bundle = null;
                Set hashSet = list2 != null ? new HashSet(list2) : null;
                long j = rky2.a;
                qjz qjz = new qjz(j != -1 ? new Date(j) : null, rky2.b, hashSet, rky2.f, qjv.a(rky), rky2.e, roh, list, rky2.h);
                Bundle bundle2 = rky2.g;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationNativeAdapter.getClass().getName());
                }
                this.b = new qjy(qjm);
                mediationNativeAdapter.requestNativeAd((Context) qct.a(qcs), this.b, a(str, rky2, str2), qjz, bundle);
            } catch (Throwable th) {
                qml.a("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String valueOf = String.valueOf(pdi.getClass().getCanonicalName());
            String str3 = "Not a MediationNativeAdapter: ";
            qml.b(valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf));
            throw new RemoteException();
        }
    }

    public final Bundle l() {
        return new Bundle();
    }

    public final qjn h() {
        pdn pdn = this.b.a;
        return pdn instanceof pdm ? new qjx((pdm) pdn) : null;
    }

    public final qjr p() {
        pdt pdt = this.b.b;
        return pdt != null ? new qki(pdt) : null;
    }

    public final qjp i() {
        pdn pdn = this.b.a;
        return pdn instanceof pdp ? new qka((pdp) pdn) : null;
    }

    public final rpb n() {
        pcn pcn = this.b.c;
        return pcn instanceof rpd ? ((rpd) pcn).a : null;
    }

    public final boolean m() {
        return this.a instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    public final void a(qcs qcs, rky rky, String str, qmc qmc, String str2) {
        rky rky2 = rky;
        pdi pdi = this.a;
        if (pdi instanceof MediationRewardedVideoAdAdapter) {
            try {
                Bundle bundle;
                pdf pdf;
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) pdi;
                Bundle a = a(str2, rky2, null);
                if (rky2 != null) {
                    List list = rky2.c;
                    Set hashSet = list != null ? new HashSet(list) : null;
                    long j = rky2.a;
                    pdf qjw = new qjw(j != -1 ? new Date(j) : null, rky2.b, hashSet, rky2.f, qjv.a(rky), rky2.e, rky2.h);
                    Bundle bundle2 = rky2.g;
                    bundle = bundle2 == null ? null : bundle2.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
                } else {
                    pdf = null;
                    bundle = pdf;
                }
                mediationRewardedVideoAdAdapter.initialize((Context) qct.a(qcs), pdf, str, new qmd(qmc), a, bundle);
            } catch (Throwable th) {
                qml.a("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String valueOf = String.valueOf(pdi.getClass().getCanonicalName());
            String str3 = "Not a MediationRewardedVideoAdAdapter: ";
            qml.b(valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf));
            throw new RemoteException();
        }
    }

    public final void a(qcs qcs, qmc qmc, List list) {
        pdi pdi = this.a;
        if (pdi instanceof InitializableMediationRewardedVideoAdAdapter) {
            try {
                InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) pdi;
                ArrayList arrayList = new ArrayList();
                for (String a : list) {
                    arrayList.add(a(a, null, null));
                }
                initializableMediationRewardedVideoAdAdapter.initialize((Context) qct.a(qcs), new qmd(qmc), arrayList);
            } catch (Throwable th) {
                qml.b("Could not initialize rewarded video adapter.", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String valueOf = String.valueOf(pdi.getClass().getCanonicalName());
            String str = "Not an InitializableMediationRewardedVideoAdAdapter: ";
            qml.b(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            throw new RemoteException();
        }
    }

    public final void a(rky rky, String str) {
        a(rky, str, null);
    }

    public final void a(rky rky, String str, String str2) {
        pdi pdi = this.a;
        if (pdi instanceof MediationRewardedVideoAdAdapter) {
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) pdi;
                List list = rky.c;
                Bundle bundle = null;
                Set hashSet = list != null ? new HashSet(list) : null;
                long j = rky.a;
                qjw qjw = new qjw(j != -1 ? new Date(j) : null, rky.b, hashSet, rky.f, qjv.a(rky), rky.e, rky.h);
                Bundle bundle2 = rky.g;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
                }
                mediationRewardedVideoAdAdapter.loadAd(qjw, a(str, rky, str2), bundle);
            } catch (Throwable th) {
                qml.a("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String valueOf = String.valueOf(pdi.getClass().getCanonicalName());
            str = "Not a MediationRewardedVideoAdAdapter: ";
            qml.b(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            throw new RemoteException();
        }
    }

    public final void f() {
        pdi pdi = this.a;
        if (pdi instanceof MediationRewardedVideoAdAdapter) {
            try {
                ((MediationRewardedVideoAdAdapter) pdi).showVideo();
            } catch (Throwable th) {
                qml.a("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String valueOf = String.valueOf(pdi.getClass().getCanonicalName());
            String str = "Not a MediationRewardedVideoAdAdapter: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            qml.b(valueOf);
            throw new RemoteException();
        }
    }

    public final boolean g() {
        pdi pdi = this.a;
        if (pdi instanceof MediationRewardedVideoAdAdapter) {
            try {
                return ((MediationRewardedVideoAdAdapter) pdi).isInitialized();
            } catch (Throwable th) {
                qml.a("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String valueOf = String.valueOf(pdi.getClass().getCanonicalName());
            String str = "Not a MediationRewardedVideoAdAdapter: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            qml.b(valueOf);
            throw new RemoteException();
        }
    }

    public final void a(boolean z) {
        pdi pdi = this.a;
        if (pdi instanceof pdq) {
            try {
                ((pdq) pdi).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                qml.a("", th);
                return;
            }
        }
        String valueOf = String.valueOf(pdi.getClass().getCanonicalName());
        String str = "Not an OnImmersiveModeUpdatedListener: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            str.concat(valueOf);
        }
    }

    public final rmt o() {
        pdi pdi = this.a;
        if (pdi instanceof pea) {
            try {
                return ((pea) pdi).getVideoController();
            } catch (Throwable th) {
                qml.a("", th);
            }
        }
        return null;
    }

    public final void b() {
        pdi pdi = this.a;
        if (pdi instanceof MediationInterstitialAdapter) {
            try {
                ((MediationInterstitialAdapter) pdi).showInterstitial();
            } catch (Throwable th) {
                qml.a("", th);
                RemoteException remoteException = new RemoteException();
            }
        } else {
            String valueOf = String.valueOf(pdi.getClass().getCanonicalName());
            String str = "Not a MediationInterstitialAdapter: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            qml.b(valueOf);
            throw new RemoteException();
        }
    }

    public final void c() {
        try {
            this.a.onDestroy();
        } catch (Throwable th) {
            qml.a("", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final void d() {
        try {
            this.a.onPause();
        } catch (Throwable th) {
            qml.a("", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final void e() {
        try {
            this.a.onResume();
        } catch (Throwable th) {
            qml.a("", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    public final void a(qcs qcs) {
        qct.a(qcs);
        pdi pdi = this.a;
        if (pdi instanceof pdr) {
            ((pdr) pdi).a();
        }
    }

    private final Bundle a(String str, rky rky, String str2) {
        String valueOf = String.valueOf(str);
        String str3 = "Server parameters: ";
        qml.b(valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf));
        try {
            Bundle bundle;
            Bundle bundle2 = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                bundle = new Bundle();
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    str3 = (String) keys.next();
                    bundle.putString(str3, jSONObject.getString(str3));
                }
            } else {
                bundle = bundle2;
            }
            if (this.a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (rky != null) {
                    bundle.putInt("tagForChildDirectedTreatment", rky.e);
                }
            }
            return bundle;
        } catch (Throwable th) {
            qml.a("", th);
            RemoteException remoteException = new RemoteException();
        }
    }

    private static boolean a(rky rky) {
        if (!rky.d) {
            rlj.a();
            if (!qmh.a()) {
                return false;
            }
        }
        return true;
    }
}
