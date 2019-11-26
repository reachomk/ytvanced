package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: ahgc */
public final class ahgc implements Parcelable {
    public static final Creator CREATOR = new ahgb();
    public boolean a = true;

    ahgc() {
    }

    public final int describeContents() {
        return 0;
    }

    protected ahgc(Parcel parcel) {
        boolean z = true;
        if (parcel.readByte() == (byte) 0) {
            z = false;
        }
        this.a = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.a);
    }
}
