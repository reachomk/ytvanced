package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: baje */
public final class baje extends baih {
    public static final Creator CREATOR = new bajh();
    public int a = 0;

    public static int a() {
        return 20;
    }

    public final int describeContents() {
        return 0;
    }

    public baje(Parcel parcel) {
        a(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(20);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        if (parcel.dataPosition() - dataPosition != 20) {
            throw new IllegalStateException("Parcelable implemented incorrectly, getByteSize() must return the correct size for each ControllerEvent subclass.");
        }
    }

    public final void a(Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        int readInt = parcel.readInt();
        super.a(parcel);
        this.a = parcel.readInt();
        parcel.setDataPosition(dataPosition + readInt);
    }
}
