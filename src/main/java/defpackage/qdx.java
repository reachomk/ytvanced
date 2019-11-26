package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.util.List;

/* renamed from: qdx */
public final class qdx extends qou {
    public static final Creator CREATOR = new qen();
    public String a;
    public Bundle b;
    public String c;
    public ApplicationErrorReport d;
    public String e;
    public BitmapTeleporter f;
    public String g;
    public List h;
    public boolean i;
    public qeb j;
    public qec k;
    public boolean l;
    public Bitmap m;
    public String n;
    public boolean o;
    public qdu p;

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, 5, this.c);
        qov.a(parcel, 6, this.d, i);
        qov.a(parcel, 7, this.e);
        qov.a(parcel, 8, this.f, i);
        qov.a(parcel, 9, this.g);
        qov.b(parcel, 10, this.h);
        qov.a(parcel, 11, this.i);
        qov.a(parcel, 12, this.j, i);
        qov.a(parcel, 13, this.k, i);
        qov.a(parcel, 14, this.l);
        qov.a(parcel, 15, this.m, i);
        qov.a(parcel, 16, this.n);
        qov.a(parcel, 17, this.o);
        qov.a(parcel, a);
    }

    qdx(String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, List list, boolean z, qeb qeb, qec qec, boolean z2, Bitmap bitmap, String str5, boolean z3) {
        this.p = null;
        this.a = str;
        this.b = bundle;
        this.c = str2;
        this.d = applicationErrorReport;
        this.e = str3;
        this.f = bitmapTeleporter;
        this.g = str4;
        this.h = list;
        this.i = z;
        this.j = qeb;
        this.k = qec;
        this.l = z2;
        this.m = bitmap;
        this.n = str5;
        this.o = z3;
    }

    private qdx(ApplicationErrorReport applicationErrorReport) {
        this(null, null, null, applicationErrorReport, null, null, null, null, true, null, null, false, null, null, false);
    }

    public static qdx a(List list) {
        qdx qdx = new qdx(null);
        qdx.h = null;
        return qdx;
    }

    public /* synthetic */ qdx(ApplicationErrorReport applicationErrorReport, byte b) {
        this(applicationErrorReport);
    }
}
