package defpackage;

/* renamed from: aawn */
final class aawn extends aaml {
    public apqa a;

    public aawn(aamd aamd, afpt afpt) {
        super("acknowledge_channel_tou_strike", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(this.a != null);
    }

    public final /* synthetic */ anzd c() {
        apqf apqf = (apqf) apqc.d.createBuilder();
        apqa apqa = this.a;
        apqf.copyOnWrite();
        apqc apqc = (apqc) apqf.instance;
        if (apqa != null) {
            apqc.c = apqa;
            apqc.a |= 2;
            return apqf;
        }
        throw new NullPointerException();
    }
}
