package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import defpackage.dfl;
import defpackage.dgz;
import defpackage.dha;
import defpackage.dhb;
import defpackage.dhc;
import defpackage.dhg;

@Deprecated
public interface MediationBannerAdapter extends dha {
    View getBannerView();

    void requestBannerAd(dhb dhb, Activity activity, dhc dhc, dfl dfl, dgz dgz, dhg dhg);
}
