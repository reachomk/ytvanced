package defpackage;

/* renamed from: annr */
public final class annr {
    public final Class a;
    public final int b = 1;

    private annr(Class cls) {
        this.a = (Class) pzr.a((Object) cls, (Object) "Null dependency anInterface.");
    }

    public static annr a(Class cls) {
        return new annr(cls);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof annr) {
            annr annr = (annr) obj;
            if (this.a == annr.a && this.b == annr.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Dependency{anInterface=");
        stringBuilder.append(this.a);
        stringBuilder.append(", required=");
        boolean z = true;
        if (this.b != 1) {
            z = false;
        }
        stringBuilder.append(z);
        stringBuilder.append(", direct=true}");
        return stringBuilder.toString();
    }
}
