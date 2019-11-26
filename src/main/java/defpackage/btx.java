package defpackage;

/* renamed from: btx */
final class btx implements Runnable {
    private final /* synthetic */ btw a;

    btx(btw btw) {
        this.a = btw;
    }

    public final void run() {
        btw btw = this.a;
        while (true) {
            boolean z = btw.c;
            try {
                btw.a((btz) btw.a.remove());
                bua bua = btw.d;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
