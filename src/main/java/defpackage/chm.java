package defpackage;

/* renamed from: chm */
public final class chm extends zj {
    private int c;

    public final void clear() {
        this.c = 0;
        super.clear();
    }

    public final Object a(int i, Object obj) {
        this.c = 0;
        return super.a(i, obj);
    }

    public final Object put(Object obj, Object obj2) {
        this.c = 0;
        return super.put(obj, obj2);
    }

    public final void a(aac aac) {
        this.c = 0;
        super.a(aac);
    }

    public final Object d(int i) {
        this.c = 0;
        return super.d(i);
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        i = super.hashCode();
        this.c = i;
        return i;
    }
}
