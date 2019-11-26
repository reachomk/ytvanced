package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import defpackage.dfi;
import defpackage.dfl;
import defpackage.dgz;
import defpackage.dhb;
import defpackage.dhd;
import defpackage.dhi;
import defpackage.dhj;
import defpackage.dhn;
import defpackage.pdy;
import defpackage.qml;

public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter {
    private CustomEventBanner a;
    private CustomEventInterstitial b;

    public final Class getAdditionalParametersType() {
        return pdy.class;
    }

    public final View getBannerView() {
        return null;
    }

    public final Class getServerParametersType() {
        return dhn.class;
    }

    private static Object a() {
        String str = null;
        try {
            str = Class.forName(null).newInstance();
            return str;
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder stringBuilder = new StringBuilder(("null".length() + 46) + String.valueOf(message).length());
            stringBuilder.append("Could not instantiate custom event adapter: ");
            stringBuilder.append(str);
            stringBuilder.append(". ");
            stringBuilder.append(message);
            qml.b(stringBuilder.toString());
            return str;
        }
    }

    public final void destroy() {
        CustomEventBanner customEventBanner = this.a;
        if (customEventBanner != null) {
            customEventBanner.a();
        }
        CustomEventInterstitial customEventInterstitial = this.b;
        if (customEventInterstitial != null) {
            customEventInterstitial.a();
        }
    }

    public final void requestBannerAd(dhb dhb, Activity activity, dhn dhn, dfl dfl, dgz dgz, pdy pdy) {
        this.a = (CustomEventBanner) a();
        if (this.a == null) {
            dhb.a(dfi.INTERNAL_ERROR);
        } else {
            this.a.requestBannerAd(new dhj(), activity, null, null, dfl, dgz, pdy != null ? pdy.a() : null);
        }
    }

    public final void requestInterstitialAd(dhd dhd, Activity activity, dhn dhn, dgz dgz, pdy pdy) {
        this.b = (CustomEventInterstitial) a();
        if (this.b == null) {
            dhd.b(dfi.INTERNAL_ERROR);
        } else {
            this.b.requestInterstitialAd(new dhi(), activity, null, null, dgz, pdy != null ? pdy.a() : null);
        }
    }

    public final void showInterstitial() {
        this.b.showInterstitial();
    }
}
