package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint;

/* renamed from: wuw */
public final class wuw extends nd implements wpk, xoy {
    public aaas Z;
    private TextView aA;
    private TextView aB;
    private TextView aC;
    private TextView aD;
    private akle aE;
    public afpu aa;
    public afpo ab;
    public akkl ac;
    public ablj ad;
    public abkx ae;
    public xoi af;
    public afqe ag;
    public akvp ah;
    public xci ai;
    public acwa aj;
    public acum ak;
    public SharedPreferences al;
    public tem am;
    public tno an;
    public tnq ao;
    public tnv ap;
    public tns aq;
    public apxu ar;
    public LoadingFrameLayout as;
    public wvh at;
    public wph au;
    public boolean av;
    private Activity aw;
    private wtc ax;
    private LoadingFrameLayout ay;
    private AlertDialog az;

    public final void a() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void a(Activity activity) {
        super.a(activity);
        this.aw = activity;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((wvc) xse.a(this.aw)).a(this);
        a(2, (int) R.style.f555Theme.YouTube.YpcTipJar);
        this.ai.d(new wux());
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.ar == null) {
            this.ar = aaax.a((bundle == null ? this.j : bundle).getByteArray("navigation_endpoint"));
        }
        this.as = (LoadingFrameLayout) layoutInflater.inflate(R.layout.ypc_tip_jar_dialog, null);
        this.as.a(this);
        Activity activity = this.aw;
        this.at = new wvh(activity, this.ac, this.ah, (InputMethodManager) activity.getSystemService("input_method"), this.as.findViewById(R.id.ypc_tip_screen));
        this.ay = (LoadingFrameLayout) this.as.findViewById(R.id.next);
        this.ay.setOnClickListener(new wuy(this));
        Context context = this.aw;
        Context context2 = context;
        wxd wxd = (wxd) context;
        ablj ablj = this.ad;
        abkx abkx = this.ae;
        afpu afpu = this.aa;
        afpo afpo = this.ab;
        xoi xoi = this.af;
        tem tem = this.am;
        tno tno = this.an;
        tnq tnq = this.ao;
        tnv tnv = this.ap;
        tns tns = this.aq;
        acwa acwa = this.aj;
        acum acum = this.ak;
        wuz wuz = r2;
        wuz wuz2 = new wuz(this);
        this.au = new wph(context2, wxd, ablj, abkx, afpu, afpo, xoi, tem, tno, tnq, tnv, tns, acwa, acum, wuz, null);
        this.au.k = this;
        return this.as;
    }

    public final void W_() {
        super.W_();
        if (this.aa.a()) {
            W();
        } else {
            this.c.hide();
            this.ag.a(this.aw, null, new wvb(this));
        }
        this.aj.t().a(acwl.aF, this.ar, null);
    }

    public final void bf_() {
        W();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    public final void a(defpackage.abma r4) {
        /*
        r3 = this;
        r0 = r3.at;
        r0 = r0.a();
        r1 = r0.a;
        r1 = r1 & 128;
        if (r1 != 0) goto L_0x000d;
    L_0x000c:
        goto L_0x0065;
    L_0x000d:
        r1 = defpackage.azph.d;
        r1 = defpackage.anxl.checkIsLite(r1);
        r0.a(r1);
        r2 = r0.h;
        r1 = r1.d;
        r1 = r2.a(r1);
        if (r1 == 0) goto L_0x0065;
    L_0x0020:
        r1 = r0.a;
        r1 = r1 & 128;
        if (r1 == 0) goto L_0x003b;
    L_0x0026:
        r1 = r0.j;
        if (r1 != 0) goto L_0x002c;
    L_0x002a:
        r1 = defpackage.azov.j;
    L_0x002c:
        r1 = r1.a;
        r1 = r1 & 1;
        if (r1 == 0) goto L_0x003b;
    L_0x0032:
        r1 = r0.j;
        if (r1 != 0) goto L_0x0038;
    L_0x0036:
        r1 = defpackage.azov.j;
    L_0x0038:
        r1 = r1.b;
        goto L_0x003d;
    L_0x003b:
        r1 = "";
    L_0x003d:
        r1 = defpackage.aali.b(r1);
        r4.p = r1;
        r1 = defpackage.azph.d;
        r1 = defpackage.anxl.checkIsLite(r1);
        r0.a(r1);
        r0 = r0.h;
        r2 = r1.d;
        r0 = r0.b(r2);
        if (r0 != 0) goto L_0x0059;
    L_0x0056:
        r0 = r1.b;
        goto L_0x005d;
    L_0x0059:
        r0 = r1.a(r0);
    L_0x005d:
        r0 = (java.lang.String) r0;
        r0 = defpackage.aali.b(r0);
        r4.q = r0;
    L_0x0065:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wuw.a(abma):void");
    }

    public final void a(akcf akcf) {
        this.aj.t().a(akcf.c);
        f(false);
        ajyh ajyh = akcf.a;
        arml arml = null;
        azom azom = ajyh != null ? ajyh.c : null;
        if (azom != null) {
            azoo azoo = azom.c;
            if (azoo == null) {
                azoo = azoo.e;
            }
            if ((azoo.a & 1) != 0) {
                azoe azoe = azoo.b;
                if (azoe == null) {
                    azoe = azoe.h;
                }
                if (this.az == null) {
                    arml arml2;
                    View inflate = View.inflate(this.aw, R.layout.ypc_post_tip_text_screen, null);
                    this.aE = new akle(this.ac, (ImageView) inflate.findViewById(R.id.viewer_thumbnail));
                    this.aA = (TextView) inflate.findViewById(R.id.thank_you_message_header);
                    this.aB = (TextView) inflate.findViewById(R.id.thank_you_message);
                    this.aC = (TextView) inflate.findViewById(R.id.confirmation_msg_header);
                    this.aD = (TextView) inflate.findViewById(R.id.confirmation_msg);
                    Builder cancelable = new Builder(this.aw).setCancelable(false);
                    if ((azoe.a & 32) != 0) {
                        arml2 = azoe.g;
                        if (arml2 == null) {
                            arml2 = arml.f;
                        }
                    } else {
                        arml2 = null;
                    }
                    this.az = cancelable.setPositiveButton(ajqy.a(arml2), new wvd(this)).setView(inflate).create();
                }
                if (azoe != null) {
                    arml arml3;
                    aygk aygk = azoe.d;
                    if (aygk == null) {
                        aygk = aygk.f;
                    }
                    if (aklb.a(aygk)) {
                        akle akle = this.aE;
                        aygk aygk2 = azoe.d;
                        if (aygk2 == null) {
                            aygk2 = aygk.f;
                        }
                        akle.a(aygk2);
                    }
                    TextView textView = this.aA;
                    if ((azoe.a & 1) != 0) {
                        arml3 = azoe.b;
                        if (arml3 == null) {
                            arml3 = arml.f;
                        }
                    } else {
                        arml3 = null;
                    }
                    textView.setText(ajqy.a(arml3));
                    textView = this.aB;
                    if ((azoe.a & 2) != 0) {
                        arml3 = azoe.c;
                        if (arml3 == null) {
                            arml3 = arml.f;
                        }
                    } else {
                        arml3 = null;
                    }
                    textView.setText(ajqy.a(arml3));
                    textView = this.aC;
                    if ((azoe.a & 8) != 0) {
                        arml3 = azoe.e;
                        if (arml3 == null) {
                            arml3 = arml.f;
                        }
                    } else {
                        arml3 = null;
                    }
                    textView.setText(ajqy.a(arml3));
                    textView = this.aD;
                    if ((azoe.a & 16) != 0) {
                        arml = azoe.f;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    }
                    textView.setText(ajqy.a(arml));
                    this.az.show();
                }
            } else {
                azog azog = azoo.c;
                if (azog == null) {
                    azog = azog.c;
                }
                if ((azog.a & 1) != 0) {
                    aaas aaas = this.Z;
                    azog azog2 = azoo.c;
                    if (azog2 == null) {
                        azog2 = azog.c;
                    }
                    apxu apxu = azog2.b;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    aaas.a(apxu, null);
                }
            }
            arml arml4 = azom.b;
            if (arml4 == null) {
                arml4 = arml.f;
            }
            Spanned a = ajqy.a(arml4);
            if (!TextUtils.isEmpty(a)) {
                this.af.a(a.toString());
            }
        }
        dismiss();
    }

    public final void a(CharSequence charSequence) {
        f(false);
        b(charSequence);
    }

    public final void b() {
        f(false);
    }

    public final void X_() {
        super.X_();
        this.ai.d(new wuu());
    }

    public final void W() {
        this.as.b();
        this.as.a();
        apxu apxu = this.ar;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.ypcTipTransactionEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                ablj ablj = this.ad;
                aaml abme = new abme(ablj.c, ablj.d.c());
                apxu = this.ar;
                anxr access$0002 = anxl.checkIsLite(YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.ypcTipTransactionEndpoint);
                apxu.a(access$0002);
                Object b = apxu.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                b = (YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint) b;
                amqw.a(b);
                abme.a = aali.b(b.b);
                apxu = this.ar;
                if ((apxu.a & 1) != 0) {
                    abme.a(apxu.b);
                } else {
                    abme.g();
                }
                ablj = this.ad;
                ablj.i.a(abme, new wva(this));
                return;
            }
        }
        xtl.c("Invalid navigation endpoint provided.");
        dismiss();
    }

    public final void f(boolean z) {
        this.av = z;
        wvh wvh = this.at;
        if (!z) {
            wvh.c();
        }
        wvh.p = z;
        if (z) {
            this.ay.a();
        } else {
            this.ay.b();
        }
    }

    public final void b(CharSequence charSequence) {
        if (this.ax == null) {
            this.ax = new wtc(this.aw, this.af);
        }
        this.ax.a(charSequence);
    }

    public static azpm a(atqk atqk) {
        atpo atpo = atqk.c;
        if (atpo == null) {
            atpo = atpo.c;
        }
        if (atpo.a != 65500215) {
            return null;
        }
        azpm azpm;
        atpo atpo2 = atqk.c;
        if (atpo2 == null) {
            atpo2 = atpo.c;
        }
        if (atpo2.a == 65500215) {
            azpm = (azpm) atpo2.b;
        } else {
            azpm = azpm.b;
        }
        return azpm;
    }
}
