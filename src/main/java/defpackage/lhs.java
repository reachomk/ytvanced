package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: lhs */
public final class lhs implements adoe {
    public final enl a;
    public final Set b = Collections.newSetFromMap(new WeakHashMap());
    private final bcaa c;
    private final bcaa d;

    public lhs(bcaa bcaa, bcaa bcaa2, enl enl) {
        this.c = bcaa;
        this.d = bcaa2;
        this.a = enl;
    }

    public final void a(String str, adod adod) {
        if (TextUtils.isEmpty(str)) {
            adod.a(Collections.emptyList());
        } else {
            adod.a(Collections.singletonList(this.a.a(airn.a(str, "", -1, 0.0f))));
        }
    }

    public final void b(String str, adod adod) {
        if (TextUtils.isEmpty(str)) {
            adod.a(Collections.emptyList());
            return;
        }
        String str2 = "";
        String str3 = "";
        String str4 = str;
        ((aisl) this.c.get()).a(str2, str4, ((aikf) this.d.get()).a(), str3, zzp.b, new lhv(this, adod));
    }
}
