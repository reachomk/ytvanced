package defpackage;

/* renamed from: aemf */
final class aemf extends xto {
    private final /* synthetic */ aaje a;
    private final /* synthetic */ aeoh b;

    aemf(String str, aaje aaje, aeoh aeoh) {
        this.a = aaje;
        this.b = aeoh;
        super(str);
    }

    public final /* bridge */ /* synthetic */ Object a() {
        Object obj = null;
        try {
            obj = aepe.a(this.a, this.b);
            return obj;
        } catch (bpx unused) {
            this.a.i.a("request header auth error");
            return obj;
        } catch (aeok unused2) {
            this.a.i.a("request encryption error");
            return obj;
        }
    }
}
