package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import defpackage.dhu;
import defpackage.dhw;
import defpackage.dhx;
import java.util.List;

public interface IApiPlayerService extends IInterface {

    public abstract class Stub extends dhx implements IApiPlayerService {

        public class Proxy extends dhu implements IApiPlayerService {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService");
            }

            public final void a(String str, int i, int i2) {
                Parcel aK_ = aK_();
                aK_.writeString(str);
                aK_.writeInt(i);
                aK_.writeInt(i2);
                b(1, aK_);
            }

            public final void a(String str, boolean z, int i, boolean z2, int i2) {
                Parcel aK_ = aK_();
                aK_.writeString(str);
                dhw.a(aK_, z);
                aK_.writeInt(i);
                dhw.a(aK_, z2);
                aK_.writeInt(i2);
                b(2, aK_);
            }

            public final void a(String str, int i, int i2, int i3) {
                Parcel aK_ = aK_();
                aK_.writeString(str);
                aK_.writeInt(i);
                aK_.writeInt(i2);
                aK_.writeInt(i3);
                b(3, aK_);
            }

            public final void a(String str, int i, int i2, boolean z, int i3) {
                Parcel aK_ = aK_();
                aK_.writeString(str);
                aK_.writeInt(i);
                aK_.writeInt(i2);
                dhw.a(aK_, z);
                aK_.writeInt(i3);
                b(4, aK_);
            }

            public final void a(List list, int i, int i2, int i3) {
                Parcel aK_ = aK_();
                aK_.writeStringList(list);
                aK_.writeInt(i);
                aK_.writeInt(i2);
                aK_.writeInt(i3);
                b(5, aK_);
            }

            public final void a(List list, int i, int i2, boolean z, int i3) {
                Parcel aK_ = aK_();
                aK_.writeStringList(list);
                aK_.writeInt(i);
                aK_.writeInt(i2);
                dhw.a(aK_, z);
                aK_.writeInt(i3);
                b(6, aK_);
            }

            public final void c() {
                b(7, aK_());
            }

            public final void d() {
                b(8, aK_());
            }

            public final void e() {
                b(9, aK_());
            }

            public final void f() {
                b(10, aK_());
            }

            public final void g() {
                b(11, aK_());
            }

            public final boolean h() {
                Parcel a = a(12, aK_());
                boolean a2 = dhw.a(a);
                a.recycle();
                return a2;
            }

            public final void b(boolean z) {
                Parcel aK_ = aK_();
                dhw.a(aK_, z);
                b(13, aK_);
            }

            public final void i() {
                b(14, aK_());
            }

            public final void j() {
                b(15, aK_());
            }

            public final void a(int i) {
                Parcel aK_ = aK_();
                aK_.writeInt(i);
                b(16, aK_);
            }

            public final void b(int i) {
                Parcel aK_ = aK_();
                aK_.writeInt(i);
                b(17, aK_);
            }

            public final void c(boolean z) {
                Parcel aK_ = aK_();
                dhw.a(aK_, z);
                b(18, aK_);
            }

            public final void d(boolean z) {
                Parcel aK_ = aK_();
                dhw.a(aK_, z);
                b(19, aK_);
            }

            public final void k() {
                b(20, aK_());
            }

            public final void e(boolean z) {
                Parcel aK_ = aK_();
                dhw.a(aK_, z);
                b(21, aK_);
            }

            public final void l() {
                b(22, aK_());
            }

            public final void f(boolean z) {
                Parcel aK_ = aK_();
                dhw.a(aK_, z);
                b(23, aK_);
            }

            public final void a(int i, KeyEvent keyEvent) {
                Parcel aK_ = aK_();
                aK_.writeInt(i);
                dhw.a(aK_, (Parcelable) keyEvent);
                b(24, aK_);
            }

            public final void b(int i, KeyEvent keyEvent) {
                Parcel aK_ = aK_();
                aK_.writeInt(i);
                dhw.a(aK_, (Parcelable) keyEvent);
                b(25, aK_);
            }

            public final void m() {
                b(26, aK_());
            }

            public final byte[] n() {
                Parcel a = a(27, aK_());
                byte[] createByteArray = a.createByteArray();
                a.recycle();
                return createByteArray;
            }

            public final boolean a(byte[] bArr) {
                Parcel aK_ = aK_();
                aK_.writeByteArray(bArr);
                Parcel a = a(28, aK_);
                boolean a2 = dhw.a(a);
                a.recycle();
                return a2;
            }

            public final void p() {
                b(29, aK_());
            }

            public final void q() {
                b(30, aK_());
            }

            public final ISelectableItemRegistryService r() {
                ISelectableItemRegistryService proxy;
                Parcel a = a(31, aK_());
                IBinder readStrongBinder = a.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISelectableItemRegistryService");
                    proxy = queryLocalInterface instanceof ISelectableItemRegistryService ? (ISelectableItemRegistryService) queryLocalInterface : new com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISelectableItemRegistryService.Stub.Proxy(readStrongBinder);
                } else {
                    proxy = null;
                }
                a.recycle();
                return proxy;
            }

            public final byte[] o() {
                Parcel a = a(32, aK_());
                byte[] createByteArray = a.createByteArray();
                a.recycle();
                return createByteArray;
            }

