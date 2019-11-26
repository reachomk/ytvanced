package defpackage;

import android.util.SparseIntArray;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: eyb */
public final class eyb {
    public final SparseIntArray a = new SparseIntArray(4);
    public int b = 0;
    private final Set c = Collections.newSetFromMap(new WeakHashMap());

    public final void a(eye eye) {
        this.c.add(eye);
    }

    public final void b(eye eye) {
        this.c.remove(eye);
    }

    public final void a(int i, int i2) {
        this.a.put(i, i2);
        i2 = 0;
        for (i = 0; i < this.a.size(); i++) {
            i2 += this.a.valueAt(i);
        }
        if (this.b != i2) {
            this.b = i2;
            for (eye a : this.c) {
                a.a();
            }
        }
    }
}
