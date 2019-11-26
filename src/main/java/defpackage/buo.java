package defpackage;

/* renamed from: buo */
final class buo {
    private boolean a;
    private boolean b;
    private boolean c;

    buo() {
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean a() {
        this.a = true;
        return e();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean b() {
        this.b = true;
        return e();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean c() {
        this.c = true;
        return e();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void d() {
        this.b = false;
        this.a = false;
        this.c = false;
    }

    private final boolean e() {
        return (this.c || this.b) && this.a;
    }
}
