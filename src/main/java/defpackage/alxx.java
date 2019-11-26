package defpackage;

/* renamed from: alxx */
public final class alxx implements bcaa {
    private final zzf a;
    private volatile aydm b;

    public alxx(zzf zzf) {
        this.a = zzf;
    }

    /* renamed from: a */
    public final aydm get() {
        return this.b == null ? b() : this.b;
    }

    private final synchronized aydm b() {
        if (this.b == null) {
            this.b = this.a.b();
        }
        return this.b;
    }
}
