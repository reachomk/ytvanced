package defpackage;

/* renamed from: aplo */
public final class aplo implements aadq {
    public static final aaeb a = new aplq();
    private final aadw b;
    private final apls c;

    public final aaeb getType() {
        return a;
    }

    public final byte[] c() {
        return this.c.toByteArray();
    }

    public final String a() {
        return this.c.b;
    }

    public final String getChannelId() {
        return this.c.c;
    }

    public final String getTitle() {
        return this.c.d;
    }

    public final aygk getAvatar() {
        aygk aygk = this.c.e;
        return aygk == null ? aygk.f : aygk;
    }

    public final Integer getVideoCount() {
        return Integer.valueOf(this.c.f);
    }

    public final Integer getSubscriberCount() {
        return Integer.valueOf(this.c.g);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aplo) {
            aplo aplo = (aplo) obj;
            if (this.b == aplo.b && this.c.equals(aplo.c)) {
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
        stringBuilder.append("ChannelEntityModel{");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* synthetic */ aplo(apls apls, aadw aadw) {
        this.c = apls;
        this.b = aadw;
    }

    public final amuw d() {
        return amwp.a;
    }
}
