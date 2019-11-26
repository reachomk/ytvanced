package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: trh */
final class trh implements tqz {
    private final /* synthetic */ tpz a;
    private final /* synthetic */ int[] b;

    trh(tpz tpz, int[] iArr) {
        this.a = tpz;
        this.b = iArr;
    }

    public final String a(Map map) {
        if (!(map.get(this.a) instanceof Double)) {
            return null;
        }
        double doubleValue = ((Double) map.get(this.a)).doubleValue() * 100.0d;
        ArrayList arrayList = new ArrayList();
        for (int i : this.b) {
            int i2 = 1;
            if (i == 0) {
                if (doubleValue > 0.0d) {
                    arrayList.add(Integer.valueOf(i2));
                }
            } else if (doubleValue >= ((double) i)) {
                arrayList.add(Integer.valueOf(i2));
            }
            i2 = 0;
            arrayList.add(Integer.valueOf(i2));
        }
        return TextUtils.join(",", arrayList);
    }
}
