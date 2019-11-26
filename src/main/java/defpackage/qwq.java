package defpackage;

import java.util.HashMap;

/* renamed from: qwq */
public final class qwq extends qrf {
    public Long a;
    public Long b;
    public Long c;
    public Long d;
    public Long e;
    public Long f;
    public Long g;
    public Long h;
    public Long i;
    public Long j;
    public Long k;

    public qwq(String str) {
        HashMap a = qrf.a(str);
        if (a != null) {
            this.a = (Long) a.get(Integer.valueOf(0));
            this.b = (Long) a.get(Integer.valueOf(1));
            this.c = (Long) a.get(Integer.valueOf(2));
            this.d = (Long) a.get(Integer.valueOf(3));
            this.e = (Long) a.get(Integer.valueOf(4));
            this.f = (Long) a.get(Integer.valueOf(5));
            this.g = (Long) a.get(Integer.valueOf(6));
            this.h = (Long) a.get(Integer.valueOf(7));
            this.i = (Long) a.get(Integer.valueOf(8));
            this.j = (Long) a.get(Integer.valueOf(9));
            this.k = (Long) a.get(Integer.valueOf(10));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final HashMap a() {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.a);
        hashMap.put(Integer.valueOf(1), this.b);
        hashMap.put(Integer.valueOf(2), this.c);
        hashMap.put(Integer.valueOf(3), this.d);
        hashMap.put(Integer.valueOf(4), this.e);
        hashMap.put(Integer.valueOf(5), this.f);
        hashMap.put(Integer.valueOf(6), this.g);
        hashMap.put(Integer.valueOf(7), this.h);
        hashMap.put(Integer.valueOf(8), this.i);
        hashMap.put(Integer.valueOf(9), this.j);
        hashMap.put(Integer.valueOf(10), this.k);
        return hashMap;
    }
}
