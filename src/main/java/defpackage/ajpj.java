package defpackage;

/* renamed from: ajpj */
final /* synthetic */ class ajpj implements Runnable {
    private final ajpk a;
    private final int b;

    ajpj(ajpk ajpk, int i) {
        this.a = ajpk;
        this.b = i;
    }

    public final void run() {
        ajpk ajpk = this.a;
        ajpk.a.a(this.b);
    }
}
