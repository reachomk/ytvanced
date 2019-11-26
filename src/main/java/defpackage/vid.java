package defpackage;

/* renamed from: vid */
final /* synthetic */ class vid implements Runnable {
    private final vhu a;
    private final boolean b;
    private final anjv c;

    vid(vhu vhu, boolean z, anjv anjv) {
        this.a = vhu;
        this.b = z;
        this.c = anjv;
    }

    public final void run() {
        this.a.a(this.b, this.c);
    }
}
