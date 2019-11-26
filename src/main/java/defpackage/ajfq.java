package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: ajfq */
public final class ajfq implements Parcelable {
    public static final Creator CREATOR = new ajft();
    public final awcq a;
    public final aakm b;
    public final String c;
    public final int d;
    public final boolean e;

    public ajfq(awcq awcq, aakm aakm, String str, int i, boolean z) {
        this.a = (awcq) amqw.a((Object) awcq);
        this.b = (aakm) amqw.a((Object) aakm);
        this.c = (String) amqw.a((Object) str);
        this.d = i;
        this.e = z;
    }

    public final int describeContents() {
        return 0;
    }

    public ajfq(Parcel parcel) {
        awcq awcq;
        ClassLoader classLoader = getClass().getClassLoader();
        ajrb ajrb = (ajrb) parcel.readParcelable(ajrb.class.getClassLoader());
        if (ajrb == null) {
            awcq = null;
        } else {
            awcq = (awcq) ajrb.a(awcq.c);
        }
        this.a = awcq;
        this.b = (aakm) parcel.readParcelable(classLoader);
        this.c = parcel.readString();
        this.d = parcel.readInt();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.e = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new ajrb(this.a), 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }

    public final String toString() {
        String toHexString = Integer.toHexString(System.identityHashCode(this));
        String valueOf = String.valueOf(this.b.a());
        int a = this.b.a(5);
        String str = this.c;
        int i = this.d;
        boolean z = this.e;
        int length = String.valueOf(toHexString).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 110) + valueOf.length()) + String.valueOf(str).length());
        stringBuilder.append("AtrClient.AtrClientState{");
        stringBuilder.append(toHexString);
        stringBuilder.append(" baseAtrUri=");
        stringBuilder.append(valueOf);
        stringBuilder.append(" delaySeconds=");
        stringBuilder.append(a);
        stringBuilder.append(" cpn=");
        stringBuilder.append(str);
        stringBuilder.append(" length=");
        stringBuilder.append(i);
        stringBuilder.append(" atrPingRequested=");
        stringBuilder.append(z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
