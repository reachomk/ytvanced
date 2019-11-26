package defpackage;

import java.util.Arrays;

/* renamed from: amuv */
public final class amuv extends amuk {
    private Object[] d;
    private int e;

    public amuv() {
        super(4);
    }

    amuv(int i) {
        super(i);
        this.d = new Object[amuw.a(i)];
    }

    public final amuv c(Object obj) {
        amqw.a(obj);
        if (this.d != null) {
            int a = amuw.a(this.b);
            int length = this.d.length;
            if (a <= length) {
                length--;
                a = obj.hashCode();
                int a2 = amud.a(a);
                while (true) {
                    a2 &= length;
                    Object[] objArr = this.d;
                    Object obj2 = objArr[a2];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        a2++;
                    } else {
                        objArr[a2] = obj;
                        this.e += a;
                        super.b(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.d = null;
        super.b(obj);
        return this;
    }

    public final amuv b(Iterable iterable) {
        amqw.a((Object) iterable);
        if (this.d != null) {
            for (Object c : iterable) {
                c(c);
            }
        } else {
            super.a(iterable);
        }
        return this;
    }

    public final amuw a() {
        int i = this.b;
        if (i == 0) {
            return amwp.a;
        }
        if (i == 1) {
            return amuw.a(this.a[0]);
        }
        amuw a;
        if (this.d == null || amuw.a(i) != this.d.length) {
            a = amuw.a(this.b, this.a);
            this.b = a.size();
        } else {
            Object[] copyOf;
            if (amuw.a(this.b, this.a.length)) {
                copyOf = Arrays.copyOf(this.a, this.b);
            } else {
                copyOf = this.a;
            }
            Object[] objArr = copyOf;
            int i2 = this.e;
            Object[] objArr2 = this.d;
            amuw amwp = new amwp(objArr, i2, objArr2, objArr2.length - 1, this.b);
        }
        this.c = true;
        this.d = null;
        return a;
    }

    public final /* synthetic */ amuj a(Object obj) {
        c(obj);
        return this;
    }
}
