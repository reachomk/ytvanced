package defpackage;

/* renamed from: ablc */
public final class ablc extends aaml {
    public String a;
    public long b;

    public ablc(aamd aamd, afpt afpt) {
        super("ypc/pause_subscription", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(this.a, (Object) "pause params must be specified");
        amqw.b(this.b > 0, (Object) "resume time must be specified");
    }

    public final /* synthetic */ anzd c() {
        atbb atbb = (atbb) atbc.e.createBuilder();
        String str = this.a;
        atbb.copyOnWrite();
        atbc atbc = (atbc) atbb.instance;
        if (str != null) {
            atbc.a |= 2;
            atbc.c = str;
            long j = this.b;
            atbb.copyOnWrite();
            atbc atbc2 = (atbc) atbb.instance;
            atbc2.a |= 4;
            atbc2.d = j;
            return atbb;
        }
        throw new NullPointerException();
    }
}
