package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: amlo */
public final class amlo extends dhu implements amlm {
    amlo(IBinder iBinder) {
        super(iBinder, "com.google.android.youtube.player.internal.IJarEmbedFragmentClient");
    }

    public final void a(Bundle bundle) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) bundle);
        b(2, aK_);
    }

    public final void a() {
        b(3, aK_());
    }

    public final void a(int i, String str, long j) {
        Parcel aK_ = aK_();
        aK_.writeInt(i);
        aK_.writeString(str);
        aK_.writeLong(j);
        b(4, aK_);
    }

    public final void a(long j) {
        Parcel aK_ = aK_();
        aK_.writeLong(j);
        b(5, aK_);
    }

    public final void a(int i) {
        Parcel aK_ = aK_();
        aK_.writeInt(i);
        b(6, aK_);
    }

    public final void a(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(7, aK_);
    }

    public final String a(String str) {
        Parcel aK_ = aK_();
        aK_.writeString(str);
        Parcel a = a(8, aK_);
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
