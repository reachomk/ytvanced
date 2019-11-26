package defpackage;

import android.net.Uri;

/* renamed from: orb */
public final class orb extends orc {
    public final String a;
    public final oqz b;
    private final org g;

    public orb(nzw nzw, String str, ord ord, String str2, long j) {
        oqz oqz;
        super(nzw, str, ord);
        Uri.parse(str);
        long j2 = ord.b;
        org org = null;
        if (j2 > 0) {
            oqz oqz2 = new oqz(null, ord.a, j2);
        } else {
            oqz = null;
        }
        this.b = oqz;
        this.a = str2;
        if (this.b == null) {
            org = new org(new oqz(null, 0, j));
        }
        this.g = org;
    }

    public final oqz a() {
        return this.b;
    }

    public final oqu b() {
        return this.g;
    }

    public final String c() {
        return this.a;
    }
}
