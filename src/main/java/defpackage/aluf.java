package defpackage;

/* renamed from: aluf */
final class aluf extends aluj {
    private final alun a;
    private final alum b;
    private final aluk c;
    private final alul d = null;

    /* Access modifiers changed, original: final */
    public final alun a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final alul d() {
        return null;
    }

    /* Access modifiers changed, original: final */
    public final alum b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final aluk c() {
        return this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        String str = "null";
        StringBuilder stringBuilder = new StringBuilder((((length + 79) + length2) + valueOf3.length()) + str.length());
        stringBuilder.append("CachePolicy{expiryGenerator=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", keyConverter=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", costGenerator=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", cacheMissFetcher=");
        stringBuilder.append(str);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aluj) {
            aluj aluj = (aluj) obj;
            return this.a.equals(aluj.a()) && this.b.equals(aluj.b()) && this.c.equals(aluj.c()) && aluj.d() == null;
        }
    }

    public final int hashCode() {
        return (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
    }

    /* synthetic */ aluf(alun alun, alum alum, aluk aluk) {
        this.a = alun;
        this.b = alum;
        this.c = aluk;
    }
}
