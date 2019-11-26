package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: airk */
final class airk implements Creator {
    airk() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new airl[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            nkv nkv = (nkv) anxl.parseFrom(nkv.j, parcel.createByteArray());
            if (nkv != null) {
                return new airl((nky) ((anxo) nkv.toBuilder()));
            }
            return null;
        } catch (anyg unused) {
            return null;
        }
    }
}
