package defpackage;

import android.util.SparseArray;

/* renamed from: wxb */
public final class wxb {
    public SparseArray a;

    public final boolean a(int i) {
        SparseArray sparseArray = this.a;
        if (sparseArray == null || sparseArray.get(i) == null) {
            return false;
        }
        return true;
    }
}
