package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gwd */
public final class gwd extends gub implements ear {
    public eaw bY;
    public eki bZ;
    public bapu ca;
    public String cb;
    private final List cc = new ArrayList();
    private boolean cd;
    private bqn ce;

    public static boolean i(fiw fiw) {
        return fiw.a == gwd.class;
    }

    public static fiw aG() {
        return gub.a(aaax.a("FEwhat_to_watch"), true);
    }

    public static fiw aH() {
        return gub.a(aaax.b("FEwhat_to_watch"), true);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            this.cd = bundle.getBoolean("instance_is_rendering_offline_browse_response");
        }
        return super.a(layoutInflater, viewGroup, bundle);
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("instance_is_rendering_offline_browse_response", this.cd);
    }

    /* Access modifiers changed, original: protected|final */
    public final void al() {
        ((gwe) xse.a(p())).a(new gwi()).a(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void an() {
        super.an();
        this.aj.a(new gwj(this));
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean ap() {
        ebk ebk = this.ay;
        return (ebk == null || !ebk.a) && super.ap();
    }

    /* Access modifiers changed, original: protected|final */
    public final void h(boolean z) {
        this.cc.clear();
        this.ce = null;
        super.h(z);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(aaff aaff, boolean z) {
        this.bV = z;
        if (aaff != null && z && !this.bZ.b()) {
            for (aafp aafp : aaff.d()) {
                akbc akbc = aafp.a;
                if (!"FEaccount".equals(akbc.j)) {
                    if ("FElibrary".equals(akbc.j)) {
                    }
                }
                akaz akaz = new akaz();
                akaz.a = new akab();
                akbc.d = akaz;
            }
        }
        String str = this.cb;
        if (str != null && !str.isEmpty() && aaff != null) {
            for (aafp aafp2 : aaff.d()) {
                akbc akbc2 = aafp2.a;
                boolean equals = this.cb.equals(akbc2.j);
                akbc2.c = equals;
                if (equals) {
                    apxu aq = aq();
                    if (aq != null) {
                        anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                        aq.a(access$000);
                        if (aq.h.a(access$000.d)) {
                            Object obj;
                            access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                            aq.a(access$000);
                            Object b = aq.h.b(access$000.d);
                            if (b == null) {
                                obj = access$000.b;
                            } else {
                                obj = access$000.a(b);
                            }
                            apgd apgd = (apgd) ((anxo) ((apge) obj).toBuilder());
                            apgd.a(akbc2.j);
                            apxx apxx = (apxx) ((anxo) aq.toBuilder());
                            apxx.a(BrowseEndpointOuterClass.browseEndpoint, (apge) ((anxl) apgd.build()));
                            this.an = (apxu) ((anxl) apxx.build());
                        }
                    }
                }
            }
            this.cb = null;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bqn bqn) {
        String valueOf;
        if (this.bV) {
            apxu apxu = this.an;
            anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            String str = "FElibrary";
            if (str.equals(((apge) b).b) && (bqn instanceof bqe)) {
                eav eav = (eav) this.aJ.get();
                try {
                    aaff b2;
                    ajrr a;
                    eaw eaw = this.bY;
                    apxu apxu2 = this.an;
                    anxr access$0002 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                    apxu2.a(access$0002);
                    Object b3 = apxu2.h.b(access$0002.d);
                    if (b3 == null) {
                        b3 = access$0002.b;
                    } else {
                        b3 = access$0002.a(b3);
                    }
                    String str2 = ((apge) b3).b;
                    aaff aaff = null;
                    if (str2.equals(str)) {
                        b2 = eav.b();
                        if (b2 == null) {
                            b2 = (aaff) eav.e().a();
                        }
                    } else {
                        b2 = null;
                    }
                    if (b2 != null) {
                        aaff = b2;
                    } else {
                        a = eav.a();
                        if (a != null) {
                            a = eaw.b(a);
                        }
                        if (a != null) {
                            aaff = new aaff(a);
                        }
                    }
                    if (aaff != null) {
                        a = aaff.a;
                        if (a != null) {
                            ajru ajru = a.a;
                            if (ajru != null) {
                                akaq akaq = ajru.b;
                                if (akaq != null) {
                                    ajrt[] ajrtArr = akaq.a;
                                    if (ajrtArr != null && ajrtArr.length > 0) {
                                        akbc akbc = ajrtArr[0].b;
                                        if (akbc != null) {
                                            akbc.j = str2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (aaff != null) {
                        this.cd = true;
                        a(aaff, true, false, false);
                        return;
                    }
                } catch (IOException e) {
                    valueOf = String.valueOf(e);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 30);
                    stringBuilder.append("Failed to get offline browse: ");
                    stringBuilder.append(valueOf);
                    xtl.c(stringBuilder.toString());
                    valueOf = a((int) R.string.offline_not_available);
                    SpecificNetworkErrorViewLoadingFrameLayout specificNetworkErrorViewLoadingFrameLayout = this.ai;
                    specificNetworkErrorViewLoadingFrameLayout.c.a(valueOf);
                    specificNetworkErrorViewLoadingFrameLayout.c.a(false);
                    specificNetworkErrorViewLoadingFrameLayout.c.b(false);
                    specificNetworkErrorViewLoadingFrameLayout.a(3);
                    return;
                }
            }
            valueOf = this.aC.b(bqn).a;
            for (gwh a2 : this.cc) {
                a2.a(valueOf);
            }
            return;
        }
        this.ce = bqn;
        super.a(bqn);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(akxv akxv) {
        if (this.bV) {
            aknh gwh = new gwh(this);
            bqn bqn = this.ce;
            if (bqn != null) {
                gwh.a(this.aC.b(bqn).a);
            } else {
                akwk a = akwl.a();
                a.a = new akuu();
                gwh.a(a.a());
            }
            this.cc.add(gwh);
            jts jts = (jts) akxv;
            aknh aknh = jts.c;
            if (aknh != gwh) {
                if (aknh != null) {
                    jts.b.c(aknh);
                }
                jts.c = gwh;
                jts.b.a(gwh);
            }
        }
    }

    public final boolean ak() {
        return this.cd || this.bV || this.ce != null || f() == 3;
    }

    public final boolean ae_() {
        return this.cd;
    }

    public final void H_() {
        if (this.ay.a) {
            View view = this.K;
            if (view != null) {
                view.postDelayed(new gwc(this), (long) q().getInteger(17694722));
                return;
            }
            return;
        }
        super.H_();
    }
}
