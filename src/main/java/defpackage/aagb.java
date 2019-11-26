package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aagb */
final class aagb implements Creator {
    aagb() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aafy[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return new aafy((ajrk) aamj.a(parcel, new ajrk()), parcel.readLong());
        } catch (aocg unused) {
            return null;
        }
    }
}
