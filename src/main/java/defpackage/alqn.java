package defpackage;

/* renamed from: alqn */
final /* synthetic */ class alqn implements Runnable {
    private final alqh a;

    alqn(alqh alqh) {
        this.a = alqh;
    }

    public final void run() {
        for (alrz c : this.a.b) {
            c.c();
        }
    }
}
