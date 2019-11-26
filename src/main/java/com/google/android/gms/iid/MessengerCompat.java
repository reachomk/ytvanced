package com.google.android.gms.iid;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.qib;
import defpackage.qie;
import defpackage.qii;

public class MessengerCompat implements ReflectedParcelable {
    public static final Creator CREATOR = new qii();
    private Messenger a;
    private qib b;

    public MessengerCompat(IBinder iBinder) {
        if (VERSION.SDK_INT < 21) {
            qib qib;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.iid.IMessengerCompat");
            if (queryLocalInterface instanceof qib) {
                qib = (qib) queryLocalInterface;
            } else {
                qib = new qie(iBinder);
            }
            this.b = qib;
            return;
        }
        this.a = new Messenger(iBinder);
    }

    public final int describeContents() {
        return 0;
    }

    public final void a(Message message) {
        Messenger messenger = this.a;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.b.a(message);
        }
    }

    private final IBinder a() {
        Messenger messenger = this.a;
        return messenger == null ? this.b.asBinder() : messenger.getBinder();
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            try {
                return a().equals(((MessengerCompat) obj).a());
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.a;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.b.asBinder());
        }
    }
}
