package defpackage;

/* renamed from: peo */
public final class peo {
    public final Object a;

    public peo(qol qol, Object obj) {
        pzr.a((Object) qol);
        this.a = obj;
    }

    static peo a(String str, boolean z, boolean z2) {
        return new peo(qol.a(str, z2), Boolean.valueOf(z));
    }

    static peo a(String str, String str2, String str3) {
        return new peo(qol.a(str, str3), str2);
    }

    static peo a(String str, long j, long j2) {
        return new peo(qol.a(str, Long.valueOf(j2)), Long.valueOf(j));
    }

    static peo a(String str, int i, int i2) {
        return new peo(qol.a(str, Integer.valueOf(i2)), Integer.valueOf(i));
    }
}
