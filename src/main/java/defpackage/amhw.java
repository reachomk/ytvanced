package defpackage;

/* renamed from: amhw */
final /* synthetic */ class amhw implements bbnw {
    private final String a;
    private final amdr b;

    amhw(String str, amdr amdr) {
        this.a = str;
        this.b = amdr;
    }

    public final void accept(Object obj) {
        String str = this.a;
        amdr amdr = this.b;
        amdz amdz = (amdz) obj;
        amdz.copyOnWrite();
        amea amea = (amea) amdz.instance;
        if (str != null) {
            amea.a |= 2048;
            amea.l = str;
            amdz.a(amdr);
            return;
        }
        throw new NullPointerException();
    }
}
