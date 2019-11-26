package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.PriorityQueue;

/* renamed from: ajed */
public final class ajed implements Parcelable {
    public static final Creator CREATOR = new ajec();
    public final aakm[] a;
    public final aakf[] b;
    public final String c;

    public ajed(PriorityQueue priorityQueue, PriorityQueue priorityQueue2, String str) {
        this.a = (aakm[]) priorityQueue.toArray(new aakm[priorityQueue.size()]);
        this.b = (aakf[]) priorityQueue2.toArray(new aakf[priorityQueue2.size()]);
        this.c = str;
    }

    public final int describeContents() {
        return 0;
    }

    public ajed(Parcel parcel) {
        this.a = (aakm[]) parcel.createTypedArray(aakm.CREATOR);
        this.b = (aakf[]) parcel.createTypedArray(aakf.CREATOR);
        this.c = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.a, i);
        parcel.writeTypedArray(this.b, i);
        parcel.writeString(this.c);
    }
}
