package defpackage;

/* renamed from: ades */
final class ades extends adgh {
    private final boolean a;

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return this.a;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder stringBuilder = new StringBuilder(54);
        stringBuilder.append("UnselectedRouteProperty{isUnselectUserInitiated=");
        stringBuilder.append(z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adgh) {
            if (this.a == ((adgh) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (!this.a ? 1237 : 1231) ^ 1000003;
    }

    /* synthetic */ ades(boolean z) {
        this.a = z;
    }
}
