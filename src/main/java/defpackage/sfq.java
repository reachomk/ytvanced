package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: sfq */
public final class sfq implements Parcelable {
    public static final Creator CREATOR = new sfp();
    public final ses a;
    public String b;
    public Throwable c;
    private final String d;
    private int e;

    private sfq(String str, ses ses, int i, String str2, Throwable th) {
        this.d = str;
        this.a = ses;
        this.e = i;
        this.b = str2;
        this.c = th;
    }

    public final int describeContents() {
        return 0;
    }

    public sfq(String str) {
        this(str, null, 0, null, null);
    }

    public sfq(int i, Throwable th) {
        this(null, null, i, th != null ? th.getMessage() : "", th);
    }

    public sfq(int i, String str, Throwable th) {
        this(null, null, i, str, th);
    }

    public sfq(sgz sgz) {
        this(null, ses.a(sgz), 0, null, null);
    }

    public sfq(ses ses) {
        this(null, ses, 0, null, null);
    }

    protected sfq(Parcel parcel) {
        this.d = parcel.readString();
        this.a = (ses) parcel.readParcelable(ses.class.getClassLoader());
        this.e = parcel.readInt();
        this.b = parcel.readString();
        this.c = (Throwable) parcel.readSerializable();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.e);
        parcel.writeString(this.b);
        parcel.writeSerializable(this.c);
    }

    public final boolean a() {
        return this.e != 0;
    }

    public final boolean b() {
        return this.a != null;
    }
}
