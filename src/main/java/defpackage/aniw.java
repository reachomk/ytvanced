package defpackage;

/* renamed from: aniw */
final class aniw extends anig {
    private anit d;
    private final /* synthetic */ anis e;

    aniw(anis anis, amuh amuh, anit anit) {
        this.e = anis;
        super(anis, amuh, false);
        this.d = anit;
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z, int i, Object obj) {
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        anit anit = this.d;
        if (anit != null) {
            anit.d();
        } else {
            amqw.b(this.e.isDone());
        }
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        anit anit = this.d;
        if (anit != null) {
            anit.e();
        }
    }
}
