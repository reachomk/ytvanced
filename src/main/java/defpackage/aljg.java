package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: aljg */
public final class aljg extends alir implements alfl, xcp {
    public aarh Z;
    public alfi aa;
    public xci ab;
    public bcaa ac;
    private apxu ad;
    private View af;
    private TextView ag;
    private TextView ah;
    private TextView ai;
    private TextView aj;
    private TextView ak;

    /* Access modifiers changed, original: protected|final */
    public final int W() {
        return R.layout.connections_invite_url_fragment;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        bundle = this.j;
        if (bundle != null) {
            String str = "navigation_endpoint";
            if (bundle.containsKey(str)) {
                try {
                    this.ad = (apxu) anxl.parseFrom(apxu.d, this.j.getByteArray(str), anxa.c());
                } catch (anyg unused) {
                }
            }
        }
        this.ab.a((Object) this);
    }

    public final void X_() {
        super.X_();
        this.ab.b(this);
    }

    public final void a(Activity activity) {
        super.a(activity);
        ((aljm) ((xfc) activity).n()).a(this);
        this.aa.a(this);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.a(layoutInflater, viewGroup, bundle);
        this.af = a.findViewById(R.id.invite_url_banner);
        this.ag = (TextView) a.findViewById(R.id.title);
        this.ah = (TextView) a.findViewById(R.id.url);
        this.ai = (TextView) a.findViewById(R.id.help);
        this.aj = (TextView) a.findViewById(R.id.share_button);
        this.ak = (TextView) a.findViewById(R.id.cancel_button);
        this.ah.setOnClickListener(new aljj(this));
        this.aj.setOnClickListener(new alji(this));
        this.ak.setOnClickListener(new aljl(this));
        a.findViewById(R.id.retry_button).setOnClickListener(new aljk(this));
        return a;
    }

    public final void B() {
        super.B();
        a(q().getConfiguration());
    }

    /* Access modifiers changed, original: protected|final */
    public final aleg a(alpo alpo, alel alel) {
        return new alff(alpo, alel, (aaas) this.ac.get());
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(alei alei) {
        aarh aarh = this.Z;
        apxu apxu = this.ad;
        byte[] d = (apxu.a & 1) != 0 ? apxu.b.d() : null;
        afsw aljn = new aljn(alei);
        aaml aatn = new aatn(aarh.c, aarh.d.c());
        if (d == null) {
            d = zzp.b;
        }
        aatn.a(d);
        aarh.a(asgx.d, aarh.g, aarx.a, aarw.a).a(aatn, aljn);
    }

    public final void J_() {
        super.J_();
        this.aa.b(this);
    }

    public final void aa() {
        f();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutParams layoutParams = (LayoutParams) this.af.getLayoutParams();
        layoutParams.height = (int) q().getDimension(R.dimen.connections_invite_url_banner_height);
        this.af.setLayoutParams(layoutParams);
        a(configuration);
    }

    private final void a(Configuration configuration) {
        Dialog dialog = this.c;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                if (configuration.orientation == 2) {
                    window.setLayout(-1, -2);
                    return;
                }
                window.setLayout(-2, -2);
            }
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{zye.class};
        } else if (i == 0) {
            zye zye = (zye) obj;
            Context p = p();
            if (p != null) {
                CharSequence charSequence;
                avls avls = zye.a;
                if (avls == null) {
                    charSequence = null;
                } else {
                    arml arml;
                    if ((avls.a & 1) != 0) {
                        arml = avls.b;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    } else {
                        arml = null;
                    }
                    charSequence = ajqy.a(arml);
                }
                if (!TextUtils.isEmpty(charSequence)) {
                    xpr.a(p, charSequence, 0);
                    return null;
                }
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
