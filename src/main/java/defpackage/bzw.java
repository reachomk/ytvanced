package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: bzw */
final class bzw implements bzq {
    private final List a;
    private final zy b;

    bzw(List list, zy zyVar) {
        this.a = list;
        this.b = zyVar;
    }

    public final bzp a(Object obj, int i, int i2, bsq bsq) {
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        bsm bsm = null;
        for (int i3 = 0; i3 < size; i3++) {
            bzq bzq = (bzq) this.a.get(i3);
            if (bzq.a(obj)) {
                bzp a = bzq.a(obj, i, i2, bsq);
                if (a != null) {
                    bsm = a.a;
                    arrayList.add(a.c);
                }
            }
        }
        if (arrayList.isEmpty() || bsm == null) {
            return null;
        }
        return new bzp(bsm, new bzv(arrayList, this.b));
    }

    public final boolean a(Object obj) {
        for (bzq a : this.a) {
            if (a.a(obj)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a.toArray());
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arrays).length() + 31);
        stringBuilder.append("MultiModelLoader{modelLoaders=");
        stringBuilder.append(arrays);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
