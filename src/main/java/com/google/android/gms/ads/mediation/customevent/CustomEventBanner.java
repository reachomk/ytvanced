package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import defpackage.pbi;
import defpackage.pdf;
import defpackage.pds;
import defpackage.pdx;

public interface CustomEventBanner extends pds {
    void requestBannerAd(Context context, pdx pdx, String str, pbi pbi, pdf pdf, Bundle bundle);
}
