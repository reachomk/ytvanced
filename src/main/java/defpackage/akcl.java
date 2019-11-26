package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

/* renamed from: akcl */
public final class akcl implements Parcelable {
    public static final Creator CREATOR = new akco();
    private aocf a;
    private byte[] b;

    public akcl(aocf aocf) {
        this.a = aocf;
    }

    public final int describeContents() {
        return 0;
    }

    public final aocf a(aocf aocf) {
        if (this.a == null) {
            byte[] bArr = this.b;
            if (bArr != null) {
                try {
                    this.a = aocf.mergeFrom(aocf, bArr);
                    this.b = null;
                } catch (aocg e) {
                    Log.e("MessageNano", "Failed to deserialize", e);
                }
            }
        }
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ParcelableMessageNano(");
        aocf aocf = this.a;
        if (aocf != null) {
            stringBuilder.append(aocf);
        } else {
            byte[] bArr = this.b;
            if (bArr != null) {
                int length = bArr.length;
                StringBuilder stringBuilder2 = new StringBuilder(17);
                stringBuilder2.append("byte[");
                stringBuilder2.append(length);
                stringBuilder2.append("]");
                stringBuilder.append(stringBuilder2.toString());
            } else {
                stringBuilder.append("null");
            }
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b == null) {
            aocf aocf = this.a;
            if (aocf != null) {
                this.b = aocf.toByteArray(aocf);
                this.a = null;
            }
        }
        parcel.writeByteArray(this.b);
    }
}
