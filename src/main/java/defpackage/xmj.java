package defpackage;

/* renamed from: xmj */
public abstract class xmj {
    public final nkp a;

    protected xmj(nkp nkp) {
        boolean z = true;
        amqw.a((nkp.a & 1) != 0);
        if ((nkp.a & 2) == 0) {
            z = false;
        }
        amqw.a(z);
        this.a = nkp;
    }

    public abstract void a();

    public final String b() {
        return this.a.b;
    }
}
