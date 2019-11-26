package defpackage;

/* renamed from: akpm */
final class akpm extends akpy {
    private final akot a;
    private final long b;
    private final Runnable c;
    private final Runnable d;

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

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 74) + valueOf2.length()) + valueOf3.length());
        stringBuilder.append("AddParameters{presenter=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", duration=");
        stringBuilder.append(j);
        stringBuilder.append(", onStart=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", onEnd=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akpy) {
            akpy akpy = (akpy) obj;
            return this.a.equals(akpy.a()) && this.b == akpy.b() && this.c.equals(akpy.c()) && this.d.equals(akpy.d());
        }
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return ((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    /* synthetic */ akpm(akot akot, long j, Runnable runnable, Runnable runnable2) {
        this.a = akot;
        this.b = j;
        this.c = runnable;
        this.d = runnable2;
    }
}
