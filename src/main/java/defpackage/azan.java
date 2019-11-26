package defpackage;

/* renamed from: azan */
public final class azan implements aadq {
    public static final aaeb a = new azap();
    private final aadw b;
    private final azar c;

    public final aaeb getType() {
        return a;
    }

    public final byte[] c() {
        return this.c.toByteArray();
    }

    public final String a() {
        return this.c.b;
    }

    public final String getVideoId() {
        return this.c.c;
    }

    public final String getTitle() {
        return this.c.e;
    }

    public final Long getViewCount() {
        return Long.valueOf(this.c.f);
    }

    public final Long getTimePublished() {
        return Long.valueOf(this.c.g);
    }

    public final Integer getVideoLength() {
        return Integer.valueOf(this.c.h);
    }

    public final aygk getThumbnailDetails() {
        aygk aygk = this.c.i;
        return aygk == null ? aygk.f : aygk;
    }

    public final Integer getPercentDurationWatched() {
        return Integer.valueOf(this.c.j);
    }

    public final amuw d() {
        amuv amuv = new amuv();
        azar azar = this.c;
        if ((azar.a & 4) != 0) {
            amuv.c(azar.d);
        }
        return amuv.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof azan) {
            azan azan = (azan) obj;
            if (this.b == azan.b && this.c.equals(azan.c)) {
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
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 18);
        stringBuilder.append("VideoEntityModel{");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* synthetic */ azan(azar azar, aadw aadw) {
        this.c = azar;
        this.b = aadw;
    }
}
