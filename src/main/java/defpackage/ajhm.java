package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.TreeMap;

/* renamed from: ajhm */
public final class ajhm {
    public long a;
    public long b;
    public boolean c;
    public String d;
    public TreeMap e = new TreeMap();
    public SparseArray f;

    public ajhm() {
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < 3; i++) {
            sparseArray.put(i, new ArrayList());
        }
        this.f = sparseArray;
    }
}
