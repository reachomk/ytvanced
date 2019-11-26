package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: bwj */
public final class bwj implements bwb {
    private final bwi a;
    private final bwl b;
    private final Map c;
    private final Map d;
    private final int e;
    private int f;

    public bwj() {
        this.a = new bwi();
        this.b = new bwl();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = 4194304;
    }

    public bwj(int i) {
        this.a = new bwi();
        this.b = new bwl();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = i;
    }

    @Deprecated
    public final void a(Object obj) {
        b(obj);
    }

    public final synchronized void b(Object obj) {
        Class cls = obj.getClass();
        bwc c = c(cls);
        int a = c.a(obj);
        int b = c.b() * a;
        if (b <= this.e / 2) {
            bwm a2 = this.b.a(a, cls);
            this.a.a(a2, obj);
            NavigableMap b2 = b(cls);
            Integer num = (Integer) b2.get(Integer.valueOf(a2.a));
            Integer valueOf = Integer.valueOf(a2.a);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            b2.put(valueOf, Integer.valueOf(i));
            this.f += b;
            b(this.e);
        }
    }

    public final synchronized Object a(Class cls) {
        return a(this.b.a(8, cls), cls);
    }

    public final synchronized Object a(int i, Class cls) {
        bwm a;
        Integer num = (Integer) b(cls).ceilingKey(Integer.valueOf(i));
        if (num != null) {
            int i2 = this.f;
            if (i2 != 0 && this.e / i2 < 2) {
                if (num.intValue() <= (i << 3)) {
                }
            }
            a = this.b.a(num.intValue(), cls);
        }
        a = this.b.a(i, cls);
        return a(a, cls);
    }

    private final Object a(bwm bwm, Class cls) {
        bwc c = c(cls);
        Object a = this.a.a((bwp) bwm);
        if (a != null) {
            this.f -= c.a(a) * c.b();
            b(c.a(a), cls);
        }
        if (a != null) {
            return a;
        }
        c.a();
        return c.a(bwm.a);
    }

    public final synchronized void a() {
        b(0);
    }

    /* JADX WARNING: Missing block: B:10:0x0016, code skipped:
            return;
     */
    public final synchronized void a(int r2) {
        /*
        r1 = this;
        monitor-enter(r1);
        r0 = 40;
        if (r2 >= r0) goto L_0x0017;
    L_0x0005:
        r0 = 20;
        if (r2 < r0) goto L_0x000a;
    L_0x0009:
        goto L_0x000e;
    L_0x000a:
        r0 = 15;
        if (r2 != r0) goto L_0x0015;
    L_0x000e:
        r2 = r1.e;	 Catch:{ all -> 0x001c }
        r2 = r2 / 2;
        r1.b(r2);	 Catch:{ all -> 0x001c }
    L_0x0015:
        monitor-exit(r1);
        return;
    L_0x0017:
        r1.a();	 Catch:{ all -> 0x001c }
        monitor-exit(r1);
        return;
    L_0x001c:
        r2 = move-exception;
        monitor-exit(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwj.a(int):void");
    }

    private final void b(int i) {
        while (this.f > i) {
            Object a = this.a.a();
            chw.a(a);
            bwc c = c(a.getClass());
            this.f -= c.a(a) * c.b();
            b(c.a(a), a.getClass());
            c.a();
        }
    }

    private final void b(int i, Class cls) {
        NavigableMap b = b(cls);
        Integer valueOf = Integer.valueOf(i);
        Integer num = (Integer) b.get(valueOf);
        if (num == null) {
            String valueOf2 = String.valueOf(this);
            StringBuilder stringBuilder = new StringBuilder(valueOf2.length() + 56);
            stringBuilder.append("Tried to decrement empty size, size: ");
            stringBuilder.append(i);
            stringBuilder.append(", this: ");
            stringBuilder.append(valueOf2);
            throw new NullPointerException(stringBuilder.toString());
        } else if (num.intValue() == 1) {
            b.remove(valueOf);
        } else {
            b.put(valueOf, Integer.valueOf(num.intValue() - 1));
        }
    }

    private final NavigableMap b(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.c.put(cls, treeMap);
        return treeMap;
    }

    private final bwc c(Class cls) {
        bwc bwc = (bwc) this.d.get(cls);
        if (bwc == null) {
            if (cls.equals(int[].class)) {
                bwc = new bwk();
            } else if (cls.equals(byte[].class)) {
                bwc = new bwf();
            } else {
                String simpleName = cls.getSimpleName();
                String str = "No array pool found for: ";
                throw new IllegalArgumentException(simpleName.length() == 0 ? new String(str) : str.concat(simpleName));
            }
            this.d.put(cls, bwc);
        }
        return bwc;
    }
}
