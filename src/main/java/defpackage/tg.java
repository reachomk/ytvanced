package defpackage;

import android.util.SparseIntArray;

/* renamed from: tg */
public final class tg implements bil {
    private static final SparseIntArray a;
    private ti b;

    tg() {
    }

    static int a(int i, int i2) {
        return 3;
    }

    static String a(int i) {
        return "USAGE_UNKNOWN";
    }

    public tg(ti tiVar) {
        this.b = tiVar;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tg)) {
            return false;
        }
        tg tgVar = (tg) obj;
        ti tiVar = this.b;
        if (tiVar != null) {
            return tiVar.equals(tgVar.b);
        }
        if (tgVar.b == null) {
            return true;
        }
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        a = sparseIntArray;
        sparseIntArray.put(5, 1);
        a.put(6, 2);
        a.put(7, 2);
        a.put(8, 1);
        a.put(9, 1);
        a.put(10, 1);
    }
}
