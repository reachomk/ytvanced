package defpackage;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: anpx */
public final class anpx implements Parcelable {
    public static final Creator CREATOR = new anpz();
    private Messenger a;
    private anqh b;

    public anpx(IBinder iBinder) {
        if (VERSION.SDK_INT >= 21) {
            this.a = new Messenger(iBinder);
        } else {
            this.b = new anqk(iBinder);
        }
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
                return a().equals(((anpx) obj).a());
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
