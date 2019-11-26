package defpackage;

/* renamed from: amtv */
final class amtv extends amsm {
    private final amtt a;
    private final Object b;
    private int c;

    amtv(amtt amtt, int i) {
        this.a = amtt;
        this.b = amtt.b[i];
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i != -1) {
            amtt amtt = this.a;
            if (i <= amtt.c && amqq.a(this.b, amtt.b[i])) {
                return;
            }
        }
        this.c = this.a.b(this.b);
    }

    public final Object getKey() {
        return this.b;
    }

    public final Object getValue() {
        a();
        int i = this.c;
        return i != -1 ? this.a.a[i] : null;
    }

    public final Object setValue(Object obj) {
        a();
        int i = this.c;
        if (i == -1) {
            return this.a.a(this.b, obj);
        }
        Object obj2 = this.a.a[i];
        if (amqq.a(obj2, obj)) {
            return obj;
        }
        this.a.b(this.c, obj);
        return obj2;
    }
}
