package defpackage;

/* renamed from: afcd */
final /* synthetic */ class afcd implements Runnable {
    private final afbo a;
    private final int b;
    private final aaje c;
    private final afcz d;
    private final aajs e;
    private final aemk f;
    private final Object g;

    afcd(afbo afbo, int i, aaje aaje, afcz afcz, aajs aajs, aemk aemk, Object obj) {
        this.a = afbo;
        this.b = i;
        this.c = aaje;
        this.d = afcz;
        this.e = aajs;
        this.f = aemk;
        this.g = obj;
    }

    public final void run() {
        afbo afbo = this.a;
        int i = this.b;
        aaje aaje = this.c;
        afcz afcz = this.d;
        aajs aajs = this.e;
        aemk aemk = this.f;
        Object obj = this.g;
        if (afbo.F() == i) {
            afbo.a(aaje, afcz, aajs, aemk, aaje.e.L());
            afbo.B = obj;
        }
    }
}
