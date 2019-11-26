package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: oxq */
public final class oxq {
    public final Map a = new HashMap();
    public final List b = new ArrayList();

    public static oxq a(oxq oxq, long j) {
        oxq.a("exo_len", Long.valueOf(j));
        return oxq;
    }

    public final oxq a(String str, Object obj) {
        this.a.put((String) oxz.a((Object) str), oxz.a(obj));
        this.b.remove(str);
        return this;
    }
}
