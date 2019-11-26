package defpackage;

import android.util.SparseArray;
import java.util.HashSet;

/* renamed from: lio */
public final class lio implements lij {
    public final SparseArray a = new SparseArray();
    public final HashSet b = new HashSet();
    public lij c;

    public final void a(lix lix) {
        lij lij = this.c;
        if (lij != null) {
            lij.a(lix);
        } else {
            this.a.put(lix.a(), lix);
        }
    }

    public final lix a(int i) {
        lij lij = this.c;
        if (lij != null) {
            return lij.a(i);
        }
        lix lix = (lix) this.a.get(i);
        if (lix != null) {
            this.a.remove(i);
        }
        return lix;
    }

    public final void a(int i, boolean z) {
        lij lij = this.c;
        if (lij != null) {
            lij.a(i, z);
        }
    }

    public final void a(lim lim) {
        lij lij = this.c;
        if (lij != null) {
            lij.a(lim);
        } else {
            this.b.add(lim);
        }
    }

    public final void b(lim lim) {
        lij lij = this.c;
        if (lij != null) {
            lij.b(lim);
        } else {
            this.b.remove(lim);
        }
    }
}
