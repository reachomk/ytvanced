package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.dhu;
import defpackage.dhw;
import defpackage.dhx;
import defpackage.myy;
import defpackage.mza;
import defpackage.mzd;
import defpackage.mze;
import defpackage.mzf;
import defpackage.mzg;
import defpackage.mzj;
import defpackage.mzk;
import defpackage.mzl;
import defpackage.mzm;
import defpackage.mzq;
import defpackage.mzs;
import defpackage.mzv;
import defpackage.mzw;
import defpackage.mzx;
import defpackage.mzy;
import defpackage.nab;
import defpackage.nac;
import defpackage.nad;
import defpackage.nae;
import defpackage.nah;
import defpackage.nai;
import defpackage.naj;
import defpackage.nak;
import defpackage.nan;
import defpackage.nao;
import defpackage.nap;
import defpackage.naq;
import defpackage.nat;
import defpackage.nav;

public interface IApiPlayerFactoryService extends IInterface {

    public abstract class Stub extends dhx implements IApiPlayerFactoryService {

        public class Proxy extends dhu implements IApiPlayerFactoryService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService");
            }

            public final IApiPlayerService a(mze mze, nab nab, nah nah, nai nai, mzd mzd, myy myy, nan nan, mzj mzj, nat nat, mzv mzv, nac nac, nao nao, mzw mzw, mzk mzk, mzq mzq, boolean z) {
                IApiPlayerService proxy;
                Parcel aK_ = aK_();
                mze mze2 = mze;
                dhw.a(aK_, (IInterface) mze);
                nab nab2 = nab;
                dhw.a(aK_, (IInterface) nab);
                nah nah2 = nah;
                dhw.a(aK_, (IInterface) nah);
                nai nai2 = nai;
                dhw.a(aK_, (IInterface) nai);
                mzd mzd2 = mzd;
                dhw.a(aK_, (IInterface) mzd);
                myy myy2 = myy;
                dhw.a(aK_, (IInterface) myy);
                nan nan2 = nan;
                dhw.a(aK_, (IInterface) nan);
                mzj mzj2 = mzj;
                dhw.a(aK_, (IInterface) mzj);
                nat nat2 = nat;
                dhw.a(aK_, (IInterface) nat);
                mzv mzv2 = mzv;
                dhw.a(aK_, (IInterface) mzv);
                dhw.a(aK_, (IInterface) nac);
                dhw.a(aK_, (IInterface) nao);
                dhw.a(aK_, (IInterface) mzw);
                dhw.a(aK_, (IInterface) mzk);
                dhw.a(aK_, (IInterface) mzq);
                dhw.a(aK_, z);
                aK_ = a(1, aK_);
                IBinder readStrongBinder = aK_.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService");
                    proxy = queryLocalInterface instanceof IApiPlayerService ? (IApiPlayerService) queryLocalInterface : new com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService.Stub.Proxy(readStrongBinder);
                } else {
                    proxy = null;
                }
                aK_.recycle();
                return proxy;
            }
        }

        public Stub() {
            super("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService");
        }

        /* Access modifiers changed, original: protected|final */
        public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return false;
            }
            IInterface queryLocalInterface;
            mze mzg;
            nab nad;
            nah naj;
            nai nak;
            mzd mzf;
            myy mza;
            nan nap;
            mzj mzl;
            nat nav;
            mzv mzx;
            nac nae;
            nao naq;
            mzw mzy;
            mzk mzm;
            IBinder readStrongBinder = parcel.readStrongBinder();
            mzq mzq = null;
            if (readStrongBinder != null) {
                queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IApiPlayerClient");
                mzg = queryLocalInterface instanceof mze ? (mze) queryLocalInterface : new mzg(readStrongBinder);
            } else {
                mzg = null;
            }
            readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IPlayerUiClient");
                nad = queryLocalInterface instanceof nab ? (nab) queryLocalInterface : new nad(readStrongBinder);
            } else {
                nad = null;
            }
            readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.jar.client.ISurfaceHolderClient");
                naj = queryLocalInterface instanceof nah ? (nah) queryLocalInterface : new naj(readStrongBinder);
            } else {
                naj = null;
            }
            readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.jar.client.ISurfaceTextureClient");
                nak = queryLocalInterface instanceof nai ? (nai) queryLocalInterface : new nak(readStrongBinder);
            } else {
                nak = null;
            }
            readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IApiMediaViewClient");
                mzf = queryLocalInterface instanceof mzd ? (mzd) queryLocalInterface : new mzf(readStrongBinder);
            } else {
                mzf = null;
            }
            readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IAdOverlayClient");
                mza = queryLocalInterface instanceof myy ? (myy) queryLocalInterface : new mza(readStrongBinder);
            } else {
                mza = null;
            }
            readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.jar.client.ISurveyOverlayClient");
                nap = queryLocalInterface instanceof nan ? (nan) queryLocalInterface : new nap(readStrongBinder);
            } else {
                nap = null;
            }
            readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IControlsOverlayClient");
                mzl = queryLocalInterface instanceof mzj ? (mzj) queryLocalInterface : new mzl(readStrongBinder);
            } else {
                mzl = null;
            }
            readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IUiElementRegistrarClient");
                nav = queryLocalInterface instanceof nat ? (nat) queryLocalInterface : new nav(readStrongBinder);
            } else {
                nav = null;
            }
            readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.jar.client.ILiveOverlayClient");
                mzx = queryLocalInterface instanceof mzv ? (mzv) queryLocalInterface : new mzx(readStrongBinder);
            } else {
                mzx = null;
            }
            readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.jar.client.ISubtitlesOverlayClient");
                nae = queryLocalInterface instanceof nac ? (nac) queryLocalInterface : new nae(readStrongBinder);
            } else {
                nae = null;
            }
            readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IThumbnailOverlayClient");
                naq = queryLocalInterface instanceof nao ? (nao) queryLocalInterface : new naq(readStrongBinder);
            } else {
                naq = null;
            }
            readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IPaidContentOverlayClient");
                mzy = queryLocalInterface instanceof mzw ? (mzw) queryLocalInterface : new mzy(readStrongBinder);
            } else {
                mzy = null;
            }
            readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IDataBusClient");
                mzm = queryLocalInterface instanceof mzk ? (mzk) queryLocalInterface : new mzm(readStrongBinder);
            } else {
                mzm = null;
            }
            readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IEmbedImageClientServiceClient");
                if (queryLocalInterface2 instanceof mzq) {
                    mzq = (mzq) queryLocalInterface2;
                } else {
                    mzq = new mzs(readStrongBinder);
                }
            }
            IInterface a = a(mzg, nad, naj, nak, mzf, mza, nap, mzl, nav, mzx, nae, naq, mzy, mzm, mzq, dhw.a(parcel));
            parcel2.writeNoException();
            dhw.a(parcel2, a);
            return true;
        }
    }

    IApiPlayerService a(mze mze, nab nab, nah nah, nai nai, mzd mzd, myy myy, nan nan, mzj mzj, nat nat, mzv mzv, nac nac, nao nao, mzw mzw, mzk mzk, mzq mzq, boolean z);
}
