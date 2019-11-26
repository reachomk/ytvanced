package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aagu */
final class aagu implements Creator {
    aagu() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aagv[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        return new aagv(readInt, z, (Uri) parcel.readParcelable(Uri.class.getClassLoader()));
    }
}
