package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: bajc */
public final class bajc extends baih {
    public static final Creator CREATOR = new bajf();
    public int a;
    public float b;
    public float c;
    private int f;

    public final int describeContents() {
        return 0;
    }

    public bajc(Parcel parcel) {
        a(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f);
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
    }

    public final void a(Parcel parcel) {
        super.a(parcel);
        this.f = parcel.readInt();
        this.a = parcel.readInt();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
    }
}
