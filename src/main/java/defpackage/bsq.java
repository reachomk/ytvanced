package defpackage;

import java.security.MessageDigest;

/* renamed from: bsq */
public final class bsq implements bsm {
    private final zj b = new chm();

    public final void a(bsq bsq) {
        this.b.a(bsq.b);
    }

    public final bsq a(bsl bsl, Object obj) {
        this.b.put(bsl, obj);
        return this;
    }

    public final Object a(bsl bsl) {
        if (this.b.containsKey(bsl)) {
            return this.b.get(bsl);
        }
        return bsl.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bsq)) {
            return false;
        }
        return this.b.equals(((bsq) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            zj zjVar = this.b;
            if (i < zjVar.b) {
                bsl bsl = (bsl) zjVar.b(i);
                Object c = this.b.c(i);
                bsn bsn = bsl.c;
                if (bsl.e == null) {
                    bsl.e = bsl.d.getBytes(bsm.a);
                }
                bsn.a(bsl.e, c, messageDigest);
                i++;
            } else {
                return;
            }
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 16);
        stringBuilder.append("Options{values=");
        stringBuilder.append(valueOf);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
