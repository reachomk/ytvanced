package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aafy */
public final class aafy implements Parcelable {
    public static final Creator CREATOR = new aagb();
    public final ajrk a;
    private final long b;

    public aafy(ajrk ajrk, long j) {
        this.a = (ajrk) amqw.a((Object) ajrk);
        this.b = j;
    }

    public final int describeContents() {
        return 0;
    }

    public final byte[] a() {
        return (byte[]) this.a.c.clone();
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        ajxg[] ajxgArr = this.a.a;
        if (ajxgArr != null) {
            for (ajxg ajxg : ajxgArr) {
                aogi aogi = ajxg.b;
                if (aogi != null && aogi.c.size() != 0) {
                    return ajxg.b.c;
                }
            }
        }
        return arrayList;
    }

    public final boolean c() {
        return this.a.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        xup.a(parcel, this.a);
        parcel.writeLong(this.b);
    }
}
