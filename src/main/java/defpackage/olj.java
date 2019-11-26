package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.List;

/* renamed from: olj */
public final class olj implements Parcelable {
    public static final Creator CREATOR = new oli();
    public final oll[] a;

    public olj(oll... ollArr) {
        if (ollArr == null) {
            ollArr = new oll[0];
        }
        this.a = ollArr;
    }

    public final int describeContents() {
        return 0;
    }

    public olj(List list) {
        this.a = new oll[list.size()];
        list.toArray(this.a);
    }

    olj(Parcel parcel) {
        this.a = new oll[parcel.readInt()];
        int i = 0;
        while (true) {
            oll[] ollArr = this.a;
            if (i < ollArr.length) {
                ollArr[i] = (oll) parcel.readParcelable(oll.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public final int a() {
        return this.a.length;
    }

    public final oll a(int i) {
        return this.a[i];
    }

    public final olj a(oll... ollArr) {
        oll[] ollArr2 = this.a;
        int length = ollArr2.length;
        int length2 = ollArr.length;
        Object[] objArr = (oll[]) Arrays.copyOf(ollArr2, length + length2);
        System.arraycopy(ollArr, 0, objArr, this.a.length, length2);
        return new olj((oll[]) ozp.a(objArr));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((olj) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.length);
        for (Parcelable writeParcelable : this.a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
