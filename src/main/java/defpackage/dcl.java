package defpackage;

import android.graphics.Typeface;
import android.util.SparseArray;

/* renamed from: dcl */
final class dcl extends SparseArray {
    private final Object a = new Object();
    private final SparseArray b;

    dcl(SparseArray sparseArray) {
        this.b = sparseArray;
    }

    public final /* bridge */ /* synthetic */ void put(int i, Object obj) {
        Typeface typeface = (Typeface) obj;
        synchronized (this.a) {
            this.b.put(i, typeface);
        }
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        Typeface typeface;
        synchronized (this.a) {
            typeface = (Typeface) this.b.get(i);
        }
        return typeface;
    }
}
