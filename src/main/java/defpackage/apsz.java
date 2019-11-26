package defpackage;

import java.util.List;

/* renamed from: apsz */
public final class apsz implements aadq {
    public static final aaeb a = new aptb();
    private final aadw b;
    private final aprc c;

    public final aaeb getType() {
        return a;
    }

    public final byte[] c() {
        return this.c.toByteArray();
    }

    public final String a() {
        return this.c.b;
    }

    public final axqf getPageToken() {
        axqf axqf = this.c.d;
        return axqf == null ? axqf.c : axqf;
    }

    public final amuw d() {
        amuv amuv = new amuv();
        if (this.c.c.size() > 0) {
            amuv.b(this.c.c);
        }
        return amuv.a();
    }

    public final List b() {
        return this.c.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof apsz) {
            apsz apsz = (apsz) obj;
            if (this.b == apsz.b && this.c.equals(apsz.c)) {
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
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 27);
        stringBuilder.append("ChatMessageSetEntityModel{");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final apsy e() {
        return new apsy((aprf) ((anxo) this.c.toBuilder()));
    }

    /* synthetic */ apsz(aprc aprc, aadw aadw) {
        this.c = aprc;
        this.b = aadw;
    }
}
