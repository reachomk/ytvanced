package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: nlt */
final class nlt implements nlp {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public final nmx[][] b;
    public boolean c = false;
    public int d = 1;
    public int e;
    private final Handler f;
    private final nlv g;
    private final int[] h;

    public nlt(int i, int i2, int i3) {
        this.b = new nmx[i][];
        this.h = new int[i];
        this.f = new nlw(this);
        this.g = new nlv(this.f, this.c, this.h, i2, i3);
    }

    public final Looper a() {
        return this.g.b.getLooper();
    }

    public final void a(nlu nlu) {
        this.a.add(nlu);
    }

    public final void b(nlu nlu) {
        this.a.remove(nlu);
    }

    public final int b() {
        return this.d;
    }

    public final void a(nnj... nnjArr) {
        Arrays.fill(this.b, null);
        this.g.a.obtainMessage(1, nnjArr).sendToTarget();
    }

    public final int c() {
        nmx[] nmxArr = this.b[0];
        return nmxArr != null ? nmxArr.length : 0;
    }

    public final nmx a(int i) {
        return this.b[0][i];
    }

    public final void a(int i, int i2) {
        int[] iArr = this.h;
        if (iArr[i] != i2) {
            iArr[i] = i2;
            this.g.a.obtainMessage(8, i, i2).sendToTarget();
        }
    }

    public final int b(int i) {
        return this.h[i];
    }

    public final void a(boolean z) {
        if (this.c != z) {
            this.c = z;
            this.e++;
            this.g.a.obtainMessage(3, z, 0).sendToTarget();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((nlu) it.next()).a(z, this.d);
            }
        }
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e() {
        return this.e == 0;
    }

    public final void a(long j) {
        nlv nlv = this.g;
        nlv.e = j;
        nlv.c.incrementAndGet();
        nlv.a.obtainMessage(6, nxf.a(j), nxf.b(j)).sendToTarget();
    }

    public final void f() {
        this.g.a.sendEmptyMessage(4);
    }

    public final void g() {
        this.g.a();
        this.f.removeCallbacksAndMessages(null);
    }

    public final void a(nls nls, int i, Object obj) {
        nlv nlv = this.g;
        nlv.d++;
        nlv.a.obtainMessage(9, i, 0, Pair.create(nls, obj)).sendToTarget();
    }

    public final void b(nls nls, int i, Object obj) {
        this.g.a(nls, i, obj);
    }

    public final long h() {
        nlv nlv = this.g;
        if (nlv.f != -1) {
            return nlv.f / 1000;
        }
        return -1;
    }

    public final long i() {
        nlv nlv = this.g;
        return nlv.c.get() <= 0 ? nlv.g / 1000 : nlv.e;
    }

    public final long j() {
        nlv nlv = this.g;
        if (nlv.h != -1) {
            return nlv.h / 1000;
        }
        return -1;
    }
}
