package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import defpackage.pdf;
import defpackage.pdi;
import defpackage.pdk;

public interface MediationInterstitialAdapter extends pdi {
    void requestInterstitialAd(Context context, pdk pdk, Bundle bundle, pdf pdf, Bundle bundle2);

    void showInterstitial();
}
