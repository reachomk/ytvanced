package defpackage;

import android.util.SparseIntArray;

/* renamed from: abru */
public final class abru {
    private static final SparseIntArray a = new abrx();
    private static final SparseIntArray b = new abrw();
    private final SparseIntArray c;

    public abru(abrz abrz) {
        Object obj;
        int ordinal = abrz.ordinal();
        if (ordinal == 0) {
            obj = a;
        } else if (ordinal != 1) {
            obj = null;
        } else {
            obj = b;
        }
        this.c = (SparseIntArray) amqw.a(obj);
    }

    public final int a(int i) {
        return this.c.indexOfKey(i) >= 0 ? this.c.get(i) : 0;
    }
}
