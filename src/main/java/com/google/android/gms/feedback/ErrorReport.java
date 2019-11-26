package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.app.ApplicationErrorReport.CrashInfo;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.qdx;
import defpackage.qdz;
import defpackage.qeb;
import defpackage.qec;
import defpackage.qef;
import defpackage.qou;
import defpackage.qov;
import java.io.File;
import java.util.List;

public class ErrorReport extends qou implements ReflectedParcelable {
    public static final Creator CREATOR = new qef();
    private int A;
    private String B;
    private String C;
    private String D;
    private Bundle E;
    private boolean F;
    private int G;
    private int H;
    private boolean I;
    private String J;
    private String K;
    private int L;
    private String M;
    private String N;
    private String O;
    private String P;
    private String Q;
    @Deprecated
    private String R;
    private String S;
    private BitmapTeleporter T;
    private String U;
    private qdz[] V;
    private String[] W;
    private boolean X;
    private qeb Y;
    private qec Z;
    public String a;
    @Deprecated
    private String aa;
    private boolean ab;
    private Bundle ac;
    private List ad;
    private boolean ae;
    private Bitmap af;
    private String ag;
    private ApplicationErrorReport b = new ApplicationErrorReport();
    private String c;
    private int d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private int l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String[] r;
    private String[] s;
    private String[] t;
    private String u;
    private String v;
    private byte[] w;
    private int x;
    private int y;
    private int z;

    public ErrorReport(ApplicationErrorReport applicationErrorReport, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, String str12, String str13, String[] strArr, String[] strArr2, String[] strArr3, String str14, String str15, byte[] bArr, int i3, int i4, int i5, int i6, String str16, String str17, String str18, Bundle bundle, boolean z, int i7, int i8, boolean z2, String str19, String str20, int i9, String str21, String str22, String str23, String str24, String str25, String str26, String str27, BitmapTeleporter bitmapTeleporter, String str28, qdz[] qdzArr, String[] strArr4, boolean z3, String str29, qeb qeb, qec qec, String str30, boolean z4, Bundle bundle2, List list, boolean z5, Bitmap bitmap, String str31) {
        this.b = applicationErrorReport;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = i2;
        this.m = str9;
        this.n = str10;
        this.o = str11;
        this.p = str12;
        this.q = str13;
        this.r = strArr;
        this.s = strArr2;
        this.t = strArr3;
        this.u = str14;
        this.v = str15;
        this.w = bArr;
        this.x = i3;
        this.y = i4;
        this.z = i5;
        this.A = i6;
        this.B = str16;
        this.C = str17;
        this.D = str18;
        this.E = bundle;
        this.F = z;
        this.G = i7;
        this.H = i8;
        this.I = z2;
        this.J = str19;
        this.K = str20;
        this.L = i9;
        this.M = str21;
        this.N = str22;
        this.O = str23;
        this.P = str24;
        this.Q = str25;
        this.R = str26;
        this.S = str27;
        this.T = bitmapTeleporter;
        this.U = str28;
        this.V = qdzArr;
        this.W = strArr4;
        this.X = z3;
        this.a = str29;
        this.Y = qeb;
        this.Z = qec;
        this.aa = str30;
        this.ab = z4;
        this.ac = bundle2;
        this.ad = list;
        this.ae = z5;
        this.af = bitmap;
        this.ag = str31;
    }

