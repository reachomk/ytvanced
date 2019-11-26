package defpackage;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.TextUtils.TruncateAt;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.lang.reflect.Field;

/* renamed from: dct */
public final class dct {
    public static final int a = 1;

    static {
        if (!dck.a.getAndSet(true)) {
            try {
                Field declaredField = Typeface.class.getDeclaredField("sTypefaceCache");
                declaredField.setAccessible(true);
                Object obj = new Object();
                synchronized (obj) {
                    int i = 0;
                    int size;
                    if (VERSION.SDK_INT >= 21) {
                        LongSparseArray longSparseArray = (LongSparseArray) declaredField.get(null);
                        dcj dcj = new dcj(obj, longSparseArray.size());
                        declaredField.set(null, dcj);
                        size = longSparseArray.size();
                        while (i < size) {
                            dcj.append(longSparseArray.keyAt(i), new dcl((SparseArray) longSparseArray.valueAt(i)));
                            i++;
                        }
                    } else {
                        SparseArray sparseArray = (SparseArray) declaredField.get(null);
                        dcm dcm = new dcm(obj, sparseArray.size());
                        declaredField.set(null, dcm);
                        size = sparseArray.size();
                        while (i < size) {
                            dcm.append(sparseArray.keyAt(i), new dcl((SparseArray) sparseArray.valueAt(i)));
                            i++;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        TruncateAt.values();
    }
}
