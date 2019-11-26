package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: siq */
final class siq implements Creator {
    private siq() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new sio[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new sio(parcel);
    }

    /* synthetic */ siq(byte b) {
    }
}
