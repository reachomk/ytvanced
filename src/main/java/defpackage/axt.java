package defpackage;

import android.util.SparseArray;

/* renamed from: axt */
final class axt {
    public axa a;
    private final SparseArray b;

    private axt() {
        this(1);
    }

    axt(int i) {
        this.b = new SparseArray(i);
    }

    /* Access modifiers changed, original: final */
    public final axt a(int i) {
        SparseArray sparseArray = this.b;
        return sparseArray != null ? (axt) sparseArray.get(i) : null;
    }

    /* Access modifiers changed, original: final */
    public final void a(axa axa, int i, int i2) {
        axt a = a(axa.a(i));
        if (a == null) {
            a = new axt();
            this.b.put(axa.a(i), a);
        }
        if (i2 > i) {
            a.a(axa, i + 1, i2);
        } else {
            a.a = axa;
        }
    }
}
