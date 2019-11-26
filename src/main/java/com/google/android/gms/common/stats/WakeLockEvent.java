package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import defpackage.qav;
import defpackage.qov;
import java.util.List;

public final class WakeLockEvent extends StatsEvent {
    public static final Creator CREATOR = new qav();
    private final int a;
    private final long b;
    private int c;
    private final String d;
    private final String e;
    private final String f;
    private final int g;
    private final List h;
    private final String i;
    private final long j;
    private int k;
    private final String l;
    private final float m;
    private final long n;
    private long o;

    public WakeLockEvent(int i, long j, int i2, String str, int i3, List list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = str;
        this.e = str3;
        this.f = str5;
        this.g = i3;
        this.o = -1;
        this.h = list;
        this.i = str2;
        this.j = j2;
        this.k = i4;
        this.l = str4;
        this.m = f;
        this.n = j3;
    }

    public WakeLockEvent(long j, int i, String str, int i2, List list, String str2, long j2, int i3, String str3, String str4, float f, long j3) {
        this(2, j, i, str, i2, list, str2, j2, i3, null, str4, f, j3, null);
    }

    public final long a() {
        return this.b;
    }

    public final int b() {
        return this.c;
    }

    public final long c() {
        return this.o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 1, this.a);
        qov.a(parcel, 2, this.b);
        qov.a(parcel, 4, this.d);
        qov.b(parcel, 5, this.g);
        qov.a(parcel, 6, this.h);
        qov.a(parcel, 8, this.j);
        qov.a(parcel, 10, this.e);
        qov.b(parcel, 11, this.c);
        qov.a(parcel, 12, this.i);
        qov.a(parcel, 13, this.l);
        qov.b(parcel, 14, this.k);
        qov.a(parcel, 15, this.m);
        qov.a(parcel, 16, this.n);
        qov.a(parcel, 17, this.f);
        qov.a(parcel, i);
    }

    public final String d() {
        Object obj;
        String str = this.d;
        int i = this.g;
        List list = this.h;
        String str2 = "";
        if (list == null) {
            obj = str2;
        } else {
            obj = TextUtils.join(",", list);
        }
        int i2 = this.k;
        String str3 = this.e;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = this.l;
        if (str4 == null) {
            str4 = str2;
        }
        float f = this.m;
        String str5 = this.f;
        if (str5 != null) {
            str2 = str5;
        }
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(obj).length();
        int length3 = str3.length();
        StringBuilder stringBuilder = new StringBuilder(((((length + 45) + length2) + length3) + str4.length()) + str2.length());
        str5 = "\t";
        stringBuilder.append(str5);
        stringBuilder.append(str);
        stringBuilder.append(str5);
        stringBuilder.append(i);
        stringBuilder.append(str5);
        stringBuilder.append(obj);
        stringBuilder.append(str5);
        stringBuilder.append(i2);
        stringBuilder.append(str5);
        stringBuilder.append(str3);
        stringBuilder.append(str5);
        stringBuilder.append(str4);
        stringBuilder.append(str5);
        stringBuilder.append(f);
        stringBuilder.append(str5);
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }
}
