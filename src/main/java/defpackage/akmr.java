package defpackage;

/* renamed from: akmr */
final class akmr extends akmo {
    private final bwd a;

    akmr(bxh bxh, bwd bwd, zq zqVar) {
        super(bxh, zqVar);
        this.a = bwd;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(bvw bvw) {
        return bvw instanceof akmq;
    }

    /* Access modifiers changed, original: protected|final */
    public final bvw a(afmc afmc) {
        return new akmq(afmc, this.a);
    }
}
