package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: osw */
final class osw implements ork {
    private final orf[] a;
    private final long[] b;

    public osw(orf[] orfArr, long[] jArr) {
        this.a = orfArr;
        this.b = jArr;
    }

    public final int a(long j) {
        int a = ozp.a(this.b, j, false, false);
        return a >= this.b.length ? -1 : a;
    }

    public final int a() {
        return this.b.length;
    }

    public final long a(int i) {
        boolean z = true;
        oxz.a(i >= 0);
        if (i >= this.b.length) {
            z = false;
        }
        oxz.a(z);
        return this.b[i];
    }

    public final List b(long j) {
        int a = ozp.a(this.b, j, false);
        if (a != -1) {
            Object obj = this.a[a];
            if (obj != null) {
                return Collections.singletonList(obj);
            }
        }
        return Collections.emptyList();
    }
}
