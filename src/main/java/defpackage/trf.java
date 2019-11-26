package defpackage;

import android.text.TextUtils;
import java.util.Map;
import java.util.Set;

/* renamed from: trf */
final class trf implements tqz {
    private final /* synthetic */ tpz a;
    private final /* synthetic */ Set b;

    trf(tpz tpz, Set set) {
        this.a = tpz;
        this.b = set;
    }

    public final String a(Map map) {
        Iterable a = tqy.a(map.get(this.a));
        if (a == null) {
            return null;
        }
        Set set = this.b;
        if (set != null) {
            a = tqy.a(a, set);
        }
        return TextUtils.join(",", a);
    }
}
