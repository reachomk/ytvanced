package defpackage;

import android.app.Dialog;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import com.google.android.youtube.R;

/* renamed from: vap */
public final class vap extends nd implements vag, vbh, vbm, vbt, vbx, xfc {
    public aaas Z;
    public vam aa;
    public acvx ab;
    public vba ac;
    public vbg ad;
    public vac ae;
    public vbs af;
    public vbp ag;
    private final xto ah = new var(this, "VerificationHostFragmentComponent");
    private nt ai;
    private boolean aj;
    private boolean ak;
    private String al = "FRAGMENT_NAME_INTRO";
    private avxz am;
    private avxo an;
    private avxf ao;
    private avxh ap;
    private avwl aq;
    private String ar;
    private String as;
    private atfx at = atfx.CODE_DELIVERY_METHOD_UNKNOWN;
    private long au;

    private final vat ab() {
        return (vat) this.ah.get();
    }

    public static vap a(avxz avxz, boolean z) {
        amqw.a((Object) avxz);
        vap vap = new vap();
        Bundle bundle = new Bundle();
        aobp.a(bundle, "ARG_INTRO_RENDERER", (anze) avxz);
        bundle.putBoolean("ARG_SHOW_AS_DIALOG", z);
        bundle.putBoolean("ARG_ALLOW_DIALOG_HARDWARE_BACK", false);
        vap.f(bundle);
        if (z) {
            vap.a(2, 0);
            vap.i_(false);
        }
        return vap;
    }

