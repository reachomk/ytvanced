package defpackage;

/* renamed from: bcti */
public final class bcti extends bcpt {
    public static final long serialVersionUID = -3513011772763289092L;
    private final String e;
    private final int f;
    private final int g;

    public bcti(String str, String str2, int i, int i2) {
        super(str);
        this.e = str2;
        this.f = i;
        this.g = i2;
    }

    public final boolean b() {
        return true;
    }

    public final long g(long j) {
        return j;
    }

    public final long h(long j) {
        return j;
    }

    public final String a(long j) {
        return this.e;
    }

    public final int b(long j) {
        return this.f;
    }

    public final int c(long j) {
        return this.g;
    }

    public final int e(long j) {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bcti) {
            bcti bcti = (bcti) obj;
            return this.d.equals(bcti.d) && this.g == bcti.g && this.f == bcti.f;
        }
    }

    public final int hashCode() {
        return (this.d.hashCode() + (this.g * 37)) + (this.f * 31);
    }
}
