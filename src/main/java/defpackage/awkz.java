package defpackage;

import java.util.List;

/* renamed from: awkz */
public final class awkz implements aadq {
    public static final aaeb a = new awlb();
    private final aadw b;
    private final awld c;

    public final aaeb getType() {
        return a;
    }

    public final byte[] c() {
        return this.c.toByteArray();
    }

    public final String a() {
        return this.c.b;
    }

    public final String getSetVideoId() {
        return this.c.d;
    }

    public final Boolean getVideoAddedByContributor() {
        return Boolean.valueOf(this.c.f);
    }

    public final List getParameters() {
        return this.c.g;
    }

    public final amuw d() {
        amuv amuv = new amuv();
        awld awld = this.c;
        if ((awld.a & 2) != 0) {
            amuv.c(awld.c);
        }
        awld = this.c;
        if ((awld.a & 8) != 0) {
            amuv.c(awld.e);
        }
        return amuv.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof awkz) {
            awkz awkz = (awkz) obj;
            if (this.b == awkz.b && this.c.equals(awkz.c)) {
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
        stringBuilder.append("PlaylistVideoEntityModel{");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* synthetic */ awkz(awld awld, aadw aadw) {
        this.c = awld;
        this.b = aadw;
    }
}
