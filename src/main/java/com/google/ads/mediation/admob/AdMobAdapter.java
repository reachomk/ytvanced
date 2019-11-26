package com.google.ads.mediation.admob;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;

public final class AdMobAdapter extends AbstractAdViewAdapter {
    public static final String NEW_BUNDLE = "_newBundle";

    /* Access modifiers changed, original: protected|final */
    public final Bundle a(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (bundle.getBoolean(NEW_BUNDLE)) {
            bundle = new Bundle(bundle);
        }
        bundle.putInt("gw", 1);
        String str = "mad_hac";
        bundle.putString(str, bundle2.getString(str));
        str = "adJson";
        if (!TextUtils.isEmpty(bundle2.getString(str))) {
            bundle.putString("_ad", bundle2.getString(str));
        }
        bundle.putBoolean("_noRefresh", true);
        return bundle;
    }
}
