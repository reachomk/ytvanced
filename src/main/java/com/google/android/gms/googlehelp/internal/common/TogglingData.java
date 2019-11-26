package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.qgq;
import defpackage.qou;
import defpackage.qov;

public class TogglingData extends qou implements ReflectedParcelable {
    public static final Creator CREATOR = new qgq();
    public String a;
    private String b;
    private String c;

    public TogglingData(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.a = str3;
    }

    private TogglingData() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.b);
        qov.a(parcel, 3, this.c);
        qov.a(parcel, 4, this.a);
        qov.a(parcel, i);
    }
}
