package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: sge */
public final class sge implements Parcelable {
    public static final sgg CREATOR = new sgg();
    public final String a;
    public final String b;
    public final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    protected sge(Parcel parcel) {
        this.a = parcel.readString();
        this.d = parcel.readString();
        this.b = parcel.readString();
        this.e = parcel.readString();
        this.c = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.d);
        parcel.writeString(this.b);
        parcel.writeString(this.e);
        parcel.writeString(this.c);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sge) {
            sge sge = (sge) obj;
            if (amqq.a(this.a, sge.a) && amqq.a(this.d, sge.d) && amqq.a(this.b, sge.b) && amqq.a(this.e, sge.e) && amqq.a(this.c, sge.c) && amqq.a(this.f, sge.f) && amqq.a(this.g, sge.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.d, this.b, this.e, this.c, this.f, this.g});
    }

    /* synthetic */ sge(String str, String str2, String str3, String str4) {
        this.a = str;
        this.d = null;
        this.b = str2;
        this.e = str3;
        this.c = str4;
        this.f = null;
        this.g = null;
    }
}