            public final void b(byte[] bArr) {
                Parcel aK_ = aK_();
                aK_.writeByteArray(bArr);
                b(33, aK_);
            }

            public final IEmbedInteractionLoggingService s() {
                IEmbedInteractionLoggingService proxy;
                Parcel a = a(34, aK_());
                IBinder readStrongBinder = a.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedInteractionLoggingService");
                    proxy = queryLocalInterface instanceof IEmbedInteractionLoggingService ? (IEmbedInteractionLoggingService) queryLocalInterface : new com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedInteractionLoggingService.Stub.Proxy(readStrongBinder);
                } else {
                    proxy = null;
                }
                a.recycle();
                return proxy;
            }

            public final void a(String str) {
                Parcel aK_ = aK_();
                aK_.writeString(str);
                b(35, aK_);
            }

            public final void b() {
                b(36, aK_());
            }
        }

        public Stub() {
            super("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService");
        }

        /* Access modifiers changed, original: protected|final */
        public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean h;
            byte[] n;
            IInterface r;
            switch (i) {
                case 1:
                    a(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 2:
                    a(parcel.readString(), dhw.a(parcel), parcel.readInt(), dhw.a(parcel), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 3:
                    a(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 4:
                    a(parcel.readString(), parcel.readInt(), parcel.readInt(), dhw.a(parcel), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 5:
                    a((List) parcel.createStringArrayList(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 6:
                    a((List) parcel.createStringArrayList(), parcel.readInt(), parcel.readInt(), dhw.a(parcel), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 7:
                    c();
                    parcel2.writeNoException();
                    break;
                case 8:
                    d();
                    parcel2.writeNoException();
                    break;
                case 9:
                    e();
                    parcel2.writeNoException();
                    break;
                case 10:
                    f();
                    parcel2.writeNoException();
                    break;
                case 11:
                    g();
                    parcel2.writeNoException();
                    break;
                case 12:
                    h = h();
                    parcel2.writeNoException();
                    dhw.a(parcel2, h);
                    break;
                case 13:
                    b(dhw.a(parcel));
                    parcel2.writeNoException();
                    break;
                case 14:
                    i();
                    parcel2.writeNoException();
                    break;
                case 15:
                    j();
                    parcel2.writeNoException();
                    break;
                case 16:
                    a(parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 17:
                    b(parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 18:
                    c(dhw.a(parcel));
                    parcel2.writeNoException();
                    break;
                case 19:
                    d(dhw.a(parcel));
                    parcel2.writeNoException();
                    break;
                case 20:
                    k();
                    parcel2.writeNoException();
                    break;
                case 21:
                    e(dhw.a(parcel));
                    parcel2.writeNoException();
                    break;
                case 22:
                    l();
                    parcel2.writeNoException();
                    break;
                case 23:
                    f(dhw.a(parcel));
                    parcel2.writeNoException();
                    break;
                case 24:
                    a(parcel.readInt(), (KeyEvent) dhw.a(parcel, KeyEvent.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 25:
                    b(parcel.readInt(), (KeyEvent) dhw.a(parcel, KeyEvent.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 26:
                    m();
                    parcel2.writeNoException();
                    break;
                case 27:
                    n = n();
                    parcel2.writeNoException();
                    parcel2.writeByteArray(n);
                    break;
                case 28:
                    h = a(parcel.createByteArray());
                    parcel2.writeNoException();
                    dhw.a(parcel2, h);
                    break;
                case 29:
                    p();
                    parcel2.writeNoException();
                    break;
                case 30:
                    q();
                    parcel2.writeNoException();
                    break;
                case 31:
                    r = r();
                    parcel2.writeNoException();
                    dhw.a(parcel2, r);
                    break;
                case 32:
                    n = o();
                    parcel2.writeNoException();
                    parcel2.writeByteArray(n);
                    break;
                case 33:
                    b(parcel.createByteArray());
                    parcel2.writeNoException();
                    break;
                case 34:
                    r = s();
                    parcel2.writeNoException();
                    dhw.a(parcel2, r);
                    break;
                case 35:
                    a(parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 36:
                    b();
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
            return true;
        }
    }

    void a(int i);

    void a(int i, KeyEvent keyEvent);

    void a(String str);

    void a(String str, int i, int i2);

    void a(String str, int i, int i2, int i3);

    void a(String str, int i, int i2, boolean z, int i3);

    void a(String str, boolean z, int i, boolean z2, int i2);

    void a(List list, int i, int i2, int i3);

    void a(List list, int i, int i2, boolean z, int i3);

    boolean a(byte[] bArr);

    void b();

    void b(int i);

    void b(int i, KeyEvent keyEvent);

    void b(boolean z);

    void b(byte[] bArr);

    void c();

    void c(boolean z);

    void d();

    void d(boolean z);

    void e();

    void e(boolean z);

    void f();

    void f(boolean z);

    void g();

    boolean h();

    void i();

    void j();

    void k();

    void l();

    void m();

    byte[] n();

    byte[] o();

    void p();

    void q();

    ISelectableItemRegistryService r();

    IEmbedInteractionLoggingService s();
}
