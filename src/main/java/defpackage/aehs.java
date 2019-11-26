package defpackage;

/* renamed from: aehs */
public final class aehs extends aefs {
    public final long a;

    public aehs(long j) {
        this.a = j;
    }

    /* Access modifiers changed, original: final */
    public final void a(acxt acxt) {
        atyl atyl = (atyl) atyi.l.createBuilder();
        atyn atyn = (atyn) atyk.i.createBuilder();
        long j = this.a;
        atyn.copyOnWrite();
        atyk atyk = (atyk) atyn.instance;
        atyk.a |= 2048;
        atyk.g = j;
        atyl.a(atyn);
        acxt.a((atyi) ((anxl) atyl.build()));
    }
}
