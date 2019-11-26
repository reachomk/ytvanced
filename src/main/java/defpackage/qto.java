package defpackage;

import java.util.HashMap;

/* renamed from: qto */
public final class qto extends qrf {
    public Long a;
    public Boolean b;
    public Boolean c;

    public qto(String str) {
        HashMap a = qrf.a(str);
        if (a != null) {
            this.a = (Long) a.get(Integer.valueOf(0));
            this.b = (Boolean) a.get(Integer.valueOf(1));
            this.c = (Boolean) a.get(Integer.valueOf(2));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.a);
        hashMap.put(Integer.valueOf(1), this.b);
        hashMap.put(Integer.valueOf(2), this.c);
        return hashMap;
    }
}
