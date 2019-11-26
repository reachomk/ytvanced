package defpackage;

/* renamed from: aacq */
final /* synthetic */ class aacq implements bbnv {
    private final aacr a;
    private final boolean b;
    private final byte[] c;
    private final String d;

    aacq(aacr aacr, boolean z, byte[] bArr, String str) {
        this.a = aacr;
        this.b = z;
        this.c = bArr;
        this.d = str;
    }

    public final Object a(Object obj) {
        aacr aacr = this.a;
        boolean z = this.b;
        byte[] bArr = this.c;
        String str = this.d;
        aadq aadq = (aadq) obj;
        if ((aadq instanceof aaec) || !(aadq.getType() instanceof aaeb)) {
            return aacr.b(str, bArr, z);
        }
        return aacr.a(z, aacr.a.b().a(((aaeb) aadq.getType()).a(bArr))).d();
    }
}
