package defpackage;

import android.graphics.Bitmap;

/* renamed from: adji */
final class adji extends adjq {
    private final CharSequence a;
    private final CharSequence b;
    private final Bitmap c;
    private final Bitmap d;

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
    public final Bitmap d() {
        return this.d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        StringBuilder stringBuilder = new StringBuilder((((length + 86) + length2) + valueOf3.length()) + valueOf4.length());
        stringBuilder.append("BigPictureStyleModel{contentTitle=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", contentText=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", largeIconBitmap=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", bigPictureBitmap=");
        stringBuilder.append(valueOf4);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adjq) {
            adjq adjq = (adjq) obj;
            if (this.a.equals(adjq.a())) {
                CharSequence charSequence = this.b;
                if (charSequence == null ? adjq.b() != null : !charSequence.equals(adjq.b())) {
                    Bitmap bitmap = this.c;
                    if (bitmap == null ? adjq.c() != null : !bitmap.equals(adjq.c())) {
                        bitmap = this.d;
                        if (bitmap == null ? adjq.d() == null : bitmap.equals(adjq.d())) {
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
        Bitmap bitmap2 = this.d;
        if (bitmap2 != null) {
            i = bitmap2.hashCode();
        }
        return hashCode ^ i;
    }

    /* synthetic */ adji(CharSequence charSequence, CharSequence charSequence2, Bitmap bitmap, Bitmap bitmap2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = bitmap;
        this.d = bitmap2;
    }
}
