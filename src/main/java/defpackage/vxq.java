package defpackage;

/* renamed from: vxq */
final class vxq extends vxi {
    private final vxd a;

    public final vxd b() {
        return this.a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 39);
        stringBuilder.append("AdTitleOverlayState{adOverlayMetadata=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vxi)) {
            return false;
        }
        return this.a.equals(((vxi) obj).b());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    /* synthetic */ vxq(vxd vxd) {
        this.a = vxd;
    }
}
