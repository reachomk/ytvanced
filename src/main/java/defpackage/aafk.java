package defpackage;

/* renamed from: aafk */
public final class aafk implements ajth {
    public final ajzz a;
    private aafn b;
    private Object c;

    public aafk(ajzz ajzz) {
        this.a = ajzz;
    }

    public final aafn d() {
        aafn aafn = this.b;
        if (aafn != null) {
            return aafn;
        }
        akac akac = this.a.a;
        if (akac != null) {
            akab akab = akac.a;
            if (akab != null) {
                this.b = new aafn(akab);
            }
        }
        return this.b;
    }

    public final ajtk a() {
        return this.a.b;
    }

    public final byte[] b() {
        return this.a.c;
    }

    public final void a(Object obj) {
        this.c = obj;
    }

    public final Object c() {
        return this.c;
    }
}
