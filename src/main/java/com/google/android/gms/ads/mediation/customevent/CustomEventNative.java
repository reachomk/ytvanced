package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import defpackage.pdo;
import defpackage.pds;
import defpackage.peb;

public interface CustomEventNative extends pds {
    void requestNativeAd(Context context, peb peb, String str, pdo pdo, Bundle bundle);
}
