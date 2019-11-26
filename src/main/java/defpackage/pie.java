package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: pie */
public final class pie extends qou {
    public static final Creator CREATOR = new pir();
    public final int a;
    public final int b;
    public final String c;
    private final int d;
    private final long e;
    private final String f;

    pie(int i, long j, String str, int i2, int i3, String str2) {
        this.d = i;
        this.e = j;
        this.f = (String) pzr.a((Object) str);
        this.a = i2;
        this.b = i3;
        this.c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 1, this.d);
        qov.a(parcel, 2, this.e);
        qov.a(parcel, 3, this.f);
        qov.b(parcel, 4, this.a);
        qov.b(parcel, 5, this.b);
        qov.a(parcel, 6, this.c);
        qov.a(parcel, i);
    }

    public final String toString() {
        int i = this.a;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        String str2 = this.f;
        String str3 = this.c;
        int i2 = this.b;
        StringBuilder stringBuilder = new StringBuilder(((String.valueOf(str2).length() + 91) + str.length()) + String.valueOf(str3).length());
        stringBuilder.append("AccountChangeEvent {accountName = ");
        stringBuilder.append(str2);
        stringBuilder.append(", changeType = ");
        stringBuilder.append(str);
        stringBuilder.append(", changeData = ");
        stringBuilder.append(str3);
        stringBuilder.append(", eventIndex = ");
        stringBuilder.append(i2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), Long.valueOf(this.e), this.f, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pie) {
            pie pie = (pie) obj;
            return this.d == pie.d && this.e == pie.e && pzj.a(this.f, pie.f) && this.a == pie.a && this.b == pie.b && pzj.a(this.c, pie.c);
        }
    }
}
