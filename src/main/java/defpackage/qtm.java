package defpackage;

import java.util.HashMap;

/* renamed from: qtm */
public final class qtm extends qrf {
    public long a = -1;
    public long b = -1;

    public qtm(String str) {
        HashMap a = qrf.a(str);
        if (a != null) {
            this.a = ((Long) a.get(Integer.valueOf(0))).longValue();
            this.b = ((Long) a.get(Integer.valueOf(1))).longValue();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), Long.valueOf(this.a));
        hashMap.put(Integer.valueOf(1), Long.valueOf(this.b));
        return hashMap;
    }
}
