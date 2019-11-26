package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: zui */
final class zui implements Creator {
    zui() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zuf[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        try {
            return new zuf((ajwf) aocf.mergeFrom(new ajwf(), bArr));
        } catch (aocg unused) {
            return null;
        }
    }
}
