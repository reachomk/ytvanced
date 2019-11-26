package defpackage;

/* renamed from: abky */
public final class abky extends aaml {
    public byte[] a = ablj.a;
    public String b = "";
    public boolean c;

    public abky(aamd aamd, afpt afpt) {
        super("ypc/log_payment_server_analytics", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(this.a);
        amqw.a(this.b);
    }

    public final /* synthetic */ anzd c() {
        asvw asvw = (asvw) asvt.f.createBuilder();
        anvu a = anvu.a(this.a);
        asvw.copyOnWrite();
        asvt asvt = (asvt) asvw.instance;
        if (a != null) {
            asvt.a |= 2;
            asvt.c = a;
            String str = this.b;
            if (str != null) {
                asvw.copyOnWrite();
                asvt = (asvt) asvw.instance;
                asvt.a |= 4;
                asvt.d = str;
            }
            boolean z = this.c;
            asvw.copyOnWrite();
            asvt = (asvt) asvw.instance;
            asvt.a |= 8;
            asvt.e = z;
            return asvw;
        }
        throw new NullPointerException();
    }
}
