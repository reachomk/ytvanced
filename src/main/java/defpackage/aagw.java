package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Collections;
import java.util.List;

/* renamed from: aagw */
public final class aagw implements afnt, Parcelable {
    public static final Creator CREATOR = new aagz();
    public static final aahb e = new aahb();
    public final int a;
    public final List b;
    public final List c;
    public final aahe d;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass().equals(obj.getClass())) {
            aagw aagw = (aagw) obj;
            if (amqq.a(Integer.valueOf(this.a), Integer.valueOf(aagw.a)) && amqq.a(this.c, aagw.c) && amqq.a(this.b, aagw.b) && amqq.a(this.d, aagw.d)) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeTypedList(this.b);
        parcel.writeTypedList(this.c);
        parcel.writeParcelable(this.d, 0);
    }

    public final /* synthetic */ afns c() {
        return new aahb(this);
    }

    public /* synthetic */ aagw(int i, List list, List list2, aahe aahe) {
        this.a = i;
        this.b = Collections.unmodifiableList((List) amqw.a((Object) list));
        this.c = Collections.unmodifiableList((List) amqw.a((Object) list2));
        this.d = aahe;
    }
}
