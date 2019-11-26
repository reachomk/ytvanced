package defpackage;

/* renamed from: viq */
final class viq extends vio {
    private final vso b;
    private final aakj c;
    private final vim d;
    private final boolean e;

    viq(vso vso, aakj aakj, vim vim, boolean z) {
        if (vso != null) {
            this.b = vso;
            this.c = aakj;
            this.d = vim;
            this.e = z;
            return;
        }
        throw new NullPointerException("Null ad");
    }

    public final vso a() {
        return this.b;
    }

    public final aakj b() {
        return this.c;
    }

    public final vim c() {
        return this.d;
    }

    public final boolean d() {
        return this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        boolean z = this.e;
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 63) + valueOf2.length()) + valueOf3.length());
        stringBuilder.append("AdUnitState{ad=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", adPlayerResponse=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", adUnitStage=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", isLive=");
        stringBuilder.append(z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vio) {
            vio vio = (vio) obj;
            if (this.b.equals(vio.a())) {
                aakj aakj = this.c;
                if (aakj == null ? vio.b() == null : aakj.equals(vio.b())) {
                    return this.d.equals(vio.c()) && this.e == vio.d();
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        aakj aakj = this.c;
        return ((((hashCode ^ (aakj != null ? aakj.hashCode() : 0)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (!this.e ? 1237 : 1231);
    }
}
