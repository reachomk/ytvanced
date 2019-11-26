package defpackage;

/* renamed from: acwt */
final class acwt {
    public final azfa a;
    public final atst b;

    acwt(byte[] bArr, atst atst) {
        azfd azfd = (azfd) azfa.h.createBuilder();
        azfd.a(anvu.a(bArr));
        this.a = (azfa) ((anxl) azfd.build());
        this.b = atst;
    }

    acwt(azfa azfa, atst atst) {
        this.a = azfa;
        this.b = atst;
    }
}
