package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Iterator;

/* renamed from: ujj */
public final class ujj implements Parcelable {
    public static final Creator CREATOR = new ujm();
    public final boolean a;
    public final long b;
    public final long c;
    public final long d;
    public String e;
    public long f;
    public long g;
    public int h;
    public long i = 0;
    public Uri j;
    public boolean k;
    public float l;
    public double m;
    public double n;
    public double o;
    public double p;

    public ujj(ukz ukz, long j, long j2, boolean z) {
        Iterator ule;
        uhy.a((Object) ukz);
        this.b = j;
        if (j2 > 0 && j2 < j) {
            StringBuilder stringBuilder = new StringBuilder(142);
            stringBuilder.append("Max video duration ");
            stringBuilder.append(j2);
            stringBuilder.append(" smaller than min video duration ");
            stringBuilder.append(j);
            stringBuilder.append(". Enforcing specified min video duration for both.");
            ujo.b(stringBuilder.toString());
            this.c = j;
        } else {
            this.c = Math.max(0, j2);
        }
        j = ukz.g;
        int[] iArr = ukz.i;
        if (iArr == null) {
            ule = new ule(ukz.h.length);
        } else {
            ule = new uiu(iArr);
        }
        if (ule.hasNext()) {
            long b = ukz.b(((Integer) ule.next()).intValue());
            long j3 = 0;
            while (ule.hasNext()) {
                long b2 = ukz.b(((Integer) ule.next()).intValue());
                j3 = Math.max(j3, b2 - b);
                b = b2;
            }
            j2 = Math.max(j3, j - b);
        } else {
            j2 = 0;
        }
        int i = 1;
        boolean z2 = j > this.b;
        if (z) {
            if (j2 > 6000000) {
                i = 0;
            }
            z2 &= i;
        }
        this.a = z2;
        this.d = j2;
        this.f = 0;
        j2 = this.c;
        if (j2 > 0) {
            j = Math.min(j, j2);
        }
        this.g = j;
        this.h = 0;
        this.e = null;
        this.i = 0;
        this.l = 0.3f;
        this.j = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeInt(this.h);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.j, i);
        parcel.writeLong(this.i);
        parcel.writeFloat(this.l);
        parcel.writeLong(this.d);
        parcel.writeByte(this.k);
        parcel.writeDouble(this.m);
        parcel.writeDouble(this.n);
        parcel.writeDouble(this.o);
        parcel.writeDouble(this.p);
    }

    /* synthetic */ ujj(Parcel parcel) {
        boolean z = true;
        this.a = parcel.readByte() != (byte) 0;
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        this.h = parcel.readInt();
        this.e = parcel.readString();
        this.j = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.i = parcel.readLong();
        this.l = parcel.readFloat();
        this.d = parcel.readLong();
        if (parcel.readByte() == (byte) 0) {
            z = false;
        }
        this.k = z;
        this.m = parcel.readDouble();
        this.n = parcel.readDouble();
        this.o = parcel.readDouble();
        this.p = parcel.readDouble();
    }
}
