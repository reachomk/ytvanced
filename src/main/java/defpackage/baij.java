package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: baij */
final class baij implements Creator {
    baij() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new baig[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        baig baig;
        synchronized (baig.b) {
            if (baig.a.isEmpty()) {
                baig = new baig();
            } else {
                baig = (baig) baig.a.remove();
            }
        }
        baig.a(parcel);
        return baig;
    }
}
