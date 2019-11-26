package defpackage;

import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
import com.google.android.youtube.R;
import com.google.vr.ndk.base.DaydreamApi;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: huk */
public final class huk extends nf implements ajan, ajlz, ejc, ekr, elf, xcp {
    public xci Z;
    public lgm a;
    public bcaa aA;
    public ekp aB;
    public lum aC;
    public elm aD;
    public lwc aE;
    public zyw aF;
    public airv aG;
    public Executor aH;
    public etx aI;
    public wxd aJ;
    private final bdfu aK = new bdfu();
    private final Set aL = new HashSet();
    private ViewGroup aM;
    private YouTubePlayerViewNotForReflection aN;
    private elo aO;
    private ahxk aP;
    private boolean aQ;
    public ajam aa;
    public YouTubePlayerOverlaysLayout ab;
    public bcaa ac;
    public dwq ad;
    public dwv ae;
    public ahlq af;
    public aiuu ag;
    public aiuq ah;
    public vcr ai;
    public ahyg aj;
    public acvx ak;
    public ajmc al;
    public adgp am;
    public xpw an;
    public aiqd ao;
    public ahxm ap;
    public adqf aq;
    public liw ar;
    public htr as;
    public hto at;
    public hug au;
    public aizy av;
    public ahnq aw;
    public huh ax;
    public bcaa ay;
    public eis az;
    public lgg b;
    public xoi c;

    public final long e() {
        return 1;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        this.aM = (ViewGroup) layoutInflater.inflate(R.layout.player_fragment, viewGroup, false);
        this.aN = (YouTubePlayerViewNotForReflection) this.aM.findViewById(R.id.player_view);
        ((huy) xse.a(p())).a(new hux()).a(this);
        this.a.a(bundle);
        if (bundle != null) {
            dwv dwv = this.ae;
            int i = bundle.getInt("background_dialog_type");
            if (i < 0) {
                dxa.a();
            }
            dwv.r = dxa.a()[i];
            String str = "background_failed_upsell_dialog";
            if (bundle.containsKey(str)) {
                try {
                    dwv.k = (ayvi) anxl.parseFrom(ayvi.r, bundle.getByteArray(str), anxa.c());
                } catch (anyg unused) {
                }
            } else {
                str = "background_failed_dismissible_dialog";
                if (bundle.containsKey(str)) {
                    dwv.l = (aqwx) anxl.parseFrom(aqwx.g, bundle.getByteArray(str), anxa.c());
                } else {
                    str = "background_failed_dismissible_snackbar";
                    if (bundle.containsKey(str)) {
                        dwv.m = (avls) anxl.parseFrom(avls.g, bundle.getByteArray(str), anxa.c());
                    }
                }
            }
            dwv.i = bundle.getLong("background_start_time");
            this.aQ = bundle.getBoolean("is_player_maximized");
        }
        this.aO = (elo) this.ac.get();
        this.b.a(new hut(this));
        this.aP = new huw(this);
        this.ai.a(this.aN);
        this.an.b = this.ab;
        a(this.aC);
        ekp ekp = this.aB;
        amqw.a((Object) this);
        if (ekp.b == null) {
            z = true;
        }
        amqw.b(z);
        ekp.b = this;
        a(this.aI);
        this.aE.c(this);
        this.aE.a(this.aN);
        this.aE.a(this.ab);
        this.aE.a(this.aO);
        this.V.a(this.az);
        this.V.a(this.ar);
        return this.aM;
    }

    public final void W_() {
        super.W_();
        this.al.a((ajlz) this);
        this.am.a((MediaRouteButton) this.ay.get());
        this.Z.d(new efr());
        if (foh.x(this.aF)) {
            this.aK.a(a(this.aa));
        } else {
            this.Z.a((Object) this);
        }
        Object obj = this.af;
        if (!obj.d) {
            if (aipo.a(obj.c, 4)) {
                obj.a(obj.a);
            } else {
                obj.b.a(obj);
            }
            obj.d = true;
        }
        htr htr = this.as;
        htr.a.a(htr);
        obj = this.at;
        obj.b.a(obj);
        if (foh.x(obj.d)) {
            obj.f.a();
            obj.f.a(obj.a(obj.e));
        } else {
            obj.c.a(obj);
        }
        hug hug = this.au;
        hug.a.a(hug);
        this.ag.c = this.ah;
        this.aB.a(0);
    }

