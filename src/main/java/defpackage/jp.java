package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: jp */
public final class jp extends aae {
    public static final Creator CREATOR = new js();
    public final aac a;

    public jp(Parcelable parcelable) {
        super(parcelable);
        this.a = new aac();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        i = this.a.b;
        parcel.writeInt(i);
        String[] strArr = new String[i];
        Bundle[] bundleArr = new Bundle[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = (String) this.a.b(i2);
            bundleArr[i2] = (Bundle) this.a.c(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public final String toString() {
        String toHexString = Integer.toHexString(System.identityHashCode(this));
        String valueOf = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(toHexString).length() + 30) + valueOf.length());
        stringBuilder.append("ExtendableSavedState{");
        stringBuilder.append(toHexString);
        stringBuilder.append(" states=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* synthetic */ jp(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.a = new aac(readInt);
        for (int i = 0; i < readInt; i++) {
            this.a.put(strArr[i], bundleArr[i]);
        }
    }
}
