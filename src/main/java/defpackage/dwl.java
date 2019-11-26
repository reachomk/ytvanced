package defpackage;

/* renamed from: dwl */
final class dwl {
    public final String a;
    private final Class b;
    private int c;

    dwl(String str, Class cls) {
        this.a = amqu.b(str);
        this.b = (Class) amqw.a((Object) cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dwl) {
            dwl dwl = (dwl) obj;
            return this.a.equals(dwl.a) && this.b.equals(dwl.b);
        }
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        i = ((this.a.hashCode() + 527) * 31) + this.b.hashCode();
        this.c = i;
        return i;
    }
}
