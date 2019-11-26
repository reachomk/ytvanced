package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: amuu */
public class amuu {
    public Object[] a;
    public int b;

    public amuu() {
        this(4);
    }

    amuu(int i) {
        this.a = new Object[(i + i)];
        this.b = 0;
    }

    private final void a(int i) {
        i += i;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i > length) {
            this.a = Arrays.copyOf(objArr, amuj.a(length, i));
        }
    }

    public amuu b(Object obj, Object obj2) {
        a(this.b + 1);
        amss.a(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
        return this;
    }

    public amuu a(Entry entry) {
        return b(entry.getKey(), entry.getValue());
    }

    public amuu a(Map map) {
        return a(map.entrySet());
    }

    public amuu a(Iterable iterable) {
        if (iterable instanceof Collection) {
            a(this.b + iterable.size());
        }
        for (Entry a : iterable) {
            a(a);
        }
        return this;
    }

    public amur b() {
        return amwm.a(this.b, this.a);
    }
}
