package defpackage;

import android.media.MediaDescription;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vh */
final class vh implements Creator {
    vh() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ve[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        if (VERSION.SDK_INT < 21) {
            return new ve(parcel);
        }
        return ve.a(MediaDescription.CREATOR.createFromParcel(parcel));
    }
}
