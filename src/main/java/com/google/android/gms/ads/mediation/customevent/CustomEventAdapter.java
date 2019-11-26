package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import defpackage.pbi;
import defpackage.pdf;
import defpackage.pdj;
import defpackage.pdk;
import defpackage.pdl;
import defpackage.pdo;
import defpackage.pdu;
import defpackage.pdv;
import defpackage.pdw;
import defpackage.qml;

public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    private CustomEventBanner a;
    private CustomEventInterstitial b;
    private CustomEventNative c;

    public final View getBannerView() {
        return null;
    }

    private static Object a(String str) {
        Object str2;
        try {
            str2 = Class.forName(str2).newInstance();
            return str2;
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 46) + String.valueOf(message).length());
            stringBuilder.append("Could not instantiate custom event adapter: ");
            stringBuilder.append(str2);
            stringBuilder.append(". ");
            stringBuilder.append(message);
            qml.b(stringBuilder.toString());
            return null;
        }
    }

    public final void onDestroy() {
        CustomEventBanner customEventBanner = this.a;
        if (customEventBanner != null) {
            customEventBanner.a();
        }
        CustomEventInterstitial customEventInterstitial = this.b;
        if (customEventInterstitial != null) {
            customEventInterstitial.a();
        }
        CustomEventNative customEventNative = this.c;
        if (customEventNative != null) {
            customEventNative.a();
        }
    }

    public final void onPause() {
        CustomEventBanner customEventBanner = this.a;
        if (customEventBanner != null) {
            customEventBanner.b();
        }
        CustomEventInterstitial customEventInterstitial = this.b;
        if (customEventInterstitial != null) {
            customEventInterstitial.b();
        }
        CustomEventNative customEventNative = this.c;
        if (customEventNative != null) {
            customEventNative.b();
        }
    }

    public final void onResume() {
        CustomEventBanner customEventBanner = this.a;
        if (customEventBanner != null) {
            customEventBanner.c();
        }
        CustomEventInterstitial customEventInterstitial = this.b;
        if (customEventInterstitial != null) {
            customEventInterstitial.c();
        }
        CustomEventNative customEventNative = this.c;
        if (customEventNative != null) {
            customEventNative.c();
        }
    }

    public final void requestBannerAd(Context context, pdj pdj, Bundle bundle, pbi pbi, pdf pdf, Bundle bundle2) {
        String str = "class_name";
        this.a = (CustomEventBanner) a(bundle.getString(str));
        if (this.a == null) {
            pdj.a(0);
            return;
        }
        this.a.requestBannerAd(context, new pdu(), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), pbi, pdf, bundle2 != null ? bundle2.getBundle(bundle.getString(str)) : null);
    }

    public final void requestInterstitialAd(Context context, pdk pdk, Bundle bundle, pdf pdf, Bundle bundle2) {
        String str = "class_name";
        this.b = (CustomEventInterstitial) a(bundle.getString(str));
        if (this.b == null) {
            pdk.b(0);
            return;
        }
        this.b.requestInterstitialAd(context, new pdw(), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), pdf, bundle2 != null ? bundle2.getBundle(bundle.getString(str)) : null);
    }

    public final void requestNativeAd(Context context, pdl pdl, Bundle bundle, pdo pdo, Bundle bundle2) {
        String str = "class_name";
        this.c = (CustomEventNative) a(bundle.getString(str));
        if (this.c == null) {
            pdl.c(0);
            return;
        }
        this.c.requestNativeAd(context, new pdv(), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), pdo, bundle2 != null ? bundle2.getBundle(bundle.getString(str)) : null);
    }

    public final void showInterstitial() {
        this.b.showInterstitial();
    }
}
