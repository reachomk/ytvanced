package defpackage;

import java.util.List;

/* renamed from: trr */
final class trr extends trv {
    private final trs a;
    private final List b;

    trr(trs trs, List list) {
        this.a = trs;
        if (list != null) {
            this.b = list;
            return;
        }
        throw new NullPointerException("Null children");
    }

    public final trs a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 26) + valueOf2.length());
        stringBuilder.append("VeTreeNode{ve=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", children=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof trv) {
            trv trv = (trv) obj;
            trs trs = this.a;
            if (trs == null ? trv.a() != null : !trs.equals(trv.a())) {
                if (this.b.equals(trv.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        trs trs = this.a;
        return (((trs != null ? trs.hashCode() : 0) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
