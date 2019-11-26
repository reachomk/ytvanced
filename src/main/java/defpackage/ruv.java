package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ruv */
public final class ruv extends qou implements rup {
    public static final Creator CREATOR = new rus();
    private final String a;
    private final List b;
    private final String c;
    private final Long d;
    private final Long e;
    private List f;

    public ruv(String str, List list, String str2, Long l, Long l2) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = l;
        this.e = l2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.b(parcel, 3, b());
        qov.a(parcel, 4, this.c);
        qov.a(parcel, 5, this.d);
        qov.a(parcel, 6, this.e);
        qov.a(parcel, i);
    }

    public final String a() {
        return this.a;
    }

    public final List b() {
        if (this.f == null) {
            List list = this.b;
            if (list != null) {
                this.f = new ArrayList(list.size());
                for (rut add : this.b) {
                    this.f.add(add);
                }
            }
        }
        return this.f;
    }

    public final String c() {
        return this.c;
    }

    public final Long d() {
        return this.d;
    }

    public final Long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rup)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        rup rup = (rup) obj;
        return pzj.a(this.a, rup.a()) && pzj.a(b(), rup.b()) && pzj.a(this.c, rup.c()) && pzj.a(this.d, rup.d()) && pzj.a(this.e, rup.e());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, b(), this.c, this.d, this.e});
    }
}
