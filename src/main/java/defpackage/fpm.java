package defpackage;

/* renamed from: fpm */
public final class fpm {
    private final fpk a;
    private Object b;

    public fpm(fpk fpk) {
        this.a = (fpk) amqw.a((Object) fpk);
    }

    public final void a() {
        if (this.b == null) {
            this.b = this.a.a();
        }
    }

    public final void b() {
        Object obj = this.b;
        if (obj != null) {
            this.a.a(obj);
            this.b = null;
        }
    }
}
