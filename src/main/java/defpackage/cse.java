package defpackage;

/* renamed from: cse */
public final class cse extends crt {
    public final cse a(cto cto) {
        a();
        this.d = new crv(cto);
        return this;
    }

    public final cse a(float f) {
        ctr ctr = new ctr(f);
        if (this.d != null) {
            this.f = ctr;
            return this;
        }
        throw new RuntimeException("Must specify a single property using #animate() before specifying an appearFrom value!");
    }

    public final cse b(float f) {
        ctr ctr = new ctr(f);
        if (this.d != null) {
            this.g = ctr;
            return this;
        }
        throw new RuntimeException("Must specify a single property using #animate() before specifying an disappearTo value!");
    }

    cse(Object obj) {
        this.c = new crw(obj);
    }
}
