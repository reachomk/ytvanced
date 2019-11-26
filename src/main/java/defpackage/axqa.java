package defpackage;

/* renamed from: axqa */
public final class axqa implements aadq {
    public static final aaeb a = new axqc();
    private final aadw b;
    private final axpy c;

    public final aaeb getType() {
        return a;
    }

    public final byte[] c() {
        return this.c.toByteArray();
    }

    public final String a() {
        return this.c.b;
    }

    public final axqf getSyncToken() {
        axqf axqf = this.c.d;
        return axqf == null ? axqf.c : axqf;
    }

    public final Long getEntityFilledTimestamp() {
        return Long.valueOf(this.c.e);
    }

    public final amuw d() {
        amuv amuv = new amuv();
        axpy axpy = this.c;
        if ((axpy.a & 2) != 0) {
            amuv.c(axpy.c);
        }
        return amuv.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof axqa) {
            axqa axqa = (axqa) obj;
            if (this.b == axqa.b && this.c.equals(axqa.c)) {
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
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 26);
        stringBuilder.append("SocialSharingEntityModel{");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* synthetic */ axqa(axpy axpy, aadw aadw) {
        this.c = axpy;
        this.b = aadw;
    }
}
