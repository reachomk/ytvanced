package defpackage;

/* renamed from: abjk */
public final class abjk extends aaml {
    public atje a;

    public abjk(aamd aamd, afpt afpt) {
        super("get_survey", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(this.a);
    }

    public final /* synthetic */ anzd c() {
        atjp atjp = (atjp) atjq.d.createBuilder();
        atje atje = this.a;
        atjp.copyOnWrite();
        atjq atjq = (atjq) atjp.instance;
        if (atje != null) {
            atjq.c = atje;
            atjq.a |= 2;
            return atjp;
        }
        throw new NullPointerException();
    }
}
