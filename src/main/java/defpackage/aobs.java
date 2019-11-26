package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.io.IOException;

/* renamed from: aobs */
public final class aobs implements aobu {
    public static final Creator CREATOR = new aobr();
    public volatile byte[] a;
    public volatile anze b;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            byte[] bArr = new byte[this.b.getSerializedSize()];
            try {
                this.b.writeTo(anwm.a(bArr));
                this.a = bArr;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        parcel.writeInt(this.a.length);
        parcel.writeByteArray(this.a);
    }

    /* synthetic */ aobs(byte[] bArr, anze anze) {
        boolean z = true;
        if (bArr == null && anze == null) {
            z = false;
        }
        amqw.a(z, (Object) "Must have a message or bytes");
        this.a = bArr;
        this.b = anze;
    }
}
