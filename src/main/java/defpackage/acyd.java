package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: acyd */
public final class acyd extends afsv {
    private final List a;
    private final afpt b;

    public acyd(String str, List list, afpt afpt, bqk bqk) {
        super(0, str, bqk);
        this.a = (List) amqw.a((Object) list);
        this.b = (afpt) amqw.a((Object) afpt);
    }

    public final Map c() {
        HashMap hashMap = new HashMap();
        try {
            for (afsa a : this.a) {
                a.a(hashMap, this);
            }
        } catch (bpx unused) {
            xtl.c("CsiRequest: unexpected AuthFailureError");
        }
        return hashMap;
    }

    public final bqh a(bqd bqd) {
        return bqh.a(null, null);
    }

    public final afpt bm_() {
        return this.b;
    }
}
