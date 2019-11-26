package defpackage;

import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: bdm */
public final class bdm {
    public static final bdq f = new bdl();
    public final List a;
    public final List b;
    public final Map c = new zj();
    public final SparseBooleanArray d = new SparseBooleanArray();
    public final bds e;

    public static bdo a(Bitmap bitmap) {
        return new bdo(bitmap);
    }

    bdm(List list, List list2) {
        this.a = list;
        this.b = list2;
        int size = this.a.size();
        int i = aocf.UNSET_ENUM_VALUE;
        bds bds = null;
        for (int i2 = 0; i2 < size; i2++) {
            bds bds2 = (bds) this.a.get(i2);
            int i3 = bds2.b;
            if (i3 > i) {
                bds = bds2;
            }
            if (i3 > i) {
                i = i3;
            }
        }
        this.e = bds;
    }

    public final List a() {
        return Collections.unmodifiableList(this.a);
    }

    public final bds a(bdr bdr) {
        return (bds) this.c.get(bdr);
    }
}
