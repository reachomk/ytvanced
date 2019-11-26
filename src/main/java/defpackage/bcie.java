package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.chromium.base.UnguessableToken;

/* renamed from: bcie */
public final class bcie implements Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new UnguessableToken[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        return (readLong == 0 || readLong2 == 0) ? null : new UnguessableToken(readLong, readLong2, null);
    }
}
