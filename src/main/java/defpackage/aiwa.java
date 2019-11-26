package defpackage;

/* renamed from: aiwa */
final class aiwa extends Thread {
    private final /* synthetic */ aiwb a;

    aiwa(aiwb aiwb, String str) {
        this.a = aiwb;
        super(str);
    }

    public final void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException unused) {
        } finally {
            this.a.a.d(0);
        }
    }
}
