package defpackage;

import android.util.SparseArray;

/* renamed from: aekf */
final class aekf extends npd {
    public final SparseArray d;

    aekf(String str, SparseArray sparseArray) {
        super(str, null, null);
        this.d = (SparseArray) amqw.a((Object) sparseArray);
    }
}
