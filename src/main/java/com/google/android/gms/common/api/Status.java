package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.pta;
import defpackage.ptn;
import defpackage.pxq;
import defpackage.pzi;
import defpackage.pzj;
import defpackage.qou;
import defpackage.qov;
import java.util.Arrays;

public final class Status extends qou implements ReflectedParcelable, ptn {
    public static final Creator CREATOR = new pxq();
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    public final int f;
    public final String g;
    public final PendingIntent h;
    private final int i;

    public Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.i = i;
        this.f = i2;
        this.g = str;
        this.h = pendingIntent;
    }

    public final Status a() {
        return this;
    }

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    public final boolean b() {
        return this.f <= 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.i), Integer.valueOf(this.f), this.g, this.h});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            if (this.i == status.i && this.f == status.f && pzj.a(this.g, status.g) && pzj.a(this.h, status.h)) {
                return true;
            }
        }
        return false;
    }

    public final String c() {
        String str = this.g;
        return str == null ? pta.a(this.f) : str;
    }

    public final String toString() {
        pzi a = pzj.a(this);
        a.a("statusCode", c());
        a.a("resolution", this.h);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.b(parcel, 1, this.f);
        qov.a(parcel, 2, this.g);
        qov.a(parcel, 3, this.h, i);
        qov.b(parcel, 1000, this.i);
        qov.a(parcel, a);
    }

    static {
        Status status = new Status(17);
        status = new Status(18);
    }
}
