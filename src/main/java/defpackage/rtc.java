package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: rtc */
public final class rtc extends qou {
    public static final Creator CREATOR = new rto();
    private String a;
    private String b;
    private String c;
    private rta d;
    private String e;

    public rtc(String str, String str2, String str3, rta rta, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = rta;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rtc)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        rtc rtc = (rtc) obj;
        return pzj.a(this.a, rtc.a) && pzj.a(this.b, rtc.b) && pzj.a(this.c, rtc.c) && pzj.a(this.d, rtc.d) && pzj.a(this.e, rtc.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        pzi a = pzj.a(this);
        a.a("displayName", this.a);
        a.a("givenName", this.b);
        a.a("familyName", this.c);
        a.a("matchInfo", this.d);
        a.a("alternativeDisplayName", this.e);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, 4, this.c);
        qov.a(parcel, 5, this.d, i);
        qov.a(parcel, 6, this.e);
        qov.a(parcel, a);
    }
}
