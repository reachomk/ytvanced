package defpackage;

import java.util.ArrayDeque;

/* renamed from: afiz */
public final class afiz {
    private final ArrayDeque a = new ArrayDeque();

    public final void a(long j, long j2) {
        if (this.a.isEmpty() || ((afiy) this.a.getLast()).a <= j) {
            afiy afiy;
            this.a.addLast(new afiy(j, j2));
            j -= 5000;
            Object removeFirst = this.a.removeFirst();
            while (true) {
                afiy = (afiy) removeFirst;
                if (this.a.size() <= 1 || ((afiy) this.a.peekFirst()).a >= j) {
                    this.a.addFirst(afiy);
                } else {
                    removeFirst = this.a.removeFirst();
                }
            }
            this.a.addFirst(afiy);
            return;
        }
        xtl.d("DropFramerateAnalyzer observation skipped due to time skew");
    }

    public final void a() {
        this.a.clear();
    }

    public final boolean a(double d) {
        if (this.a.size() > 2) {
            long j = ((afiy) this.a.getLast()).a - ((afiy) this.a.getFirst()).a;
            long j2 = ((afiy) this.a.getLast()).b - ((afiy) this.a.getFirst()).b;
            if (j >= 5000 && ((double) ((j2 * 1000) / j)) > d) {
                return true;
            }
        }
        return false;
    }
}
