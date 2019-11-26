package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.design.bottomsheet.BottomSheetBehavior;

/* renamed from: fa */
public final class fa extends aae {
    public static final Creator CREATOR = new fd();
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public fa(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        boolean z = false;
        this.c = parcel.readInt() == 1;
        this.d = parcel.readInt() == 1;
        if (parcel.readInt() == 1) {
            z = true;
        }
        this.e = z;
    }

    public fa(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
        super(parcelable);
        this.a = bottomSheetBehavior.k;
        this.b = bottomSheetBehavior.b;
        this.c = bottomSheetBehavior.a;
        this.d = bottomSheetBehavior.i;
        this.e = bottomSheetBehavior.j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }
}
