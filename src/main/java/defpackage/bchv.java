package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bchv */
public final class bchv implements Iterable {
    public final List a = new ArrayList();
    public int b;
    public int c;
    public boolean d;

    public final boolean a(Object obj) {
        if (obj == null || this.a.contains(obj)) {
            return false;
        }
        this.a.add(obj);
        this.c++;
        return true;
    }

    public final Iterator iterator() {
        return new bchx(this);
    }

    public final Object a(int i) {
        return this.a.get(i);
    }
}
