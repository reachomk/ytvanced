package defpackage;

/* renamed from: vep */
final /* synthetic */ class vep implements Runnable {
    private final vem a;
    private final aafv b;
    private final aakj c;
    private final aaga d;

    vep(vem vem, aafv aafv, aakj aakj, aaga aaga) {
        this.a = vem;
        this.b = aafv;
        this.c = aakj;
        this.d = aaga;
    }

    public final void run() {
        vem vem = this.a;
        aafv aafv = this.b;
        aakj aakj = this.c;
        aaga aaga = this.d;
        vuv vuv = vem.c;
        aaga.d();
        vuv.a(aafv, aakj, aaga.l(), false, false);
    }
}
