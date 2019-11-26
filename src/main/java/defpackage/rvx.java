package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rvx */
public final class rvx extends qou {
    public static final Creator CREATOR = new rxh();
    private final byte[] a;

    public rvx(byte[] bArr) {
        this.a = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, i);
    }
}
