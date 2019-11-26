package defpackage;

/* renamed from: anhu */
final class anhu implements Runnable {
    public final anhl a;
    public final anjv b;

    anhu(anhl anhl, anjv anjv) {
        this.a = anhl;
        this.b = anjv;
    }

    public final void run() {
        if (this.a.value == this) {
            if (anhl.d.a(this.a, (Object) this, anhl.b(this.b))) {
                anhl.a(this.a);
            }
        }
    }
}
