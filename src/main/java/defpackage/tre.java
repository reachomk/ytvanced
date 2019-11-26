package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* renamed from: tre */
final class tre implements tqz {
    private final /* synthetic */ tpz a;
    private final /* synthetic */ Set b;

    tre(tpz tpz, Set set) {
        this.a = tpz;
        this.b = set;
    }

    public final String a(Map map) {
        Iterable<Number> a = tqy.a(map.get(this.a));
        if (a == null) {
            return null;
        }
        Iterable arrayList = new ArrayList();
        int i = 0;
        for (Number intValue : a) {
            i += intValue.intValue();
            arrayList.add(Integer.valueOf(i));
        }
        Set set = this.b;
        if (set != null) {
            arrayList = tqy.a(arrayList, set);
        }
        return TextUtils.join(",", arrayList);
    }
}
