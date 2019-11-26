package defpackage;

import android.content.Context;
import android.util.SparseArray;

/* renamed from: ovq */
public final class ovq {
    public final Context a;
    public final SparseArray b;
    public final int c;
    public final oye d;

    public ovq(Context context) {
        this.a = context != null ? context.getApplicationContext() : null;
        int[] iArr = (int[]) ovo.a.get(ozp.b(context));
        if (iArr == null) {
            iArr = new int[]{2, 2, 2, 2};
        }
        SparseArray sparseArray = new SparseArray(6);
        sparseArray.append(0, Long.valueOf(1000000));
        sparseArray.append(2, Long.valueOf(ovo.b[iArr[0]]));
        sparseArray.append(3, Long.valueOf(ovo.c[iArr[1]]));
        sparseArray.append(4, Long.valueOf(ovo.d[iArr[2]]));
        sparseArray.append(5, Long.valueOf(ovo.e[iArr[3]]));
        sparseArray.append(7, Long.valueOf(ovo.b[iArr[0]]));
        this.b = sparseArray;
        this.c = 2000;
        this.d = oye.a;
    }
}
