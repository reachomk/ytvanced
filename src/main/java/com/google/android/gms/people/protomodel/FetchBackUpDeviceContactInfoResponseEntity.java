package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import defpackage.pzj;
import defpackage.qou;
import defpackage.qov;
import defpackage.rup;
import defpackage.rur;
import defpackage.rva;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FetchBackUpDeviceContactInfoResponseEntity extends qou implements rur {
    public static final Creator CREATOR = new rva();
    private final List a;
    private List b;

    public FetchBackUpDeviceContactInfoResponseEntity(List list) {
        this.a = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 2, a());
        qov.a(parcel, i);
    }

    public final List a() {
        if (this.b == null) {
            List list = this.a;
            if (list != null) {
                this.b = new ArrayList(list.size());
                for (rup add : this.a) {
                    this.b.add(add);
                }
            }
        }
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rur)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return pzj.a(a(), ((rur) obj).a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a()});
    }
}
