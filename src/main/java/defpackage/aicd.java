package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: aicd */
public final class aicd implements Parcelable {
    public static final Creator CREATOR = new aicg();
    public static final aicd a;
    public static final aicd b;
    public static final aicd c;
    public static final aicd d;
    public static final aicd e;
    public static final aicd f;
    public static final aicd g;
    public static final aicd h;
    public static final aicd i;
    public static final aicd j;
    public static final aicd k;
    public static final aicd l;
    public static final aicd m;
    public final String n;
    public final boolean o;
    public final boolean p;
    public final int q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    protected aicd(Parcel parcel) {
        this.n = parcel.readString();
        boolean z = true;
        this.o = parcel.readByte() != (byte) 0;
        this.p = parcel.readByte() != (byte) 0;
        this.q = parcel.readInt();
        this.r = parcel.readByte() != (byte) 0;
        this.s = parcel.readByte() != (byte) 0;
        this.t = parcel.readByte() != (byte) 0;
        this.u = parcel.readByte() != (byte) 0;
        this.v = parcel.readByte() != (byte) 0;
        this.w = parcel.readByte() != (byte) 0;
        this.x = parcel.readByte() != (byte) 0;
        this.y = parcel.readByte() != (byte) 0;
        if (parcel.readByte() == (byte) 0) {
            z = false;
        }
        this.z = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.n;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.n);
        parcel.writeByte(this.o);
        parcel.writeByte(this.p);
        parcel.writeInt(this.q);
        parcel.writeByte(this.r);
        parcel.writeByte(this.s);
        parcel.writeByte(this.t);
        parcel.writeByte(this.u);
        parcel.writeByte(this.v);
        parcel.writeByte(this.w);
        parcel.writeByte(this.x);
        parcel.writeByte(this.y);
        parcel.writeByte(this.z);
    }

    public static boolean a(aicd aicd) {
        return amqq.a(aicd.n, k.n) || amqq.a(aicd.n, l.n) || amqq.a(aicd.n, g.n) || amqq.a(aicd.n, h.n);
    }

    public static boolean b(aicd aicd) {
        return amqq.a(aicd.n, f.n) || amqq.a(aicd.n, g.n) || amqq.a(aicd.n, e.n) || amqq.a(aicd.n, h.n);
    }

    public static boolean c(aicd aicd) {
        return amqq.a(aicd.n, i.n) || amqq.a(aicd.n, j.n);
    }

    static {
        aicf aicf = new aicf();
        aicf.a = "YOUTUBE";
        aicf.b = false;
        aicf.c = true;
        aicf.d = -65536;
        aicf.e = true;
        aicf.f = true;
        aicf.g = true;
        aicf.h = true;
        aicf.i = true;
        aicf.j = false;
        aicf.k = true;
        aicf.l = true;
        aicf.m = false;
        a = aicf.a();
        aicf = new aicf();
        aicf.a = "PREROLL";
        aicf.b = false;
        aicf.c = true;
        aicf.d = -14183450;
        aicf.e = true;
        aicf.f = false;
        aicf.g = true;
        aicf.h = true;
        aicf.i = false;
        aicf.j = false;
        aicf.k = true;
        aicf.l = true;
        aicf.m = false;
        b = aicf.a();
        aicf = new aicf();
        aicf.a = "POSTROLL";
        aicf.b = false;
        aicf.c = true;
        aicf.d = -14183450;
        aicf.e = true;
        aicf.f = false;
        aicf.g = true;
        aicf.h = true;
        aicf.i = true;
        aicf.j = false;
        aicf.k = true;
        aicf.l = true;
        aicf.m = false;
        c = aicf.a();
        aicf = new aicf();
        aicf.a = "TRAILER";
        aicf.b = false;
        aicf.c = true;
        aicf.d = -14183450;
        aicf.e = true;
        aicf.f = false;
        aicf.g = true;
        aicf.h = true;
        aicf.i = true;
        aicf.j = false;
        aicf.k = true;
        aicf.l = true;
        aicf.m = false;
        d = aicf.a();
        aicf = new aicf();
        aicf.a = "REMOTE_TRAILER";
        aicf.b = false;
        aicf.c = true;
        aicf.d = -14183450;
        aicf.e = false;
        aicf.f = false;
        aicf.g = true;
        aicf.h = true;
        aicf.i = true;
        aicf.j = false;
        aicf.k = true;
        aicf.l = true;
        aicf.m = false;
        e = aicf.a();
        aicf = new aicf();
        aicf.a = "REMOTE";
        aicf.b = false;
        aicf.c = true;
        aicf.d = -65536;
        aicf.e = false;
        aicf.f = false;
        aicf.g = true;
        aicf.h = true;
        aicf.i = true;
        aicf.j = false;
        aicf.k = true;
        aicf.l = true;
        aicf.m = false;
        f = aicf.a();
        aicf = new aicf();
        aicf.a = "REMOTE_LIVE";
        aicf.b = false;
        aicf.c = false;
        aicf.d = -65536;
        aicf.e = false;
        aicf.f = false;
        aicf.g = false;
        aicf.h = true;
        aicf.i = true;
        aicf.j = false;
        aicf.k = false;
        aicf.l = true;
        aicf.m = false;
        g = aicf.a();
        aicf = new aicf();
        aicf.a = "REMOTE_LIVE_DVR";
        aicf.b = false;
        aicf.c = true;
        aicf.d = -65536;
        aicf.e = false;
        aicf.f = false;
        aicf.g = true;
        aicf.h = true;
        aicf.i = true;
        aicf.j = false;
        aicf.k = true;
        aicf.l = true;
        aicf.m = true;
        h = aicf.a();
        aicf = new aicf();
        aicf.a = "AD";
        aicf.b = false;
        aicf.c = true;
        aicf.d = -1524949;
        aicf.e = false;
        aicf.f = false;
        aicf.g = false;
        aicf.h = true;
        aicf.i = false;
        aicf.j = true;
        aicf.k = false;
        aicf.l = false;
        aicf.m = false;
        i = aicf.a();
        aicf = new aicf();
        aicf.a = "AD_REMOTE";
        aicf.b = false;
        aicf.c = true;
        aicf.d = -1524949;
        aicf.e = false;
        aicf.f = false;
        aicf.g = false;
        aicf.h = true;
        aicf.i = false;
        aicf.j = true;
        aicf.k = false;
        aicf.l = false;
        aicf.m = false;
        j = aicf.a();
        aicf = new aicf();
        aicf.a = "LIVE";
        aicf.b = false;
        aicf.c = false;
        aicf.d = -65536;
        aicf.e = false;
        aicf.f = false;
        aicf.g = false;
        aicf.h = true;
        aicf.i = true;
        aicf.j = false;
        aicf.k = false;
        aicf.l = true;
        aicf.m = false;
        k = aicf.a();
        aicf = new aicf();
        aicf.a = "LIVE_DVR";
        aicf.b = false;
        aicf.c = true;
        aicf.d = -65536;
        aicf.e = false;
        aicf.f = false;
        aicf.g = true;
        aicf.h = true;
        aicf.i = true;
        aicf.j = false;
        aicf.k = true;
        aicf.l = true;
        aicf.m = true;
        l = aicf.a();
        aicf = new aicf();
        aicf.a = "HIDDEN";
        aicf.b = true;
        aicf.c = false;
        aicf.d = -65536;
        aicf.e = false;
        aicf.f = false;
        aicf.g = false;
        aicf.h = false;
        aicf.i = false;
        aicf.j = false;
        aicf.k = false;
        aicf.l = false;
        aicf.m = false;
        m = aicf.a();
    }
}
