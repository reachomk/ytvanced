package defpackage;

/* renamed from: amtw */
final class amtw extends amsm {
    private final Object a;
    private int b;
    private final /* synthetic */ amtt c;

    amtw(amtt amtt, int i) {
        this.c = amtt;
        this.a = amtt.a[i];
        this.b = i;
    }

    private final void a() {
        int i = this.b;
        if (i != -1) {
            amtt amtt = this.c;
            if (i <= amtt.c && amqq.a(amtt.a[i], this.a)) {
                return;
            }
        }
        this.b = this.c.a(this.a);
    }

    public final Object getKey() {
        return this.a;
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
            return this.c.put(this.a, obj);
        }
        Object obj2 = this.c.b[i];
        if (amqq.a(obj2, obj)) {
            return obj;
        }
        this.c.a(this.b, obj);
        return obj2;
    }
}
