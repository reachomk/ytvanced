package defpackage;

import android.net.Uri;

/* renamed from: uef */
public final class uef {
    private static final zj a = new zj();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (uef.class) {
            uri = (Uri) a.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                String str2 = "content://com.google.android.gms.phenotype/";
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                uri = Uri.parse(valueOf);
                a.put(str, uri);
            }
        }
        return uri;
    }
}
