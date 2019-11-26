package defpackage;

import android.net.Uri;

/* renamed from: amhb */
final /* synthetic */ class amhb implements anij {
    private final amhc a;
    private final alyz b;
    private final String c;

    amhb(amhc amhc, alyz alyz, String str) {
        this.a = amhc;
        this.b = alyz;
        this.c = str;
    }

    public final anjv a() {
        amhc amhc = this.a;
        amea a = this.b.a(this.c);
        int i = 1;
        if (!(a == null || (a.a & 2) == 0)) {
            try {
                amhc.a.getContentResolver().releasePersistableUriPermission(Uri.parse(a.d), 1);
            } catch (SecurityException unused) {
            }
        }
        if (a != null) {
            int a2 = amem.a(a.H);
            if (a2 != 0) {
                i = a2;
            }
            if (a.M || (!a.L && (i == 4 || i == 5 || i == 2))) {
                return anjf.a(new alzg());
            }
        }
        return anjf.a(new alze(amhc.b));
    }
}
