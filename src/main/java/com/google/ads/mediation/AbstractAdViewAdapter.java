package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.internal.zzaxm;
import defpackage.dgv;
import defpackage.dgx;
import defpackage.dgy;
import defpackage.dhm;
import defpackage.dhp;
import defpackage.pbd;
import defpackage.pbe;
import defpackage.pbf;
import defpackage.pbg;
import defpackage.pbh;
import defpackage.pbi;
import defpackage.pbj;
import defpackage.pbl;
import defpackage.pca;
import defpackage.pcf;
import defpackage.pcq;
import defpackage.pdf;
import defpackage.pdh;
import defpackage.pdj;
import defpackage.pdk;
import defpackage.pdl;
import defpackage.pdo;
import defpackage.pdq;
import defpackage.pea;
import defpackage.pec;
import defpackage.pef;
import defpackage.qcs;
import defpackage.qct;
import defpackage.qlp;
import defpackage.qlz;
import defpackage.qmh;
import defpackage.qml;
import defpackage.rkr;
import defpackage.rks;
import defpackage.rku;
import defpackage.rkv;
import defpackage.rkz;
import defpackage.rla;
import defpackage.rlb;
import defpackage.rld;
import defpackage.rlf;
import defpackage.rlj;
import defpackage.rlm;
import defpackage.rlz;
import defpackage.rmt;
import defpackage.rnb;
import defpackage.rnd;
import defpackage.rnf;
import defpackage.roh;
import defpackage.rqb;
import defpackage.rqc;
import defpackage.rqd;
import defpackage.rqe;
import defpackage.rqg;
import java.util.Date;
import java.util.Set;

