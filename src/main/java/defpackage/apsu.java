package defpackage;

/* renamed from: apsu */
public final class apsu implements aadq {
    public static final aaeb a = new apsw();
    public final apra b;
    private final aadw c;

    public final aaeb getType() {
        return a;
    }

    public final byte[] c() {
        return this.b.toByteArray();
    }

    public final String a() {
        return this.b.b;
    }

    public final anvu getTitle() {
        return this.b.d;
    }

    public final anvu getSnippet() {
        return this.b.e;
    }

    public final aygk getVideoThumbnail() {
        aygk aygk = this.b.f;
        return aygk == null ? aygk.f : aygk;
    }

    public final Boolean getNotificationsMuted() {
        return Boolean.valueOf(this.b.g);
    }

    public final Long getLastModified() {
        return Long.valueOf(this.b.h);
    }

    public final Integer getUnreadCount() {
        return Integer.valueOf(this.b.i);
    }

    public final anvu getReadReceiptText() {
        return this.b.j;
    }

    public final amuw d() {
        amuv amuv = new amuv();
        if (this.b.c.size() > 0) {
            amuv.b(this.b.c);
        }
        apra apra = this.b;
        if ((apra.a & 256) != 0) {
            amuv.c(apra.k);
        }
        return amuv.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof apsu) {
            apsu apsu = (apsu) obj;
            if (this.c == apsu.c && this.b.equals(apsu.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 23);
        stringBuilder.append("ChatHeaderEntityModel{");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* synthetic */ apsu(apra apra, aadw aadw) {
        this.b = apra;
        this.c = aadw;
    }
}
