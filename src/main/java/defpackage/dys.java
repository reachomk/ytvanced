package defpackage;

/* renamed from: dys */
final /* synthetic */ class dys implements bbny {
    private final dyl a;
    private final aadq b;
    private final String c;

    dys(dyl dyl, aadq aadq, String str) {
        this.a = dyl;
        this.b = aadq;
        this.c = str;
    }

    public final boolean a(Object obj) {
        dyl dyl = this.a;
        aadq aadq = this.b;
        String str = this.c;
        Throwable th = (Throwable) obj;
        xtl.a("Error rating", th);
        dyl.a.c(th);
        if (foh.q(dyl.b)) {
            if (aadq != null) {
                dyl.c.b().a(aadq).a();
            } else {
                dyl.c.b().a(str).a();
            }
        }
        return true;
    }
}
