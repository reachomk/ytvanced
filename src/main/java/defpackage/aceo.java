package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: aceo */
public final class aceo implements Parcelable, Serializable {
    public static final Creator CREATOR = new acer();
    public transient boolean a;
    public String b;
    public String c;
    public acgv d;
    public boolean e;
    public int f;
    public transient auyw g;
    public transient avbq h;
    public transient apxu i;
    public long j;
    public boolean k;
    public boolean l;
    public int m = -1;
    public int n;
    public int o;
    public String p;
    public String q;
    public String r;
    public int s = -1;
    public transient azaj t;
    private String u;
    private transient apxu v;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, 0);
        parcel.writeByte(this.e);
        parcel.writeString(this.u);
        parcel.writeInt(this.f);
        parcel.writeParcelable(new ajrb(this.v), 0);
        parcel.writeParcelable(new ajrb(this.g), 0);
        parcel.writeParcelable(new ajrb(this.h), 0);
        parcel.writeParcelable(new ajrb(this.i), 0);
        parcel.writeLong(this.j);
        parcel.writeByte(this.k);
        parcel.writeByte(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeInt(this.s);
        parcel.writeParcelable(new ajrb(this.t), 0);
    }

    aceo(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = (acgv) parcel.readParcelable(acgv.class.getClassLoader());
        boolean z = true;
        this.e = parcel.readByte() != (byte) 0;
        this.u = parcel.readString();
        this.f = parcel.readInt();
        ajrb ajrb = (ajrb) parcel.readParcelable(ajrb.class.getClassLoader());
        if (ajrb != null) {
            this.v = (apxu) ajrb.a(apxu.d);
        }
        ajrb = (ajrb) parcel.readParcelable(ajrb.class.getClassLoader());
        if (ajrb != null) {
            this.g = (auyw) ajrb.a(auyw.y);
        }
        ajrb = (ajrb) parcel.readParcelable(ajrb.class.getClassLoader());
        if (ajrb != null) {
            this.h = (avbq) ajrb.a(avbq.g);
        }
        ajrb = (ajrb) parcel.readParcelable(ajrb.class.getClassLoader());
        if (ajrb != null) {
            this.i = (apxu) ajrb.a(apxu.d);
        }
        this.j = parcel.readLong();
        this.k = parcel.readByte() != (byte) 0;
        if (parcel.readByte() == (byte) 0) {
            z = false;
        }
        this.l = z;
        this.m = parcel.readInt();
        this.n = parcel.readInt();
        this.o = parcel.readInt();
        this.p = parcel.readString();
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.s = parcel.readInt();
        ajrb ajrb2 = (ajrb) parcel.readParcelable(ajrb.class.getClassLoader());
        if (ajrb2 != null) {
            this.t = (azaj) ajrb2.a(azaj.h);
        }
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        acei.a(objectOutputStream, this.v);
        acei.a(objectOutputStream, this.g);
        acei.a(objectOutputStream, this.h);
        acei.a(objectOutputStream, this.i);
        acei.a(objectOutputStream, this.t);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.v = (apxu) acei.a(objectInputStream, apxu.d, apxu.class);
        this.g = (auyw) acei.a(objectInputStream, auyw.y, auyw.class);
        this.h = (avbq) acei.a(objectInputStream, avbq.g, avbq.class);
        this.i = (apxu) acei.a(objectInputStream, apxu.d, apxu.class);
        this.t = (azaj) acei.a(objectInputStream, azaj.h, azaj.class);
    }

    public static aceo a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str, 0)));
                Object readObject = objectInputStream.readObject();
                objectInputStream.close();
                return (aceo) readObject;
            } catch (Exception e) {
                xtl.b("Deserialization of live stream config data from Shared Preferences failed.", e);
            }
        }
        return null;
    }
}
