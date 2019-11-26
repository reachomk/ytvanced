package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: baih */
public abstract class baih implements Parcelable {
    public long d;
    public int e = 0;

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
    }

    public void a(Parcel parcel) {
        this.d = parcel.readLong();
        this.e = parcel.readInt();
    }
}
