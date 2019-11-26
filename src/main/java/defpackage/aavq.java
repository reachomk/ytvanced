package defpackage;

/* renamed from: aavq */
public final class aavq extends aaml {
    public String a;

    public aavq(aamd aamd, afpt afpt) {
        super("mobiledataplan/purchase_data_plan", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(this.a);
    }

    public final /* synthetic */ anzd c() {
        xak.b();
        asyp asyp = (asyp) asyq.d.createBuilder();
        String str = this.a;
        asyp.copyOnWrite();
        asyq asyq = (asyq) asyp.instance;
        if (str != null) {
            asyq.a |= 2;
            asyq.c = str;
            return asyp;
        }
        throw new NullPointerException();
    }
}
