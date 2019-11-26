package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

/* renamed from: rrh */
public final class rrh extends qou {
    public static final Creator CREATOR = new rrg();
    public static final List a = Collections.emptyList();
    private final LocationRequest b;
    private final List c;
    private final String d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final String h;

    public rrh(LocationRequest locationRequest, List list, String str, boolean z, boolean z2, boolean z3, String str2) {
        this.b = locationRequest;
        this.c = list;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 1, this.b, i);
        qov.b(parcel, 5, this.c);
        qov.a(parcel, 6, this.d);
        qov.a(parcel, 7, this.e);
        qov.a(parcel, 8, this.f);
        qov.a(parcel, 9, this.g);
        qov.a(parcel, 10, this.h);
        qov.a(parcel, a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        if (this.d != null) {
            stringBuilder.append(" tag=");
            stringBuilder.append(this.d);
        }
        if (this.h != null) {
            stringBuilder.append(" moduleId=");
            stringBuilder.append(this.h);
        }
        stringBuilder.append(" hideAppOps=");
        stringBuilder.append(this.e);
        stringBuilder.append(" clients=");
        stringBuilder.append(this.c);
        stringBuilder.append(" forceCoarseLocation=");
        stringBuilder.append(this.f);
        if (this.g) {
            stringBuilder.append(" exemptFromBackgroundThrottle");
        }
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rrh) {
            rrh rrh = (rrh) obj;
            if (pzj.a(this.b, rrh.b) && pzj.a(this.c, rrh.c) && pzj.a(this.d, rrh.d) && this.e == rrh.e && this.f == rrh.f && this.g == rrh.g && pzj.a(this.h, rrh.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
