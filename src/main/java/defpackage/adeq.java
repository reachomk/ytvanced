package defpackage;

/* renamed from: adeq */
final class adeq extends adgf {
    private final adpw a;

    /* Access modifiers changed, original: final */
    public final adpw a() {
        return this.a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 49);
        stringBuilder.append("SelectedRouteProperty{initialPlaybackDescriptor=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        boolean z = false;
        if (!(obj instanceof adgf)) {
            return false;
        }
        adgf adgf = (adgf) obj;
        adpw adpw = this.a;
        adpw a = adgf.a();
        if (adpw != null) {
            z = adpw.equals(a);
        } else if (a != null) {
            return z;
        } else {
            return true;
        }
        return z;
    }

    public final int hashCode() {
        adpw adpw = this.a;
        return (adpw != null ? adpw.hashCode() : 0) ^ 1000003;
    }

    /* synthetic */ adeq(adpw adpw) {
        this.a = adpw;
    }
}
