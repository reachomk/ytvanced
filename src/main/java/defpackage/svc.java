package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: svc */
public final class svc {
    public final Map a = new HashMap();

    public svc(Context context, suq suq, Map map, swk swk) {
        this.a.put("/environment", new suv(context, suq, swk));
        this.a.putAll(map);
    }

    public final boolean a(String str) {
        return this.a.containsKey(str);
    }
}
