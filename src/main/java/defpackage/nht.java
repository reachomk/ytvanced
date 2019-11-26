package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: nht */
public final class nht implements Parcelable {
    public static final Creator CREATOR = new nhw();
    public static final nht a = new nht(null, null);
    private final CharSequence b;
    private final CharSequence c;

    private nht(CharSequence charSequence, CharSequence charSequence2) {
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
        if (obj instanceof nht) {
            nht nht = (nht) obj;
            if (TextUtils.equals(this.b, nht.b) && TextUtils.equals(this.c, nht.c)) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.b, parcel, i);
        TextUtils.writeToParcel(this.c, parcel, i);
    }

    /* synthetic */ nht(Parcel parcel) {
        this((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
    }
}
