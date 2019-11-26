package defpackage;

import android.net.Uri;

/* renamed from: ajfb */
final class ajfb {
    private static final amuw a = amuw.a((Object) "docid", (Object) "referrer");

    static void a(Uri uri) {
        xvo a = xvo.a(uri);
        amxo amxo = (amxo) a.iterator();
        while (amxo.hasNext()) {
            String str = (String) amxo.next();
            if (a.b(str) != null) {
                a.a(str, "(scrubbed)");
            }
        }
        String valueOf = String.valueOf(a.a());
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 8);
        stringBuilder.append("Pinging ");
        stringBuilder.append(valueOf);
        xtl.d(stringBuilder.toString());
    }
}
