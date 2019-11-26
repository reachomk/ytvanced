package defpackage;

/* renamed from: cht */
public final class cht {
    private Class a;
    private Class b;
    private Class c;

    public cht(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }

    public final void a(Class cls, Class cls2, Class cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 30) + valueOf2.length());
        stringBuilder.append("MultiClassKey{first=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", second=");
        stringBuilder.append(valueOf2);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cht cht = (cht) obj;
            return this.a.equals(cht.a) && this.b.equals(cht.b) && chv.a(this.c, cht.c);
        }
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Class cls = this.c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }
}
