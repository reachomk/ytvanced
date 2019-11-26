package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;

/* renamed from: ajrb */
public final class ajrb implements Parcelable {
    public static final Creator CREATOR = new ajre();
    private anze a;
    private byte[] b;

    public ajrb(anze anze) {
        this.a = anze;
    }

    public final int describeContents() {
        return 0;
    }

    public final anze a(anze anze) {
        if (this.a == null && this.b != null) {
            try {
                this.a = anze.newBuilderForType().mergeFrom(this.b, anxa.c()).build();
                this.b = null;
            } catch (anyg e) {
                Log.e("MessageLite", "Failed to deserialize", e);
            }
        }
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ParcelableMessageLite(");
        anze anze = this.a;
        if (anze != null) {
            stringBuilder.append(anze);
        } else if (this.b != null) {
            stringBuilder.append("byte[");
            stringBuilder.append(this.b.length);
            stringBuilder.append("]");
        } else {
            stringBuilder.append("null");
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b == null) {
            anze anze = this.a;
            if (anze != null) {
                this.b = anze.toByteArray();
                this.a = null;
            }
        }
        parcel.writeByteArray(this.b);
    }
}
