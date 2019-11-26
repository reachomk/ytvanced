package defpackage;

/* renamed from: sid */
final /* synthetic */ class sid implements Runnable {
    private final shz a;

    sid(shz shz) {
        this.a = shz;
    }

    public final void run() {
        shz shz = this.a;
        boolean z = true;
        if (!(shz.m.a() || shz.o)) {
            z = false;
        }
        shz.a(z);
        shz.q = null;
    }
}