    public ErrorReport(qdx qdx, File file) {
        if (qdx != null) {
            Bundle bundle = qdx.b;
            if (bundle != null && bundle.size() > 0) {
                this.E = qdx.b;
            }
            if (!TextUtils.isEmpty(qdx.a)) {
                this.C = qdx.a;
            }
            if (!TextUtils.isEmpty(qdx.c)) {
                this.c = qdx.c;
            }
            ApplicationErrorReport applicationErrorReport = qdx.d;
            CrashInfo crashInfo = applicationErrorReport != null ? applicationErrorReport.crashInfo : null;
            if (crashInfo != null) {
                this.N = crashInfo.throwMethodName;
                this.L = crashInfo.throwLineNumber;
                this.M = crashInfo.throwClassName;
                this.O = crashInfo.stackTrace;
                this.J = crashInfo.exceptionClassName;
                this.P = crashInfo.exceptionMessage;
                this.K = crashInfo.throwFileName;
            }
            qeb qeb = qdx.j;
            if (qeb != null) {
                this.Y = qeb;
            }
            if (!TextUtils.isEmpty(qdx.e)) {
                this.Q = qdx.e;
            }
            if (!TextUtils.isEmpty(qdx.g)) {
                this.b.packageName = qdx.g;
            }
            if (!TextUtils.isEmpty(qdx.n)) {
                this.ag = qdx.n;
            }
            Bitmap bitmap = qdx.m;
            if (bitmap != null) {
                this.af = bitmap;
            }
            if (file != null) {
                BitmapTeleporter bitmapTeleporter = qdx.f;
                if (bitmapTeleporter != null) {
                    this.T = bitmapTeleporter;
                    this.T.a = file;
                }
                List<qdz> list = qdx.h;
                if (!(list == null || list.isEmpty())) {
                    for (qdz qdz : list) {
                        qdz.a = file;
                    }
                    this.V = (qdz[]) list.toArray(new qdz[qdx.h.size()]);
                }
            }
            qec qec = qdx.k;
            if (qec != null) {
                this.Z = qec;
            }
            this.X = qdx.i;
            this.ae = qdx.l;
            this.F = qdx.o;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 2, this.b, i);
        qov.a(parcel, 3, this.c);
        qov.b(parcel, 4, this.d);
        qov.a(parcel, 5, this.e);
        qov.a(parcel, 6, this.f);
        qov.a(parcel, 7, this.g);
        qov.a(parcel, 8, this.h);
        qov.a(parcel, 9, this.i);
        qov.a(parcel, 10, this.j);
        qov.a(parcel, 11, this.k);
        qov.b(parcel, 12, this.l);
        qov.a(parcel, 13, this.m);
        qov.a(parcel, 14, this.n);
        qov.a(parcel, 15, this.o);
        qov.a(parcel, 16, this.p);
        qov.a(parcel, 17, this.q);
        qov.a(parcel, 18, this.r);
        qov.a(parcel, 19, this.s);
        qov.a(parcel, 20, this.t);
        qov.a(parcel, 21, this.u);
        qov.a(parcel, 22, this.v);
        qov.a(parcel, 23, this.w);
        qov.b(parcel, 24, this.x);
        qov.b(parcel, 25, this.y);
        qov.b(parcel, 26, this.z);
        qov.b(parcel, 27, this.A);
        qov.a(parcel, 28, this.B);
        qov.a(parcel, 29, this.C);
        qov.a(parcel, 30, this.D);
        qov.a(parcel, 31, this.E);
        qov.a(parcel, 32, this.F);
        qov.b(parcel, 33, this.G);
        qov.b(parcel, 34, this.H);
        qov.a(parcel, 35, this.I);
        qov.a(parcel, 36, this.J);
        qov.a(parcel, 37, this.K);
        qov.b(parcel, 38, this.L);
        qov.a(parcel, 39, this.M);
        qov.a(parcel, 40, this.N);
        qov.a(parcel, 41, this.O);
        qov.a(parcel, 42, this.P);
        qov.a(parcel, 43, this.Q);
        qov.a(parcel, 44, this.R);
        qov.a(parcel, 45, this.S);
        qov.a(parcel, 46, this.T, i);
        qov.a(parcel, 47, this.U);
        qov.a(parcel, 48, this.V, i);
        qov.a(parcel, 49, this.W);
        qov.a(parcel, 50, this.X);
        qov.a(parcel, 51, this.a);
        qov.a(parcel, 52, this.Y, i);
        qov.a(parcel, 53, this.Z, i);
        qov.a(parcel, 54, this.aa);
        qov.a(parcel, 55, this.ab);
        qov.a(parcel, 56, this.ac);
        qov.b(parcel, 57, this.ad);
        qov.a(parcel, 58, this.ae);
        qov.a(parcel, 59, this.af, i);
        qov.a(parcel, 60, this.ag);
        qov.a(parcel, a);
    }
}
