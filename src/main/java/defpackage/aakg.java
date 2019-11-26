package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aakg */
final class aakg implements Creator {
    aakg() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aakh[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            return new aakh((atdx) anxl.parseFrom(atdx.p, bArr));
        } catch (anyg unused) {
            return new aakh();
        }
    }
}
