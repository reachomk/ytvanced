package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: zet */
public final class zet implements Parcelable {
    public static final Creator CREATOR = new zew();
    public final Spanned a;
    public final Spanned b;
    public final int c;
    public final Uri d;
    public final aygk e;
    public final Spanned f;
    private final Spanned g;

    public zet(Spanned spanned, Spanned spanned2, int i, Uri uri, aygk aygk, Spanned spanned3, Spanned spanned4) {
        amqw.a(i > 0);
        this.a = (Spanned) amqw.a((Object) spanned);
        this.b = (Spanned) amqw.a((Object) spanned2);
        this.c = i;
        this.d = (Uri) amqw.a((Object) uri);
        this.e = aygk;
        this.g = spanned3;
        this.f = spanned4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zet zet = (zet) obj;
            return TextUtils.equals(this.b, zet.b) && TextUtils.equals(this.a, zet.a) && this.c == zet.c && amqq.a(this.d, zet.d) && amqq.a(this.e, zet.e) && TextUtils.equals(this.g, zet.g) && TextUtils.equals(this.f, zet.f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e, this.g, this.f});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr;
        parcel.writeValue(this.a);
        parcel.writeValue(this.b);
        parcel.writeInt(this.c);
        parcel.writeValue(this.d);
        aygk aygk = this.e;
        if (aygk == null) {
            bArr = new byte[0];
        } else {
            bArr = aygk.toByteArray();
        }
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
        parcel.writeValue(this.g);
        parcel.writeValue(this.f);
    }

    /* synthetic */ zet(Parcel parcel) {
        this.a = (Spanned) amqw.a((Spanned) parcel.readValue(Spanned.class.getClassLoader()));
        this.b = (Spanned) amqw.a((Spanned) parcel.readValue(Spanned.class.getClassLoader()));
        this.c = parcel.readInt();
        this.d = (Uri) amqw.a((Uri) parcel.readValue(Uri.class.getClassLoader()));
        aygk aygk = null;
        try {
            int readInt = parcel.readInt();
            byte[] bArr = new byte[readInt];
            parcel.readByteArray(bArr);
            if (readInt > 0) {
                aygk = (aygk) anxl.parseFrom(aygk.f, bArr);
            }
            this.e = aygk;
        } catch (anyg e) {
            xtl.a("Cannot deserialize thumbnail details", e);
            this.e = null;
        } catch (Throwable th) {
            this.e = null;
            throw th;
        }
        this.g = (Spanned) parcel.readValue(Spanned.class.getClassLoader());
        this.f = (Spanned) parcel.readValue(Spanned.class.getClassLoader());
        amqw.a(this.c > 0);
    }
}
