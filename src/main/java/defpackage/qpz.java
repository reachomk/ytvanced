package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: qpz */
public final class qpz implements Parcelable {
    public static final Creator CREATOR = new qqc();
    public final ParcelFileDescriptor a;
    public final Parcelable b;

    public final int describeContents() {
        int i = 0;
        int i2 = this.a != null ? 1 : 0;
        Parcelable parcelable = this.b;
        if (parcelable != null) {
            i = parcelable.describeContents();
        }
        return i2 | i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }

    /* synthetic */ qpz(ParcelFileDescriptor parcelFileDescriptor, Parcelable parcelable) {
        this.a = parcelFileDescriptor;
        this.b = parcelable;
    }
}
