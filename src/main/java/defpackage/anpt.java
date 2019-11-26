package defpackage;

/* renamed from: anpt */
final class anpt implements Runnable {
    private final /* synthetic */ anps a;
    private final /* synthetic */ anpu b;

    anpt(anpu anpu, anps anps) {
        this.b = anpu;
        this.a = anps;
    }

    public final void run() {
        this.b.a.a(this.a.a);
        this.a.a();
    }
}
