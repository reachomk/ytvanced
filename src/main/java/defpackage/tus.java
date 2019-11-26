package defpackage;

/* renamed from: tus */
final class tus implements Runnable {
    private final /* synthetic */ bcfa a;
    private final /* synthetic */ tur b;

    tus(tur tur, bcfa bcfa) {
        this.b = tur;
        this.a = bcfa;
    }

    public final void run() {
        this.b.a(this.a, null);
    }
}
