package com.google.android.apps.youtube.embeddedplayer.service.jar.client;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService.Stub.Proxy;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService.Stub;
import defpackage.amle;
import defpackage.amlh;
import defpackage.amlm;
import defpackage.ammf;
import defpackage.ammh;
import defpackage.ammj;
import defpackage.ammk;
import defpackage.bctz;
import defpackage.bcuf;
import defpackage.bcuh;
import defpackage.bcuj;
import defpackage.bcut;
import defpackage.bcvn;
import defpackage.bcvw;
import defpackage.bcvx;
import defpackage.bczv;
import defpackage.bdcl;
import defpackage.bdfe;
import defpackage.bdfh;
import defpackage.msh;
import defpackage.mvb;
import defpackage.nbn;
import defpackage.nbo;
import defpackage.nbp;
import defpackage.nbq;
import defpackage.nbr;
import defpackage.nbs;
import defpackage.nbt;
import defpackage.nbu;
import defpackage.nbv;
import defpackage.nbw;
import defpackage.nbx;
import defpackage.nby;
import defpackage.nbz;
import defpackage.nca;
import defpackage.ncb;
import defpackage.ncc;
import defpackage.ncd;
import defpackage.nce;
import defpackage.ncf;
import defpackage.ncg;
import defpackage.nch;
import defpackage.nci;
import defpackage.ncj;
import defpackage.nck;
import defpackage.ncl;
import defpackage.ncm;
import defpackage.ncn;
import defpackage.nco;
import defpackage.ncp;
import defpackage.ncq;
import defpackage.ncr;
import defpackage.ncs;
import defpackage.nct;
import defpackage.ncu;
import defpackage.ncv;
import defpackage.ncw;
import defpackage.ncx;
import defpackage.ncy;
import defpackage.ncz;
import defpackage.nda;
import defpackage.ndb;
import defpackage.ndc;
import defpackage.ndd;
import defpackage.nde;
import defpackage.ndf;
import defpackage.ndg;
import defpackage.ndi;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class RemoteEmbedFragment extends amlh {
    private final ViewGroup a;
    private final bcuh b;
    private final Future c;

    @Deprecated
    public final void c() {
    }

    @Deprecated
    public final void l() {
    }

    public RemoteEmbedFragment(IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4) {
        ammf ammf;
        IInterface queryLocalInterface;
        ammf ammh;
        IApiPlayerFactoryService proxy;
        String str = "com.google.android.youtube.player.internal.dynamic.IObjectWrapper";
        IEmbedFragmentServiceFactoryService iEmbedFragmentServiceFactoryService = null;
        if (iBinder == null) {
            ammf = null;
        } else {
            IInterface queryLocalInterface2 = iBinder.queryLocalInterface(str);
            if (queryLocalInterface2 instanceof ammf) {
                ammf = (ammf) queryLocalInterface2;
            } else {
                ammf = new ammh(iBinder);
            }
        }
        Context context = (Context) ammk.a(ammf);
        if (iBinder2 != null) {
            queryLocalInterface = iBinder2.queryLocalInterface(str);
            ammh = queryLocalInterface instanceof ammf ? (ammf) queryLocalInterface : new ammh(iBinder2);
        } else {
            ammh = null;
        }
        Activity activity = (Activity) ammk.a(ammh);
        if (iBinder3 != null) {
            queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService");
            proxy = queryLocalInterface instanceof IApiPlayerFactoryService ? (IApiPlayerFactoryService) queryLocalInterface : new Proxy(iBinder3);
        } else {
            proxy = null;
        }
        if (iBinder4 != null) {
            queryLocalInterface = iBinder4.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedFragmentServiceFactoryService");
            if (queryLocalInterface instanceof IEmbedFragmentServiceFactoryService) {
                iEmbedFragmentServiceFactoryService = (IEmbedFragmentServiceFactoryService) queryLocalInterface;
            } else {
                iEmbedFragmentServiceFactoryService = new Stub.Proxy(iBinder4);
            }
        }
        this.a = new FrameLayout(activity);
        msh msh = new msh(activity);
        bcuh a = bcuh.a(new bczv(new nbo(activity, context)));
        bcuf a2 = bdfe.a();
        if (a instanceof bdcl) {
            a = ((bdcl) a).b(a2);
        } else {
            a = bcuh.a(new bcuj(a, a2));
        }
        a = a.a();
        this.b = ndi.a(a, mvb.a(a, msh, proxy), msh, this.a, iEmbedFragmentServiceFactoryService).a(bcut.a());
        this.b.a(bcvn.a, new nbn());
        bctz a3 = bcuh.a(new bdfh(this.b).a);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        this.c = new bcvw(countDownLatch, bctz.a(new bcvx(countDownLatch, atomicReference2, atomicReference), a3.g()), atomicReference2, atomicReference);
    }

    public final void a() {
        this.b.a(nca.a, new ncj());
    }

    public static void a(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        String str = "Could not access YouTube service: ";
        ammj.b(valueOf.length() == 0 ? new String(str) : str.concat(valueOf), new Object[0]);
    }

    public final void a(amlm amlm) {
        this.b.a(new ncw(amlm), new ndb());
    }

    public final ammf b() {
        return ammk.a(this.a);
    }

    public final void d() {
        this.b.a(nde.a, new ndd());
    }

    public final void a(String str, boolean z) {
        this.b.a(new ndg(str, z), new ndf());
    }

    @Deprecated
    public final void b(String str, boolean z) {
        this.b.a(new nbq(str, z), new nbp());
    }

    @Deprecated
    public final void a(List list, boolean z) {
        this.b.a(new nbs(list, z), new nbr());
    }

    public final void a(String str) {
        this.b.a(new nbu(str), new nbt());
    }

    @Deprecated
    public final void e() {
        this.b.a(nbw.a, new nbv());
    }

    public final void f() {
        this.b.a(nby.a, new nbx());
    }

    public final void g() {
        this.b.a(nbz.a, new ncc());
    }

    public final void h() {
        this.b.a(ncb.a, new nce());
    }

    public final void b(String str) {
        this.b.a(new ncd(str), new ncg());
    }

    public final void c(String str) {
        this.b.a(new ncf(str), new nci());
    }

    public final void i() {
        this.b.a(nch.a, new nck());
    }

    public final void a(int i) {
        this.b.a(new ncm(i), new ncl());
    }

    public final void d(String str) {
        this.b.a(new nco(str), new ncn());
    }

    public final void j() {
        this.b.a(ncq.a, new ncp());
    }

    public final Bundle k() {
        ndi ndi;
        try {
            ndi = (ndi) this.c.get(1, TimeUnit.SECONDS);
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            String str = "Cannot save state: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            ammj.a(valueOf, new Object[0]);
            ndi = null;
        }
        if (ndi != null) {
            return ndi.d();
        }
        return null;
    }

    public final void a(Bundle bundle) {
        this.b.a(new ncs(bundle), new ncr());
    }

    public final void a(boolean z) {
        this.b.a(new ncu(z), new nct());
    }

    public final void b(boolean z) {
        this.b.a(new ncv(z), new ncy());
    }

    public final void a(amle amle) {
        this.b.a(new ncx(amle), new nda());
    }

    public final void a(String str, amle amle) {
        this.b.a(new ncz(str, amle), new ndc());
    }
}
