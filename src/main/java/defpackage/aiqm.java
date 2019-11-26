package defpackage;

/* renamed from: aiqm */
final class aiqm extends airf {
    private final int a;
    private final int b;

    public final int a() {
        return this.a;
    }

    public final String toString() {
        Object obj;
        int i = this.b;
        if (i == 0) {
            obj = "null";
        } else if (i == 0) {
            throw null;
        } else if (i != 0) {
            obj = Integer.toString(i - 1);
        } else {
            throw null;
        }
        String valueOf = String.valueOf(obj);
        int i2 = this.a;
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 84);
        stringBuilder.append("PrefetchPlaybackContextWrapper{prefetchReason=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", playbackBeginsInSeconds=");
        stringBuilder.append(i2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof airf)) {
            return false;
        }
        airf airf = (airf) obj;
        int i = this.b;
        int b = airf.b();
        if (i != 0) {
            return i == b && this.a == airf.a();
        } else {
            throw null;
        }
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return ((i ^ 1000003) * 1000003) ^ this.a;
        }
        throw null;
    }

    public final int b() {
        return this.b;
    }

    /* synthetic */ aiqm(int i, int i2) {
        this.b = i;
        this.a = i2;
    }
}
