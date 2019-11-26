package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: rsz */
public final class rsz extends qou {
    public static final Creator CREATOR = new rtl();
    private final boolean a;
    private final String b;
    private final String c;

    rsz(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rsz)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        rsz rsz = (rsz) obj;
        return pzj.a(Boolean.valueOf(this.a), Boolean.valueOf(rsz.a)) && pzj.a(this.b, rsz.b) && pzj.a(this.c, rsz.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c});
    }

    public final String toString() {
        pzi a = pzj.a(this);
        a.a("isLastCallback", Boolean.valueOf(this.a));
        a.a("query", this.b);
        a.a("widgetName", this.c);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, 4, this.c);
        qov.a(parcel, i);
    }
}
