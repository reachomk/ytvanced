package defpackage;

/* renamed from: aavr */
public final class aavr extends aaml {
    public String a;

    public aavr(aamd aamd, afpt afpt) {
        super("mobiledataplan/get_data_plan_promo", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(this.a);
    }

    public final /* synthetic */ anzd c() {
        xak.b();
        askr askr = (askr) asko.d.createBuilder();
        String str = this.a;
        askr.copyOnWrite();
        asko asko = (asko) askr.instance;
        if (str != null) {
            asko.a |= 2;
            asko.c = str;
            b();
            return askr;
        }
        throw new NullPointerException();
    }
}
