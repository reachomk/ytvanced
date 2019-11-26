package defpackage;

import android.util.Pair;

/* renamed from: amib */
final /* synthetic */ class amib implements amng {
    private final amhz a;
    private final String b;
    private final amea c;

    amib(amhz amhz, String str, amea amea) {
        this.a = amhz;
        this.b = str;
        this.c = amea;
    }

    public final Object a(amne amne) {
        String str;
        amhz amhz = this.a;
        String str2 = this.b;
        amea amea = this.c;
        String str3 = amea.G;
        String str4 = amea.F;
        synchronized (amhz.f) {
            amne.a(new amie(amhz, str3), amhz.a);
            if (amhz.f.containsKey(str3)) {
                amne amne2 = (amne) ((Pair) amhz.f.get(str3)).second;
                String str5 = "Another polling request has been added for video id ";
                String valueOf = String.valueOf(str3);
                if (valueOf.length() == 0) {
                    valueOf = new String(str5);
                } else {
                    valueOf = str5.concat(valueOf);
                }
                amne2.a(new IllegalStateException(valueOf));
            }
            amhz.f.put(str3, new Pair(str2, amne));
            amhz.c.a(null, str3, str4);
            str = "Polling for feedback on background thread";
        }
        return str;
    }
}
