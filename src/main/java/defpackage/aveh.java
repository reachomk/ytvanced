package defpackage;

import java.util.List;

/* renamed from: aveh */
public final class aveh implements aadq {
    public static final aaeb a = new avej();
    private final aadw b;
    private final avel c;

    public final aaeb getType() {
        return a;
    }

    public final byte[] c() {
        return this.c.toByteArray();
    }

    public final String a() {
        return this.c.b;
    }

    public final List getSelectedVideoIds() {
        return this.c.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aveh) {
            aveh aveh = (aveh) obj;
            if (this.b == aveh.b && this.c.equals(aveh.c)) {
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
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 51);
        stringBuilder.append("MultiSelectVideoItemFeedSelectionStateEntityModel{");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* synthetic */ aveh(avel avel, aadw aadw) {
        this.c = avel;
        this.b = aadw;
    }

    public final amuw d() {
        return amwp.a;
    }
}
