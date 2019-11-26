package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aobr */
final class aobr implements Creator {
    aobr() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aobs[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        return new aobs(bArr, null);
    }
}
