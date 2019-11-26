package defpackage;

/* renamed from: apst */
public final class apst implements aadq {
    public static final aaeb a = new apsv();
    public final apqy b;
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

    public final axqf getSyncToken() {
        axqf axqf = this.b.e;
        return axqf == null ? axqf.c : axqf;
    }

    public final Long getEntityFilledTimestamp() {
        return Long.valueOf(this.b.f);
    }

    public final axqf getForegroundChatToken() {
        axqf axqf = this.b.g;
        return axqf == null ? axqf.c : axqf;
    }

    public final amuw d() {
        amuv amuv = new amuv();
        apqy apqy = this.b;
        if ((apqy.a & 2) != 0) {
            amuv.c(apqy.c);
        }
        apqy = this.b;
        if ((apqy.a & 4) != 0) {
            amuv.c(apqy.d);
        }
        return amuv.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof apst) {
            apst apst = (apst) obj;
            if (this.c == apst.c && this.b.equals(apst.b)) {
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
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 17);
        stringBuilder.append("ChatEntityModel{");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* synthetic */ apst(apqy apqy, aadw aadw) {
        this.b = apqy;
        this.c = aadw;
    }
}
