package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bahk */
public final class bahk {
    public static bahi a(Context context) {
        bahj b = bahk.b(context);
        if (b != null) {
            return new bafd(b.a, b.b);
        }
        return new bafy(context);
    }

    public static bahj b(Context context) {
        List<String> c = bahk.c(context);
        if (c != null) {
            for (String str : c) {
                ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(str);
                if (acquireContentProviderClient != null) {
                    return new bahj(acquireContentProviderClient, str);
                }
            }
        }
        return null;
    }

    public static List c(Context context) {
        if ("com.google.vr.vrcore".equals(context.getPackageName())) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("com.google.vr.vrcore.settings");
            return arrayList;
        }
        List<ResolveInfo> queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("android.content.action.VR_SETTINGS_PROVIDER"), 0);
        if (queryIntentContentProviders == null || queryIntentContentProviders.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentContentProviders) {
            ProviderInfo providerInfo = resolveInfo.providerInfo;
            if (baga.a(providerInfo.packageName)) {
                arrayList2.add(providerInfo.authority);
            }
        }
        return arrayList2;
    }
}
