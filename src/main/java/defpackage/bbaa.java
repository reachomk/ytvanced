package defpackage;

/* renamed from: bbaa */
abstract class bbaa implements Runnable {
    private final basr a;

    public bbaa(basr basr) {
        this.a = basr;
    }

    public abstract void a();

    public final void run() {
        basr c = this.a.c();
        try {
            a();
        } finally {
            this.a.a(c);
        }
    }
}
