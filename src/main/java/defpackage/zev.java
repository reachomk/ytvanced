package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: zev */
public abstract class zev implements Parcelable {
    public final CharSequence a;
    public final int b;

    public zev(CharSequence charSequence, int i) {
        this.b = i;
        this.a = (CharSequence) amqw.a((Object) charSequence);
    }

    public abstract List a(Context context);

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj instanceof zev) {
                zev zev = (zev) obj;
                if (TextUtils.equals(this.a, zev.a)) {
                    if (this.b == zev.b) {
                        return z;
                    }
                    return false;
                }
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.a});
    }

    public void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.a, parcel, 0);
        parcel.writeInt(this.b);
    }

    protected zev(Parcel parcel) {
        this.a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.b = parcel.readInt();
    }
}
