package defpackage;

/* renamed from: amuc */
final class amuc extends amub {
    private final /* synthetic */ amtt b;

    amuc(amtt amtt) {
        this.b = amtt;
        super(amtt);
    }

    /* Access modifiers changed, original: final */
    public final Object a(int i) {
        return this.b.b[i];
    }

    public final boolean contains(Object obj) {
        return this.b.containsValue(obj);
    }

    public final boolean remove(Object obj) {
        int a = amud.a(obj);
        int b = this.b.b(obj, a);
        if (b == -1) {
            return false;
        }
        this.b.b(b, a);
        return true;
    }
}
