package defpackage;

/* renamed from: abic */
public final class abic extends aaml {
    private final String a;
    private final xhv b;
    private final xmc c;

    public abic(aamd aamd, afpt afpt, String str, xhv xhv, xmc xmc) {
        super("account/get_setting", aamd, afpt);
        g();
        this.a = str;
        this.b = (xhv) amqw.a((Object) xhv);
        this.c = (xmc) amqw.a((Object) xmc);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final /* synthetic */ anzd c() {
        athu athu;
        atht atht = (atht) athu.e.createBuilder();
        String str = this.a;
        if (str != null) {
            atht.copyOnWrite();
            athu = (athu) atht.instance;
            athu.a |= 2;
            athu.c = str;
        }
        athr athr = (athr) aths.d.createBuilder();
        boolean i = this.b.i();
        athr.copyOnWrite();
        aths aths = (aths) athr.instance;
        aths.a |= 1;
        aths.b = i;
        i = this.c.a();
        athr.copyOnWrite();
        aths = (aths) athr.instance;
        aths.a |= 2;
        aths.c = i;
        atht.copyOnWrite();
        athu = (athu) atht.instance;
        athu.d = (aths) ((anxl) athr.build());
        athu.a |= 4;
        return atht;
    }
}
