package defpackage;

/* renamed from: xxk */
final class xxk implements Runnable {
    private final String a;
    private final apxu b;
    private final /* synthetic */ xxf c;

    public final void run() {
        this.c.b.a(this.a);
        this.c.b(this.b);
    }

    /* synthetic */ xxk(xxf xxf, String str, apxu apxu) {
        this.c = xxf;
        this.a = (String) amqw.a((Object) str);
        this.b = (apxu) amqw.a((Object) apxu);
    }
}
