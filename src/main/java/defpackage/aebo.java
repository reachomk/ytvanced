package defpackage;

/* renamed from: aebo */
final class aebo extends aebu {
    public final CharSequence a;
    public final CharSequence b;
    public final int c;
    public final int d;
    public final aygk e;

    public final CharSequence a() {
        return this.a;
    }

    public final CharSequence b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final aygk e() {
        return this.e;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.c;
        int i2 = this.d;
        String valueOf3 = String.valueOf(this.e);
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((length + afy.av) + valueOf2.length()) + valueOf3.length());
        stringBuilder.append("MdxAdState{adVideoTitle=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", adVideoSubtitle=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", adProgressMillis=");
        stringBuilder.append(i);
        stringBuilder.append(", skippableState=");
        stringBuilder.append(i2);
        stringBuilder.append(", adThumbnailDetails=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aebu) {
            aebu aebu = (aebu) obj;
            CharSequence charSequence = this.a;
            if (charSequence == null ? aebu.a() != null : !charSequence.equals(aebu.a())) {
                charSequence = this.b;
                if (charSequence == null ? aebu.b() != null : !charSequence.equals(aebu.b())) {
                    if (this.c == aebu.c() && this.d == aebu.d()) {
                        aygk aygk = this.e;
                        if (aygk == null ? aebu.e() == null : aygk.equals(aebu.e())) {
                            return true;
                        }
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
        hashCode = (((((hashCode ^ (charSequence2 != null ? charSequence2.hashCode() : 0)) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        aygk aygk = this.e;
        if (aygk != null) {
            i = aygk.hashCode();
        }
        return hashCode ^ i;
    }

    public final aebt f() {
        return new aebn(this);
    }

    /* synthetic */ aebo(CharSequence charSequence, CharSequence charSequence2, int i, int i2, aygk aygk) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = i;
        this.d = i2;
        this.e = aygk;
    }
}
