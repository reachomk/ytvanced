package defpackage;

import android.util.SparseArray;

/* renamed from: nhv */
public final class nhv {
    public final SparseArray a = new SparseArray();

    public final void a(int i, Runnable runnable) {
        c(i).a.add(runnable);
    }

    public final void a(int i, nhz nhz) {
        nia c = c(i);
        c.b.add(nhz);
        nhz.a(c.c);
    }

    public final void a(int i, boolean z) {
        nia c = c(i);
        c.c = z;
        bctz.a(c.b).a(new nhy(z));
    }

    public final boolean a(int i) {
        nia nia = (nia) this.a.get(i);
        return nia != null && nia.c;
    }

    public final void b(int i) {
        nia nia = (nia) this.a.get(i);
        if (nia != null) {
            bctz.a(nia.a).a(nhx.a);
        }
    }

    private final nia c(int i) {
        nia nia = (nia) this.a.get(i);
        if (nia != null) {
            return nia;
        }
        nia = new nia();
        this.a.put(i, nia);
        return nia;
    }
}
