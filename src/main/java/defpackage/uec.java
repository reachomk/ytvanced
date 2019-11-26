package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.net.Uri;

/* renamed from: uec */
public final class uec {
    private static volatile amqp a = ampo.a;
    private static final Object b = new Object();

    public static boolean a(Context context, Uri uri) {
        String authority = uri.getAuthority();
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(authority).length() + 91);
            stringBuilder.append(authority);
            stringBuilder.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (a.a()) {
            return ((Boolean) a.b()).booleanValue();
        } else {
            synchronized (b) {
                if (a.a()) {
                    boolean booleanValue = ((Boolean) a.b()).booleanValue();
                    return booleanValue;
                }
                boolean z = false;
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0);
                    if (resolveContentProvider != null) {
                        if (!"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        }
                    }
                    a = amqp.b(Boolean.valueOf(z));
                    return ((Boolean) a.b()).booleanValue();
                }
                try {
                    if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                        z = true;
                    }
                } catch (NameNotFoundException unused) {
                }
                a = amqp.b(Boolean.valueOf(z));
                return ((Boolean) a.b()).booleanValue();
            }
        }
    }
}
