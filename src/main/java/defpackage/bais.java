package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: bais */
public final class bais extends baho {
    public static final Creator CREATOR = new baiu();

    public bais(Parcel parcel) {
        super(parcel);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return obj instanceof bais ? Arrays.equals(((bais) obj).a, this.a) : false;
        } else {
            return true;
        }
    }
}
