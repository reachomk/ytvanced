package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: ddn */
public final class ddn implements dfa {
    private final Context a;

    public ddn(Context context) {
        this.a = context;
    }

    public final List a(der der) {
        Collection emptyList;
        Collection emptyList2;
        ArrayList arrayList = new ArrayList();
        dek dek = (dek) der;
        dew dew = dek.d;
        if (dew == dfe.a || (dew instanceof dey) || (dew instanceof dez)) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = Collections.singletonList("Unknown trigger provided");
        }
        arrayList.addAll(emptyList);
        arrayList.addAll(ddn.b(dek.g));
        Bundle bundle = dek.b;
        if (bundle == null || bundle.isEmpty()) {
            emptyList2 = Collections.emptyList();
        } else {
            emptyList2 = new ArrayList();
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize > 10240) {
                emptyList2.add(String.format(Locale.US, "Extras too large: %d bytes is > the max (%d bytes)", new Object[]{Integer.valueOf(dataSize), Integer.valueOf(10240)}));
            }
            if (dek.e > 1) {
                for (String str : bundle.keySet()) {
                    Collection emptyList3;
                    Object obj = bundle.get(str);
                    if (obj == null || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof Boolean)) {
                        emptyList3 = Collections.emptyList();
                    } else {
                        emptyList3 = Collections.singletonList(String.format(Locale.US, "Received value of type '%s' for key '%s', but only the following extra parameter types are supported: Integer, Long, Double, String, and Boolean", new Object[]{obj.getClass(), str}));
                    }
                    emptyList2.addAll(emptyList3);
                }
            }
        }
        arrayList.addAll(emptyList2);
        String str2 = dek.c;
        if (str2 == null) {
            emptyList = Collections.singletonList("Tag can't be null");
        } else if (str2.length() > 100) {
            emptyList = Collections.singletonList("Tag must be shorter than 100");
        } else {
            emptyList = Collections.emptyList();
        }
        arrayList.addAll(emptyList);
        str2 = dek.a;
        if (str2 == null || str2.isEmpty()) {
            emptyList = Collections.singletonList("Service can't be empty");
        } else {
            Context context = this.a;
            if (context == null) {
                emptyList = Collections.singletonList("Context is null, can't query PackageManager");
            } else {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    emptyList = Collections.singletonList("PackageManager is null, can't validate service");
                } else {
                    Intent intent = new Intent("com.firebase.jobdispatcher.ACTION_EXECUTE");
                    intent.setClassName(this.a, str2);
                    List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                    if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                        StringBuilder stringBuilder = new StringBuilder(str2.length() + 145);
                        stringBuilder.append("Couldn't find a registered service with the name ");
                        stringBuilder.append(str2);
                        stringBuilder.append(". Is it declared in the manifest with the right intent-filter? If not, the job won't be started.");
                        Log.e("FJD.GooglePlayReceiver", stringBuilder.toString());
                        emptyList = Collections.emptyList();
                    } else {
                        for (ResolveInfo resolveInfo : queryIntentServices) {
                            if (resolveInfo.serviceInfo != null && resolveInfo.serviceInfo.enabled) {
                                emptyList = Collections.emptyList();
                                break;
                            }
                        }
                        emptyList = Collections.singletonList(str2.concat(" is disabled."));
                    }
                }
            }
        }
        arrayList.addAll(emptyList);
        if (dek.i && dek.d == dfe.a) {
            arrayList.add("Trigger.NOW can't be used with recurring jobs");
        }
        return !arrayList.isEmpty() ? arrayList : null;
    }

    public final List a(dfc dfc) {
        List b = ddn.b(dfc);
        return b.isEmpty() ? null : b;
    }

    private static List b(dfc dfc) {
        int i = dfc.b;
        int i2 = dfc.c;
        int i3 = dfc.d;
        ArrayList arrayList = new ArrayList();
        if (!(i == 1 || i == 2)) {
            arrayList.add("Unknown retry policy provided");
        }
        if (i3 < i2) {
            arrayList.add("Maximum backoff must be greater than or equal to initial backoff");
        }
        if (i3 < 300) {
            arrayList.add("Maximum backoff must be greater than 300s (5 minutes)");
        }
        if (i2 < 30) {
            arrayList.add("Initial backoff must be at least 30s");
        }
        return arrayList;
    }
}
