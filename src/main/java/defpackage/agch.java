package defpackage;

/* renamed from: agch */
final /* synthetic */ class agch implements amqd {
    private final agci a;
    private final String b;

    agch(agci agci, String str) {
        this.a = agci;
        this.b = str;
    }

    public final Object a(Object obj) {
        agci agci = this.a;
        return amqp.c(((agfi) agci.m.get()).j(this.b));
    }
}
