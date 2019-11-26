package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/* renamed from: acgv */
public final class acgv implements Parcelable, Serializable {
    public static final Creator CREATOR = new acgu();
    public String a;
    public String b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public transient asjd g;
    public transient asjf h;
    public awnx i = awnx.PRIVATE;
    public zrb j;
    public Date k;
    public transient arog l;

    public final int describeContents() {
        return 0;
    }

    acgv(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.d = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.e = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.f = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        ajrb ajrb = (ajrb) parcel.readParcelable(ajrb.class.getClassLoader());
        if (ajrb != null) {
            this.g = (asjd) ajrb.a(asjd.h);
        }
        ajrb = (ajrb) parcel.readParcelable(ajrb.class.getClassLoader());
        if (ajrb != null) {
            this.h = (asjf) ajrb.a(asjf.h);
        }
        this.i = awnx.a(parcel.readInt());
        if (this.i == null) {
            this.i = awnx.PRIVATE;
        }
        this.j = (zrb) parcel.readParcelable(zrb.class.getClassLoader());
        this.k = (Date) parcel.readSerializable();
        ajrb ajrb2 = (ajrb) parcel.readParcelable(ajrb.class.getClassLoader());
        if (ajrb2 != null) {
            this.l = (arog) ajrb2.a(arog.e);
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.g = (asjd) acei.a(objectInputStream, asjd.h, asjd.class);
        this.h = (asjf) acei.a(objectInputStream, asjf.h, asjf.class);
        this.l = (arog) acei.a(objectInputStream, arog.e, arog.class);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        acei.a(objectOutputStream, this.g);
        acei.a(objectOutputStream, this.h);
        acei.a(objectOutputStream, this.l);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeValue(this.c);
        parcel.writeValue(this.d);
        parcel.writeValue(this.e);
        parcel.writeValue(this.f);
        parcel.writeParcelable(new ajrb(this.g), 0);
        parcel.writeParcelable(new ajrb(this.h), 0);
        parcel.writeInt(this.i.d);
        parcel.writeParcelable(this.j, 0);
        parcel.writeSerializable(this.k);
        parcel.writeParcelable(new ajrb(this.l), 0);
    }

    public final boolean equals(Object obj) {
        throw new UnsupportedOperationException("Equals is not implemented for and should not be implemented for StreamMetadata!");
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("hashCode is not implemented for and should not be implemented for StreamMetadata");
    }
}
