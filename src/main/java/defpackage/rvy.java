package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rvy */
public final class rvy extends qou {
    public static final Creator CREATOR = new rxo();
    private final String a;
    private final String b;
    private final rvz c;
    private final boolean d;

    public rvy(String str, String str2, rvz rvz, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = rvz;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rvy) {
            rvy rvy = (rvy) obj;
            return rwh.a(this.a, rvy.a) && rwh.a(this.b, rvy.b) && rwh.a(this.c, rvy.c) && this.d == rvy.d;
        }
    }

    public final String toString() {
        return a(new StringBuilder());
    }

    public final String a(StringBuilder stringBuilder) {
        stringBuilder.append("FlagOverride(");
        stringBuilder.append(this.a);
        String str = ", ";
        stringBuilder.append(str);
        stringBuilder.append(this.b);
        stringBuilder.append(str);
        this.c.a(stringBuilder);
        stringBuilder.append(str);
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, 4, this.c, i);
        qov.a(parcel, 5, this.d);
        qov.a(parcel, a);
    }
}
