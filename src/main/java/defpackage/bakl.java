package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.IOException;

/* renamed from: bakl */
public final class bakl implements Parcelable {
    public static final Creator CREATOR = new bakk();
    private final andw a;
    private final angf b;

    public bakl(andw andw, angf angf) {
        if (andw != null) {
            this.a = andw;
            this.b = angf;
            return;
        }
        throw new NullPointerException();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.c);
        angf angf = this.b;
        parcel.writeByteArray(angf != null ? aocf.toByteArray(angf) : null);
    }

    /* synthetic */ bakl(Parcel parcel) {
        andw a = andw.a(parcel.readInt());
        if (a == null) {
            a = andw.UNKNOWN_EVENT_TYPE;
        }
        this.a = a;
        angf angf = null;
        try {
            byte[] createByteArray = parcel.createByteArray();
            if (createByteArray != null) {
                angf = (angf) aocf.mergeFrom(new angf(), createByteArray);
            }
        } catch (IOException e) {
            String.valueOf(e).length();
        }
        this.b = angf;
    }
}
