package defpackage;

import java.util.List;

/* renamed from: apso */
public final class apso implements aadq {
    public static final aaeb a = new apsq();
    public final apqw b;
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

    public final List getParticipants() {
        return this.b.c;
    }

    public final String getConversationId() {
        return this.b.f;
    }

    public final String getOnViewEditConversationToken() {
        return this.b.g;
    }

    public final anvu getReadReceiptText() {
        return this.b.h;
    }

    public final String getShowTypingStatusToken() {
        return this.b.i;
    }

    public final String getHideTypingStatusToken() {
        return this.b.j;
    }

    public final atun getInvalidationId() {
        atun atun = this.b.k;
        return atun == null ? atun.g : atun;
    }

    public final String getGetConversationAttachmentToken() {
        return this.b.l;
    }

    public final amuw d() {
        amuv amuv = new amuv();
        apqw apqw = this.b;
        if ((apqw.a & 2) != 0) {
            amuv.c(apqw.d);
        }
        apqw = this.b;
        if ((apqw.a & 4) != 0) {
            amuv.c(apqw.e);
        }
        return amuv.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof apso) {
            apso apso = (apso) obj;
            if (this.c == apso.c && this.b.equals(apso.b)) {
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
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 21);
        stringBuilder.append("ChatBodyEntityModel{");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* synthetic */ apso(apqw apqw, aadw aadw) {
        this.b = apqw;
        this.c = aadw;
    }
}
