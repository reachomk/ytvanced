package defpackage;

/* renamed from: ajmp */
public class ajmp extends ajmx {
    private volatile boolean a = false;
    public volatile boolean j = true;
    public volatile ajmr k;

    public ajmp(long j, long j2, ajms ajms, ajmr ajmr, String str) {
        super(j, j2, ((ajms) amqw.a((Object) ajms)).ordinal(), str);
        this.k = (ajmr) amqw.a((Object) ajmr);
    }

    /* Access modifiers changed, original: protected */
    public void a() {
    }

    /* Access modifiers changed, original: protected */
    public void a(boolean z, boolean z2, boolean z3) {
    }

    public final synchronized void e() {
        this.j = false;
    }

    public final void f() {
        this.a = false;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b(boolean z, boolean z2, boolean z3) {
        if (this.j) {
            a(z, z2, z3);
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void g() {
        if (this.j) {
            a();
        }
    }
}
