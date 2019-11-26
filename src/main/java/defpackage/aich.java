package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: aich */
public final class aich implements Parcelable {
    public static final Creator CREATOR = new aick();
    public final aicj a;
    public final boolean b;

    public static aich a() {
        return new aich(aicj.NEW, false);
    }

    public final int describeContents() {
        return 0;
    }

    public static aich b() {
        return new aich(aicj.PLAYING, true);
    }

    public static aich c() {
        return new aich(aicj.PAUSED, true);
    }

    public static aich d() {
        return new aich(aicj.PAUSED, false);
    }

    public static aich e() {
        return new aich(aicj.RECOVERABLE_ERROR, false);
    }

    public static aich f() {
        return new aich(aicj.UNRECOVERABLE_ERROR, false);
    }

    public aich(aicj aicj, boolean z) {
        if (!(aicj == aicj.PLAYING || aicj == aicj.PAUSED)) {
            amqw.a(z ^ 1, (Object) "controls can be in the buffering state only if in PLAYING or PAUSED video state");
        }
        this.a = (aicj) amqw.a((Object) aicj);
        this.b = z;
    }

    public final boolean g() {
        return this.a == aicj.RECOVERABLE_ERROR || this.a == aicj.UNRECOVERABLE_ERROR;
    }

    public final boolean h() {
        return this.a == aicj.PLAYING || this.a == aicj.PAUSED || this.a == aicj.ENDED;
    }

    public final boolean i() {
        return h() && !this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aich) {
            aich aich = (aich) obj;
            return this.a == aich.a && this.b == aich.b;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    public final String toString() {
        amqo amqo = new amqo(aich.class.getSimpleName());
        amqo.a("videoState", this.a);
        amqo.a("isBuffering", this.b);
        return amqo.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.ordinal());
        parcel.writeByte(this.b);
    }

    /* synthetic */ aich(aicj aicj, boolean z, byte b) {
        this(aicj, z);
    }
}
