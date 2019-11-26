package defpackage;

import android.content.Context;

/* renamed from: ajqw */
public final class ajqw {
    public final Context a;
    public final arml b;
    public final ajqr c;

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 73) + valueOf2.length()) + valueOf3.length());
        stringBuilder.append("FormattedStringDecorator{context=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", formattedString=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", commandSpanFactory=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajqw) {
            ajqw ajqw = (ajqw) obj;
            Context context = this.a;
            if (context == null ? ajqw.a != null : !context.equals(ajqw.a)) {
                arml arml = this.b;
                if (arml == null ? ajqw.b != null : !arml.equals(ajqw.b)) {
                    ajqr ajqr = this.c;
                    if (ajqr == null ? ajqw.c == null : ajqr.equals(ajqw.c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Context context = this.a;
        int i = 0;
        int hashCode = ((context != null ? context.hashCode() : 0) ^ 1000003) * 1000003;
        arml arml = this.b;
        hashCode = (hashCode ^ (arml != null ? arml.hashCode() : 0)) * 1000003;
        ajqr ajqr = this.c;
        if (ajqr != null) {
            i = ajqr.hashCode();
        }
        return hashCode ^ i;
    }

    public static ajqv a() {
        return new ajqv();
    }

    /* synthetic */ ajqw(Context context, arml arml, ajqr ajqr) {
        this.a = context;
        this.b = arml;
        this.c = ajqr;
    }
}
