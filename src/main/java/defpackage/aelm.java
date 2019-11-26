package defpackage;

/* renamed from: aelm */
final class aelm extends aely {
    private final aepc a;
    private final int b;

    /* Access modifiers changed, original: final */
    public final aepc a() {
        return this.a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String str = i != 1 ? i != 2 ? "null" : "VIDEO" : "AUDIO";
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 44) + str.length());
        stringBuilder.append("InitSegmentData{onesieVideoData=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", dataType=");
        stringBuilder.append(str);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aely) {
            aely aely = (aely) obj;
            if (this.a.equals(aely.a())) {
                int i = this.b;
                int b = aely.b();
                if (i == 0) {
                    throw null;
                } else if (i == b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        int i = this.b;
        if (i != 0) {
            return hashCode ^ i;
        }
        throw null;
    }

    aelm(aepc aepc, int i) {
        if (aepc != null) {
            this.a = aepc;
            if (i != 0) {
                this.b = i;
                return;
            }
            throw new NullPointerException("Null dataType");
        }
        throw new NullPointerException("Null onesieVideoData");
    }

    /* Access modifiers changed, original: final */
    public final int b() {
        return this.b;
    }
}
