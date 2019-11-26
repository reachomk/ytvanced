package defpackage;

/* renamed from: amhv */
final /* synthetic */ class amhv implements bbnw {
    private final amdr a;
    private final int b;

    amhv(int i, amdr amdr) {
        this.b = i;
        this.a = amdr;
    }

    public final void accept(Object obj) {
        int i = this.b;
        amdr amdr = this.a;
        amdz amdz = (amdz) obj;
        amdz.copyOnWrite();
        amea amea = (amea) amdz.instance;
        if (i != 0) {
            amea.a |= 1024;
            amea.k = i - 1;
            amdz.a(amdr);
            return;
        }
        throw new NullPointerException();
    }
}
