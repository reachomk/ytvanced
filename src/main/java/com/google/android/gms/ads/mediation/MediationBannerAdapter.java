package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import defpackage.pbi;
import defpackage.pdf;
import defpackage.pdi;
import defpackage.pdj;

public interface MediationBannerAdapter extends pdi {
    View getBannerView();

    void requestBannerAd(Context context, pdj pdj, Bundle bundle, pbi pbi, pdf pdf, Bundle bundle2);
}
