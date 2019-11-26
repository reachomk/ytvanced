package defpackage;

/* renamed from: ahbm */
final /* synthetic */ class ahbm implements ahcw {
    private final ahbk a;
    private final avsj b;
    private final acvx c;
    private final String d;
    private final byte[] e;
    private final ahcq f;

    ahbm(ahbk ahbk, avsj avsj, acvx acvx, String str, byte[] bArr, ahcq ahcq) {
        this.a = ahbk;
        this.b = avsj;
        this.c = acvx;
        this.d = str;
        this.e = bArr;
        this.f = ahcq;
    }

    public final void a(avsi avsi, agqq agqq) {
        ahbk ahbk = this.a;
        avsj avsj = this.b;
        acvx acvx = this.c;
        String str = this.d;
        byte[] bArr = this.e;
        ahcq ahcq = this.f;
        ahce.a(avsj, acvx, str, null, avsi, false, agqq);
        ahbk.a(str, avsi, agqq, bArr, ahcq);
    }
}
