package defpackage;

/* renamed from: bvl */
public final class bvl implements bvw {
    public final boolean a;
    public final bvw b;
    private final boolean c;
    private final bvo d;
    private final bsm e;
    private int f;
    private boolean g;

    bvl(bvw bvw, boolean z, boolean z2, bsm bsm, bvo bvo) {
        this.b = (bvw) chw.a((Object) bvw);
        this.a = z;
        this.c = z2;
        this.e = bsm;
        this.d = (bvo) chw.a((Object) bvo);
    }

    public final Class a() {
        return this.b.a();
    }

    public final Object b() {
        return this.b.b();
    }

    public final int c() {
        return this.b.c();
    }

    public final synchronized void d() {
        if (this.f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (this.g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        } else {
            this.g = true;
            if (this.c) {
                this.b.d();
            }
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void e() {
        if (this.g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f++;
    }

    public final void f() {
        synchronized (this.d) {
            synchronized (this) {
                int i = this.f;
                if (i > 0) {
                    i--;
                    this.f = i;
                    if (i == 0) {
                        this.d.a(this.e, this);
                    }
                } else {
                    throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
                }
            }
        }
    }

    public final synchronized String toString() {
        StringBuilder stringBuilder;
        boolean z = this.a;
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.e);
        int i = this.f;
        boolean z2 = this.g;
        String valueOf3 = String.valueOf(this.b);
        int length = valueOf.length();
        stringBuilder = new StringBuilder(((length + 107) + valueOf2.length()) + valueOf3.length());
        stringBuilder.append("EngineResource{isMemoryCacheable=");
        stringBuilder.append(z);
        stringBuilder.append(", listener=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", key=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", acquired=");
        stringBuilder.append(i);
        stringBuilder.append(", isRecycled=");
        stringBuilder.append(z2);
        stringBuilder.append(", resource=");
        stringBuilder.append(valueOf3);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
