package defpackage;

/* renamed from: cjp */
public final class cjp {
    public final int a;

    public cjp(int i) {
        this.a = i;
    }

    public final String toString() {
        int i = this.a;
        StringBuilder stringBuilder = new StringBuilder(afy.av);
        stringBuilder.append("Entry{reserved=");
        stringBuilder.append((i >> 6) & 3);
        stringBuilder.append(", sampleDependsOn=");
        stringBuilder.append((i >> 4) & 3);
        stringBuilder.append(", sampleIsDependentOn=");
        stringBuilder.append((i >> 2) & 3);
        stringBuilder.append(", sampleHasRedundancy=");
        stringBuilder.append(i & 3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            if (this.a == ((cjp) obj).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
