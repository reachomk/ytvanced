package defpackage;

import java.util.ArrayList;

/* renamed from: fgu */
public final class fgu {
    public final ffu a;
    public final int b;
    public final ArrayList c = new ArrayList();
    public int d = 0;
    public int e = 0;
    public fgu f;

    fgu(fob fob, fgz fgz, int i) {
        this.a = new ffu(fgz, fob);
        this.b = i;
    }

    /* Access modifiers changed, original: final */
    public final void a(fgs fgs) {
        this.c.remove(fgs);
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return this.c.isEmpty() ^ 1;
    }
}
