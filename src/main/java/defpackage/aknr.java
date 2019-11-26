package defpackage;

import android.util.SparseBooleanArray;
import java.util.ArrayList;

/* renamed from: aknr */
public class aknr extends apu {
    public final int b = 20;
    private final SparseBooleanArray c = new SparseBooleanArray();

    public void a(int i, int i2) {
        apx b = b(i);
        b.b = i2;
        ArrayList arrayList = b.a;
        while (arrayList.size() > i2) {
            arrayList.remove(arrayList.size() - 1);
        }
        this.c.put(i, true);
    }

    public void a(aqj aqj) {
        int i = aqj.f;
        if (!this.c.get(i)) {
            a(i, this.b);
        }
        super.a(aqj);
    }
}
