package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import defpackage.qdu;
import defpackage.qeb;
import defpackage.qfu;
import defpackage.qhc;
import defpackage.qou;
import defpackage.qov;
import java.util.ArrayList;
import java.util.List;

public final class GoogleHelp extends qou implements ReflectedParcelable {
    public static final Creator CREATOR = new qhc();
    private qeb A;
    private List B;
    private int C;
    private PendingIntent D;
    private int E;
    private String F;
    private boolean G;
    public Account a;
    public Uri b;
    public boolean c;
    public ErrorReport d;
    public TogglingData e;
    public int f;
    public boolean g;
    public boolean h;
    public qfu i;
    public qdu j;
    private final int k;
    private String l;
    private Bundle m;
    private String n;
    private String o;
    private Bitmap p;
    private boolean q;
    private boolean r;
    private List s;
    @Deprecated
    private Bundle t;
    @Deprecated
    private Bitmap u;
    @Deprecated
    private byte[] v;
    @Deprecated
    private int w;
    @Deprecated
    private int x;
    private String y;
    private List z;

    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, qeb qeb, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6) {
        int i8 = i;
        this.d = new ErrorReport();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException("Help requires a non-empty appContext");
        }
        qeb qeb2;
        this.k = i8;
        this.f = i6;
        this.g = z4;
        this.h = z5;
        this.E = i7;
        this.F = str5;
        this.l = str;
        this.a = account;
        this.m = bundle;
        this.n = str2;
        this.o = str3;
        this.p = bitmap;
        this.q = z;
        this.r = z2;
        this.G = z6;
        this.s = list;
        this.D = pendingIntent;
        this.t = bundle2;
        this.u = bitmap2;
        this.v = bArr;
        this.w = i2;
        this.x = i3;
        this.y = str4;
        this.b = uri;
        this.z = list2;
        if (i8 < 4) {
            qeb2 = new qeb();
            qeb2.a = i4;
        } else {
            qeb2 = qeb == null ? new qeb() : qeb;
        }
        this.A = qeb2;
        this.B = list3;
        this.c = z3;
        this.d = errorReport;
        ErrorReport errorReport2 = this.d;
        if (errorReport2 != null) {
            errorReport2.a = "GoogleHelp";
        }
        this.e = togglingData;
        this.C = i5;
    }

    @Deprecated
    public GoogleHelp(String str) {
        String str2 = str;
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = arrayList2;
        arrayList2 = new ArrayList();
        ArrayList arrayList4 = arrayList2;
        arrayList2 = new ArrayList();
        ErrorReport errorReport = r1;
        ErrorReport errorReport2 = new ErrorReport();
        this(13, str2, null, null, null, null, null, true, true, arrayList, null, null, null, 0, 0, null, null, arrayList3, 0, null, arrayList4, false, errorReport, null, 0, null, -1, false, false, 200, null, false);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.b(parcel, 1, this.k);
        qov.a(parcel, 2, this.l);
        qov.a(parcel, 3, this.a, i);
        qov.a(parcel, 4, this.m);
        qov.a(parcel, 5, this.q);
        qov.a(parcel, 6, this.r);
        qov.a(parcel, 7, this.s);
        qov.a(parcel, 10, this.t);
        qov.a(parcel, 11, this.u, i);
        qov.a(parcel, 14, this.y);
        qov.a(parcel, 15, this.b, i);
        qov.b(parcel, 16, this.z);
        qov.b(parcel, 17, 0);
        qov.b(parcel, 18, this.B);
        qov.a(parcel, 19, this.v);
        qov.b(parcel, 20, this.w);
        qov.b(parcel, 21, this.x);
        qov.a(parcel, 22, this.c);
        qov.a(parcel, 23, this.d, i);
        qov.a(parcel, 25, this.A, i);
        qov.a(parcel, 28, this.n);
        qov.a(parcel, 31, this.e, i);
        qov.b(parcel, 32, this.C);
        qov.a(parcel, 33, this.D, i);
        qov.a(parcel, 34, this.o);
        qov.a(parcel, 35, this.p, i);
        qov.b(parcel, 36, this.f);
        qov.a(parcel, 37, this.g);
        qov.a(parcel, 38, this.h);
        qov.b(parcel, 39, this.E);
        qov.a(parcel, 40, this.F);
        qov.a(parcel, 41, this.G);
        qov.a(parcel, a);
    }
}
