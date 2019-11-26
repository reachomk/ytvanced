package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: omd */
final class omd implements Creator {
    omd() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new oma[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new oma(parcel);
    }
}
