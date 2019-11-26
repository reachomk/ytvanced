package defpackage;

/* renamed from: aiws */
public final class aiws implements bcaa {
    public ajlj a;
    private final aiwh b;

    public aiws(aiwh aiwh) {
        this.b = aiwh;
    }

    public final synchronized void a(ajpz ajpz, aiqw aiqw) {
        ajlj ajlj = this.a;
        if (ajlj != null) {
            ajlj.c();
        }
        this.a = this.b.a().a(ajpz, aiqw);
    }

    public final synchronized void a(aiqq aiqq, aiqw aiqw) {
        ajlj ajlj = this.a;
        if (ajlj != null) {
            ajlj.c();
        }
        this.a = this.b.a().a(aiqq, aiqw);
    }

    public final synchronized void a() {
        ajlj ajlj = this.a;
        if (ajlj != null) {
            ajlj.c();
        }
        this.a = null;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return this.a;
    }
}
