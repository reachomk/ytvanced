package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bahu */
public final class bahu extends dhu implements bahv {
    bahu(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.common.api.IDaydreamManager");
    }

    public final boolean a(ComponentName componentName, baht baht) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) componentName);
        dhw.a(aK_, (IInterface) baht);
        Parcel a = a(1, aK_);
        boolean a2 = dhw.a(a);
        a.recycle();
        return a2;
    }

    public final boolean a(ComponentName componentName) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) componentName);
        Parcel a = a(2, aK_);
        boolean a2 = dhw.a(a);
        a.recycle();
        return a2;
    }

    public final int a(ComponentName componentName, bahr bahr) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) componentName);
        Parcel a = a(3, aK_);
        int readInt = a.readInt();
        if (a.readInt() != 0) {
            bahr.a(a);
        }
        a.recycle();
        return readInt;
    }

    public final void a(PendingIntent pendingIntent) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) pendingIntent);
        c(5, aK_);
    }

    public final void b() {
        c(6, aK_());
    }

    public final boolean a(PendingIntent pendingIntent, ComponentName componentName) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) pendingIntent);
        dhw.a(aK_, (Parcelable) componentName);
        Parcel a = a(7, aK_);
        boolean a2 = dhw.a(a);
        a.recycle();
        return a2;
    }

    public final boolean c() {
        Parcel a = a(8, aK_());
        boolean a2 = dhw.a(a);
        a.recycle();
        return a2;
    }

    public final boolean a(bahx bahx) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (IInterface) bahx);
        Parcel a = a(9, aK_);
        boolean a2 = dhw.a(a);
        a.recycle();
        return a2;
    }

    public final boolean b(PendingIntent pendingIntent) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) pendingIntent);
        Parcel a = a(10, aK_);
        boolean a2 = dhw.a(a);
        a.recycle();
        return a2;
    }

    public final int a(ComponentName componentName, int i, PendingIntent pendingIntent, bahr bahr) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) componentName);
        aK_.writeInt(i);
        dhw.a(aK_, (Parcelable) pendingIntent);
        Parcel a = a(13, aK_);
        i = a.readInt();
        if (a.readInt() != 0) {
            bahr.a(a);
        }
        a.recycle();
        return i;
    }

    public final void d() {
        c(14, aK_());
    }

    public final int a(Bundle bundle, bahr bahr) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) bundle);
        Parcel a = a(16, aK_);
        int readInt = a.readInt();
        if (a.readInt() != 0) {
            bahr.a(a);
        }
        a.recycle();
        return readInt;
    }

    public final boolean a(Bundle bundle) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) bundle);
        Parcel a = a(17, aK_);
        boolean a2 = dhw.a(a);
        a.recycle();
        return a2;
    }
}
