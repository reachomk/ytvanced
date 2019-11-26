package defpackage;

/* renamed from: axyd */
public final class axyd implements aadq {
    public static final aaeb a = new axyf();
    private final aadw b;
    private final axyh c;

    public final aaeb getType() {
        return a;
    }

    public final byte[] c() {
        return this.c.toByteArray();
    }

    public final String a() {
        return this.c.b;
    }

    public final Boolean getSubscribed() {
        return Boolean.valueOf(this.c.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof axyd) {
            axyd axyd = (axyd) obj;
            if (this.b == axyd.b && this.c.equals(axyd.c)) {
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
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 30);
        stringBuilder.append("SubscriptionStateEntityModel{");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* synthetic */ axyd(axyh axyh, aadw aadw) {
        this.c = axyh;
        this.b = aadw;
    }

    public final amuw d() {
        return amwp.a;
    }
}
