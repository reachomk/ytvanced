package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aiqt */
final class aiqt implements Creator {
    aiqt() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aiqq[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            nkm nkm = (nkm) anxl.parseFrom(nkm.x, parcel.createByteArray(), anxa.c());
            if (nkm == null) {
                return null;
            }
            aiqs a = aiqq.a();
            a.h = nkm;
            return a.b();
        } catch (anyg unused) {
            return null;
        }
    }
}
