package defpackage;

/* renamed from: aabl */
final /* synthetic */ class aabl implements amqd {
    private final String a;
    private final boolean b;

    aabl(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final Object a(Object obj) {
        String str = this.a;
        boolean z = this.b;
        aabs aabs = (aabs) obj;
        bbuw bbuw = new bbuw(aabs.a(str));
        return z ? bbmi.a(new aabx(aabs, str, bbuw)) : bbuw;
    }
}
