package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: oma */
public final class oma extends omp {
    public static final Creator CREATOR = new omd();
    private final byte[] a;

    public oma(String str, byte[] bArr) {
        super(str);
        this.a = bArr;
    }

    oma(Parcel parcel) {
        super((String) ozp.a(parcel.readString()));
        this.a = (byte[]) ozp.a(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            oma oma = (oma) obj;
            return this.d.equals(oma.d) && Arrays.equals(this.a, oma.a);
        }
    }

    public final int hashCode() {
        return ((this.d.hashCode() + 527) * 31) + Arrays.hashCode(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeByteArray(this.a);
    }
}
