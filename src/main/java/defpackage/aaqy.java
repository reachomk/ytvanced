package defpackage;

/* renamed from: aaqy */
public final class aaqy extends aaml {
    public String a;
    public String b;
    private final afpu c;

    public aaqy(aamd aamd, afpu afpu) {
        super("channel/edit_name", aamd, afpu.c());
        this.c = afpu;
        g();
    }

    public final void b() {
        amqw.b(this.c.a());
    }

    public final /* synthetic */ anzd c() {
        ascp ascp = (ascp) ascm.e.createBuilder();
        String str = this.a;
        ascp.copyOnWrite();
        ascm ascm = (ascm) ascp.instance;
        if (str != null) {
            ascm.a |= 2;
            ascm.c = str;
            str = this.b;
            if (str != null) {
                ascp.copyOnWrite();
                ascm = (ascm) ascp.instance;
                ascm.a |= 4;
                ascm.d = str;
            }
            return ascp;
        }
        throw new NullPointerException();
    }
}
