package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: ajcy */
public final class ajcy implements Parcelable {
    public static final Creator CREATOR = new ajdb();
    public final atdh a;
    public final byte[] b;
    public final String c;
    public final long d;
    public final int e;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new ajrb(this.a), 0);
        parcel.writeInt(this.b.length);
        parcel.writeByteArray(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
    }

    /* synthetic */ ajcy(atdh atdh, byte[] bArr, String str, long j, int i) {
        this.a = atdh;
        this.b = bArr;
        this.c = str;
        this.d = j;
        this.e = i;
    }

    /* synthetic */ ajcy(Parcel parcel) {
        this.a = (atdh) ((ajrb) parcel.readParcelable(ajrb.class.getClassLoader())).a(atdh.h);
        this.b = new byte[parcel.readInt()];
        parcel.readByteArray(this.b);
        this.c = parcel.readString();
        this.d = parcel.readLong();
        this.e = parcel.readInt();
    }
}
