package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: zen */
public final class zen implements Parcelable {
    public static final Creator CREATOR = new zeq();
    public CharSequence a;
    public List b;

    public zen(CharSequence charSequence, List list) {
        this.a = (CharSequence) amqw.a((Object) charSequence);
        this.b = (List) amqw.a((Object) list);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj instanceof zen) {
                zen zen = (zen) obj;
                if (this.a.equals(zen.a)) {
                    if (this.b.equals(zen.b)) {
                        return z;
                    }
                    return false;
                }
            }
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.a, parcel, 0);
        parcel.writeInt(this.b.size());
        for (aoym toByteArray : this.b) {
            byte[] toByteArray2 = toByteArray.toByteArray();
            parcel.writeInt(toByteArray2.length);
            parcel.writeByteArray(toByteArray2);
        }
    }

    /* synthetic */ zen(Parcel parcel) {
        this.a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.b = new ArrayList();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            aoyl aoyl = (aoyl) aoym.e.createBuilder();
            try {
                aoyl.mergeFrom(bArr, anxa.c());
                this.b.add((aoym) ((anxl) aoyl.build()));
            } catch (anyg e) {
                xtl.a("Cannot deserialize AudioTracksCategoryRenderer from stored proto byte[] in parcel. Safely ignoring.", e);
            }
        }
    }
}
