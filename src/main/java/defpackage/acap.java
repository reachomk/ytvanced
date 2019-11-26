package defpackage;

/* renamed from: acap */
final class acap implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ acan b;

    acap(acan acan, int i) {
        this.b = acan;
        this.a = i;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
