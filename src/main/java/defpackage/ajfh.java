package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: ajfh */
public final class ajfh implements Parcelable {
    public static final Creator CREATOR = new ajfg();
    public final int[] A;
    public final int B;
    public final String C;
    private final long D;
    public final aakm a;
    public final aakm b;
    public final aakm c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final long k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final int t;
    public final int u;
    public final int v;
    public final long w;
    public final String x;
    public final float y;
    public final int z;

    ajfh(aakm aakm, aakm aakm2, aakm aakm3, long j, long j2, long j3, String str, String str2, String str3, int i, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i2, int i3, String str4, float f, int i4, int[] iArr, int i5, String str5, int i6, long j6) {
        this.a = aakm;
        this.b = aakm2;
        this.c = aakm3;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = i;
        this.k = j4;
        this.D = j5;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.p = z4;
        this.o = z5;
        this.q = z6;
        this.r = z7;
        this.s = z8;
        this.t = i2;
        this.u = i3;
        this.x = str4;
        this.y = f;
        this.z = i4;
        this.A = iArr;
        this.B = i5;
        this.C = str5 == null ? "" : str5;
        this.v = i6;
        this.w = j6;
    }

    public final int describeContents() {
        return 0;
    }

    ajfh(Parcel parcel) {
        ClassLoader classLoader = ajfh.class.getClassLoader();
        this.a = (aakm) parcel.readParcelable(classLoader);
        this.b = (aakm) parcel.readParcelable(classLoader);
        this.c = (aakm) parcel.readParcelable(classLoader);
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.j = parcel.readInt();
        this.k = parcel.readLong();
        this.D = parcel.readLong();
        boolean z = false;
        this.l = parcel.readInt() == 1;
        this.m = parcel.readInt() == 1;
        this.n = parcel.readInt() == 1;
        this.p = parcel.readInt() == 1;
        this.o = parcel.readInt() == 1;
        this.q = parcel.readInt() == 1;
        this.r = parcel.readInt() == 1;
        if (parcel.readInt() == 1) {
            z = true;
        }
        this.s = z;
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.x = parcel.readString();
        this.i = parcel.readString();
        this.z = parcel.readInt();
        this.A = parcel.createIntArray();
        this.B = parcel.readInt();
        this.C = parcel.readString();
        this.y = parcel.readFloat();
        this.v = parcel.readInt();
        this.w = parcel.readLong();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.j);
        parcel.writeLong(this.k);
        parcel.writeLong(this.D);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.p);
        parcel.writeInt(this.o);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeString(this.x);
        parcel.writeString(this.i);
        parcel.writeInt(this.z);
        parcel.writeIntArray(this.A);
        parcel.writeInt(this.B);
        parcel.writeString(this.C);
        parcel.writeFloat(this.y);
        parcel.writeInt(this.v);
        parcel.writeLong(this.w);
    }

    public final String toString() {
        String toHexString = Integer.toHexString(System.identityHashCode(this));
        String valueOf = String.valueOf(this.a.a());
        String valueOf2 = String.valueOf(this.b.a());
        String valueOf3 = String.valueOf(this.c.a());
        long j = this.d;
        long j2 = this.e;
        long j3 = this.f;
        String str = this.g;
        String str2 = this.h;
        int i = this.j;
        long j4 = this.k;
        boolean z = this.l;
        boolean z2 = this.m;
        boolean z3 = this.n;
        boolean z4 = this.p;
        boolean z5 = this.o;
        boolean z6 = this.q;
        int i2 = this.t;
        int i3 = this.u;
        String str3 = this.x;
        boolean z7 = z;
        float f = this.y;
        String str4 = this.C;
        if (str4 == null) {
            str4 = "NULL";
        }
        int length = String.valueOf(toHexString).length();
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        int length4 = valueOf3.length();
        int length5 = String.valueOf(str).length();
        int length6 = String.valueOf(str2).length();
        String str5 = str4;
        StringBuilder stringBuilder = new StringBuilder((((((((length + 512) + length2) + length3) + length4) + length5) + length6) + String.valueOf(str3).length()) + str4.length());
        stringBuilder.append("VideoStats2Client.VideoStats2ClientState{");
        stringBuilder.append(toHexString);
        stringBuilder.append(" basePlaybackUri=");
        stringBuilder.append(valueOf);
        stringBuilder.append(" baseDelayplayUri=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(" baseWatchtimeUri=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(" sessionStartTimestamp=");
        stringBuilder.append(j);
        stringBuilder.append(" currentPlaybackPosition=");
        stringBuilder.append(j2);
        stringBuilder.append(" lengthMillis=");
        stringBuilder.append(j3);
        stringBuilder.append(" videoId=");
        stringBuilder.append(str);
        stringBuilder.append(" cpn=");
        stringBuilder.append(str2);
        stringBuilder.append(" delay=");
        stringBuilder.append(i);
        stringBuilder.append(" watchTimeMillis=");
        stringBuilder.append(j4);
        stringBuilder.append(" autoplay=");
        stringBuilder.append(z7);
        stringBuilder.append(" scriptedPlayback=");
        stringBuilder.append(z2);
        stringBuilder.append(" delayedPingSent=");
        stringBuilder.append(z3);
        stringBuilder.append(" finalPingSent=");
        stringBuilder.append(z4);
        stringBuilder.append(" initialPingSent=");
        stringBuilder.append(z5);
        stringBuilder.append(" throttled=");
        stringBuilder.append(z6);
        stringBuilder.append(" videoItag=");
        stringBuilder.append(i2);
        stringBuilder.append(" audioItag=");
        stringBuilder.append(i3);
        stringBuilder.append(" subtitleTrackId=");
        stringBuilder.append(str3);
        stringBuilder.append(" playbackRate=");
        stringBuilder.append(f);
        stringBuilder.append(" referringAppName=");
        stringBuilder.append(str5);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
