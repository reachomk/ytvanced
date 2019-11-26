package defpackage;

import android.text.Spanned;

/* renamed from: aceq */
final class aceq extends acex {
    private final int a;
    private final Spanned b;

    aceq(int i, Spanned spanned) {
        this.a = i;
        this.b = spanned;
    }

    /* Access modifiers changed, original: final */
    public final int a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final Spanned b() {
        return this.b;
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 41);
        stringBuilder.append("IconText{iconResId=");
        stringBuilder.append(i);
        stringBuilder.append(", spanned=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof acex) {
            acex acex = (acex) obj;
            if (this.a == acex.a()) {
                Spanned spanned = this.b;
                if (spanned == null ? acex.b() == null : spanned.equals(acex.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        Spanned spanned = this.b;
        return i ^ (spanned != null ? spanned.hashCode() : 0);
    }
}
