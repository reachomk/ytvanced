package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.dhu;
import defpackage.dhw;
import defpackage.dhx;
import defpackage.mzp;
import defpackage.mzr;

public interface IEmbedFragmentServiceFactoryService extends IInterface {

    public abstract class Stub extends dhx implements IEmbedFragmentServiceFactoryService {

        public class Proxy extends dhu implements IEmbedFragmentServiceFactoryService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService");
            }

            public final IEmbedFragmentService a(mzp mzp, int i) {
                IEmbedFragmentService proxy;
                Parcel aK_ = aK_();
                dhw.a(aK_, (IInterface) mzp);
                aK_.writeInt(i);
                Parcel a = a(1, aK_);
                IBinder readStrongBinder = a.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService");
                    proxy = queryLocalInterface instanceof IEmbedFragmentService ? (IEmbedFragmentService) queryLocalInterface : new com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService.Stub.Proxy(readStrongBinder);
                } else {
                    proxy = null;
                }
                a.recycle();
                return proxy;
            }
        }

        public Stub() {
            super("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService");
        }

        /* Access modifiers changed, original: protected|final */
        public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            mzp mzr;
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IEmbedFragmentClient");
                mzr = queryLocalInterface instanceof mzp ? (mzp) queryLocalInterface : new mzr(readStrongBinder);
            } else {
                mzr = null;
            }
            IInterface a = a(mzr, parcel.readInt());
            parcel2.writeNoException();
            dhw.a(parcel2, a);
            return true;
        }
    }

    IEmbedFragmentService a(mzp mzp, int i);
}
