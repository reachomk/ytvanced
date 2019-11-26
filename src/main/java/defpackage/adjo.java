package defpackage;

import android.graphics.Bitmap;

/* renamed from: adjo */
final class adjo extends adls {
    private final CharSequence a;
    private final CharSequence b;
    private final Bitmap c;
    private final adjq d;

    /* Access modifiers changed, original: final */
    public final CharSequence a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final CharSequence b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final Bitmap c() {
        return this.c;
    }

    /* Access modifiers changed, original: final */
    public final adjq d() {
        return this.d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder stringBuilder = new StringBuilder((((length + 87) + length2) + valueOf3.length()) + valueOf4.length());
        stringBuilder.append("NotificationModel{contentTitle=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", contentText=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", largeIconBitmap=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", bigPictureStyleModel=");
        stringBuilder.append(valueOf4);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adls) {
            adls adls = (adls) obj;
            if (this.a.equals(adls.a())) {
                CharSequence charSequence = this.b;
                if (charSequence == null ? adls.b() != null : !charSequence.equals(adls.b())) {
                    Bitmap bitmap = this.c;
                    if (bitmap == null ? adls.c() != null : !bitmap.equals(adls.c())) {
                        adjq adjq = this.d;
                        if (adjq == null ? adls.d() == null : adjq.equals(adls.d())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        CharSequence charSequence = this.b;
        int i = 0;
        hashCode = (hashCode ^ (charSequence != null ? charSequence.hashCode() : 0)) * 1000003;
        Bitmap bitmap = this.c;
        hashCode = (hashCode ^ (bitmap != null ? bitmap.hashCode() : 0)) * 1000003;
        adjq adjq = this.d;
        if (adjq != null) {
            i = adjq.hashCode();
        }
        return hashCode ^ i;
    }

    /* synthetic */ adjo(CharSequence charSequence, CharSequence charSequence2, Bitmap bitmap, adjq adjq) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = bitmap;
        this.d = adjq;
    }
}
