package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: acsl */
public final class acsl implements Parcelable {
    public static final Creator CREATOR = new acsn();
    public int a;
    public int b;
    public int c;
    public boolean d;

    public final int describeContents() {
        return 0;
    }

    protected acsl(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readByte() != (byte) 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeByte(this.d);
    }
}
