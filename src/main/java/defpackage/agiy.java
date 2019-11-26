package defpackage;

import android.util.SparseArray;

/* renamed from: agiy */
public enum agiy {
    EMPTY(0),
    FORECASTING(1),
    FULL(2);
    
    public static final SparseArray d = null;
    public final int c;

    private agiy(int i) {
        this.c = i;
    }

    static {
        d = new SparseArray();
        agiy[] values = agiy.values();
        int length = values.length;
        int i;
        while (i < length) {
            agiy agiy = values[i];
            d.put(agiy.c, agiy);
            i++;
        }
    }
}
