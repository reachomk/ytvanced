package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: amuk */
class amuk extends amuj {
    public Object[] a;
    public int b = 0;
    public boolean c;

    amuk(int i) {
        amss.a(i, "initialCapacity");
        this.a = new Object[i];
    }

    public final void a(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        if (length < i) {
            this.a = Arrays.copyOf(objArr, amuj.a(length, i));
            this.c = false;
        } else if (this.c) {
            this.a = (Object[]) objArr.clone();
            this.c = false;
        }
    }

    public final amuk b(Object obj) {
        amqw.a(obj);
        a(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
        return this;
    }

    public final amuj a(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            a(this.b + collection.size());
            if (collection instanceof amuh) {
                this.b = ((amuh) collection).a(this.a, this.b);
                return this;
            }
        }
        for (Object a : iterable) {
            a(a);
        }
        return this;
    }
}
