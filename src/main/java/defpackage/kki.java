package defpackage;

import android.util.SparseArray;
import android.view.ViewGroup;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: kki */
final class kki {
    public final SparseArray a = new SparseArray();
    public final ViewGroup b;
    private final SparseArray c = new SparseArray();

    /* Access modifiers changed, original: final */
    public final kki a(int i, kkh kkh) {
        this.c.put(i, kkh);
        this.a.put(i, new ArrayDeque());
        return this;
    }

    /* Access modifiers changed, original: final */
    public final kkg a(int i) {
        kkg kkg = (kkg) ((Deque) this.a.get(i)).pollLast();
        if (!(kkg == null || kkg.b().getParent() == null)) {
            ((Deque) this.a.get(i)).offerFirst(kkg);
            kkg = null;
        }
        return kkg == null ? ((kkh) this.c.get(i)).a(this.b) : kkg;
    }

    /* synthetic */ kki(ViewGroup viewGroup) {
        this.b = viewGroup;
    }
}
