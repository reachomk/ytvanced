package defpackage;

import java.util.HashMap;

/* renamed from: qtt */
public final class qtt extends qrf {
    public Long a;
    public Long b;

    public qtt(String str) {
        HashMap a = qrf.a(str);
        if (a != null) {
            this.a = (Long) a.get(Integer.valueOf(0));
            this.b = (Long) a.get(Integer.valueOf(1));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.a);
        hashMap.put(Integer.valueOf(1), this.b);
        return hashMap;
    }
}
