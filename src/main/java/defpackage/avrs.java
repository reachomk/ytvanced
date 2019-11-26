package defpackage;

/* renamed from: avrs */
public final class avrs implements aadq {
    public static final aaeb a = new avru();
    private final aadw b;
    private final avrw c;

    public final aaeb getType() {
        return a;
    }

    public final byte[] c() {
        return this.c.toByteArray();
    }

    public final String a() {
        return this.c.b;
    }

    public final azal getDownloadState() {
        azal a = azal.a(this.c.c);
        return a == null ? azal.DOWNLOAD_STATE_UNKNOWN : a;
    }

    public final Long getBytesDownloaded() {
        return Long.valueOf(this.c.d);
    }

    public final Long getTotalBytes() {
        return Long.valueOf(this.c.e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof avrs) {
            avrs avrs = (avrs) obj;
            if (this.b == avrs.b && this.c.equals(avrs.c)) {
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
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 31);
        stringBuilder.append("OfflineVideoStatusEntityModel{");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* synthetic */ avrs(avrw avrw, aadw aadw) {
        this.c = avrw;
        this.b = aadw;
    }

    public final amuw d() {
        return amwp.a;
    }
}
