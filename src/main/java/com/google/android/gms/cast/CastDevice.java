package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ppj;
import defpackage.pra;
import defpackage.qou;
import defpackage.qov;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CastDevice extends qou implements ReflectedParcelable {
    public static final Creator CREATOR = new pra();
    public String a;
    public InetAddress b;
    public String c;
    private String d;
    private String e;
    private String f;
    private int g;
    private List h;
    private int i;
    private int j;
    private String k;
    private String l;
    private int m;
    private String n;
    private byte[] o;
    private String p;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i, List list, int i2, int i3, String str6, String str7, int i4, String str8, byte[] bArr, String str9) {
        this.a = a(str);
        this.d = a(str2);
        if (!TextUtils.isEmpty(this.d)) {
            try {
                this.b = InetAddress.getByName(this.d);
            } catch (UnknownHostException e) {
                str2 = this.d;
                str = e.getMessage();
                String.valueOf(str2).length();
                String.valueOf(str).length();
            }
        }
        this.c = a(str3);
        this.e = a(str4);
        this.f = a(str5);
        this.g = i;
        if (list == null) {
            list = new ArrayList();
        }
        this.h = list;
        this.i = i2;
        this.j = i3;
        this.k = a(str6);
        this.l = str7;
        this.m = i4;
        this.n = str8;
        this.o = bArr;
        this.p = str9;
    }

    private static String a(String str) {
        return str == null ? "" : str;
    }

    public final boolean a(int i) {
        return (this.i & i) == i;
    }

    public final String toString() {
        return String.format("\"%s\" (%s)", new Object[]{this.c, this.a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, 3, this.d);
        qov.a(parcel, 4, this.c);
        qov.a(parcel, 5, this.e);
        qov.a(parcel, 6, this.f);
        qov.b(parcel, 7, this.g);
        qov.b(parcel, 8, Collections.unmodifiableList(this.h));
        qov.b(parcel, 9, this.i);
        qov.b(parcel, 10, this.j);
        qov.a(parcel, 11, this.k);
        qov.a(parcel, 12, this.l);
        qov.b(parcel, 13, this.m);
        qov.a(parcel, 14, this.n);
        qov.a(parcel, 15, this.o);
        qov.a(parcel, 16, this.p);
        qov.a(parcel, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CastDevice) {
            CastDevice castDevice = (CastDevice) obj;
            String str = this.a;
            if (str == null) {
                return castDevice.a == null;
            } else {
                if (ppj.a(str, castDevice.a) && ppj.a(this.b, castDevice.b) && ppj.a(this.e, castDevice.e) && ppj.a(this.c, castDevice.c) && ppj.a(this.f, castDevice.f) && this.g == castDevice.g && ppj.a(this.h, castDevice.h) && this.i == castDevice.i && this.j == castDevice.j && ppj.a(this.k, castDevice.k) && ppj.a(Integer.valueOf(this.m), Integer.valueOf(castDevice.m)) && ppj.a(this.n, castDevice.n) && ppj.a(this.l, castDevice.l) && ppj.a(this.f, castDevice.f) && this.g == castDevice.g) {
                    byte[] bArr = this.o;
                    return ((bArr == null && castDevice.o == null) || Arrays.equals(bArr, castDevice.o)) && ppj.a(this.p, castDevice.p);
                }
            }
        }
    }

    public final int hashCode() {
        String str = this.a;
        return str != null ? str.hashCode() : 0;
    }

    public static CastDevice a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(CastDevice.class.getClassLoader());
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }
}
