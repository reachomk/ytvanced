package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: bui */
final class bui {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public brb c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public bul h;
    public bsq i;
    public Map j;
    public Class k;
    public boolean l;
    public boolean m;
    public bsm n;
    public bre o;
    public bup p;
    public boolean q;
    public boolean r;

    bui() {
    }

    /* Access modifiers changed, original: final */
    public final bww a() {
        return this.h.a();
    }

    /* Access modifiers changed, original: final */
    public final bwb b() {
        return this.c.b;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(Class cls) {
        return b(cls) != null;
    }

    /* Access modifiers changed, original: final */
    public final bvr b(Class cls) {
        bvr bvr;
        Class cls2 = cls;
        brd brd = this.c.c;
        Class cls3 = this.g;
        Class cls4 = this.k;
        cfs cfs = brd.h;
        cht cht = (cht) cfs.c.getAndSet(null);
        if (cht == null) {
            cht = new cht();
        }
        cht.a(cls2, cls3, cls4);
        synchronized (cfs.b) {
            bvr = (bvr) cfs.b.get(cht);
        }
        cfs.c.set(cht);
        if (cfs.a.equals(bvr)) {
            return null;
        }
        if (bvr != null) {
            return bvr;
        }
        ArrayList arrayList = new ArrayList();
        for (Class cls5 : brd.c.b(cls2, cls3)) {
            for (Class cls6 : brd.f.b(cls5, cls4)) {
                buq buq = r2;
                buq buq2 = new buq(cls, cls5, cls6, brd.c.a(cls2, cls5), brd.f.a(cls5, cls6), brd.i);
                arrayList.add(buq);
            }
        }
        bvr bvr2 = !arrayList.isEmpty() ? new bvr(cls, cls3, cls4, arrayList, brd.i) : null;
        cfs = brd.h;
        synchronized (cfs.b) {
            cfs.b.put(new cht(cls2, cls3, cls4), bvr2 == null ? cfs.a : bvr2);
        }
        return bvr2;
    }

    /* Access modifiers changed, original: final */
    public final bsr c(Class cls) {
        bsr bsr = (bsr) this.j.get(cls);
        if (bsr == null) {
            for (Entry entry : this.j.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    bsr = (bsr) entry.getValue();
                    break;
                }
            }
        }
        if (bsr != null) {
            return bsr;
        }
        if (!this.j.isEmpty() || !this.q) {
            return cbf.a();
        }
        String valueOf = String.valueOf(cls);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 115);
        stringBuilder.append("Missing transformation for ");
        stringBuilder.append(valueOf);
        stringBuilder.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: final */
    public final List a(File file) {
        return this.c.c.a((Object) file);
    }

    /* Access modifiers changed, original: final */
    public final List c() {
        if (!this.l) {
            this.l = true;
            this.a.clear();
            List a = this.c.c.a(this.d);
            int size = a.size();
            for (int i = 0; i < size; i++) {
                bzp a2 = ((bzq) a.get(i)).a(this.d, this.e, this.f, this.i);
                if (a2 != null) {
                    this.a.add(a2);
                }
            }
        }
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final List d() {
        if (!this.m) {
            this.m = true;
            this.b.clear();
            List c = c();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                bzp bzp = (bzp) c.get(i);
                if (!this.b.contains(bzp.a)) {
                    this.b.add(bzp.a);
                }
                for (int i2 = 0; i2 < bzp.b.size(); i2++) {
                    if (!this.b.contains(bzp.b.get(i2))) {
                        this.b.add((bsm) bzp.b.get(i2));
                    }
                }
            }
        }
        return this.b;
    }
}
