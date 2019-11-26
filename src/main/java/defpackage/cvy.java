package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: cvy */
public final class cvy {
    private static final List i = new ArrayList();
    public int a;
    public int b;
    public int c;
    public int d;
    public dbz e;
    public List f;
    public List g;
    public List h;

    private cvy(int i, int i2, int i3, int i4, dbz dbz, List list, List list2, List list3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (dbz == null) {
            dbz = cyk.m();
        }
        this.e = dbz;
        if (list == null) {
            this.f = i;
        } else {
            i = list.size();
            this.f = new ArrayList(i);
            for (i2 = 0; i2 < i; i2++) {
                Object obj = (dbz) list.get(i2);
                List list4 = this.f;
                if (obj == null) {
                    obj = cyk.m();
                }
                list4.add(obj);
            }
        }
        if (list2 != null) {
            this.g = Collections.unmodifiableList(list2);
        }
        if (list3 != null) {
            this.h = Collections.unmodifiableList(list3);
        }
    }

    static cvy a(cvy cvy, int i) {
        int i2 = cvy.c;
        return cvy.a(cvy.a, cvy.b + i, i2 >= 0 ? i2 + i : -1, cvy.d, cvy.e, cvy.f, cvy.g, cvy.h);
    }

    static cvy a(cvy cvy) {
        return cvy.a(cvy.a, cvy.b, cvy.c, cvy.d, cvy.e, cvy.f, cvy.g, cvy.h);
    }

    public static cvy a(Object obj) {
        return cvy.a(3, cyk.m(), obj, null);
    }

    public static cvy a(int i, dbz dbz, Object obj, Object obj2) {
        List list = null;
        List singletonList = obj != null ? Collections.singletonList(obj) : null;
        if (obj2 != null) {
            list = Collections.singletonList(obj2);
        }
        return cvy.a(i, 0, -1, 1, dbz, null, singletonList, list);
    }

    public static cvy a(int i, int i2, int i3, int i4, dbz dbz, List list, List list2, List list3) {
        return new cvy(i, i2, i3, i4, dbz, list, list2, list3);
    }
}
