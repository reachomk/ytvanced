package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: wa */
public final class wa implements vy {
    private final IBinder a;

    public wa(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void a(float f) {
        throw null;
    }

    public final void a(int i) {
        throw null;
    }

    public final void a(int i, int i2) {
        throw null;
    }

    public final void a(long j) {
        throw null;
    }

    public final void a(Uri uri, Bundle bundle) {
        throw null;
    }

    public final void a(String str, Bundle bundle) {
        throw null;
    }

    public final void a(String str, Bundle bundle, xm xmVar) {
        throw null;
    }

    public final void a(ve veVar) {
        throw null;
    }

    public final void a(ve veVar, int i) {
        throw null;
    }

    public final void a(vo voVar) {
        throw null;
    }

    public final void a(vo voVar, Bundle bundle) {
        throw null;
    }

    public final void a(boolean z) {
        throw null;
    }

    public final boolean a() {
        throw null;
    }

    public final String b() {
        throw null;
    }

    public final void b(int i) {
        throw null;
    }

    public final void b(int i, int i2) {
        throw null;
    }

    public final void b(long j) {
        throw null;
    }

    public final void b(Uri uri, Bundle bundle) {
        throw null;
    }

    public final void b(String str, Bundle bundle) {
        throw null;
    }

    public final void b(ve veVar) {
        throw null;
    }

    public final String c() {
        throw null;
    }

    public final void c(int i) {
        throw null;
    }

    public final void c(String str, Bundle bundle) {
        throw null;
    }

    public final void d(String str, Bundle bundle) {
        throw null;
    }

    public final long e() {
        throw null;
    }

    public final void e(String str, Bundle bundle) {
        throw null;
    }

    public final xq f() {
        throw null;
    }

    public final List i() {
        throw null;
    }

    public final CharSequence j() {
        throw null;
    }

    public final Bundle k() {
        throw null;
    }

    public final int l() {
        throw null;
    }

    public final boolean m() {
        throw null;
    }

    public final int n() {
        throw null;
    }

    public final boolean o() {
        throw null;
    }

    public final int p() {
        throw null;
    }

    public final Bundle q() {
        throw null;
    }

    public final void r() {
        throw null;
    }

    public final void v() {
        throw null;
    }

    public final void w() {
        throw null;
    }

    public final void x() {
        throw null;
    }

    public final void y() {
        throw null;
    }

    public final void z() {
        throw null;
    }

    public final IBinder asBinder() {
        return this.a;
    }

    public final boolean a(KeyEvent keyEvent) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            boolean z = true;
            obtain.writeInt(1);
            keyEvent.writeToParcel(obtain, 0);
            this.a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() == 0) {
                z = false;
            }
            obtain2.recycle();
            obtain.recycle();
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void a(vx vxVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongBinder(vxVar != null ? vxVar.asBinder() : null);
            this.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void b(vx vxVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeStrongBinder(vxVar != null ? vxVar.asBinder() : null);
            this.a.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final PendingIntent d() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.a.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            PendingIntent pendingIntent = obtain2.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return pendingIntent;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final vj g() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.a.transact(27, obtain, obtain2, 0);
            obtain2.readException();
            vj vjVar = obtain2.readInt() != 0 ? (vj) vj.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return vjVar;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final xs h() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.a.transact(28, obtain, obtain2, 0);
            obtain2.readException();
            xs xsVar = obtain2.readInt() != 0 ? (xs) xs.CREATOR.createFromParcel(obtain2) : null;
            obtain2.recycle();
            obtain.recycle();
            return xsVar;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void s() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.a.transact(13, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void t() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.a.transact(18, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void u() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.a.transact(19, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
