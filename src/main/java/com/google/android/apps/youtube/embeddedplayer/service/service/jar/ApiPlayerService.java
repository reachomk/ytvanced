package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.IBinder.DeathRecipient;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.Surface;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerService.Stub;
import defpackage.afpc;
import defpackage.afpf;
import defpackage.amks;
import defpackage.amkt;
import defpackage.amky;
import defpackage.amkz;
import defpackage.amqw;
import defpackage.mlp;
import defpackage.mmk;
import defpackage.mmq;
import defpackage.mte;
import defpackage.myy;
import defpackage.mzd;
import defpackage.mze;
import defpackage.mzj;
import defpackage.mzk;
import defpackage.mzq;
import defpackage.mzv;
import defpackage.mzw;
import defpackage.nab;
import defpackage.nac;
import defpackage.nah;
import defpackage.nai;
import defpackage.nan;
import defpackage.nao;
import defpackage.nat;
import defpackage.nhv;
import defpackage.xci;
import defpackage.xpt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.DeflaterOutputStream;

public final class ApiPlayerService extends Stub implements amks, DeathRecipient {
    public final mmk a;
    private final Handler b;
    private final amkt c;
    private final ApiPlayerListener d;
    private final RemoteSurfaceHolder e;
    private final RemoteSurfaceTexture f;
    private final RemotePlayerUi g;
    private final RemoteAdOverlay h;
    private final RemoteSurveyOverlay i;
    private final RemoteControlsOverlay j;
    private final RemoteLiveOverlay k;
    private final RemoteSubtitlesOverlay l;
    private final RemoteThumbnailOverlay m;
    private final RemotePaidContentOverlay n;
    private final AbstractRemoteMediaView o;
    private final RemoteUiElementRegistrar p;
    private final RemoteDataBus q;
    private final EmbedImageClientService r;
    private final EmbedInteractionLoggingService s;
    private final SelectableItemRegistry t;
    private final ApiPlayerEmbedConfigProvider u;
    private mze v;

    final class ApiPlayerEmbedConfigProvider implements amky {
        public mze a;

        public ApiPlayerEmbedConfigProvider(mze mze) {
            this.a = mze;
        }

        public final String a(String str) {
            mze mze = this.a;
            if (mze == null) {
                return amky.b.a(str);
            }
            try {
                str = mze.b(str);
                return str;
            } catch (RemoteException unused) {
                return amky.b.a(str);
            }
        }
    }

    final class ApiPlayerListener implements mmq {
        public mze a;

        public ApiPlayerListener(mze mze) {
            this.a = mze;
        }

        public final void a() {
            mze mze = this.a;
            if (mze != null) {
                try {
                    mze.a();
                } catch (RemoteException unused) {
                }
            }
        }

        public final void b() {
            mze mze = this.a;
            if (mze != null) {
                try {
                    mze.b();
                } catch (RemoteException unused) {
                }
            }
        }

        public final void c() {
            mze mze = this.a;
            if (mze != null) {
                try {
                    mze.c();
                } catch (RemoteException unused) {
                }
            }
        }

        public final void d() {
            mze mze = this.a;
            if (mze != null) {
                try {
                    mze.d();
                } catch (RemoteException unused) {
                }
            }
        }

        public final void a(String str, String str2, long j, long j2, boolean z, boolean z2, int i) {
            mze mze = this.a;
            if (mze != null) {
                try {
                    mze.a(str, str2, j, j2, z, z2, i);
                } catch (RemoteException unused) {
                }
            }
        }

        public final void e() {
            mze mze = this.a;
            if (mze != null) {
                try {
                    mze.e();
                } catch (RemoteException unused) {
                }
            }
        }

        public final void f() {
            mze mze = this.a;
            if (mze != null) {
                try {
                    mze.f();
                } catch (RemoteException unused) {
                }
            }
        }

        public final void g() {
            mze mze = this.a;
            if (mze != null) {
                try {
                    mze.g();
                } catch (RemoteException unused) {
                }
            }
        }

        public final void a(amkz amkz) {
            mze mze = this.a;
            if (mze != null) {
                try {
                    mze.a(amkz.name());
                } catch (RemoteException unused) {
                }
            }
        }

        public final void a(long j, long j2) {
            mze mze = this.a;
            if (mze != null) {
                try {
                    mze.a(j, j2);
                } catch (RemoteException unused) {
                }
            }
        }

        public final void a(long j) {
            mze mze = this.a;
            if (mze != null) {
                try {
                    mze.a(j);
                } catch (RemoteException unused) {
                }
            }
        }

