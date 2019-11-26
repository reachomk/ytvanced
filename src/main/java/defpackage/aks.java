package defpackage;

/* renamed from: aks */
public final class aks {
    public int a;
    public int b;
    public Object c;
    public int d;

    aks(int i, int i2, int i3, Object obj) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = obj;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append("[");
        int i = this.a;
        String str = i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        stringBuilder.append(str);
        stringBuilder.append(",s:");
        stringBuilder.append(this.b);
        stringBuilder.append("c:");
        stringBuilder.append(this.d);
        stringBuilder.append(",p:");
        stringBuilder.append(this.c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aks aks = (aks) obj;
            int i = this.a;
            if (i == aks.a) {
                if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == aks.b && this.b == aks.d) {
                    return true;
                }
                if (this.d == aks.d && this.b == aks.b) {
                    Object obj2 = this.c;
                    if (obj2 != null) {
                        if (!obj2.equals(aks.c)) {
                            return false;
                        }
                    } else if (aks.c != null) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }
}
