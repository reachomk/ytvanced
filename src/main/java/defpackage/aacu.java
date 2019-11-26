package defpackage;

/* renamed from: aacu */
public final class aacu extends aacz {
    public final int a = 1;
    private final int b;

    public final int a() {
        return this.b;
    }

    public final String toString() {
        int i = this.a;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "USER" : "TIMER_FIRED" : "MEMORY_CALLBACK";
        int i2 = this.b;
        StringBuilder stringBuilder = new StringBuilder(str.length() + 56);
        stringBuilder.append("EntityLifecycleContext{reason=");
        stringBuilder.append(str);
        stringBuilder.append(", memoryLevel=");
        stringBuilder.append(i2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aacz)) {
            return false;
        }
        aacz aacz = (aacz) obj;
        int i = this.a;
        int b = aacz.b();
        if (i != 0) {
            return i == b && this.b == aacz.a();
        } else {
            throw null;
        }
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return ((i ^ 1000003) * 1000003) ^ this.b;
        }
        throw null;
    }

    aacu(int i) {
        this.b = i;
    }

    public final int b() {
        return this.a;
    }
}
