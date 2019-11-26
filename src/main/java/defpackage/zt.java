package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: zt */
public abstract class zt {
    public zv a;
    public zw b;
    private zu c;

    zt() {
    }

    public abstract int a();

    public abstract int a(Object obj);

    public abstract Object a(int i, int i2);

    public abstract Object a(int i, Object obj);

    public abstract void a(int i);

    public abstract void a(Object obj, Object obj2);

    public abstract int b(Object obj);

    public abstract Map b();

    public abstract void c();

    public static boolean a(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public final Object[] b(int i) {
        int a = a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = a(i2, i);
        }
        return objArr;
    }

    public final Object[] a(Object[] objArr, int i) {
        int a = a();
        if (objArr.length < a) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), a);
        }
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = a(i2, i);
        }
        if (objArr.length > a) {
            objArr[a] = null;
        }
        return objArr;
    }

    public static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    public final Set d() {
        if (this.c == null) {
            this.c = new zu(this);
        }
        return this.c;
    }
}
