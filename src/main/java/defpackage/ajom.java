package defpackage;

/* renamed from: ajom */
final /* synthetic */ class ajom implements Runnable {
    private final ajok a;
    private final ajov b;

    ajom(ajok ajok, ajov ajov) {
        this.a = ajok;
        this.b = ajov;
    }

    public final void run() {
        ajok ajok = this.a;
        if (!this.b.c()) {
            ((ajoy) ajok.a.get()).f();
        }
    }
}
