package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.pxr;
import defpackage.pzr;
import defpackage.qou;
import defpackage.qov;

public final class Scope extends qou implements ReflectedParcelable {
    public static final Creator CREATOR = new pxr();
    private final int a;
    private final String b;

    public Scope(int i, String str) {
        pzr.a(str, (Object) "scopeUri must not be null or empty");
        this.a = i;
        this.b = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj instanceof Scope ? this.b.equals(((Scope) obj).b) : false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 1, this.a);
        qov.a(parcel, 2, this.b);
        qov.a(parcel, i);
    }
}
