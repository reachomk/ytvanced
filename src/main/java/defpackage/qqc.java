package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: qqc */
final class qqc implements Creator {
    qqc() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new qpz[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) parcel.readParcelable(ParcelFileDescriptor.class.getClassLoader());
        Parcelable readParcelable = parcel.readParcelable(getClass().getClassLoader());
        Object obj = null;
        Object obj2 = parcelFileDescriptor != null ? null : 1;
        if (readParcelable == null) {
            obj = 1;
        }
        return obj2 == obj ? new qpz(parcelFileDescriptor, readParcelable) : null;
    }
}
