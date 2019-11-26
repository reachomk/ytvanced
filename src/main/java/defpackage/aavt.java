package defpackage;

/* renamed from: aavt */
public final class aavt extends aamz {
    public aavt(aamd aamd, afpt afpt, String str, long j) {
        xak.b();
        atfq atfq = (atfq) atfn.e.createBuilder();
        atfq.copyOnWrite();
        atfn atfn = (atfn) atfq.instance;
        atfn.a |= 4;
        atfn.d = j;
        atfq.copyOnWrite();
        atfn atfn2 = (atfn) atfq.instance;
        atfn2.a |= 2;
        atfn2.c = str;
        super(aamd, afpt, "mobiledataplan/register_cpid", atfq);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.b((((atfn) ((atfq) c()).instance).a & 2) != 0);
    }
}