    public final void B() {
        super.B();
        this.aB.a(1);
    }

    public final void ad_() {
        super.ad_();
        this.aB.a(2);
    }

    public final void N_() {
        super.N_();
        this.aB.a(4);
        this.al.a(null);
        this.ag.c = null;
        if (foh.x(this.aF)) {
            this.aK.a();
        } else {
            this.Z.b(this);
        }
        htr htr = this.as;
        htr.a.b(htr);
        hto hto = this.at;
        hto.b.b(hto);
        if (!foh.x(hto.d)) {
            hto.c.b(hto);
        }
        hto.f.a();
        hug hug = this.au;
        hug.a.b(hug);
        this.am.b((MediaRouteButton) this.ay.get());
    }

    public final void e(Bundle bundle) {
        this.a.b(bundle);
        dwv dwv = this.ae;
        int i = dwv.r;
        int i2 = i - 1;
        if (i != 0) {
            bundle.putInt("background_dialog_type", i2);
            i = dwv.r;
            i2 = i - 1;
            if (i != 0) {
                if (i2 == 2) {
                    bundle.putByteArray("background_failed_dismissible_dialog", dwv.l.toByteArray());
                } else if (i2 == 3) {
                    bundle.putByteArray("background_failed_upsell_dialog", dwv.k.toByteArray());
                } else if (i2 == 4) {
                    bundle.putByteArray("background_failed_dismissible_snackbar", dwv.m.toByteArray());
                }
                bundle.putLong("background_start_time", dwv.i);
                ejd c = this.aE.c();
                boolean z = true;
                if ((!c.b() || c.d()) && !c.k()) {
                    z = false;
                }
                this.aQ = z;
                bundle.putBoolean("is_player_maximized", z);
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void i() {
        super.i();
        this.aO.c();
        this.aN.b.m();
        this.ai.b = null;
        this.aw.f.clear();
        this.aL.remove(this.aI);
    }

    private final void a(eli eli) {
        this.aL.add(eli);
    }

    /* JADX WARNING: Missing block: B:17:0x0052, code skipped:
            if (r1 == 3) goto L_0x0056;
     */
    public final void a(defpackage.eiy r12, defpackage.ejd r13, boolean r14) {
        /*
        r11 = this;
        r0 = r11.aD;
        r0 = r0.b;
        if (r0 == 0) goto L_0x00d5;
    L_0x0006:
        defpackage.amqw.a(r12);
        r0 = r12.a;
        r7 = r0.a;
        r1 = r11.av;
        r1 = r1.b(r7);
        r8 = 1;
        if (r1 == 0) goto L_0x0056;
    L_0x0016:
        r1 = r7.j();
        if (r1 != 0) goto L_0x0056;
    L_0x001c:
        r1 = r11.Z;
        r2 = new ahjp;
        r2.<init>();
        r1.d(r2);
        r1 = r12.d;
        r2 = 2;
        if (r1 != r2) goto L_0x0035;
    L_0x002b:
        r12 = r11.av;
        r13 = r7.g();
        r12.a(r13);
        goto L_0x0055;
    L_0x0035:
        if (r1 != r8) goto L_0x0051;
    L_0x0037:
        r12 = r11.av;
        r12.a();
        r12 = r11.av;
        r12.e();
        if (r14 == 0) goto L_0x0055;
    L_0x0043:
        r12 = defpackage.ejd.INLINE;
        if (r13 == r12) goto L_0x0055;
    L_0x0047:
        r12 = r11.aj;
        r13 = r11.ak;
        r14 = r7.b;
        r12.a(r13, r14);
        return;
    L_0x0051:
        r14 = 3;
        if (r1 != r14) goto L_0x0055;
    L_0x0054:
        goto L_0x0056;
    L_0x0055:
        return;
    L_0x0056:
        r14 = 0;
        if (r13 == 0) goto L_0x0071;
    L_0x0059:
        r1 = r11.ax;
        defpackage.amqw.a(r13);
        r2 = r1.a;
        if (r2 == r13) goto L_0x0068;
    L_0x0062:
        r1.b = r13;
        r1.b(r13);
        goto L_0x0071;
    L_0x0068:
        r13 = r1.b;
        if (r13 == 0) goto L_0x0071;
    L_0x006c:
        r1.b = r14;
        r1.b(r2);
    L_0x0071:
        r13 = r11.aG;
        r5 = r7.b();
        r9 = r11.aH;
        r6 = defpackage.aiqw.a;
        r1 = r13.g;
        r1 = defpackage.aipo.f(r1);
        if (r1 == 0) goto L_0x00b9;
    L_0x0083:
        r1 = r7.m();
        if (r1 != 0) goto L_0x00b9;
    L_0x0089:
        r1 = r13.h;
        r4 = r7.a(r1);
        r10 = new airx;
        r1 = r10;
        r2 = r13;
        r3 = r7;
        r1.<init>(r2, r3, r4, r5, r6);
        r9.execute(r10);
        r1 = r13.g;
        r1 = defpackage.aipo.a(r1);
        r1 = r1.y;
        if (r1 != 0) goto L_0x00a5;
    L_0x00a4:
        goto L_0x00b9;
    L_0x00a5:
        r1 = r13.i;
        r13 = r13.g;
        r13 = defpackage.aipo.a(r13);
        r13 = r13.z;
        r2 = (long) r13;
        r4 = 1;
        r2 = java.lang.Math.max(r2, r4);
        r1.block(r2);
    L_0x00b9:
        r13 = r11.a;
        r0 = r0.b;
        r0 = r0.instance;
        r0 = (defpackage.nkv) r0;
        r0 = r0.g;
        r0 = r0 ^ r8;
        r13.a(r7, r0);
        r13 = r12.b;
        r11.a(r7, r14, r13);
        r12 = r12.e;
        if (r12 == 0) goto L_0x00d5;
    L_0x00d0:
        r12 = r11.av;
        r12.a(r8);
    L_0x00d5:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.huk.a(eiy, ejd, boolean):void");
    }

    public final void a(aiqq aiqq) {
        if (this.av.b(aiqq)) {
            f(false);
        }
    }

    private final void f(boolean z) {
        adqe c = this.aq.c();
        Object obj = null;
        if (!this.aD.b && this.av.z()) {
            obj = 1;
        }
        if (c == null && obj == null) {
            if (z) {
                this.a.a(true);
            }
            this.av.w();
            this.av.i();
            if (!z) {
                this.a.e();
                for (eli d : this.aL) {
                    d.d();
                }
            }
        }
    }

    public final void d() {
        if (elq.a(this.av) && !this.av.g()) {
            eja c = this.aC.c();
            ajcp f = this.av.f(false);
            if (c != null && f != null) {
                aiqs a = aiqq.a();
                a.a = c.a();
                a(a.b(), f, null);
            }
        }
    }

    public final void f() {
        this.av.e();
    }

    public final void g() {
        this.a.f();
        d();
    }

    public final void a(ejd ejd, ejd ejd2) {
        if (ejd2 == ejd.NONE) {
            f(false);
        }
        this.ax.a(ejd2);
    }

    public final void l() {
        this.aO.d();
    }

    public final void a(float f) {
        this.av.a(f);
    }

    public final boolean m() {
        return this.av.s() ^ 1;
    }

    public final void b(aiqq aiqq) {
        aiqq.a(this.av.c() ^ 1);
        a(aiqq, null, null);
    }

    public final void a(aiqq aiqq, ajcp ajcp, aygk aygk) {
        aiuq aiuq = this.ah;
        AlertDialog alertDialog = aiuq.b;
        if (alertDialog != null) {
            if (alertDialog.isShowing()) {
                aiuq.b.cancel();
            }
            aiuq.b();
        }
        if (ajcp != null) {
            this.av.a(ajcp);
        } else {
            this.av.a(aiqq);
        }
        for (eli a : this.aL) {
            a.a(elq.a(aiqq), aygk);
        }
    }

    public final boolean e_(boolean z) {
        eis eis = this.az;
        if (eis.b != airi.PLAYBACK_LOADED) {
            eis.a(1500);
        }
        eis.a = false;
        this.av.x();
        Object obj = (ahxc) this.aA.get();
        obj.d.add(this.ap);
        Object p = p();
        Object obj2 = this.aP;
        wxd wxd = this.aJ;
        obj.i = (nn) amqw.a(p);
        obj.j = (ahxk) amqw.a(obj2);
        obj.e = wxd;
        obj.a.g();
        obj.f = DaydreamApi.create(obj.i);
        ahxs ahxs = obj.b;
        ahxs.c = (ahxc) amqw.a(obj);
        ahxs.d = (nn) amqw.a(p);
        ahxs.a = ((wwz) p.getApplication()).i().ox();
        this.av.a(this.aN.b, this.ao);
        int i = this.aE.c().n() ? 2 : !z ? 1 : 3;
        this.av.a(i);
        elm elm = this.aD;
        elm.b = true;
        Iterator it = elm.a.iterator();
        while (it.hasNext()) {
            ((ell) it.next()).A_();
        }
        this.ax.a(this.aE.c());
        g(false);
        return elq.a(this.av) ^ 1;
    }

    public final void c() {
        if (!(elq.a(this.av) || this.av.z())) {
            this.a.a(new huj(this));
        }
        g(true);
    }

    private final void g(boolean z) {
        boolean a = elq.a(this.av);
        if (a != (this.aE.c() != ejd.NONE)) {
            if (a) {
                z = this.av.c();
                if (this.aQ) {
                    this.aE.f(false);
                } else {
                    this.aE.e(false);
                }
                if (z && !this.av.c()) {
                    this.av.e();
                    ViewGroup viewGroup = this.aM;
                    if (viewGroup != null) {
                        viewGroup.post(new hum(this));
                    }
                }
            } else if (z) {
                this.aE.g(false);
            }
        }
    }

    public final void a(boolean z) {
        this.av.a(!z ? 1 : 3);
    }

    public final void c(boolean z) {
        ahhd ahhd;
        if (this.aE.c().j()) {
            this.aE.g(false);
            f(false);
        } else if (z) {
            f(true);
        }
        ahxc ahxc = (ahxc) this.aA.get();
        ahxc.a.f();
        if (ahxc.a.t) {
            ahxc.a();
        }
        aozy aozy = null;
        ahxc.i = null;
        ahxc.j = null;
        ahxc.e = null;
        ahxs ahxs = ahxc.b;
        ahxs.c = null;
        ahxs.d = null;
        ahxs.a = null;
        DaydreamApi daydreamApi = ahxc.f;
        if (daydreamApi != null) {
            daydreamApi.close();
            ahxc.f = null;
        }
        ahxc.d.remove(this.ap);
        eis eis = this.az;
        eis.a("as");
        eis.a = true;
        dwq dwq = this.ad;
        if (!dwq.b.c()) {
            apao apao;
            dwp dwp = dwq.c;
            aakj aakj = dwp.e;
            if (aakj != null) {
                apao e = aiqr.e(aakj.l());
                if (e != null) {
                    apao = e;
                }
            }
            if (!dwp.a(apao)) {
                dwq.c.c();
            }
            ahhd = ahhd.VIDEO_NOT_BACKGROUNDABLE;
        } else if (VERSION.SDK_INT < 28 || !dwq.a.isPackageSuspended()) {
            aizy aizy = (aizy) dwq.d.get();
            xak.a();
            aizy.d.c();
            ahhb d = aizy.c.d();
            ahhd ahhd2 = d.a;
            int ordinal = ahhd2.ordinal();
            if (ordinal == 1) {
                dwv dwv;
                ((elo) dwq.e.get()).e();
                dwp dwp2 = dwq.c;
                dwp2.b.c();
                if (dwp2.a.d()) {
                    dwv = dwp2.b;
                    dwv.r = 2;
                    dwv.i = dwv.f.a();
                    dwv.e();
                    dwo dwo = dwp2.c;
                    dwo.a();
                    dwo.k = true;
                    if (dwo.j == null) {
                        dwo.j = new qg(dwo.a);
                        xlr.a(dwo.j, dwo.a);
                        Intent b = ebl.b(dwo.a);
                        Intent putExtra = ebl.c(dwo.a).putExtra(":android:no_headers", true).putExtra("background_settings", true);
                        CharSequence string = dwo.b.getString(R.string.background_settings_notification_message, new Object[]{foh.a(dwo.e, dwo.a)});
                        qj qhVar = new qh();
                        qhVar.a(string);
                        qg qgVar = dwo.j;
                        qgVar.a(dwo.b.getString(R.string.pref_background_options_title));
                        qgVar.b(string);
                        qgVar.e(dwo.b.getString(R.string.background_settings_is_on_title));
                        qgVar.d(null);
                        qgVar.a((int) R.drawable.quantum_ic_video_youtube_white_24);
                        qgVar.a(false);
                        qgVar.b(true);
                        qgVar.a(qhVar);
                        qgVar.t = dwo.b.getColor(R.color.color_brand_primary);
                        qgVar.f = PendingIntent.getActivity(dwo.a, 1, b, 134217728);
                        qgVar.a((int) R.drawable.ic_notification_settings, dwo.b.getString(R.string.background_settings_notification_action_button), PendingIntent.getActivity(dwo.a, 2, putExtra, 134217728));
                        qgVar.c();
                    }
                    dwo.j.a(System.currentTimeMillis());
                    dwo.d.notify(1005, dwo.j.e());
                }
                dwv = dwp2.b;
                aakj aakj2 = dwp2.e;
                if (aakj2 != null) {
                    atdv l = aakj2.l();
                    if (!(l == null || (l.a & 1024) == 0)) {
                        apap apap;
                        atdd atdd = l.i;
                        if (atdd == null) {
                            atdd = atdd.c;
                        }
                        if (atdd.a != 64657230) {
                            apap = null;
                        } else {
                            atdd atdd2 = l.i;
                            if (atdd2 == null) {
                                atdd2 = atdd.c;
                            }
                            if (atdd2.a == 64657230) {
                                apap = (apap) atdd2.b;
                            } else {
                                apap = apap.d;
                            }
                        }
                        if (apap != null) {
                            apao apao2 = apap.c;
                            if (apao2 == null) {
                                apao2 = apao.f;
                            }
                            if ((apao2.a & 4) != 0) {
                                apao apao3 = apap.c;
                                if (apao3 == null) {
                                    apao3 = apao.f;
                                }
                                aozy = apao3.d;
                                if (aozy == null) {
                                    aozy = aozy.g;
                                }
                            }
                        }
                    }
                }
                dwv.q = aozy;
            } else if (ordinal == 2) {
                ((adjs) dwq.f.get()).e();
                dwq.c.a(d.b);
            } else if (ordinal == 3) {
                dwq.c.c();
            }
            ahhd = ahhd2;
        } else {
            ahhd = ahhd.VIDEO_NOT_BACKGROUNDABLE;
        }
        boolean isFinishing = p().isFinishing();
        Object obj = (this.av.z() || ahhd == ahhd.PENDING) ? 1 : null;
        if (elq.a(this.av)) {
            if (isFinishing && obj == null) {
                f(false);
            } else if (!isFinishing) {
                this.a.a(false);
            }
        }
        if (!p().isChangingConfigurations() || VERSION.SDK_INT < 24) {
            this.av.b(isFinishing);
        } else if (obj == null) {
            this.av.b();
        }
        this.av.a(1);
        elm elm = this.aD;
        elm.b = false;
        Iterator it = elm.a.iterator();
        while (it.hasNext()) {
            ((ell) it.next()).ar_();
        }
    }

    public final void n() {
        this.av.a(this.aN.b, this.ao);
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkg ahkg) {
        boolean z = true;
        if (ahkg.a != 1) {
            z = false;
        }
        h(z);
    }

    private final void h(boolean z) {
        if (z && this.av.c() && !this.aw.t && !u() && (VERSION.SDK_INT < 24 || !p().isInMultiWindowMode())) {
            this.aB.a(3);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkf ahkf) {
        aakj aakj = ahkf.b;
        if (ahkf.e == 4 && aakj != null) {
            aajj n = aakj.n();
            if (n != null && n.m()) {
                this.c.a((int) R.string.force_muted_video);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void W() {
        xpr.a(p(), (int) R.string.playlist_skipped_unavailable_videos, 1);
    }

    public final aiuf k() {
        return this.ab;
    }

    public final boolean a(afif afif) {
        if ("surfaceunavailable".equals(afif.a())) {
            h(true);
        }
        return false;
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.a(hul.a, huo.a).f().a(emg.a(this.aF, 35184372088832L, 0)).a(new hun(this), huq.a), ajam.t().f().a(emg.a(this.aF, 35184372088832L, 1)).a(new hup(this), hus.a), ajam.s().f().a(emg.a(this.aF, 35184372088832L, 0)).a(new hur(this), huu.a)};
    }

    public final /* bridge */ /* synthetic */ ekl j() {
        return this.aN;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkf.class, ahkg.class, ahki.class};
        } else if (i == 0) {
            a((ahkf) obj);
            return null;
        } else if (i == 1) {
            a((ahkg) obj);
            return null;
        } else if (i == 2) {
            W();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
