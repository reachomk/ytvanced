package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dhu;
import defpackage.dhw;
import defpackage.dhx;
import defpackage.nhm;

public interface IEmbedInteractionLoggingService extends IInterface {

    public abstract class Stub extends dhx implements IEmbedInteractionLoggingService {

        public class Proxy extends dhu implements IEmbedInteractionLoggingService {
            Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedInteractionLoggingService");
            }

            public final int a(int i) {
                Parcel aK_ = aK_();
                aK_.writeInt(i);
                Parcel a = a(1, aK_);
                int readInt = a.readInt();
                a.recycle();
                return readInt;
            }

            public final void b(int i) {
                Parcel aK_ = aK_();
                aK_.writeInt(i);
                b(2, aK_);
            }

            public final void c(int i) {
                Parcel aK_ = aK_();
                aK_.writeInt(i);
                b(3, aK_);
            }

            public final void a(int i, nhm nhm, boolean z) {
                Parcel aK_ = aK_();
                aK_.writeInt(i);
                dhw.a(aK_, (Parcelable) nhm);
                dhw.a(aK_, true);
                b(4, aK_);
            }

            public final void d(int i) {
                Parcel aK_ = aK_();
                aK_.writeInt(i);
                b(5, aK_);
            }

            public final void e(int i) {
                Parcel aK_ = aK_();
                aK_.writeInt(i);
                b(6, aK_);
            }
        }

        public Stub() {
            super("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedInteractionLoggingService");
        }

        /* Access modifiers changed, original: protected|final */
        public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            switch (i) {
                case 1:
                    i = a(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(i);
                    break;
                case 2:
                    b(parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 3:
                    c(parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 4:
                    a(parcel.readInt(), (nhm) dhw.a(parcel, nhm.CREATOR), dhw.a(parcel));
                    parcel2.writeNoException();
                    break;
                case 5:
                    d(parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 6:
                    e(parcel.readInt());
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
            return true;
        }
    }

    int a(int i);

    void a(int i, nhm nhm, boolean z);

    void b(int i);

    void c(int i);

    void d(int i);

    void e(int i);
}
