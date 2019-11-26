package defpackage;

/* renamed from: bmm */
public final class bmm {
    public Object a;
    public Object b;

    public final boolean equals(Object obj) {
        if (obj instanceof zz) {
            zz zzVar = (zz) obj;
            if (bmm.a(zzVar.a, this.a) && bmm.a(zzVar.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(Object obj, Object obj2) {
        boolean z = true;
        if (obj != obj2) {
            if (obj != null) {
                return obj.equals(obj2) ? z : false;
            } else {
                z = false;
            }
        }
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = obj != null ? obj.hashCode() : 0;
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Pair{");
        stringBuilder.append(String.valueOf(this.a));
        stringBuilder.append(" ");
        stringBuilder.append(String.valueOf(this.b));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
