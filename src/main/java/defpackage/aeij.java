package defpackage;

/* renamed from: aeij */
public final class aeij extends aefs {
    public final String a;

    public aeij(String str) {
        this.a = str;
    }

    /* Access modifiers changed, original: final */
    public final void a(acxt acxt) {
        atyl atyl = (atyl) atyi.l.createBuilder();
        atyn atyn = (atyn) atyk.i.createBuilder();
        String str = this.a;
        atyn.copyOnWrite();
        atyk atyk = (atyk) atyn.instance;
        if (str != null) {
            atyk.a |= 512;
            atyk.e = str;
            atyl.a(atyn);
            acxt.a((atyi) ((anxl) atyl.build()));
            return;
        }
        throw new NullPointerException();
    }
}
