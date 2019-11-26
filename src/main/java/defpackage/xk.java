package defpackage;

import android.media.session.MediaSession.QueueItem;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xk */
public final class xk implements Parcelable {
    public static final Creator CREATOR = new xn();
    private final ve a;
    private final long b;

    private xk(ve veVar, long j) {
        if (veVar == null) {
            throw new IllegalArgumentException("Description cannot be null");
        } else if (j != -1) {
            this.a = veVar;
            this.b = j;
        } else {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
    }

    public final int describeContents() {
        return 0;
    }

    xk(Parcel parcel) {
        this.a = (ve) ve.CREATOR.createFromParcel(parcel);
        this.b = parcel.readLong();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeLong(this.b);
    }

    public static List a(List list) {
        if (list == null || VERSION.SDK_INT < 21) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            Object next2;
            if (next2 != null && VERSION.SDK_INT >= 21) {
                QueueItem queueItem = (QueueItem) next2;
                next2 = new xk(ve.a(queueItem.getDescription()), queueItem.getQueueId());
            } else {
                next2 = null;
            }
            arrayList.add(next2);
        }
        return arrayList;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MediaSession.QueueItem {Description=");
        stringBuilder.append(this.a);
        stringBuilder.append(", Id=");
        stringBuilder.append(this.b);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
