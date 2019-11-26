package defpackage;

/* renamed from: vxw */
final class vxw extends vye {
    private final boolean a;

    public final boolean a() {
        return this.a;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder stringBuilder = new StringBuilder(39);
        stringBuilder.append("MdxAdOverlayState{remotePlayback=");
        stringBuilder.append(z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vye) {
            if (this.a == ((vye) obj).a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (!this.a ? 1237 : 1231) ^ 1000003;
    }

    /* synthetic */ vxw(boolean z) {
        this.a = z;
    }
}
