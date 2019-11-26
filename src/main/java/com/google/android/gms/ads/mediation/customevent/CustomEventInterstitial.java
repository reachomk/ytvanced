package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import defpackage.pdf;
import defpackage.pds;
import defpackage.pdz;

public interface CustomEventInterstitial extends pds {
    void requestInterstitialAd(Context context, pdz pdz, String str, pdf pdf, Bundle bundle);

    void showInterstitial();
}
