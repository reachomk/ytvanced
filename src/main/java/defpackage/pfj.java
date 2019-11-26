package defpackage;

import android.util.Log;

@Deprecated
/* renamed from: pfj */
public final class pfj {
    private static volatile pej a = new pey();

    public static void a(String str, Object obj) {
        pfm pfm = pfm.a;
        if (pfm != null) {
            pfm.d(str, obj);
        } else if (a != null) {
            if (obj != null) {
                String valueOf = String.valueOf(obj);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + valueOf.length());
                stringBuilder.append(str);
                stringBuilder.append(":");
                stringBuilder.append(valueOf);
                str = stringBuilder.toString();
            }
            Log.e((String) pel.b.a, str);
        }
    }
}
