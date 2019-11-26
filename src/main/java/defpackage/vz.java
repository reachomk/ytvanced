package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: vz */
final class vz implements vx {
    private final IBinder a;

    vz(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void a(int i) {
        throw null;
    }

    public final void a(Bundle bundle) {
        throw null;
    }

    public final void a(CharSequence charSequence) {
        throw null;
    }

    public final void a(String str, Bundle bundle) {
        throw null;
    }

    public final void a(List list) {
        throw null;
    }

    public final void a(boolean z) {
        throw null;
    }

    public final void b() {
        throw null;
    }

    public final void b(int i) {
        throw null;
    }

    public final void c() {
        throw null;
    }

    public final IBinder asBinder() {
        return this.a;
    }

    public final void a() {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            this.a.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void a(xs xsVar) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (xsVar != null) {
                obtain.writeInt(1);
                xsVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void a(vj vjVar) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (vjVar != null) {
                obtain.writeInt(1);
                vjVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(4, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final void a(xq xqVar) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            obtain.writeInt(1);
            xqVar.writeToParcel(obtain, 0);
            this.a.transact(8, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
