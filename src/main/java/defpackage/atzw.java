package defpackage;

/* renamed from: atzw */
public final class atzw implements aadq {
    public static final aaeb a = new atzy();
    private final aadw b;
    private final auaa c;

    public final aaeb getType() {
        return a;
    }

    public final byte[] c() {
        return this.c.toByteArray();
    }

    public final String a() {
        return this.c.b;
    }

    public final auac getLikeStatus() {
        auac a = auac.a(this.c.c);
        return a == null ? auac.LIKE : a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof atzw) {
            atzw atzw = (atzw) obj;
            if (this.b == atzw.b && this.c.equals(atzw.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 23);
        stringBuilder.append("LikeStatusEntityModel{");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* synthetic */ atzw(auaa auaa, aadw aadw) {
        this.c = auaa;
        this.b = aadw;
    }

    public final amuw d() {
        return amwp.a;
    }
}