@qlp
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, MediationRewardedVideoAdAdapter, zzaxm, pdq, pea {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    public pbj a;
    public pef b;
    private pbh c;
    private pbj d;
    private pbe e;
    private Context f;
    private final pec g = new dhm(this);

    public abstract Bundle a(Bundle bundle, Bundle bundle2);

    private final pbg a(Context context, pdf pdf, Bundle bundle, Bundle bundle2) {
        pbf pbf = new pbf();
        Date a = pdf.a();
        if (a != null) {
            pbf.a.g = a;
        }
        int b = pdf.b();
        if (b != 0) {
            pbf.a.h = b;
        }
        Set<String> c = pdf.c();
        if (c != null) {
            for (String add : c) {
                pbf.a.a.add(add);
            }
        }
        Location d = pdf.d();
        if (d != null) {
            pbf.a.i = d;
        }
        if (pdf.f()) {
            rlj.a();
            pbf.a.a(qmh.a(context));
        }
        if (pdf.e() != -1) {
            b = 1;
            if (pdf.e() != 1) {
                b = 0;
            }
            pbf.a.j = b;
        }
        pbf.a.k = pdf.g();
        Bundle a2 = a(bundle, bundle2);
        Class cls = AdMobAdapter.class;
        pbf.a.b.putBundle(cls.getName(), a2);
        if (cls.equals(AdMobAdapter.class) && a2.getBoolean("_emulatorLiveAds")) {
            pbf.a.d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return new pbg(pbf);
    }

    public void onDestroy() {
        pbh pbh = this.c;
        if (pbh != null) {
            try {
                rlz rlz = pbh.a.g;
                if (rlz != null) {
                    rlz.b();
                }
            } catch (RemoteException e) {
                qml.c("#007 Could not call remote method.", e);
            }
            this.c = null;
        }
        if (this.d != null) {
            this.d = null;
        }
        if (this.e != null) {
            this.e = null;
        }
        if (this.a != null) {
            this.a = null;
        }
    }

    public void onPause() {
        pbh pbh = this.c;
        if (pbh != null) {
            try {
                rlz rlz = pbh.a.g;
                if (rlz != null) {
                    rlz.d();
                }
            } catch (RemoteException e) {
                qml.c("#007 Could not call remote method.", e);
            }
        }
    }

    public void onResume() {
        pbh pbh = this.c;
        if (pbh != null) {
            try {
                rlz rlz = pbh.a.g;
                if (rlz != null) {
                    rlz.e();
                }
            } catch (RemoteException e) {
                qml.c("#007 Could not call remote method.", e);
            }
        }
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    public void requestBannerAd(Context context, pdj pdj, Bundle bundle, pbi pbi, pdf pdf, Bundle bundle2) {
        this.c = new pbh(context);
        pbh pbh = this.c;
        pbi pbi2 = new pbi(pbi.b, pbi.c);
        rnd rnd = pbh.a;
        pbi[] pbiArr = new pbi[]{pbi2};
        if (rnd.e == null) {
            rnd.e = pbiArr;
            try {
                rlz rlz = rnd.g;
                if (rlz != null) {
                    rlz.a(rnd.a(rnd.i.getContext(), rnd.e));
                }
            } catch (RemoteException e) {
                qml.c("#007 Could not call remote method.", e);
            }
            rnd.i.requestLayout();
            pbh pbh2 = this.c;
            String adUnitId = getAdUnitId(bundle);
            rnd = pbh2.a;
            if (rnd.h == null) {
                rlz rlz2;
                rnd.h = adUnitId;
                pbh2 = this.c;
                dgv dgv = new dgv(pdj);
                rlm rlm = pbh2.a.c;
                synchronized (rlm.a) {
                    rlm.b = dgv;
                }
                rnd rnd2 = pbh2.a;
                try {
                    rnd2.d = dgv;
                    rlz2 = rnd2.g;
                    if (rlz2 != null) {
                        rlz2.a(new rkr(dgv));
                    }
                } catch (RemoteException e2) {
                    qml.c("#007 Could not call remote method.", e2);
                }
                rnd2 = pbh2.a;
                try {
                    rnd2.f = dgv;
                    rlz2 = rnd2.g;
                    if (rlz2 != null) {
                        rlz2.a(new rlb(dgv));
                    }
                } catch (RemoteException e22) {
                    qml.c("#007 Could not call remote method.", e22);
                }
                pbh pbh3 = this.c;
                pbg a = a(context, pdf, bundle2, bundle);
                rnd2 = pbh3.a;
                rnb rnb = a.a;
                try {
                    if (rnd2.g == null) {
                        if (rnd2.e == null || rnd2.h == null) {
                            throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                        }
                        rlz rlz3;
                        Context context2 = rnd2.i.getContext();
                        rkz a2 = rnd.a(context2, rnd2.e);
                        if ("search_v2".equals(a2.a)) {
                            rlz3 = (rlz) new rlf(rlj.b(), context2, a2, rnd2.h).a(context2, false);
                        } else {
                            rlz3 = (rlz) new rld(rlj.b(), context2, a2, rnd2.h, rnd2.a).a(context2, false);
                        }
                        rnd2.g = rlz3;
                        rnd2.g.a(new rku(rnd2.c));
                        rks rks = rnd2.d;
                        if (rks != null) {
                            rnd2.g.a(new rkr(rks));
                        }
                        pca pca = rnd2.f;
                        if (pca != null) {
                            rnd2.g.a(new rlb(pca));
                        }
                        rnd2.g.o();
                        try {
                            qcs a3 = rnd2.g.a();
                            if (a3 != null) {
                                rnd2.i.addView((View) qct.a(a3));
                            }
                        } catch (RemoteException e3) {
                            qml.c("#007 Could not call remote method.", e3);
                        }
                    }
                    if (rnd2.g.a(rla.a(rnd2.i.getContext(), rnb))) {
                        rnd2.a.a = rnb.h;
                    }
                    return;
                } catch (RemoteException e4) {
                    qml.c("#007 Could not call remote method.", e4);
                    return;
                }
            }
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public View getBannerView() {
        return this.c;
    }

    public void requestInterstitialAd(Context context, pdk pdk, Bundle bundle, pdf pdf, Bundle bundle2) {
        rlz rlz;
        String str = "#008 Must be called on the main UI thread.";
        this.d = new pbj(context);
        this.d.a(getAdUnitId(bundle));
        pbj pbj = this.d;
        dgy dgy = new dgy(pdk);
        rnf rnf = pbj.a;
        try {
            rnf.c = dgy;
            rlz = rnf.e;
            if (rlz != null) {
                rlz.a(new rku(dgy));
            }
        } catch (RemoteException e) {
            qml.c(str, e);
        }
        rnf = pbj.a;
        try {
            rnf.d = dgy;
            rlz = rnf.e;
            if (rlz != null) {
                rlz.a(new rkr(dgy));
            }
        } catch (RemoteException e2) {
            qml.c(str, e2);
        }
        this.d.a(a(context, pdf, bundle2, bundle));
    }

    public void onImmersiveModeUpdated(boolean z) {
        pbj pbj = this.d;
        if (pbj != null) {
            pbj.a(z);
        }
        pbj = this.a;
        if (pbj != null) {
            pbj.a(z);
        }
    }

    public rmt getVideoController() {
        pbh pbh = this.c;
        if (pbh != null) {
            rnd rnd = pbh.a;
            pbl pbl = rnd != null ? rnd.b : null;
            if (pbl != null) {
                return pbl.a();
            }
        }
        return null;
    }

    public void showInterstitial() {
        this.d.a();
    }

    public Bundle getInterstitialAdapterInfo() {
        pdh pdh = new pdh();
        pdh.a = 1;
        Bundle bundle = new Bundle();
        bundle.putInt("capabilities", pdh.a);
        return bundle;
    }

    public void requestNativeAd(Context context, pdl pdl, Bundle bundle, pdo pdo, Bundle bundle2) {
        pbe pbe;
        dgx dgx = new dgx(this, pdl);
        pbd pbd = new pbd(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        try {
            pbd.b.a(new rku(dgx));
        } catch (RemoteException e) {
            qml.b("Failed to set AdListener.", e);
        }
        pcf h = pdo.h();
        if (h != null) {
            try {
                pbd.b.a(new roh(h));
            } catch (RemoteException e2) {
                qml.b("Failed to specify native ad options", e2);
            }
        }
        if (pdo.j()) {
            try {
                pbd.b.a(new rqg(dgx));
            } catch (RemoteException e22) {
                qml.b("Failed to add google native ad listener", e22);
            }
        }
        if (pdo.i()) {
            try {
                pbd.b.a(new rqc(dgx));
            } catch (RemoteException e222) {
                qml.b("Failed to add app install ad listener", e222);
            }
        }
        if (pdo.k()) {
            try {
                pbd.b.a(new rqb(dgx));
            } catch (RemoteException e2222) {
                qml.b("Failed to add content ad listener", e2222);
            }
        }
        if (pdo.l()) {
            for (String str : pdo.m().keySet()) {
                pcq pcq = !((Boolean) pdo.m().get(str)).booleanValue() ? null : dgx;
                try {
                    pbd.b.a(str, new rqd(dgx), pcq != null ? new rqe(pcq) : null);
                } catch (RemoteException e3) {
                    qml.b("Failed to add custom template ad listener", e3);
                }
            }
        }
        try {
            pbe = new pbe(pbd.a, pbd.b.a());
        } catch (RemoteException e22222) {
            qml.a("Failed to build AdLoader.", e22222);
            pbe = null;
        }
        this.e = pbe;
        pbe = this.e;
        try {
            pbe.b.a(rla.a(pbe.a, a(context, pdo, bundle2, bundle).a));
        } catch (RemoteException e4) {
            qml.a("Failed to load ad.", e4);
        }
    }

    public void initialize(Context context, pdf pdf, String str, pef pef, Bundle bundle, Bundle bundle2) {
        this.f = context.getApplicationContext();
        this.b = pef;
        this.b.a((MediationRewardedVideoAdAdapter) this);
    }

    public void loadAd(pdf pdf, Bundle bundle, Bundle bundle2) {
        String str = "#008 Must be called on the main UI thread.";
        Context context = this.f;
        if (context == null || this.b == null) {
            qml.a("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        rlz rlz;
        this.a = new pbj(context);
        pbj pbj = this.a;
        pbj.a.i = true;
        pbj.a(getAdUnitId(bundle));
        pbj = this.a;
        pec pec = this.g;
        rnf rnf = pbj.a;
        try {
            rnf.h = pec;
            rlz = rnf.e;
            if (rlz != null) {
                rlz.a(pec != null ? new qlz(pec) : null);
            }
        } catch (RemoteException e) {
            qml.c(str, e);
        }
        pbj = this.a;
        dhp dhp = new dhp(this);
        rnf = pbj.a;
        try {
            rnf.g = dhp;
            rlz = rnf.e;
            if (rlz != null) {
                rlz.a(new rkv(dhp));
            }
        } catch (RemoteException e2) {
            qml.c(str, e2);
        }
        this.a.a(a(this.f, pdf, bundle2, bundle));
    }

    public void showVideo() {
        this.a.a();
    }

    public boolean isInitialized() {
        return this.b != null;
    }
}
