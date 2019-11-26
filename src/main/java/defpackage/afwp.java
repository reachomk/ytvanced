package defpackage;

import java.util.Collection;
import java.util.Locale;

/* renamed from: afwp */
final class afwp {
    public static void a(afwd afwd, boolean z) {
        Locale locale = Locale.US;
        Object[] objArr = new Object[4];
        objArr[0] = !z ? "" : "    ";
        objArr[1] = afwd.b;
        int i = afwd.g;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "UNSUBSCRIBED" : "UNSUBSCRIBING" : "SUBSCRIBED" : "SUBSCRIBING";
        if (i != 0) {
            objArr[2] = str;
            objArr[3] = Integer.valueOf(afwd.c.size());
            String.format(locale, "%s%s: %s - %d subscribers", objArr);
            return;
        }
        throw null;
    }

    public static void a(afwk afwk) {
        xak.a();
        Collection<afwd> a = afwk.a();
        String.format(Locale.US, "There are %d active GCM topic subscriptions:", new Object[]{Integer.valueOf(a.size())});
        for (afwd a2 : a) {
            afwp.a(a2, true);
        }
    }
}
