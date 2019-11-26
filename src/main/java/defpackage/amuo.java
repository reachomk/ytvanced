package defpackage;

import java.util.Iterator;

/* renamed from: amuo */
public final class amuo extends amuk {
    public amuo() {
        super(4);
    }

    amuo(int i) {
        super(i);
    }

    public final amuo c(Object obj) {
        super.b(obj);
        return this;
    }

    public final amuo a(Object... objArr) {
        amwd.a(objArr);
        int i = this.b;
        int length = objArr.length;
        a(i + length);
        System.arraycopy(objArr, 0, this.a, this.b, length);
        this.b += length;
        return this;
    }

    public final amuo b(Iterable iterable) {
        super.a(iterable);
        return this;
    }

    public final amuo a(Iterator it) {
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }

    public final amul a() {
        this.c = true;
        return amul.b(this.a, this.b);
    }
}
