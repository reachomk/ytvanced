package defpackage;

/* renamed from: akpq */
final class akpq extends akqy {
    private final akot a;
    private final long b;
    private final Runnable c;
    private final Runnable d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;

    public final akot a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final Runnable c() {
        return this.c;
    }

    public final Runnable d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public final int f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final int h() {
        return this.h;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int i = this.e;
        int i2 = this.f;
        int i3 = this.g;
        int i4 = this.h;
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 147) + valueOf2.length()) + valueOf3.length());
        stringBuilder.append("MoveParameters{presenter=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", duration=");
        stringBuilder.append(j);
        stringBuilder.append(", onStart=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", onEnd=");
        stringBuilder.append(valueOf3);
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
        if (obj instanceof akqy) {
            akqy akqy = (akqy) obj;
            return this.a.equals(akqy.a()) && this.b == akqy.b() && this.c.equals(akqy.c()) && this.d.equals(akqy.d()) && this.e == akqy.e() && this.f == akqy.f() && this.g == akqy.g() && this.h == akqy.h();
        }
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return ((((((((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h;
    }

    /* synthetic */ akpq(akot akot, long j, Runnable runnable, Runnable runnable2, int i, int i2, int i3, int i4) {
        this.a = akot;
        this.b = j;
        this.c = runnable;
        this.d = runnable2;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }
}
