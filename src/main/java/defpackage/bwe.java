package defpackage;

import java.util.Queue;

/* renamed from: bwe */
abstract class bwe {
    private final Queue a = chv.a(20);

    bwe() {
    }

    public abstract bwp b();

    /* Access modifiers changed, original: final */
    public final bwp a() {
        bwp bwp = (bwp) this.a.poll();
        return bwp == null ? b() : bwp;
    }

    public final void a(bwp bwp) {
        if (this.a.size() < 20) {
            this.a.offer(bwp);
        }
    }
}
