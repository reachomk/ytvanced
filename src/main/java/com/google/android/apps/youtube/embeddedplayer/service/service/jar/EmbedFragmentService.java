package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentService.Stub;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import defpackage.aamd;
import defpackage.aaml;
import defpackage.aanl;
import defpackage.acwc;
import defpackage.afpu;
import defpackage.afsu;
import defpackage.afsw;
import defpackage.akkq;
import defpackage.aklb;
import defpackage.amks;
import defpackage.amkt;
import defpackage.amky;
import defpackage.ammj;
import defpackage.amqq;
import defpackage.amqw;
import defpackage.anxl;
import defpackage.anxr;
import defpackage.aphg;
import defpackage.asmm;
import defpackage.asmo;
import defpackage.asmp;
import defpackage.asmq;
import defpackage.asmr;
import defpackage.asmt;
import defpackage.axak;
import defpackage.aygk;
import defpackage.bqn;
import defpackage.mlp;
import defpackage.mrz;
import defpackage.msa;
import defpackage.msf;
import defpackage.mzp;
import defpackage.nhm;
import defpackage.wxg;
import defpackage.wxi;

public class EmbedFragmentService extends Stub implements amks, DeathRecipient {
    public mzp a;
    public final EmbedInteractionLoggerCoordinator b;
    public final int c;
    private final amkt d;
    private final akkq e;
    private final aanl f;
    private final mrz g;
    private final Handler h;
    private msa i;
    private afsu j;
    private wxi k;
    private aphg l;

    final class EmbeddedPlayerServiceListener implements afsw {
        public final void a(bqn bqn) {
            EmbedFragmentService.this.e();
        }

        /* synthetic */ EmbeddedPlayerServiceListener() {
        }
    }

    final class ThumbnailCallback implements wxg {
        /* synthetic */ ThumbnailCallback() {
        }
    }

    public EmbedFragmentService(Handler handler, mzp mzp, mlp mlp, amkt amkt, int i) {
        this.h = (Handler) amqw.a((Object) handler, (Object) "uiHandler cannot be null");
        this.a = mzp;
        this.d = amkt;
        this.b = mlp.f.f();
        int a = this.b.a(i);
        this.c = a;
        this.b.c(a);
        this.e = mlp.b();
        this.g = mlp.f.e();
        this.f = mlp.f.d();
        amkt.a(this);
        try {
            mzp.asBinder().linkToDeath(this, 0);
        } catch (RemoteException unused) {
            b();
        }
    }

    public final void binderDied() {
        b();
    }

    public final void b() {
        this.h.post(new EmbedFragmentService$$Lambda$0(this));
    }

    public final void a(nhm nhm) {
        boolean z = false;
        aaml aaml = null;
        if (nhm != null) {
            asmp asmp = (asmp) asmm.e.createBuilder();
            int i = nhm.a;
            asmt asmt;
            String str;
            if (i == 1) {
                if (!TextUtils.isEmpty(nhm.b)) {
                    asmt = (asmt) asmq.d.createBuilder();
                    asmt.a(nhm.b);
                    str = nhm.b;
                    mzp mzp = this.a;
                    if (mzp == null) {
                        str = amky.b.a(str);
                    } else {
                        try {
                            String a = mzp.a(str);
                            str = a == null ? amky.b.a(str) : a;
                        } catch (RemoteException unused) {
                            str = amky.b.a(str);
                        }
                    }
                    asmt.copyOnWrite();
                    asmq asmq = (asmq) asmt.instance;
                    if (str != null) {
                        asmq.a |= 2;
                        asmq.c = str;
                        asmp.a(asmt);
                    } else {
                        throw new NullPointerException();
                    }
                }
            } else if (i != 2) {
                if (i == 3) {
                    i = nhm.f;
                    i = (i < 0 || i >= nhm.d.size()) ? 0 : nhm.f;
                    str = (String) nhm.d.get(i);
                    if (str != null) {
                        asmt = (asmt) asmq.d.createBuilder();
                        asmt.a(str);
                        asmp.a(asmt);
                    }
                }
            } else if (!TextUtils.isEmpty(nhm.c)) {
                asmr asmr = (asmr) asmo.d.createBuilder();
                str = nhm.c;
                asmr.copyOnWrite();
                asmo asmo = (asmo) asmr.instance;
                if (str != null) {
                    asmo.a |= 1;
                    asmo.b = str;
                    i = nhm.f;
                    asmr.copyOnWrite();
                    asmo = (asmo) asmr.instance;
                    asmo.a |= 2;
                    asmo.c = (long) i;
                    asmp.copyOnWrite();
                    asmm asmm = (asmm) asmp.instance;
                    asmm.c = (anxl) asmr.build();
                    asmm.b = 3;
                } else {
                    throw new NullPointerException();
                }
            }
            mrz mrz = this.g;
            aaml msa = new msa((aamd) mrz.a((aamd) mrz.a.get(), 1), (afpu) mrz.a((afpu) mrz.b.get(), 2), (asmp) mrz.a(asmp, 3));
            msa.g();
            aaml = msa;
        }
        if (aaml != null) {
            if (!amqq.a(this.i, aaml)) {
                e();
                this.j = new afsu(new EmbeddedPlayerServiceListener());
                this.f.a(aaml, this.j);
            }
            this.i = aaml;
            if (nhm.e != 0) {
                z = true;
            }
            this.b.a(this.c, msf.a(nhm), z);
            return;
        }
        ammj.b("Malformed description, cannot load preview.", new Object[0]);
    }

    public final int c() {
        return this.c;
    }

    public final void a(int i) {
        if (i == acwc.PLAYER_SHARE_BUTTON.dU) {
            aphg aphg = this.l;
            if (!(aphg == null || (aphg.a & 4096) == 0)) {
                this.b.b(this.c, aphg.r.d());
                return;
            }
        }
        this.b.a(this.c, acwc.a(i));
    }

    public final void d() {
        afsu afsu = this.j;
        if (afsu != null) {
            afsu.a();
            this.j = null;
        }
        this.d.b(this);
        mzp mzp = this.a;
        if (mzp != null) {
            mzp.asBinder().unlinkToDeath(this, 0);
            this.a = null;
        }
        this.b.b(this.c);
        System.gc();
    }

    public final void a() {
        d();
    }

    public final void a(CharSequence charSequence) {
        mzp mzp = this.a;
        if (mzp != null) {
            try {
                mzp.a(charSequence);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void b(CharSequence charSequence) {
        mzp mzp = this.a;
        if (mzp != null) {
            try {
                mzp.b(charSequence);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(aygk aygk) {
        wxi wxi = this.k;
        if (wxi != null) {
            wxi.a();
            this.k = null;
        }
        Uri e = aklb.e(aygk);
        if (e != null) {
            this.k = wxi.a(new ThumbnailCallback());
            this.e.b(e, this.k);
        }
    }

    public final void a(Bitmap bitmap) {
        mzp mzp = this.a;
        if (mzp != null) {
            try {
                mzp.a(bitmap);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(axak axak) {
        if (this.a != null) {
            if (axak != null) {
                anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                axak.a(access$000);
                Object b = axak.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                this.l = (aphg) b;
                aphg aphg = this.l;
                if (aphg != null) {
                    this.b.a(this.c, aphg.r.d());
                }
            } else {
                this.l = null;
            }
            try {
                this.a.b(this.l != null);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void e() {
        afsu afsu = this.j;
        if (afsu != null) {
            afsu.a();
            this.j = null;
        }
        a(null);
        a(null);
        a(null);
        b(null);
        a(null);
    }
}
