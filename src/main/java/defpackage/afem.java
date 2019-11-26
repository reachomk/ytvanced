package defpackage;

/* renamed from: afem */
final /* synthetic */ class afem implements Runnable {
    private final afen a;
    private final int b;

    afem(afen afen, int i) {
        this.a = afen;
        this.b = i;
    }

    public final void run() {
        afen afen = this.a;
        afen.a.a(this.b);
    }
}
