package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aahl */
final class aahl implements Creator {
    aahl() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aahi[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new aahi(parcel.readInt(), (Uri) parcel.readParcelable(Uri.class.getClassLoader()));
    }
}
