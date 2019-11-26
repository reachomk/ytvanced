package defpackage;

/* renamed from: amtb */
final class amtb extends amsm {
    private final Object a;
    private int b;
    private final /* synthetic */ amsw c;

    amtb(amsw amsw, int i) {
        this.c = amsw;
        this.a = amsw.a[i];
        this.b = i;
    }

    public final Object getKey() {
        return this.a;
    }

    private final void a() {
        int i = this.b;
        if (i != -1) {
            amsw amsw = this.c;
            if (i < amsw.d && amqq.a(this.a, amsw.a[i])) {
                return;
            }
        }
        this.b = this.c.a(this.a);
    }

    public final Object getValue() {
        a();
        int i = this.b;
        return i != -1 ? this.c.b[i] : null;
    }

    public final Object setValue(Object obj) {
        a();
        int i = this.b;
        if (i == -1) {
            this.c.put(this.a, obj);
            return null;
        }
        Object[] objArr = this.c.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}
