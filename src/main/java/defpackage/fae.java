package defpackage;

/* renamed from: fae */
final class fae extends faa {
    public final ezo a;
    public final ezo b;
    public final int c;
    public final ezo d;
    public final int e;
    public final ezo f;
    public final ezo g;
    public final ezo h;
    public final int i;

    public final ezo a() {
        return this.a;
    }

    public final ezo b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final ezo d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public final ezo f() {
        return this.f;
    }

    public final ezo g() {
        return this.g;
    }

    public final ezo h() {
        return this.h;
    }

    public final int i() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof faa) {
            faa faa = (faa) obj;
            return this.a.equals(faa.a()) && this.b.equals(faa.b()) && this.c == faa.c() && this.d.equals(faa.d()) && this.e == faa.e() && this.f.equals(faa.f()) && this.g.equals(faa.g()) && this.h.equals(faa.h()) && this.i == faa.i();
        }
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i;
    }

    public final fac k() {
        return new fad(this);
    }

    /* synthetic */ fae(ezo ezo, ezo ezo2, int i, ezo ezo3, int i2, ezo ezo4, ezo ezo5, ezo ezo6, int i3) {
        this.a = ezo;
        this.b = ezo2;
        this.c = i;
        this.d = ezo3;
        this.e = i2;
        this.f = ezo4;
        this.g = ezo5;
        this.h = ezo6;
        this.i = i3;
    }
}
