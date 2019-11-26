package defpackage;

/* renamed from: aarc */
public final class aarc extends aaml {
    private final afpu a;

    public aarc(aamd aamd, afpu afpu) {
        super("channel/get_profile_editor", aamd, afpu.c());
        this.a = afpu;
        g();
    }

    public final void b() {
        amqw.b(this.a.a());
    }

    public final /* synthetic */ anzd c() {
        return (ascv) ascs.c.createBuilder();
    }
}
