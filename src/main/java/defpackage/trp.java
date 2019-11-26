package defpackage;

import java.util.Objects;

/* renamed from: trp */
final class trp {
    public final int a;
    public final Integer b;

    public trp() {
        this.a = 0;
        this.b = null;
    }

    public trp(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            trp trp = (trp) obj;
            return Objects.equals(Integer.valueOf(this.a), Integer.valueOf(trp.a)) && Objects.equals(this.b, trp.b);
        }
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.a), this.b});
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 59);
        stringBuilder.append("QuartileSnapshot{coverage=");
        stringBuilder.append(i);
        stringBuilder.append(", instantaneousState=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
