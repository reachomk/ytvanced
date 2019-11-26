package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: li */
public final class li extends aae {
    public static final Creator CREATOR = new lk();
    public CharSequence a;
    public boolean b;

    public li(Parcelable parcelable) {
        super(parcelable);
    }

    li(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.b = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.a, parcel, i);
        parcel.writeInt(this.b);
    }

    public final String toString() {
        String toHexString = Integer.toHexString(System.identityHashCode(this));
        String valueOf = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(toHexString).length() + 35) + valueOf.length());
        stringBuilder.append("TextInputLayout.SavedState{");
        stringBuilder.append(toHexString);
        stringBuilder.append(" error=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
