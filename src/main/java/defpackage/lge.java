package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: lge */
public final class lge extends fim implements Parcelable {
    public static final Creator CREATOR = new lgh();
    private final int d;

    public lge() {
        this((byte) 0);
    }

    public final int describeContents() {
        return 0;
    }

    private lge(byte b) {
        this.d = 10;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        aiqq aiqq = (aiqq) this.c;
        if (aiqq != null) {
            parcel.writeByte((byte) 1);
            parcel.writeParcelable(aiqq, i);
        } else {
            parcel.writeByte((byte) 0);
        }
        ArrayDeque arrayDeque = new ArrayDeque(this.a);
        while (arrayDeque.size() > this.d) {
            arrayDeque.pollLast();
        }
        lge.a(parcel, i, arrayDeque);
        arrayDeque = new ArrayDeque(this.b);
        while (arrayDeque.size() > this.d) {
            arrayDeque.pollLast();
        }
        lge.a(parcel, i, arrayDeque);
    }

    private static final Deque a(Parcel parcel) {
        int i = 0;
        int max = Math.max(parcel.readInt(), 0);
        ArrayDeque arrayDeque = new ArrayDeque(max);
        if (max != 0) {
            while (i < max) {
                arrayDeque.offerLast(lge.b(parcel));
                i++;
            }
        }
        return arrayDeque;
    }

    private static final aiqq b(Parcel parcel) {
        return (aiqq) parcel.readParcelable(aiqq.class.getClassLoader());
    }

    private static void a(Parcel parcel, int i, Deque deque) {
        ArrayDeque arrayDeque = new ArrayDeque(deque);
        int size = arrayDeque.size();
        parcel.writeInt(size);
        if (size != 0) {
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeParcelable((aiqq) arrayDeque.pollFirst(), i);
            }
        }
    }
}
