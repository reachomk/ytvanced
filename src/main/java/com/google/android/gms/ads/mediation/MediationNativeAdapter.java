package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import defpackage.pdi;
import defpackage.pdl;
import defpackage.pdo;

public interface MediationNativeAdapter extends pdi {
    void requestNativeAd(Context context, pdl pdl, Bundle bundle, pdo pdo, Bundle bundle2);
}
