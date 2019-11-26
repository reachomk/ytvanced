package defpackage;

/* renamed from: aaqq */
public final class aaqq extends aaml {
    public String a;
    private final afpu b;

    public aaqq(aamd aamd, afpu afpu) {
        super("channel/edit_banner", aamd, afpu.c());
        this.b = afpu;
        g();
    }

    public final void b() {
        amqw.b(this.b.a());
        xvd.a(this.a);
    }

    public final /* synthetic */ anzd c() {
        ascl ascl = (ascl) asci.d.createBuilder();
        String str = this.a;
        ascl.copyOnWrite();
        asci asci = (asci) ascl.instance;
        if (str != null) {
            asci.a |= 2;
            asci.c = str;
            return ascl;
        }
        throw new NullPointerException();
    }
}
