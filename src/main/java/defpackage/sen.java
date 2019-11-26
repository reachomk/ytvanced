package defpackage;

import java.util.List;

/* renamed from: sen */
final class sen extends sfz {
    private final List a;
    private final int b;

    public final List a() {
        return this.a;
    }

    public final String toString() {
        Object obj;
        int i = this.b;
        if (i == 0) {
            obj = "null";
        } else if (i != 0) {
            obj = Integer.toString(aodh.a(i));
        } else {
            throw null;
        }
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 39) + valueOf2.length());
        stringBuilder.append("LoggingState{clientState=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", attributes=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sfz)) {
            return false;
        }
        sfz sfz = (sfz) obj;
        int i = this.b;
        int b = sfz.b();
        if (i != 0) {
            return i == b && this.a.equals(sfz.a());
        } else {
            throw null;
        }
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return ((i ^ 1000003) * 1000003) ^ this.a.hashCode();
        }
        throw null;
    }

    sen(int i, List list) {
        if (i != 0) {
            this.b = i;
            if (list != null) {
                this.a = list;
                return;
            }
            throw new NullPointerException("Null attributes");
        }
        throw new NullPointerException("Null clientState");
    }

    public final int b() {
        return this.b;
    }
}
