package defpackage;

/* renamed from: agyj */
final /* synthetic */ class agyj implements Runnable {
    private final agyk a;

    agyj(agyk agyk) {
        this.a = agyk;
    }

    public final void run() {
        agyk agyk = this.a;
        synchronized (agyk.y) {
            if (agyk.z == agyk.A && !agyk.H) {
                agyk.g();
            }
        }
    }
}
