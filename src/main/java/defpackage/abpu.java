package defpackage;

/* renamed from: abpu */
final /* synthetic */ class abpu implements Runnable {
    private final abps a;
    private final ajtf b;

    abpu(abps abps, ajtf ajtf) {
        this.a = abps;
        this.b = ajtf;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
