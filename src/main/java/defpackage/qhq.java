package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;
import android.util.Log;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Deprecated
/* renamed from: qhq */
public final class qhq {
    public static long a = TimeUnit.DAYS.toSeconds(7);
    public static qhz b;
    public static qhu c;
    public static String d;
    private static Map g = new zj();
    public final Context e;
    public String f = "";

    private qhq(Context context, String str) {
        this.e = context.getApplicationContext();
        this.f = str;
    }

    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 38);
            stringBuilder.append("Never happens: can't find own package ");
            stringBuilder.append(valueOf);
            Log.w("InstanceID", stringBuilder.toString());
            return 0;
        }
    }

    public static synchronized qhq b(Context context) {
        synchronized (qhq.class) {
            String packageName;
            context = context.getApplicationContext();
            if (b == null) {
                packageName = context.getPackageName();
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(packageName).length() + 73);
                stringBuilder.append("Instance ID SDK is deprecated, ");
                stringBuilder.append(packageName);
                stringBuilder.append(" should update to use Firebase Instance ID");
                Log.w("InstanceID", stringBuilder.toString());
                b = new qhz(context);
                c = new qhu(context);
            }
            d = Integer.toString(qhq.a(context));
            packageName = "";
            qhq qhq = (qhq) g.get(packageName);
            if (qhq == null) {
                qhq = new qhq(context, packageName);
                g.put(packageName, qhq);
                return qhq;
            }
            return qhq;
        }
    }

    public static String a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("InstanceID", "Unexpected error, device missing required algorithms");
            return null;
        }
    }
}
