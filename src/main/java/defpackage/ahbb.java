package defpackage;

/* renamed from: ahbb */
final /* synthetic */ class ahbb implements ahcw {
    private final ahbc a;
    private final avsj b;
    private final acvx c;
    private final String d;
    private final byte[] e;
    private final ahcg f = null;

    ahbb(ahbc ahbc, avsj avsj, acvx acvx, String str, byte[] bArr) {
        this.a = ahbc;
        this.b = avsj;
        this.c = acvx;
        this.d = str;
        this.e = bArr;
    }

    public final void a(avsi avsi, agqq agqq) {
        ahbc ahbc = this.a;
        avsj avsj = this.b;
        acvx acvx = this.c;
        String str = this.d;
        byte[] bArr = this.e;
        ahce.a(avsj, acvx, null, str, avsi, false, agqq);
        ahbc.a(str, avsi, agqq, bArr, null);
    }
}
