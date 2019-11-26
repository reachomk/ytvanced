package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pbb */
final class pbb implements Creator {
    pbb() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new paz[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new paz(parcel);
    }
}
