package defpackage;

/* renamed from: uig */
public final class uig {
    public final String a;
    public final Class b;

    public static uig a(String str) {
        return new uig(str, String.class);
    }

    public static uig b(String str) {
        return new uig(str, Boolean.class);
    }

    private uig(String str, Class cls) {
        this.a = (String) amqw.a((Object) str);
        this.b = (Class) amqw.a((Object) cls);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uig) {
            uig uig = (uig) obj;
            return this.b == uig.b && this.a.equals(uig.a);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.format("(%s, %s)", new Object[]{this.a, this.b});
    }
}
