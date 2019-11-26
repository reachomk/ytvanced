package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.libraries.youtube.ads.ui.webview.AdsWebView;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;

/* renamed from: kwp */
public final class kwp implements akot, dvz, wcg {
    private final Context a;
    private final LoadingFrameLayout b = ((LoadingFrameLayout) LayoutInflater.from(this.a).inflate(R.layout.loading_ads_web_view, null, false).findViewById(R.id.loading_layout));
    private final vdg c;
    private final xsc d;
    private final dwa e;
    private final kwi f;
    private final aaas g;
    private acvx h;
    private aopd i;
    private long j;
    private boolean k = true;
    private boolean l = false;
    private AdsWebView m;

    public kwp(Context context, vdg vdg, xsc xsc, dwa dwa, aaas aaas, kwi kwi) {
        this.a = context;
        this.c = (vdg) amqw.a((Object) vdg);
        this.d = (xsc) amqw.a((Object) xsc);
        this.e = (dwa) amqw.a((Object) dwa);
        this.f = (kwi) amqw.a((Object) kwi);
        this.g = (aaas) amqw.a((Object) aaas);
    }

    public final void b() {
        if (this.i != null) {
            AdsWebView adsWebView = this.m;
            afpf afpf;
            String valueOf;
            String str;
            if (adsWebView == null) {
                afpf = afpf.ad;
                valueOf = String.valueOf(this.i.b);
                str = "No AdsWebView found for renderer: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                afpc.a(1, afpf, valueOf);
                return;
            }
            String url = adsWebView.getUrl();
            if (TextUtils.isEmpty(url)) {
                afpf = afpf.ad;
                valueOf = String.valueOf(this.i.b);
                str = "No url found for AdsWebView: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                afpc.a(1, afpf, valueOf);
                return;
            }
            anxq anxq;
            ayvn ayvn;
            aopg aopg;
            aopd aopd = this.i;
            if ((aopd.a & 8) != 0) {
                anxp anxp = aopd.e;
                if (anxp == null) {
                    anxp = apxu.d;
                }
                anxr access$000 = anxl.checkIsLite(UrlEndpointOuterClass.urlEndpoint);
                anxp.a(access$000);
                if (anxp.h.a(access$000.d)) {
                    anxl anxl = this.i.e;
                    if (anxl == null) {
                        anxl = apxu.d;
                    }
                    anxq = (apxx) ((anxo) anxl.toBuilder());
                    ayvn = (ayvn) ((anxo) ((ayvl) anxq.b(UrlEndpointOuterClass.urlEndpoint)).toBuilder());
                    ayvn.a(url);
                    anxq.a(UrlEndpointOuterClass.urlEndpoint, (ayvl) ((anxl) ayvn.build()));
                    aopg = (aopg) ((anxo) this.i.toBuilder());
                    aopg.copyOnWrite();
                    aopd = (aopd) aopg.instance;
                    aopd.e = (apxu) ((anxl) anxq.build());
                    aopd.a |= 8;
                    this.i = (aopd) ((anxl) aopg.build());
                    this.g.a((apxu) ((anxl) anxq.build()), amur.a("com.google.android.libraries.youtube.innertube.endpoint.tag", this.i));
                }
            }
            afpc.a(1, afpf.ad, "AdsWebViewPresenter base command not correctly specified.");
            anxq = (apxx) apxu.d.createBuilder();
            anxq.a(UrlEndpointOuterClass.urlEndpoint, ayvl.d);
            ayvn = (ayvn) ((anxo) ((ayvl) anxq.b(UrlEndpointOuterClass.urlEndpoint)).toBuilder());
            ayvn.a(url);
            anxq.a(UrlEndpointOuterClass.urlEndpoint, (ayvl) ((anxl) ayvn.build()));
            aopg = (aopg) ((anxo) this.i.toBuilder());
            aopg.copyOnWrite();
            aopd = (aopd) aopg.instance;
            aopd.e = (apxu) ((anxl) anxq.build());
            aopd.a |= 8;
            this.i = (aopd) ((anxl) aopg.build());
            this.g.a((apxu) ((anxl) anxq.build()), amur.a("com.google.android.libraries.youtube.innertube.endpoint.tag", this.i));
        }
    }

    public final View K_() {
        return this.b;
    }

    public final void a(akpb akpb) {
        aopd aopd = this.i;
        if (aopd != null) {
            dwa dwa = this.e;
            dwa.a.remove(aopd.b);
        }
        this.b.removeAllViews();
        AdsWebView adsWebView = this.m;
        if (adsWebView != null) {
            adsWebView.destroy();
            this.m = null;
        }
    }

    private final void f() {
        AdsWebView adsWebView = this.m;
        if (adsWebView != null && adsWebView.getParent() == null) {
            this.b.addView(this.m);
        }
    }

    public final void c() {
        this.j = this.d.a();
        this.b.a();
    }

    public final void d() {
        f();
        this.b.b();
        if (!this.c.i()) {
            return;
        }
        atss atss;
        if (this.k) {
            int a = (int) (this.d.a() - this.j);
            if (!(this.i == null || this.h == null)) {
                atsc atsc = (atsc) atsd.c.createBuilder();
                atsc.copyOnWrite();
                atsd atsd = (atsd) atsc.instance;
                atsd.a |= 1;
                atsd.b = a;
                atsd atsd2 = (atsd) ((anxl) atsc.build());
                atss = (atss) atst.q.createBuilder();
                atss.a(atsd2);
                this.h.a(this.i.g.d(), (atst) ((anxl) atss.build()));
            }
            this.k = false;
        } else if (this.l) {
            if (!(this.i == null || this.h == null)) {
                atss = (atss) atst.q.createBuilder();
                atss.a(atsd.c);
                atst atst = (atst) ((anxl) atss.build());
                aopd aopd = this.i;
                if ((aopd.a & 64) != 0) {
                    this.h.a(3, new acvs(aopd.g), atst);
                }
            }
            this.l = false;
        }
    }

    public final void e() {
        this.l = true;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aopd aopd = (aopd) obj;
        if (aopd == null) {
            xpr.a(this.b, false);
            return;
        }
        this.i = aopd;
        if (this.m == null) {
            kwi kwi = this.f;
            Activity activity = (Activity) this.a;
            aopd aopd2 = this.i;
            this.m = kwi.a(activity, aopd2.b, aopd2.c, false);
        }
        this.m.onResume();
        this.m.a = this;
        if (this.c.i()) {
            this.f.a((Activity) this.a, this.m, this.i.c, false);
        } else {
            aopd aopd3 = this.i;
            if (!aopd3.d) {
                this.f.a((Activity) this.a, this.m, aopd3.c, aopd3.f);
            }
        }
        if (this.i.d) {
            f();
        }
        this.b.c();
        this.b.b();
        if (this.m.getProgress() != 100) {
            this.b.a();
        }
        dwa dwa = this.e;
        String str = aopd.b;
        if (str != null) {
            dwa.a.put(str, this);
        }
        xpr.a(this.b, true);
        acvx acvx = akor.a;
        if (acvx != null) {
            this.h = acvx;
        }
        if (!this.c.i()) {
            acvx = this.h;
            if (acvx != null) {
                acvx.a(aopd.g.d(), null);
            }
        }
    }
}
