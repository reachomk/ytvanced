package defpackage;

/* renamed from: ajoj */
final /* synthetic */ class ajoj implements Runnable {
    private final ajok a;
    private final ajov b;
    private final atdv c;

    ajoj(ajok ajok, ajov ajov, atdv atdv) {
        this.a = ajok;
        this.b = ajov;
        this.c = atdv;
    }

    public final void run() {
        ajok ajok = this.a;
        ajov ajov = this.b;
        atdv atdv = this.c;
        if (!ajov.c()) {
            ajoy ajoy = (ajoy) ajok.a.get();
            aiqs a = aiqq.a();
            a.a = ajok.a(atdv);
            ajoy.a(a.b());
        }
    }
}
