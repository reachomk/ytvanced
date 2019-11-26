package defpackage;

import java.util.Locale;

/* renamed from: bcsx */
final class bcsx implements Comparable {
    public final bcpn a;
    private final int b;
    private final String c;
    private final Locale d;

    bcsx(bcpn bcpn, int i) {
        this.a = bcpn;
        this.b = i;
        this.c = null;
        this.d = null;
    }

    bcsx(bcpn bcpn, String str, Locale locale) {
        this.a = bcpn;
        this.b = 0;
        this.c = str;
        this.d = locale;
    }

    /* Access modifiers changed, original: final */
    public final long a(long j, boolean z) {
        String str = this.c;
        if (str == null) {
            j = this.a.b(j, this.b);
        } else {
            j = this.a.a(j, str, this.d);
        }
        return z ? this.a.c(j) : j;
    }

    /* renamed from: a */
    public final int compareTo(bcsx bcsx) {
        bcpn bcpn = bcsx.a;
        int a = bcsu.a(this.a.e(), bcpn.e());
        return a == 0 ? bcsu.a(this.a.d(), bcpn.d()) : a;
    }
}
