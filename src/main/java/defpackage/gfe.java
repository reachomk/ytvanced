package defpackage;

/* renamed from: gfe */
final class gfe implements afsw {
    private final /* synthetic */ gff a;

    gfe(gff gff) {
        this.a = gff;
    }

    public final void a(bqn bqn) {
        if (!this.a.e.get()) {
            xtl.a("Failed to get camera info", (Throwable) bqn);
            this.a.b.sendEmptyMessage(2);
        }
    }
}