        public final void h() {
            mze mze = this.a;
            if (mze != null) {
                try {
                    mze.h();
                } catch (RemoteException unused) {
                }
            }
        }

        public final void b(long j, long j2) {
            mze mze = this.a;
            if (mze != null) {
                try {
                    mze.b(j, j2);
                } catch (RemoteException unused) {
                }
            }
        }

        public final void a(boolean z, long j) {
            mze mze = this.a;
            if (mze != null) {
                try {
                    mze.a(z, j);
                } catch (RemoteException unused) {
                }
            }
        }

        public final void b(long j) {
            mze mze = this.a;
            if (mze != null) {
                try {
                    mze.b(j);
                } catch (RemoteException unused) {
                }
            }
        }

        public final void a(boolean z) {
            mze mze = this.a;
            if (mze != null) {
                try {
                    mze.a(z);
                } catch (RemoteException unused) {
                }
            }
        }

        public final void i() {
            mze mze = this.a;
            if (mze != null) {
                try {
                    mze.i();
                } catch (RemoteException unused) {
                }
            }
        }

        public final void j() {
            mze mze = this.a;
            if (mze != null) {
                try {
                    mze.j();
                } catch (RemoteException unused) {
                }
            }
        }

        public final void k() {
            mze mze = this.a;
            if (mze != null) {
                try {
                    mze.k();
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public ApiPlayerService(Context context, Handler handler, amkt amkt, mlp mlp, mze mze, nab nab, nah nah, nai nai, mzd mzd, myy myy, nan nan, mzj mzj, nat nat, mzv mzv, nac nac, nao nao, mzw mzw, mzk mzk, mzq mzq, boolean z) {
        Object obj = handler;
        Object obj2 = amkt;
        Object obj3 = mlp;
        Object obj4 = mze;
        Object obj5 = nab;
        Object obj6 = nah;
        Object obj7 = nai;
        Object obj8 = mzd;
        Object obj9 = myy;
        Object obj10 = mzv;
        Object obj11 = nac;
        nao nao2 = nao;
        mzw mzw2 = mzw;
        amqw.a((Object) context, (Object) "context cannot be null");
        this.b = (Handler) amqw.a(obj, (Object) "uiHandler cannot be null");
        this.c = (amkt) amqw.a(obj2, (Object) "serviceDestroyedNotifier");
        amqw.a(obj3, (Object) "apiEnvironment cannot be null");
        this.v = (mze) amqw.a(obj4, (Object) "apiPlayerClient cannot be null");
        amqw.a(obj5, (Object) "playerUiClient cannot be null");
        if (z) {
            amqw.a(obj7, (Object) "surfaceTextureClient cannot be null");
        } else {
            amqw.a(obj6, (Object) "surfaceHolderClient cannot be null");
        }
        amqw.a(obj8, (Object) "mediaViewClient cannot be null");
        amqw.a(obj9, (Object) "adOverlayClient cannot be null");
        amqw.a((Object) mzj, (Object) "controlsOverlayClient cannot be null");
        amqw.a(obj10, (Object) "liveOverlayClient cannot be null");
        amqw.a(obj11, (Object) "subtitlesOverlayClient cannot be null");
        amqw.a((Object) nao2, (Object) "thumbnailOverlayClient cannot be null");
        amqw.a((Object) mzw2, (Object) "paidContentOverlayClient cannot be null");
        this.g = new RemotePlayerUi(obj, obj5);
        this.h = new RemoteAdOverlay(obj, obj9);
        this.i = new RemoteSurveyOverlay(obj, nan);
        xci oC = obj3.f.oC();
        RemoteControlsOverlay remoteControlsOverlay = r1;
        mzw mzw3 = mzw2;
        nao nao3 = nao2;
        RemoteControlsOverlay remoteControlsOverlay2 = new RemoteControlsOverlay(context, handler, oC, mzj, obj3.f.f());
        this.j = remoteControlsOverlay;
        this.k = new RemoteLiveOverlay(obj, obj10);
        this.l = new RemoteSubtitlesOverlay(obj11);
        this.m = new RemoteThumbnailOverlay(nao3);
        this.n = new RemotePaidContentOverlay(mzw3);
        if (z) {
            this.e = null;
            this.f = new RemoteSurfaceTexture(obj, obj7);
            this.o = new RemoteTextureMediaView(this.f, obj8);
        } else {
            this.f = null;
            this.e = new RemoteSurfaceHolder(obj, obj6);
            this.o = new RemoteSurfaceMediaView(this.e, obj8);
        }
        mze mze2 = mze;
        this.d = new ApiPlayerListener(mze2);
        nhv nhv = r1;
        nhv nhv2 = new nhv();
        this.p = new RemoteUiElementRegistrar(mte.a, obj, nhv2, nat);
        this.q = new RemoteDataBus(mzk);
        mlp mlp2 = mlp;
        this.r = new EmbedImageClientService(mzq, mlp2.f.i(), mlp.b());
        this.t = new SelectableItemRegistry();
        this.s = new EmbedInteractionLoggingService(mlp2.f.f());
        PrimitiveAdOverlayAdapter primitiveAdOverlayAdapter = r1;
        PrimitiveAdOverlayAdapter primitiveAdOverlayAdapter2 = new PrimitiveAdOverlayAdapter(this.h, obj, mlp.b());
        this.u = new ApiPlayerEmbedConfigProvider(mze2);
        ApiPlayerListener apiPlayerListener = this.d;
        RemotePlayerUi remotePlayerUi = this.g;
        AbstractRemoteMediaView abstractRemoteMediaView = this.o;
        RemoteSurveyOverlay remoteSurveyOverlay = this.i;
        RemoteControlsOverlay remoteControlsOverlay3 = this.j;
        RemoteControlsOverlay remoteControlsOverlay4 = remoteControlsOverlay3;
        Context context2 = context;
        mlp mlp3 = mlp;
        this.a = new mmk(context2, apiPlayerListener, mlp3, remotePlayerUi, abstractRemoteMediaView, primitiveAdOverlayAdapter, remoteSurveyOverlay, remoteControlsOverlay4, remoteControlsOverlay3, nhv, this.t, remoteControlsOverlay3, remoteControlsOverlay3, remoteControlsOverlay3, this.k, this.l, this.m, this.n, this.q, this.u);
        amkt.a(this);
        try {
            mze.asBinder().linkToDeath(this, 0);
        } catch (RemoteException unused) {
            binderDied();
        }
    }

    public final void a(boolean z) {
        this.a.d(z);
        this.q.a();
        this.r.a();
        this.c.b(this);
        this.p.a();
        mze mze = this.v;
        if (mze != null) {
            mze.asBinder().unlinkToDeath(this, 0);
            this.v = null;
        }
        this.d.a = null;
        this.u.a = null;
        RemoteSurfaceHolder remoteSurfaceHolder = this.e;
        if (remoteSurfaceHolder != null) {
            Surface surface = remoteSurfaceHolder.d;
            if (surface != null) {
                surface.release();
                remoteSurfaceHolder.d = null;
                remoteSurfaceHolder.a();
            }
            remoteSurfaceHolder.c = null;
        }
        this.g.a = null;
        this.j.a = null;
        this.h.a = null;
        this.i.a = null;
        this.k.a = null;
        this.l.a = null;
        this.m.a = null;
        this.n.a = null;
        AbstractRemoteMediaView abstractRemoteMediaView = this.o;
        abstractRemoteMediaView.m();
        abstractRemoteMediaView.a = null;
        System.gc();
    }

    public final void a() {
        a(true);
    }

    public final void binderDied() {
        b(true);
    }

    public final void a(String str, int i, int i2) {
        this.b.post(new ApiPlayerService$$Lambda$0(this, str, i, i2));
    }

    public final void a(String str) {
        this.b.post(new ApiPlayerService$$Lambda$1(this, str));
    }

    public final void b() {
        this.b.post(new ApiPlayerService$$Lambda$2(this));
    }

    public final void a(String str, boolean z, int i, boolean z2, int i2) {
        this.b.post(new ApiPlayerService$$Lambda$3(this, str, z, i, z2, i2));
    }

    public final void a(String str, int i, int i2, int i3) {
        this.b.post(new ApiPlayerService$$Lambda$4(this, str, i, i2, i3));
    }

    public final void a(String str, int i, int i2, boolean z, int i3) {
        this.b.post(new ApiPlayerService$$Lambda$5(this, str, i, i2, z, i3));
    }

    public final void a(List list, int i, int i2, int i3) {
        this.b.post(new ApiPlayerService$$Lambda$6(this, list, i, i2, i3));
    }

    public final void a(List list, int i, int i2, boolean z, int i3) {
        this.b.post(new ApiPlayerService$$Lambda$7(this, list, i, i2, z, i3));
    }

    public final void c() {
        this.b.post(new ApiPlayerService$$Lambda$8(this));
    }

    public final void d() {
        this.b.post(new ApiPlayerService$$Lambda$9(this));
    }

    public final void e() {
        this.b.post(new ApiPlayerService$$Lambda$10(this));
    }

    public final void f() {
        this.b.post(new ApiPlayerService$$Lambda$11(this));
    }

    public final void g() {
        ConditionVariable conditionVariable = new ConditionVariable();
        this.b.post(new ApiPlayerService$$Lambda$12(this, conditionVariable));
        conditionVariable.block();
    }

    public final boolean h() {
        ConditionVariable conditionVariable = new ConditionVariable();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        this.b.post(new ApiPlayerService$$Lambda$13(this, atomicBoolean, conditionVariable));
        conditionVariable.block();
        return atomicBoolean.get();
    }

    public final void b(boolean z) {
        this.b.post(new ApiPlayerService$$Lambda$14(this, z));
    }

    public final void i() {
        this.b.post(new ApiPlayerService$$Lambda$15(this));
    }

    public final void j() {
        this.b.post(new ApiPlayerService$$Lambda$16(this));
    }

    public final void a(int i) {
        this.b.post(new ApiPlayerService$$Lambda$17(this, i));
    }

    public final void b(int i) {
        this.b.post(new ApiPlayerService$$Lambda$18(this, i));
    }

    public final void c(boolean z) {
        this.b.post(new ApiPlayerService$$Lambda$19(this, z));
    }

    public final void d(boolean z) {
        this.b.post(new ApiPlayerService$$Lambda$20(this, z));
    }

    public final void k() {
        this.b.post(new ApiPlayerService$$Lambda$21(this));
    }

    public final void e(boolean z) {
        this.b.post(new ApiPlayerService$$Lambda$22(this, z));
    }

    public final void l() {
        this.b.post(new ApiPlayerService$$Lambda$23(this));
    }

    public final void f(boolean z) {
        this.b.post(new ApiPlayerService$$Lambda$24(this, z));
    }

    public final void a(int i, KeyEvent keyEvent) {
        this.b.post(new ApiPlayerService$$Lambda$25(this, i, keyEvent));
    }

    public final void b(int i, KeyEvent keyEvent) {
        this.b.post(new ApiPlayerService$$Lambda$26(this, i, keyEvent));
    }

    public final void m() {
        xpt xpt = this.a.H;
        if (xpt != null) {
            xpt.a();
        }
    }

    public final byte[] n() {
        AtomicReference atomicReference = new AtomicReference();
        ConditionVariable conditionVariable = new ConditionVariable();
        this.b.post(new ApiPlayerService$$Lambda$27(this, atomicReference, conditionVariable));
        conditionVariable.block();
        Parcel obtain = Parcel.obtain();
        obtain.writeInt(1);
        obtain.writeParcelable((Parcelable) atomicReference.get(), 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        int length = marshall.length;
        if (length > 419430) {
            afpf afpf = afpf.embeddedplayer;
            StringBuilder stringBuilder = new StringBuilder(34);
            stringBuilder.append("Saved state excessive: ");
            stringBuilder.append(length);
            afpc.a(1, afpf, stringBuilder.toString());
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(18);
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream);
        try {
            deflaterOutputStream.write(marshall);
            deflaterOutputStream.flush();
            deflaterOutputStream.close();
        } catch (IOException unused) {
            afpc.a(2, afpf.embeddedplayer, "Problem during compression.");
        }
        marshall = byteArrayOutputStream.toByteArray();
        if (marshall.length >= 419430) {
            afpc.a(2, afpf.embeddedplayer, "Compression above threshold.");
        }
        return marshall;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0070 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:15:?, code skipped:
            defpackage.afpc.a(2, defpackage.afpf.embeddedplayer, "Cannot read state.");
     */
    /* JADX WARNING: Missing block: B:16:0x007a, code skipped:
            return false;
     */
    /* JADX WARNING: Missing block: B:17:0x007b, code skipped:
            r0.recycle();
     */
    public final boolean a(byte[] r7) {
        /*
        r6 = this;
        r0 = new java.util.zip.Inflater;
        r0.<init>();
        r0.setInput(r7);
        r1 = new java.io.ByteArrayOutputStream;
        r2 = 18;
        r1.<init>(r2);
        r2 = new java.util.zip.InflaterOutputStream;
        r2.<init>(r1);
        r3 = 2;
        r4 = 0;
        r5 = r7.length;	 Catch:{ IOException -> 0x0021 }
        r2.write(r7, r4, r5);	 Catch:{ IOException -> 0x0021 }
        r2.flush();	 Catch:{ IOException -> 0x0021 }
        r2.close();	 Catch:{ IOException -> 0x0021 }
        goto L_0x0028;
    L_0x0021:
        r7 = defpackage.afpf.embeddedplayer;
        r2 = "IOException when decompressing.";
        defpackage.afpc.a(r3, r7, r2);
    L_0x0028:
        r7 = r1.toByteArray();
        r0.end();
        r0 = android.os.Parcel.obtain();
        r1 = r7.length;
        r0.unmarshall(r7, r4, r1);
        r0.setDataPosition(r4);
        r7 = r0.readInt();
        r1 = 1;
        if (r7 == r1) goto L_0x004c;
    L_0x0041:
        r0.recycle();
        r7 = defpackage.afpf.embeddedplayer;
        r0 = "Incorrect state format.";
        defpackage.afpc.a(r3, r7, r0);
        return r4;
    L_0x004c:
        r7 = defpackage.ajcp.class;
        r7 = r7.getClassLoader();	 Catch:{ BadParcelableException -> 0x0070 }
        r7 = r0.readParcelable(r7);	 Catch:{ BadParcelableException -> 0x0070 }
        r7 = (defpackage.ajcp) r7;	 Catch:{ BadParcelableException -> 0x0070 }
        r0.recycle();
        r0 = new android.os.ConditionVariable;
        r0.<init>();
        r2 = r6.b;
        r3 = new com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$Lambda$28;
        r3.<init>(r6, r7, r0);
        r2.post(r3);
        r0.block();
        return r1;
    L_0x006e:
        r7 = move-exception;
        goto L_0x007b;
    L_0x0070:
        r7 = defpackage.afpf.embeddedplayer;	 Catch:{ all -> 0x006e }
        r1 = "Cannot read state.";
        defpackage.afpc.a(r3, r7, r1);	 Catch:{ all -> 0x006e }
        r0.recycle();
        return r4;
    L_0x007b:
        r0.recycle();
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService.a(byte[]):boolean");
    }

    public final byte[] o() {
        AtomicReference atomicReference = new AtomicReference();
        ConditionVariable conditionVariable = new ConditionVariable();
        this.b.post(new ApiPlayerService$$Lambda$29(this, atomicReference, conditionVariable));
        conditionVariable.block();
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable((Parcelable) atomicReference.get(), 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001e */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:6:?, code skipped:
            defpackage.afpc.a(2, defpackage.afpf.embeddedplayer, "Cannot read IPC-compatible player state.");
     */
    /* JADX WARNING: Missing block: B:9:0x003f, code skipped:
            r0.recycle();
     */
    /* JADX WARNING: Missing block: B:12:?, code skipped:
            r4 = null;
     */
    public final void b(byte[] r4) {
        /*
        r3 = this;
        r0 = android.os.Parcel.obtain();
        r1 = r4.length;
        r2 = 0;
        r0.unmarshall(r4, r2, r1);
        r0.setDataPosition(r2);
        r4 = defpackage.ngx.class;
        r4 = r4.getClassLoader();	 Catch:{ BadParcelableException -> 0x001e }
        r4 = r0.readParcelable(r4);	 Catch:{ BadParcelableException -> 0x001e }
        r4 = (defpackage.ngx) r4;	 Catch:{ BadParcelableException -> 0x001e }
        r0.recycle();
        goto L_0x002a;
    L_0x001c:
        r4 = move-exception;
        goto L_0x003f;
    L_0x001e:
        r4 = defpackage.afpf.embeddedplayer;	 Catch:{ all -> 0x001c }
        r1 = "Cannot read IPC-compatible player state.";
        r2 = 2;
        defpackage.afpc.a(r2, r4, r1);	 Catch:{ all -> 0x001c }
        r0.recycle();
        r4 = 0;
    L_0x002a:
        if (r4 == 0) goto L_0x003e;
    L_0x002c:
        r0 = new android.os.ConditionVariable;
        r0.<init>();
        r1 = r3.b;
        r2 = new com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService$$Lambda$30;
        r2.<init>(r3, r4, r0);
        r1.post(r2);
        r0.block();
    L_0x003e:
        return;
    L_0x003f:
        r0.recycle();
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.service.jar.ApiPlayerService.b(byte[]):void");
    }

    public final void p() {
        this.b.post(new ApiPlayerService$$Lambda$31(this));
    }

    public final void q() {
        this.b.post(new ApiPlayerService$$Lambda$32(this));
    }

    public final ISelectableItemRegistryService r() {
        return this.t;
    }

    public final IEmbedInteractionLoggingService s() {
        return this.s;
    }
}
