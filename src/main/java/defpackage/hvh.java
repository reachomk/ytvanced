package defpackage;

import android.util.SparseArray;
import android.view.View.OnClickListener;

/* renamed from: hvh */
public final class hvh {
    public final SparseArray a = new SparseArray(3);
    public int b = 0;

    hvh(hvi hvi, hvi hvi2, hvi hvi3) {
        this.a.put(1, (hvi) amqw.a((Object) hvi));
        this.a.put(2, (hvi) amqw.a((Object) hvi2));
        this.a.put(3, (hvi) amqw.a((Object) hvi3));
        a();
    }

    /* Access modifiers changed, original: final */
    public final void a(OnClickListener onClickListener) {
        for (int i = 0; i < this.a.size(); i++) {
            ((hvi) this.a.valueAt(i)).a(onClickListener);
        }
    }

    public final void a() {
        for (int i = 0; i < this.a.size(); i++) {
            hvi hvi = (hvi) this.a.valueAt(i);
            boolean z = this.a.keyAt(i) == this.b;
            if (z && !hvi.c) {
                hvi.a();
            }
            xpr.a(hvi.a, z);
        }
    }
}
