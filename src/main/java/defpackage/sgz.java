package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Map;

/* renamed from: sgz */
public final class sgz implements Parcelable {
    public static final Creator CREATOR = new shb();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final sio e;
    public final String[] f;
    public final antp g;
    public final sgc h;
    public final String i;
    public final sfi j;
    public seo k;
    public final Map l;
    public final boolean m;
    public final amul n;

    public final PendingIntent a() {
        seo seo = this.k;
        return seo != null ? seo.a() : null;
    }

    public final int describeContents() {
        return 0;
    }

    public final sem b() {
        seo seo = this.k;
        return seo != null ? seo.e() : null;
    }

    public final boolean c() {
        seo seo = this.k;
        return seo != null && seo.f();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeStringArray(this.f);
        parcel.writeString(this.g.name());
        parcel.writeParcelable(this.h, i);
        parcel.writeParcelable(this.j, i);
        parcel.writeMap(this.l);
        parcel.writeParcelable(this.k, i);
        parcel.writeByte(this.m);
        parcel.writeStringList(this.n);
    }

    public /* synthetic */ sgz(String str, String str2, String str3, String str4, String str5, sio sio, String[] strArr, antp antp, sgc sgc, sfi sfi, Map map, seo seo, boolean z, amul amul) {
        this.a = str;
        this.b = str2;
        this.i = str3;
        this.c = str4;
        this.d = str5;
        this.e = sio;
        this.f = strArr;
        this.g = antp;
        this.h = sgc;
        this.j = sfi;
        this.l = map;
        this.k = seo;
        this.m = z;
        this.n = amul;
    }
}
