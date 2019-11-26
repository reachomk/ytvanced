package defpackage;

/* renamed from: abpz */
final class abpz implements afsw {
    public final /* synthetic */ abpx a;
    private final /* synthetic */ Runnable b;
    private final /* synthetic */ ajti c;
    private final /* synthetic */ aaml d;

    abpz(abpx abpx, Runnable runnable, ajti ajti, aaml aaml) {
        this.a = abpx;
        this.b = runnable;
        this.c = ajti;
        this.d = aaml;
    }

    public final void a(bqn bqn) {
        abro e = this.a.a.e();
        if (e != null) {
            e.a(this.a.a.h.a((Throwable) bqn), new abpy(this, this.d, this.c, this.b));
        }
        abpt abpt = this.a.a.e;
        if (abpt != null) {
            abpt.b();
        }
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }
}
