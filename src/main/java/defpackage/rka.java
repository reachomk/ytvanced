package defpackage;

/* renamed from: rka */
public final class rka extends rio implements Cloneable {
    public static volatile rka[] a;
    private String b;
    private String c;

    public rka() {
        String str = "";
        this.b = str;
        this.c = str;
        this.V = null;
        this.W = -1;
    }

    /* renamed from: e */
    public final rka clone() {
        try {
            return (rka) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rka)) {
            return false;
        }
        rka rka = (rka) obj;
        String str = this.b;
        if (str == null) {
            if (rka.b != null) {
                return false;
            }
        } else if (!str.equals(rka.b)) {
            return false;
        }
        str = this.c;
        if (str == null) {
            if (rka.c != null) {
                return false;
            }
        } else if (!str.equals(rka.c)) {
            return false;
        }
        riq riq = this.V;
        if (riq != null && !riq.a()) {
            return this.V.equals(rka.V);
        }
        riq riq2 = rka.V;
        return riq2 == null || riq2.a();
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.b;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.c;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        riq riq = this.V;
        if (!(riq == null || riq.a())) {
            i = this.V.hashCode();
        }
        return hashCode + i;
    }

    public final void a(rim rim) {
        String str = this.b;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            rim.a(1, this.b);
        }
        str = this.c;
        if (!(str == null || str.equals(str2))) {
            rim.a(2, this.c);
        }
        super.a(rim);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        int a = super.a();
        String str = this.b;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            a += rim.b(1, this.b);
        }
        str = this.c;
        return (str == null || str.equals(str2)) ? a : a + rim.b(2, this.c);
    }
}
