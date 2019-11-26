package com.google.android.gms.people.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.pzi;
import defpackage.pzj;
import defpackage.pzr;
import defpackage.qou;
import defpackage.qov;
import defpackage.ruq;
import java.util.Arrays;

public final class AvatarReference extends qou implements ReflectedParcelable {
    public static final Creator CREATOR = new ruq();
    private final int a;
    @Deprecated
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final Long g;
    private final Long h;

    public AvatarReference(int i, String str, String str2, String str3, String str4, String str5, Long l, Long l2) {
        pzr.a(i != 0);
        this.a = i;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.b = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        this.c = str2;
        if (TextUtils.isEmpty(str3)) {
            str3 = null;
        }
        this.d = str3;
        if (TextUtils.isEmpty(str4)) {
            str4 = null;
        }
        this.e = str4;
        if (TextUtils.isEmpty(str5)) {
            str5 = null;
        }
        this.f = str5;
        this.g = l;
        this.h = l2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 1, this.a);
        qov.a(parcel, 2, this.b);
        qov.a(parcel, 3, this.c);
        qov.a(parcel, 4, this.d);
        qov.a(parcel, 5, this.e);
        qov.a(parcel, 6, this.f);
        qov.a(parcel, 7, this.g);
        qov.a(parcel, 8, this.h);
        qov.a(parcel, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AvatarReference avatarReference = (AvatarReference) obj;
            return this.a == avatarReference.a && pzj.a(this.b, avatarReference.b) && pzj.a(this.c, avatarReference.c) && pzj.a(this.d, avatarReference.d) && pzj.a(this.e, avatarReference.e) && pzj.a(this.f, avatarReference.f) && pzj.a(this.g, avatarReference.g) && pzj.a(this.h, avatarReference.h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.e, this.f, this.g, this.h});
    }

    public final String toString() {
        pzi a = pzj.a(this);
        a.a("source", Integer.valueOf(this.a));
        a.a("location", this.b);
        a.a("url", this.c);
        a.a("email", this.d);
        a.a("account", this.e);
        a.a("focusId", this.f);
        a.a("contactId", this.g);
        a.a("rawContactId", this.h);
        return a.toString();
    }
}
