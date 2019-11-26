package defpackage;

/* renamed from: akri */
public abstract class akri implements akqx {
    public akqy a;

    public abstract boolean a();

    public abstract boolean b(akqw akqw);

    public final boolean a(akqy akqy) {
        this.a = akqy;
        return a();
    }

    public final boolean a(akqw akqw) {
        boolean b = b(akqw);
        if (b) {
            this.a = this.a.a(akqw);
        }
        return b;
    }
}
