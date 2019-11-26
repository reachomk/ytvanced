package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: nhr */
public final class nhr implements Parcelable {
    public static final Creator CREATOR = new nhu();
    public static final nhr a = new nhr(null, null);
    private final CharSequence b;
    private final CharSequence c;

    private nhr(CharSequence charSequence, CharSequence charSequence2) {
        this.b = charSequence;
        this.c = charSequence2;
    }

    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nhr) {
            nhr nhr = (nhr) obj;
            if (TextUtils.equals(this.b, nhr.b) && TextUtils.equals(this.c, nhr.c)) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.b, parcel, i);
        TextUtils.writeToParcel(this.c, parcel, i);
    }

    /* synthetic */ nhr(Parcel parcel) {
        this((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
    }
}
