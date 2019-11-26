package defpackage;

import android.util.SparseArray;

/* renamed from: acel */
public enum acel {
    GOOD(0),
    POOR(1),
    BAD(2);
    
    private static final SparseArray e = null;
    private final int d;

    private acel(int i) {
        this.d = i;
    }

    static {
        e = new SparseArray();
        acel[] values = acel.values();
        int length = values.length;
        int i;
        while (i < length) {
            acel acel = values[i];
            e.put(acel.d, acel);
            i++;
        }
    }
}
