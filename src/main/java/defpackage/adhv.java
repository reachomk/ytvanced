package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: adhv */
final class adhv implements Creator {
    adhv() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new adhw[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        adhy b = adhw.a().a(parcel.readInt()).a((Uri) parcel.readParcelable(Uri.class.getClassLoader())).a(parcel.readString()).a((adjb) parcel.readSerializable()).a(parcel.readByte() == (byte) 1).b(parcel.readByte() == (byte) 1);
        if (parcel.readByte() == (byte) 1) {
            z = true;
        }
        return b.c(z).a(adhw.a(parcel)).a();
    }
}
