package defpackage;

/* renamed from: aeon */
final class aeon implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ aajf b;
    private final /* synthetic */ aeol c;

    aeon(aeol aeol, String str, aajf aajf) {
        this.c = aeol;
        this.a = str;
        this.b = aajf;
    }

    public final void run() {
        ((aepu) this.c.a.get()).d.a((String) amqw.a(this.a), (aajf) amqw.a(this.b));
    }
}
