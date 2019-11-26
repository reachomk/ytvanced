package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.pix;
import defpackage.pzj;
import defpackage.pzr;
import defpackage.qou;
import defpackage.qov;
import java.util.Arrays;
import java.util.List;

public class TokenData extends qou implements ReflectedParcelable {
    public static final Creator CREATOR = new pix();
    public final String a;
    private final int b;
    private final Long c;
    private final boolean d;
    private final boolean e;
    private final List f;
    private final String g;

    public static TokenData a(Bundle bundle, String str) {
        Class cls = TokenData.class;
        bundle.setClassLoader(cls.getClassLoader());
        bundle = bundle.getBundle(str);
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(cls.getClassLoader());
        return (TokenData) bundle.getParcelable("TokenData");
    }

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List list, String str2) {
        this.b = i;
        this.a = pzr.a(str);
        this.c = l;
        this.d = z;
        this.e = z2;
        this.f = list;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TokenData) {
            TokenData tokenData = (TokenData) obj;
            if (TextUtils.equals(this.a, tokenData.a) && pzj.a(this.c, tokenData.c) && this.d == tokenData.d && this.e == tokenData.e && pzj.a(this.f, tokenData.f) && pzj.a(this.g, tokenData.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 1, this.b);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, 3, this.c);
        qov.a(parcel, 4, this.d);
        qov.a(parcel, 5, this.e);
        qov.a(parcel, 6, this.f);
        qov.a(parcel, 7, this.g);
        qov.a(parcel, i);
    }
}
