package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: ubb */
public abstract class ubb implements bpp {
    private Object a;
    public int k;
    public ubb l;
    public final Set m = new HashSet();
    public boolean n = false;
    public int o;
    public int p;
    public String q;
    public int r = -1;
    public final List s = new ArrayList();
    public ubb t;

    public static boolean a(ubb ubb) {
        return (ubb instanceof uba) && (((uba) ubb).a.o & 2) != 0;
    }

    public abstract int a(ubl ubl);

    public abstract int a(ubl ubl, int i);

    public abstract int b(ubl ubl);

    public abstract String b(ubl ubl, int i);

    public abstract String c(ubl ubl, int i);

    public static boolean b(ubb ubb) {
        return (ubb.o & 1) != 0;
    }

    public static void a(ubb ubb, ubl ubl) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(ubb);
        while (!arrayDeque.isEmpty()) {
            ubb = (ubb) arrayDeque.pop();
            if (ubb.r != -1) {
                for (ubb ubb2 : ubb.s) {
                    ubb.r += ubb2.r;
                }
            } else {
                ubb.r = ubb.b(ubl);
                arrayDeque.push(ubb);
                for (ubb push : ubb.s) {
                    arrayDeque.push(push);
                }
            }
        }
    }

    protected ubb(int i) {
        this.k = i;
    }

    public final int e(ubl ubl) {
        return ubl.d(this.k);
    }

    public final void a(Object obj) {
        this.a = obj;
    }

    public final Object a() {
        return this.a;
    }

    public final void a(bpp bpp) {
        this.t = (ubb) bpp;
        this.t.s.add(this);
    }

    public Iterable b() {
        return Collections.emptyList();
    }
}
