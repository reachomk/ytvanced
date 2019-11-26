package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vsc */
final class vsc implements Creator {
    vsc() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new vsd[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        aafx aafx = (aafx) parcel.readParcelable(aafx.class.getClassLoader());
        int readInt = parcel.readInt();
        boolean z = parcel.readInt() == 1;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        return new vsd(aafx, readInt, z, readString, readString2, readString3, bArr);
    }
}
