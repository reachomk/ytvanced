package defpackage;

import java.util.Iterator;

/* renamed from: amwu */
final class amwu extends amuw {
    private final transient Object a;
    private transient int b;

    amwu(Object obj) {
        this.a = amqw.a(obj);
    }

    /* Access modifiers changed, original: final */
    public final boolean f() {
        return false;
    }

    public final int size() {
        return 1;
    }

    amwu(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean contains(Object obj) {
        return this.a.equals(obj);
    }

    public final amxo a() {
        return new amvf(this.a);
    }

    /* Access modifiers changed, original: final */
    public final amul h() {
        return amul.a(this.a);
    }

    /* Access modifiers changed, original: final */
    public final int a(Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        i = this.a.hashCode();
        this.b = i;
        return i;
    }

    /* Access modifiers changed, original: final */
    public final boolean g() {
        return this.b != 0;
    }

    public final String toString() {
        String obj = this.a.toString();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj).length() + 2);
        stringBuilder.append('[');
        stringBuilder.append(obj);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
