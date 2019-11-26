package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: dhw */
public final class dhw {
    public static final ClassLoader a = dhw.class.getClassLoader();

    private dhw() {
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(z);
    }

    public static CharSequence b(Parcel parcel) {
        return parcel.readInt() != 0 ? (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel) : null;
    }

    public static void a(Parcel parcel, CharSequence charSequence) {
        if (charSequence != null) {
            parcel.writeInt(1);
            TextUtils.writeToParcel(charSequence, parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public static Parcelable a(Parcel parcel, Creator creator) {
        return parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null;
    }

    public static void a(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public static void b(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
            return;
        }
        parcel.writeInt(0);
    }

    public static void a(Parcel parcel, IInterface iInterface) {
        if (iInterface != null) {
            parcel.writeStrongBinder(iInterface.asBinder());
        } else {
            parcel.writeStrongBinder(null);
        }
    }
}
