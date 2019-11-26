package defpackage;

/* renamed from: aaqu */
public final class aaqu extends aaml {
    public String a;
    private final afpu b;

    public aaqu(aamd aamd, afpu afpu) {
        super("channel/edit_description", aamd, afpu.c());
        this.b = afpu;
        g();
    }

    public final void b() {
        amqw.b(this.b.a());
        amqw.a(this.a);
    }

    public final /* synthetic */ anzd c() {
        asbz asbz = (asbz) asbw.d.createBuilder();
        String str = this.a;
        asbz.copyOnWrite();
        asbw asbw = (asbw) asbz.instance;
        if (str != null) {
            asbw.a |= 2;
            asbw.c = str;
            return asbz;
        }
        throw new NullPointerException();
    }
}
