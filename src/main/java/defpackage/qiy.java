package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.os.Build.VERSION;
import android.util.Log;

/* renamed from: qiy */
public final class qiy {
    private static qiy b;
    public final Context a;

    public static synchronized void a() {
        synchronized (qiy.class) {
            b = null;
        }
    }

    public static synchronized qiy a(Context context) {
        qiy qiy;
        synchronized (qiy.class) {
            context = qiz.a(context);
            if (b == null || b.a != context) {
                qiy qiy2 = null;
                if (VERSION.SDK_INT >= 21) {
                    try {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                        String str;
                        if (psk.a(context).a(packageInfo)) {
                            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(qix.a.getAuthority(), 0);
                            if (resolveContentProvider != null) {
                                if (resolveContentProvider.packageName.equals("com.google.android.gms")) {
                                    qiy2 = new qiy(context);
                                } else {
                                    str = resolveContentProvider.packageName;
                                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 85);
                                    stringBuilder.append("Package ");
                                    stringBuilder.append(str);
                                    stringBuilder.append(" is invalid for instant apps content provider; instant apps will be disabled.");
                                    Log.e("IAMetadataClient", stringBuilder.toString());
                                }
                            }
                        } else {
                            str = String.valueOf(packageInfo.packageName);
                            String str2 = "Incorrect signature for package ";
                            Log.e("InstantAppsApi", str.length() == 0 ? new String(str2) : str2.concat(str));
                        }
                    } catch (NameNotFoundException unused) {
                    }
                }
                b = qiy2;
            }
            qiy = b;
        }
        return qiy;
    }

    private qiy(Context context) {
        this.a = context;
    }
}
