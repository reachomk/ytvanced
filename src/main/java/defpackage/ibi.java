package defpackage;

import android.util.SparseIntArray;
import android.util.SparseLongArray;

/* renamed from: ibi */
final class ibi {
    public final SparseIntArray a = new SparseIntArray(5);
    public final SparseLongArray b = new SparseLongArray(5);

    ibi() {
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, int i2, long j) {
        i--;
        this.a.put(i, i2);
        this.b.put(i, j);
    }

    /* Access modifiers changed, original: final */
    public final boolean a(int i) {
        SparseIntArray sparseIntArray = this.a;
        int i2 = i - 1;
        if (i != 0) {
            return sparseIntArray.indexOfKey(i2) >= 0;
        } else {
            throw null;
        }
    }
}
