package defpackage;

import java.util.Objects;

/* renamed from: zz */
public final class zz {
    public final Object a;
    public final Object b;

    public zz(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zz) {
            zz zzVar = (zz) obj;
            if (Objects.equals(zzVar.a, this.a) && Objects.equals(zzVar.b, this.b)) {
                return true;
            }
        }
        return false;
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

    public static zz a(Object obj, Object obj2) {
        return new zz(obj, obj2);
    }
}
