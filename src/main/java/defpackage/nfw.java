package defpackage;

import android.graphics.Bitmap;

/* renamed from: nfw */
final class nfw extends ngf {
    public final CharSequence a;
    public final CharSequence b;
    public final Bitmap c;

    public final CharSequence a() {
        return this.a;
    }

    public final CharSequence b() {
        return this.b;
    }

    public final Bitmap c() {
        return this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 49) + valueOf2.length()) + valueOf3.length());
        stringBuilder.append("EmbedVideoMetadata{title=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", subtitle=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", thumbnail=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ngf) {
            ngf ngf = (ngf) obj;
            CharSequence charSequence = this.a;
            if (charSequence == null ? ngf.a() != null : !charSequence.equals(ngf.a())) {
                charSequence = this.b;
                if (charSequence == null ? ngf.b() != null : !charSequence.equals(ngf.b())) {
                    Bitmap bitmap = this.c;
                    if (bitmap == null ? ngf.c() == null : bitmap.equals(ngf.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int i = 0;
        int hashCode = ((charSequence != null ? charSequence.hashCode() : 0) ^ 1000003) * 1000003;
        CharSequence charSequence2 = this.b;
        hashCode = (hashCode ^ (charSequence2 != null ? charSequence2.hashCode() : 0)) * 1000003;
        Bitmap bitmap = this.c;
        if (bitmap != null) {
            i = bitmap.hashCode();
        }
        return hashCode ^ i;
    }

    public final ngi d() {
        return new nfv(this);
    }

    /* synthetic */ nfw(CharSequence charSequence, CharSequence charSequence2, Bitmap bitmap) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = bitmap;
    }
}