    public final void b(Bundle bundle) {
        String str = "BUNDLE_PHONE_INPUT_RENDERER";
        String str2 = "BUNDLE_INTRO_RENDERER";
        super.b(bundle);
        ab().a(this);
        if (bundle != null) {
            if (this.ai == null) {
                this.ai = s();
            }
            or a = this.ai.a();
            this.ac = (vba) this.ai.a(bundle, "BUNDLE_INTRO_FRAGMENT");
            if (!(this.ac == null || TextUtils.equals(this.al, "FRAGMENT_NAME_INTRO"))) {
                a.b(this.ac);
            }
            this.ad = (vbg) this.ai.a(bundle, "BUNDLE_PHONE_INPUT_FRAGMENT");
            if (!(this.ad == null || TextUtils.equals(this.al, "FRAGMENT_NAME_PHONE_INPUT"))) {
                a.b(this.ad);
            }
            this.ae = (vac) this.ai.a(bundle, "BUNDLE_CODE_INPUT_FRAGMENT");
            if (!(this.ae == null || TextUtils.equals(this.al, "FRAGMENT_NAME_CODE_INPUT"))) {
                a.b(this.ae);
            }
            this.af = (vbs) this.ai.a(bundle, "BUNDLE_RESULT_SUCCESS_FRAGMENT");
            if (!(this.af == null || TextUtils.equals(this.al, "FRAGMENT_NAME_RESULT_SUCCESS"))) {
                a.b(this.af);
            }
            this.ag = (vbp) this.ai.a(bundle, "BUNDLE_RESULT_ERROR_FRAGMENT");
            if (!(this.ag == null || TextUtils.equals(this.al, "FRAGMENT_NAME_RESULT_ERROR"))) {
                a.b(this.ag);
            }
            a.a();
            try {
                if (bundle.containsKey(str2)) {
                    this.am = (avxz) aobp.a(bundle, str2, avxz.g, anxa.c());
                }
                if (bundle.containsKey(str)) {
                    this.an = (avxo) aobp.a(bundle, str, avxo.i, anxa.c());
                }
                byte[] byteArray = bundle.getByteArray("BUNDLE_CODE_INPUT_RENDERER");
                if (byteArray != null) {
                    this.ao = (avxf) anxl.parseFrom(avxf.d, byteArray, anxa.c());
                }
                byteArray = bundle.getByteArray("BUNDLE_RESULT_SUCCESS_RENDERER");
                if (byteArray != null) {
                    this.ap = (avxh) anxl.parseFrom(avxh.c, byteArray, anxa.c());
                }
                Parcel parcel = (Parcel) bundle.getParcelable("BUNDLE_RESULT_ERROR_RENDERER");
                if (parcel != null) {
                    aobs aobs;
                    anze anze = avwl.g;
                    anxa c = anxa.c();
                    if (VERSION.SDK_INT < 23) {
                        aobs = (aobs) parcel.readParcelable(aobs.class.getClassLoader());
                    } else {
                        aobs = (aobs) parcel.readTypedObject(aobs.CREATOR);
                    }
                    this.aq = (avwl) aobp.a(aobs, anze, c);
                }
                this.al = bundle.getString("BUNDLE_CURRENT_FRAGMENT");
                this.ar = bundle.getString("BUNDLE_CURRENT_PHONE_NUMBER");
                this.as = bundle.getString("BUNDLE_CURRENT_COUNTRY_CODE");
                this.at = atfx.a(bundle.getInt("BUNDLE_CURRENT_DELIVERY_METHOD"));
                if (this.at == null) {
                    this.at = atfx.CODE_DELIVERY_METHOD_UNKNOWN;
                }
                this.au = bundle.getLong("BUNDLE_CURRENT_IDV_REQUEST_ID");
            } catch (anyg e) {
                throw new RuntimeException("Failed to parse a known parcelable proto", e);
            }
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bundle = this.j;
        this.aj = bundle.getBoolean("ARG_SHOW_AS_DIALOG", false);
        this.ak = bundle.getBoolean("ARG_ALLOW_DIALOG_HARDWARE_BACK", false);
        String str = "ARG_INTRO_RENDERER";
        if (bundle.containsKey(str)) {
            try {
                this.am = (avxz) aobp.a(bundle, str, avxz.g, anxa.c());
            } catch (anyg e) {
                throw new RuntimeException("Failed to parse a known parcelable proto.", e);
            }
        }
        return layoutInflater.inflate(R.layout.verification_host_fragment, viewGroup, false);
    }

    public final void B() {
        super.B();
        if (this.aj) {
            Dialog dialog = this.c;
            if (dialog != null) {
                if (dialog.getWindow() != null) {
                    LayoutParams attributes = this.c.getWindow().getAttributes();
                    xss.g(p());
                    attributes.height = (int) q().getDimension(R.dimen.av_flow_dialog_height);
                    attributes.width = (int) q().getDimension(R.dimen.av_flow_dialog_width);
                    this.c.getWindow().setAttributes(attributes);
                }
                if (this.ak) {
                    this.c.setOnKeyListener(new vao(this));
                }
            }
        }
        if (TextUtils.equals(this.al, "FRAGMENT_NAME_INTRO")) {
            a(this.am);
        } else if (TextUtils.equals(this.al, "FRAGMENT_NAME_PHONE_INPUT")) {
            a(this.an, false);
        } else if (TextUtils.equals(this.al, "FRAGMENT_NAME_CODE_INPUT")) {
            a(this.ao, false);
        } else if (TextUtils.equals(this.al, "FRAGMENT_NAME_RESULT_SUCCESS")) {
            c(this.ap);
        } else if (TextUtils.equals(this.al, "FRAGMENT_NAME_RESULT_ERROR")) {
            a(this.aq, false);
        }
    }

    private final void a(nf nfVar, String str) {
        if (this.ai == null) {
            this.ai = s();
        }
        or a = this.ai.a();
        nf a2 = this.ai.a(this.al);
        if (nfVar.equals(a2)) {
            a.c(nfVar);
            a.a();
            return;
        }
        nf a3 = this.ai.a(str);
        if (!(a3 == null || a3.equals(nfVar))) {
            a.a(a3);
        }
        if (a2 != null && a2.F_()) {
            a.b(a2);
        }
        if (!nfVar.F_()) {
            a.a(R.id.verification_fragment_container, nfVar, str);
        } else if (nfVar.C) {
            a.c(nfVar);
        }
        a.i = 4099;
        a.a();
        this.al = str;
    }

    private final void a(avxz avxz) {
        if (this.ac == null) {
            this.am = avxz;
            vba vba = new vba();
            Bundle bundle = new Bundle();
            if (avxz != null) {
                aobp.a(bundle, "ARG_RENDERER", (anze) avxz);
            }
            vba.f(bundle);
            this.ac = vba;
        }
        a(this.ac, "FRAGMENT_NAME_INTRO");
        a(acwl.ac);
    }

    private final void a(avxo avxo, boolean z) {
        if (this.ad == null || z) {
            this.an = avxo;
            vbg vbg = new vbg();
            Bundle bundle = new Bundle();
            if (avxo != null) {
                bundle.putByteArray("ARG_RENDERER", avxo.toByteArray());
            }
            vbg.f(bundle);
            this.ad = vbg;
        }
        a(this.ad, "FRAGMENT_NAME_PHONE_INPUT");
        a(acwl.af);
    }

    private final void a(avxf avxf, boolean z) {
        if (this.ae == null || z) {
            this.ao = avxf;
            long j = this.au;
            vac vac = new vac();
            Bundle bundle = new Bundle();
            if (avxf != null) {
                bundle.putByteArray("ARG_RENDERER", avxf.toByteArray());
            }
            bundle.putLong("ARG_IDV_REQUEST_ID", j);
            vac.f(bundle);
            this.ae = vac;
        }
        a(this.ae, "FRAGMENT_NAME_CODE_INPUT");
        a(acwl.ab);
    }

    private final void c(avxh avxh) {
        if (this.af == null) {
            this.ap = avxh;
            vbs vbs = new vbs();
            Bundle bundle = new Bundle();
            if (avxh != null) {
                bundle.putByteArray("ARG_RENDERER", avxh.toByteArray());
            }
            vbs.f(bundle);
            this.af = vbs;
        }
        a(this.af, "FRAGMENT_NAME_RESULT_SUCCESS");
        a(acwl.ae);
    }

    private final void a(avwl avwl, boolean z) {
        if (this.ag == null || z) {
            this.aq = avwl;
            Object obj = this.at;
            Object obj2 = this.as;
            Object obj3 = this.ar;
            Object valueOf = Long.valueOf(this.au);
            amqw.a((Object) avwl);
            amqw.a(obj);
            amqw.a(obj2);
            amqw.a(obj3);
            amqw.a(valueOf);
            vbp vbp = new vbp();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_RENDERER", aobp.a(avwl));
            bundle.putInt("ARG_CODE_DELIVERY_METHOD", obj.c);
            bundle.putString("ARG_COUNTRY_CODE", obj2);
            bundle.putString("ARG_PHONE_NUMBER", obj3);
            bundle.putLong("ARG_IDV_REQUEST_ID", valueOf.longValue());
            vbp.f(bundle);
            this.ag = vbp;
        }
        a(this.ag, "FRAGMENT_NAME_RESULT_ERROR");
        a(acwl.ad);
    }

    public static boolean b(nf nfVar) {
        return (nfVar == null || nfVar.p || nfVar.D || !nfVar.F_() || !nfVar.u() || nfVar.p() == null) ? false : true;
    }

    private static boolean c(nf nfVar) {
        return nfVar != null && vap.b(nfVar) && nfVar.v();
    }

    private final void a(acwl acwl) {
        this.ab.a(acwl, null, null);
    }

    public final void W() {
        if (vap.c(this.ac)) {
            this.aa.q_();
        } else if (vap.c(this.ad)) {
            a(this.am);
        } else if (vap.c(this.ae)) {
            a(this.an, false);
        } else if (vap.c(this.ag)) {
            this.aa.q_();
        } else {
            vap.c(this.af);
        }
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        if (this.ai == null) {
            this.ai = s();
        }
        vba vba = this.ac;
        if (vba != null) {
            this.ai.a(bundle, "BUNDLE_INTRO_FRAGMENT", vba);
        }
        vbg vbg = this.ad;
        if (vbg != null) {
            this.ai.a(bundle, "BUNDLE_PHONE_INPUT_FRAGMENT", vbg);
        }
        vac vac = this.ae;
        if (vac != null) {
            this.ai.a(bundle, "BUNDLE_CODE_INPUT_FRAGMENT", vac);
        }
        vbs vbs = this.af;
        if (vbs != null) {
            this.ai.a(bundle, "BUNDLE_RESULT_SUCCESS_FRAGMENT", vbs);
        }
        vbp vbp = this.ag;
        if (vbp != null) {
            this.ai.a(bundle, "BUNDLE_RESULT_ERROR_FRAGMENT", vbp);
        }
        anze anze = this.am;
        if (anze != null) {
            aobp.a(bundle, "BUNDLE_INTRO_RENDERER", anze);
        }
        anze = this.an;
        if (anze != null) {
            aobp.a(bundle, "BUNDLE_PHONE_INPUT_RENDERER", anze);
        }
        avxf avxf = this.ao;
        if (avxf != null) {
            bundle.putByteArray("BUNDLE_CODE_INPUT_RENDERER", avxf.toByteArray());
        }
        avxh avxh = this.ap;
        if (avxh != null) {
            bundle.putByteArray("BUNDLE_RESULT_SUCCESS_RENDERER", avxh.toByteArray());
        }
        avwl avwl = this.aq;
        if (avwl != null) {
            bundle.putParcelable("BUNDLE_RESULT_ERROR_RENDERER", aobp.a(avwl));
        }
        bundle.putString("BUNDLE_CURRENT_FRAGMENT", this.al);
        bundle.putString("BUNDLE_CURRENT_PHONE_NUMBER", this.ar);
        bundle.putString("BUNDLE_CURRENT_COUNTRY_CODE", this.as);
        bundle.putInt("BUNDLE_CURRENT_DELIVERY_METHOD", this.at.c);
        bundle.putLong("BUNDLE_CURRENT_IDV_REQUEST_ID", this.au);
    }

    public final void a() {
        W();
    }

    public final void a(avxo avxo) {
        a(avxo, true);
    }

    public final void a(apxu apxu) {
        this.Z.a(apxu, null);
    }

    public final void X() {
        this.aa.p_();
    }

    public final void a(avxf avxf, long j) {
        this.au = j;
        a(avxf, true);
    }

    public final void b(avxo avxo) {
        a(avxo, true);
    }

    public final void Y() {
        this.aa.p_();
    }

    public final void a(atfx atfx, String str, String str2) {
        this.at = atfx;
        this.as = str;
        this.ar = str2;
    }

    public final void a(avxh avxh) {
        c(avxh);
    }

    public final void a(avwl avwl) {
        a(avwl, true);
    }

    public final void b() {
        this.aa.p_();
    }

    public final void b(avxf avxf, long j) {
        this.au = j;
        a(avxf, true);
    }

    public final void c(avxo avxo) {
        a(avxo, true);
    }

    public final void b(avxh avxh) {
        c(avxh);
    }

    public final void b(avwl avwl) {
        a(avwl, true);
    }

    public final void Z() {
        this.aa.p_();
    }

    public final void aa() {
        this.aa.o_();
    }

    public final /* synthetic */ Object n() {
        return ab();
    }
}
