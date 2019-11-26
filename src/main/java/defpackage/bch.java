package defpackage;

/* renamed from: bch */
final class bch implements Runnable {
    private final /* synthetic */ bci a;

    bch(bci bci) {
        this.a = bci;
    }

    public final void run() {
        bci bci = this.a;
        int size = bci.g.size();
        for (int i = 0; i < size; i++) {
            ((bbg) bci.g.valueAt(i)).a(null, null);
        }
        bci.g.clear();
    }
}
