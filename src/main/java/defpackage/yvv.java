package defpackage;

/* renamed from: yvv */
final /* synthetic */ class yvv implements bqj {
    private final yvo a;
    private final ykv b;

    yvv(yvo yvo, ykv ykv) {
        this.a = yvo;
        this.b = ykv;
    }

    public final void a(Object obj) {
        yvo yvo = this.a;
        asgp asgp = (asgp) obj;
        bblt a = yvo.a(this.b.a, 1);
        Object yvp = new yvp(yvo, asgp);
        bbow.a(yvp, "onComplete is null");
        a.a(new bbpj(yvp));
    }
}
