package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dcc */
public final class dcc {
    public final SparseArray a = new SparseArray();
    public final int b;
    private final Map c = new HashMap();
    private final boolean d;
    private int e;

    public dcc(boolean z, int i) {
        this.d = z;
        this.b = i;
        this.e = i + 1;
    }

    public final void a(dbz dbz) {
        if (dbz.f() && dbz != dat.a) {
            if (this.d && !dbz.i()) {
                throw new IllegalStateException("If you enable custom viewTypes, you must provide a customViewType in ViewRenderInfo.");
            } else if (!this.d && dbz.i()) {
                throw new IllegalStateException("You must enable custom viewTypes to provide customViewType in ViewRenderInfo.");
            } else if (this.d && this.b == dbz.j()) {
                throw new IllegalStateException("CustomViewType cannot be the same as ComponentViewType.");
            } else {
                int intValue;
                cye h = dbz.h();
                if (this.c.containsKey(h)) {
                    intValue = ((Integer) this.c.get(h)).intValue();
                } else {
                    int j;
                    if (dbz.i()) {
                        j = dbz.j();
                    } else {
                        j = this.e;
                        this.e = j + 1;
                    }
                    this.a.put(j, h);
                    this.c.put(h, Integer.valueOf(j));
                    intValue = j;
                }
                if (!dbz.i()) {
                    dbz.a(intValue);
                }
            }
        }
    }
}
