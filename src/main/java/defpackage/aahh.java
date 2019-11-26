package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aahh */
final class aahh implements Creator {
    aahh() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aahe[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Uri uri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        String readString3 = parcel.readString();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        return new aahe(readString, readString2, uri, readString3, z, parcel.readFloat(), (Uri) parcel.readParcelable(Uri.class.getClassLoader()), parcel.readInt());
    }
}
