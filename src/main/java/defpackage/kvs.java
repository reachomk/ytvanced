package defpackage;

/* renamed from: kvs */
final class kvs implements Runnable {
    public boolean a;
    private final xci b;
    private final Object c;

    public kvs(xci xci, Object obj) {
        this.b = (xci) amqw.a((Object) xci);
        this.c = amqw.a(obj);
    }

    public final void run() {
        if (!this.a) {
            this.b.d(new zyg(this.c));
        }
    }
}
