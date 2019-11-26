package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: baho */
public class baho implements Parcelable {
    public byte[] a = null;

    /* Access modifiers changed, original: protected */
    public boolean a() {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public boolean b() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public baho(byte[] bArr) {
        this.a = bArr;
    }

    protected baho(Parcel parcel) {
        a(parcel);
    }

    public final void a(anze anze) {
        if (anze == null || anze.getSerializedSize() == 0) {
            this.a = null;
        } else {
            this.a = anze.toByteArray();
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (a()) {
            byte[] bArr = this.a;
            parcel.writeInt(bArr != null ? bArr.length : 0);
        }
        if (this.a == null && b()) {
            parcel.writeByteArray(new byte[0]);
        } else {
            parcel.writeByteArray(this.a);
        }
    }

    public final void a(Parcel parcel) {
        if (a()) {
            parcel.readInt();
        }
        this.a = parcel.createByteArray();
    }

    public String toString() {
        int c = c();
        StringBuilder stringBuilder = new StringBuilder(38);
        stringBuilder.append("ParcelableProtoLite[");
        stringBuilder.append(c);
        stringBuilder.append(" bytes]");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof baho)) {
                z = false;
            } else if (Arrays.equals(((baho) obj).a, this.a)) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final int c() {
        byte[] bArr = this.a;
        return bArr != null ? bArr.length : 0;
    }
}
