package defpackage;

/* renamed from: aqkj */
public final class aqkj implements aadq {
    public static final aaeb a = new aqkl();
    private final aadw b;
    private final aqji c;

    public final aaeb getType() {
        return a;
    }

    public final byte[] c() {
        return this.c.toByteArray();
    }

    public final String a() {
        return this.c.b;
    }

    public final anvu getName() {
        return this.c.c;
    }

    public final Boolean getViewer() {
        return Boolean.valueOf(this.c.d);
    }

    public final aygk getAvatar() {
        aygk aygk = this.c.e;
        return aygk == null ? aygk.f : aygk;
    }

    public final aqkt getStatus() {
        aqkt a = aqkt.a(this.c.f);
        return a == null ? aqkt.CONTACT_STATUS_UNKNOWN : a;
    }

    public final String getInviteToken() {
        return this.c.g;
    }

    public final String getAcceptInviteToken() {
        return this.c.h;
    }

    public final String getRejectInviteToken() {
        return this.c.i;
    }

    public final String getCancelInviteToken() {
        return this.c.j;
    }

    public final String getReinviteToken() {
        return this.c.k;
    }

    public final String getRemoveToken() {
        return this.c.l;
    }

    public final String getBlockToken() {
        return this.c.m;
    }

    public final String getUnblockToken() {
        return this.c.n;
    }

    public final String getExternalChannelId() {
        return this.c.o;
    }

    public final String getSerializedContactInvitee() {
        return this.c.p;
    }

    public final Boolean getSuppressContactMenu() {
        return Boolean.valueOf(this.c.q);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aqkj) {
            aqkj aqkj = (aqkj) obj;
            if (this.b == aqkj.b && this.c.equals(aqkj.c)) {
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
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 20);
        stringBuilder.append("ContactEntityModel{");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* synthetic */ aqkj(aqji aqji, aadw aadw) {
        this.c = aqji;
        this.b = aadw;
    }

    public final amuw d() {
        return amwp.a;
    }
}
