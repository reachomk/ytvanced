package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: bail */
final class bail implements Creator {
    bail() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new baii[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        baig baii;
        synchronized (baii.m) {
            if (baii.l.isEmpty()) {
                baii = new baii();
            } else {
                baii = (baii) baii.l.remove();
            }
        }
        baii.a(parcel);
        return baii;
    }
}
