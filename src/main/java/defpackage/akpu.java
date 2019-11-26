package defpackage;

/* renamed from: akpu */
final class akpu extends akre {
    private final akot a;
    private final akot b;
    private final long c;
    private final Runnable d;
    private final Runnable e;
    private final Runnable f;
    private final Runnable g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;

    public final akot a() {
        return this.a;
    }

    public final akot b() {
        return this.b;
    }

    public final long c() {
        return this.c;
    }

    public final Runnable d() {
        return this.d;
    }

    public final Runnable e() {
        return this.e;
    }

    public final Runnable f() {
        return this.f;
    }

    public final Runnable g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    public final int i() {
        return this.i;
    }

    public final int j() {
        return this.j;
    }

    public final int k() {
        return this.k;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        long j = this.c;
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        int i = this.h;
        int i2 = this.i;
        int i3 = this.j;
        int i4 = this.k;
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int length4 = valueOf4.length();
        StringBuilder stringBuilder = new StringBuilder((((((length + 198) + length2) + length3) + length4) + valueOf5.length()) + valueOf6.length());
        stringBuilder.append("ReplaceParameters{oldPresenter=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", newPresenter=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", duration=");
        stringBuilder.append(j);
        stringBuilder.append(", oldOnStart=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", oldOnEnd=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", newOnStart=");
        stringBuilder.append(valueOf5);
        stringBuilder.append(", newOnEnd=");
        stringBuilder.append(valueOf6);
        stringBuilder.append(", fromX=");
        stringBuilder.append(i);
        stringBuilder.append(", fromY=");
        stringBuilder.append(i2);
        stringBuilder.append(", toX=");
        stringBuilder.append(i3);
        stringBuilder.append(", toY=");
        stringBuilder.append(i4);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akre) {
            akre akre = (akre) obj;
            return this.a.equals(akre.a()) && this.b.equals(akre.b()) && this.c == akre.c() && this.d.equals(akre.d()) && this.e.equals(akre.e()) && this.f.equals(akre.f()) && this.g.equals(akre.g()) && this.h == akre.h() && this.i == akre.i() && this.j == akre.j() && this.k == akre.k();
        }
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        long j = this.c;
        return ((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k;
    }

    /* synthetic */ akpu(akot akot, akot akot2, long j, Runnable runnable, Runnable runnable2, Runnable runnable3, Runnable runnable4, int i, int i2, int i3, int i4) {
        this.a = akot;
        this.b = akot2;
        this.c = j;
        this.d = runnable;
        this.e = runnable2;
        this.f = runnable3;
        this.g = runnable4;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = i4;
    }
}
