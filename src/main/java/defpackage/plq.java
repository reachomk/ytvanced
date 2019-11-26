package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: plq */
final class plq extends plz {
    private final /* synthetic */ plm a;

    plq(plm plm) {
        this.a = plm;
    }

    public final void a(int[] iArr) {
        List a = ppj.a(iArr);
        if (!this.a.e.equals(a)) {
            this.a.f();
            this.a.g.evictAll();
            this.a.h.clear();
            plm plm = this.a;
            plm.e = a;
            plm.e();
            this.a.h();
            this.a.g();
        }
    }

    public final void a(int[] iArr, int i) {
        if (i != 0) {
            i = this.a.f.get(i, -1);
            if (i == -1) {
                this.a.b();
                return;
            }
        }
        i = this.a.e.size();
        this.a.f();
        this.a.e.addAll(i, ppj.a(iArr));
        this.a.e();
        Iterator it = this.a.m.iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.a.g();
    }

    public final void b(int[] iArr) {
        Collection arrayList = new ArrayList();
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            int i2 = iArr[i];
            this.a.g.remove(Integer.valueOf(i2));
            i2 = this.a.f.get(i2, -1);
            if (i2 == -1) {
                this.a.b();
                return;
            } else {
                arrayList.add(Integer.valueOf(i2));
                i++;
            }
        }
        Collections.sort(arrayList);
        this.a.f();
        plm plm = this.a;
        ppj.a(arrayList);
        plm.i();
        this.a.g();
    }

    public final void c(int[] iArr) {
        Collection arrayList = new ArrayList();
        for (int i : iArr) {
            this.a.g.remove(Integer.valueOf(i));
            int i2 = this.a.f.get(i, -1);
            if (i2 == -1) {
                this.a.b();
                return;
            }
            this.a.f.delete(i);
            arrayList.add(Integer.valueOf(i2));
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            this.a.f();
            this.a.e.removeAll(ppj.a(iArr));
            this.a.e();
            plm plm = this.a;
            ppj.a(arrayList);
            Iterator it = plm.m.iterator();
            while (it.hasNext()) {
                it.next();
            }
            this.a.g();
        }
    }

    public final void a(pjy[] pjyArr) {
        HashSet hashSet = new HashSet();
        this.a.h.clear();
        int length = pjyArr.length;
        int i = 0;
        while (i < length) {
            pjy pjy = pjyArr[i];
            int i2 = pjy.b;
            this.a.g.put(Integer.valueOf(i2), pjy);
            int i3 = this.a.f.get(i2, -1);
            if (i3 == -1) {
                this.a.b();
                return;
            } else {
                hashSet.add(Integer.valueOf(i3));
                i++;
            }
        }
        for (Integer intValue : this.a.h) {
            length = this.a.f.get(intValue.intValue(), -1);
            if (length != -1) {
                hashSet.add(Integer.valueOf(length));
            }
        }
        this.a.h.clear();
        Collection arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        this.a.f();
        plm plm = this.a;
        ppj.a(arrayList);
        plm.i();
        this.a.g();
    }

    public final void a() {
        long b = plm.b(this.a.c);
        plm plm = this.a;
        if (b != plm.b) {
            plm.b = b;
            plm.a();
            plm plm2 = this.a;
            if (plm2.b != 0) {
                plm2.b();
            }
        }
    }
}
