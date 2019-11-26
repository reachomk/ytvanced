package defpackage;

import java.lang.reflect.Method;

/* renamed from: s */
final class s {
    public final int a;
    public final Method b;

    s(int i, Method method) {
        this.a = i;
        this.b = method;
        this.b.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            s sVar = (s) obj;
            return this.a == sVar.a && this.b.getName().equals(sVar.b.getName());
        }
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.getName().hashCode();
    }
}
