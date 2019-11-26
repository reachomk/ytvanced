package com.google.android.gms.ads.reward.mediation;

import android.content.Context;
import android.os.Bundle;
import defpackage.pdf;
import defpackage.pdi;
import defpackage.pef;

public interface MediationRewardedVideoAdAdapter extends pdi {
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";

    void initialize(Context context, pdf pdf, String str, pef pef, Bundle bundle, Bundle bundle2);

    boolean isInitialized();

    void loadAd(pdf pdf, Bundle bundle, Bundle bundle2);

    void showVideo();
}
