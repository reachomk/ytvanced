package defpackage;

/* renamed from: enu */
final class enu extends eny {
    private final boolean a;

    enu(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder stringBuilder = new StringBuilder(48);
        stringBuilder.append("SwipeRefreshEvent{wasSectionListRefreshed=");
        stringBuilder.append(z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eny) {
            if (this.a == ((eny) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (!this.a ? 1237 : 1231) ^ 1000003;
    }
}
