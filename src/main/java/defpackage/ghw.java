package defpackage;

import android.util.SparseArray;
import android.view.ViewGroup;

/* renamed from: ghw */
final class ghw extends oo {
    public int b = 0;
    private final SparseArray c = new SparseArray();
    private final /* synthetic */ ghn d;

    public ghw(ghn ghn, nt ntVar) {
        this.d = ghn;
        super(ntVar);
    }

    public final Object a(ViewGroup viewGroup, int i) {
        nf nfVar = (nf) super.a(viewGroup, this.d.an.c(i));
        this.c.put(i, nfVar);
        return nfVar;
    }

    public final void a(ViewGroup viewGroup, int i, Object obj) {
        this.c.remove(i);
        super.a(viewGroup, i, obj);
    }

    public final nf c(int i) {
        return (nf) this.c.get(this.d.an.c(i));
    }

    public final int c() {
        return this.b;
    }

    public final nf a(int i) {
        return new gil();
    }
}
