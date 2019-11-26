package defpackage;

/* renamed from: amtz */
final class amtz extends amub {
    private final /* synthetic */ amtt b;

    amtz(amtt amtt) {
        this.b = amtt;
        super(amtt);
    }

    /* Access modifiers changed, original: final */
    public final Object a(int i) {
        return this.b.a[i];
    }

    public final boolean contains(Object obj) {
        return this.b.containsKey(obj);
    }

    public final boolean remove(Object obj) {
        int a = amud.a(obj);
        int a2 = this.b.a(obj, a);
        if (a2 == -1) {
            return false;
        }
        this.b.a(a2, a);
        return true;
    }
}
