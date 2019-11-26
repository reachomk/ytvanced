package defpackage;

/* renamed from: acga */
final /* synthetic */ class acga implements Runnable {
    private final acfl a;
    private final int b;
    private final aqhy c;

    acga(acfl acfl, int i, aqhy aqhy) {
        this.a = acfl;
        this.b = i;
        this.c = aqhy;
    }

    public final void run() {
        this.a.a(this.b, this.c);
    }
}
