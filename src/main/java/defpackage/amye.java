package defpackage;

/* renamed from: amye */
final class amye extends amyc {
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private int f = 0;

    public final String a() {
        return this.b.replace('/', '.');
    }

    public final String b() {
        return this.c;
    }

    public final int c() {
        return (char) this.d;
    }

    public final String d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amye) {
            amye amye = (amye) obj;
            if (this.b.equals(amye.b) && this.c.equals(amye.c) && this.d == amye.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        i = ((((this.b.hashCode() + 4867) * 31) + this.c.hashCode()) * 31) + this.d;
        this.f = i;
        return i;
    }

    /* synthetic */ amye(String str, String str2, int i, String str3) {
        this.b = (String) anad.a(str, "class name");
        this.c = (String) anad.a(str2, "method name");
        this.d = i;
        this.e = str3;
    }
}
