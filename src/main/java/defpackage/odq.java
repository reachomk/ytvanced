package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* renamed from: odq */
public final class odq implements Parcelable, Comparator {
    public static final Creator CREATOR = new odt();
    public final String a;
    public final int b;
    private final ods[] c;
    private int d;

    public static odq a(odq odq, odq odq2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (odq != null) {
            str = odq.a;
            for (ods ods : odq.c) {
                if (ods.a()) {
                    arrayList.add(ods);
                }
            }
        } else {
            str = null;
        }
        if (odq2 != null) {
            if (str == null) {
                str = odq2.a;
            }
            int size = arrayList.size();
            for (ods ods2 : odq2.c) {
                if (ods2.a()) {
                    UUID uuid = ods2.a;
                    for (int i = 0; i < size; i++) {
                        if (((ods) arrayList.get(i)).a.equals(uuid)) {
                            break;
                        }
                    }
                    arrayList.add(ods2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new odq(str, arrayList);
    }

    public final int describeContents() {
        return 0;
    }

    public odq(List list) {
        this(null, false, (ods[]) list.toArray(new ods[0]));
    }

    private odq(String str, List list) {
        this(str, false, (ods[]) list.toArray(new ods[0]));
    }

    public odq(ods... odsArr) {
        this(null, true, odsArr);
    }

    private odq(String str, boolean z, ods... odsArr) {
        this.a = str;
        if (z) {
            odsArr = (ods[]) odsArr.clone();
        }
        this.c = odsArr;
        this.b = odsArr.length;
        Arrays.sort(this.c, this);
    }

    odq(Parcel parcel) {
        this.a = parcel.readString();
        this.c = (ods[]) ozp.a((ods[]) parcel.createTypedArray(ods.CREATOR));
        this.b = this.c.length;
    }

    public final ods a(int i) {
        return this.c[i];
    }

    public final odq a(String str) {
        return !ozp.a(this.a, (Object) str) ? new odq(str, false, this.c) : this;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        String str = this.a;
        i = ((str != null ? str.hashCode() : 0) * 31) + Arrays.hashCode(this.c);
        this.d = i;
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            odq odq = (odq) obj;
            return ozp.a(this.a, odq.a) && Arrays.equals(this.c, odq.c);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeTypedArray(this.c, 0);
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int compareTo;
        ods ods = (ods) obj;
        ods ods2 = (ods) obj2;
        if (!nyr.a.equals(ods.a)) {
            compareTo = ods.a.compareTo(ods2.a);
        } else if (nyr.a.equals(ods2.a)) {
            return 0;
        } else {
            compareTo = 1;
        }
        return compareTo;
    }
}
