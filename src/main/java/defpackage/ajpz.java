package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: ajpz */
public final class ajpz implements Parcelable {
    public static final Creator CREATOR = new ajqc();
    public final ajqb a;
    public final ajqb b;
    public final aakj c;
    public final aiqq d;
    public final boolean e;
    public final aakj f;
    public final String g;
    public final long h;
    public final String i;
    public final float j;
    public final boolean k;

    public ajpz(ajqb ajqb, ajqb ajqb2, aakj aakj, aiqq aiqq, boolean z, aakj aakj2, String str, long j, String str2, float f, boolean z2) {
        this.a = (ajqb) amqw.a((Object) ajqb);
        this.b = ajqb2;
        this.c = aakj;
        this.d = aiqq;
        this.e = z;
        this.f = aakj2;
        this.g = str;
        this.h = j;
        this.i = str2;
        this.j = f;
        this.k = z2;
    }

    public final int describeContents() {
        return 0;
    }

    public ajpz(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = ajqb.a(parcel);
        this.b = parcel.readInt() != 0 ? ajqb.a(parcel) : null;
        this.c = (aakj) parcel.readParcelable(classLoader);
        this.d = (aiqq) parcel.readParcelable(classLoader);
        boolean z = true;
        this.e = parcel.readInt() != 0;
        this.f = (aakj) parcel.readParcelable(classLoader);
        this.g = parcel.readString();
        this.h = parcel.readLong();
        this.i = parcel.readString();
        this.j = parcel.readFloat();
        if (parcel.readInt() == 0) {
            z = false;
        }
        this.k = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.a.b(parcel);
        parcel.writeInt(this.b != null ? 1 : 0);
        ajqb ajqb = this.b;
        if (ajqb != null) {
            ajqb.b(parcel);
        }
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeInt(this.e);
        parcel.writeParcelable(this.f, 0);
        parcel.writeString(this.g);
        parcel.writeLong(this.h);
        parcel.writeString(this.i);
        parcel.writeFloat(this.j);
        parcel.writeInt(this.k);
    }

    public final String toString() {
        String toHexString = Integer.toHexString(System.identityHashCode(this));
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        boolean z = this.e;
        String valueOf5 = String.valueOf(this.f);
        String str = this.g;
        long j = this.h;
        String str2 = this.i;
        float f = this.j;
        boolean z2 = this.k;
        int length = String.valueOf(toHexString).length();
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        int length4 = valueOf3.length();
        int length5 = valueOf4.length();
        int length6 = valueOf5.length();
        StringBuilder stringBuilder = new StringBuilder((((((((length + 299) + length2) + length3) + length4) + length5) + length6) + String.valueOf(str).length()) + String.valueOf(str2).length());
        stringBuilder.append("DirectorSavedState{");
        stringBuilder.append(toHexString);
        stringBuilder.append(" contentVideoState=");
        stringBuilder.append(valueOf);
        stringBuilder.append(" interstitialVideoState=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(" playerResponse=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(" playbackStartDescriptor=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(" userInitiatedPlayback=");
        stringBuilder.append(z);
        stringBuilder.append(" interstitialPlayerResponse=");
        stringBuilder.append(valueOf5);
        stringBuilder.append(" interstitialCpn=");
        stringBuilder.append(str);
        stringBuilder.append(" adStartPositionMillis=");
        stringBuilder.append(j);
        stringBuilder.append(" videoCpn=");
        stringBuilder.append(str2);
        stringBuilder.append(" contentPlaybackRate=");
        stringBuilder.append(f);
        stringBuilder.append(" fatalPlaybackErrorOccurred=");
        stringBuilder.append(z2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ajpz) {
            ajpz ajpz = (ajpz) obj;
            return amqq.a(this.a, ajpz.a) && amqq.a(this.b, ajpz.b) && amqq.a(this.f, ajpz.f) && amqq.a(this.g, ajpz.g) && amqq.a(this.c, ajpz.c) && aiqx.a(this.d, ajpz.d) && this.e == ajpz.e && this.h == ajpz.h && TextUtils.equals(this.i, ajpz.i) && this.j == ajpz.j && this.k == ajpz.k;
        }
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() + 527) * 31;
        ajqb ajqb = this.b;
        int i = 0;
        hashCode = (hashCode + (ajqb != null ? ajqb.hashCode() : 0)) * 31;
        aakj aakj = this.c;
        hashCode = (hashCode + (aakj != null ? aakj.hashCode() : 0)) * 31;
        aiqq aiqq = this.d;
        hashCode = (((hashCode + (aiqq != null ? aiqq.hashCode() : 0)) * 31) + this.e) * 31;
        aakj = this.f;
        hashCode = (hashCode + (aakj != null ? aakj.hashCode() : 0)) * 31;
        String str = this.g;
        if (str != null) {
            i = str.hashCode();
        }
        long j = this.h;
        return ((((((((((hashCode + i) * 31) + ((int) (j >> 32))) * 31) + ((int) j)) * 31) + this.i.hashCode()) * 31) + Float.floatToIntBits(this.j)) * 31) + this.k;
    }
}
