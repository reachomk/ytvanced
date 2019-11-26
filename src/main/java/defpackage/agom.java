package defpackage;

/* renamed from: agom */
public final class agom extends ukc {
    public final cis a(String str, byte[] bArr, String str2) {
        if ("meta".equals(str)) {
            return new cjm();
        }
        if ("ilst".equals(str)) {
            return new ckm();
        }
        if ("©ART".equals(str)) {
            return new balr();
        }
        if ("©nam".equals(str)) {
            return new bals();
        }
        if ("covr".equals(str)) {
            return new balq();
        }
        if ("©day".equals(str)) {
            return new balv();
        }
        return super.a(str, bArr, str2);
    }
}
