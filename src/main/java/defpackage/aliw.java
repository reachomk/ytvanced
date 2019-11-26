package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddConnectionEndpointOuterClass$AddConnectionEndpoint;

/* renamed from: aliw */
public final class aliw extends alir implements alfl {
    public alpa Z;
    public alfi aa;
    public akkq ab;
    public aarh ac;
    public aaas ad;
    private TextView af;
    private View ag;
    private View ah;
    private akle ai;
    private TextView aj;
    private TextView ak;
    private TextView al;
    private TextView am;
    private TextView an;
    private ImageButton ao;
    private aomb ap;
    private apxu aq;
    private int ar;

    /* Access modifiers changed, original: protected|final */
    public final int W() {
        return R.layout.add_connection_dialog;
    }

    public static aliw a(apxu apxu) {
        aliw aliw = new aliw();
        if (apxu != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray("navigation_endpoint", apxu.toByteArray());
            aliw.f(bundle);
        }
        return aliw;
    }

    public final void a(Activity activity) {
        super.a(activity);
        ((aljf) ((xfc) activity).n()).a(this);
        this.aa.a(this);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        bundle = this.j;
        if (bundle != null) {
            String str = "navigation_endpoint";
            if (bundle.containsKey(str)) {
                try {
                    this.aq = (apxu) anxl.parseFrom(apxu.d, this.j.getByteArray(str), anxa.c());
                } catch (anyg unused) {
                }
            }
        }
        this.ar = q().getConfiguration().orientation;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.a(layoutInflater, viewGroup, bundle);
        this.af = (TextView) a.findViewById(R.id.title);
        this.ag = a.findViewById(R.id.connection_container);
        this.ah = a.findViewById(R.id.connection_avatar);
        this.ai = new akle(this.ab, (ImageView) this.ah);
        this.aj = (TextView) a.findViewById(R.id.connection_name);
        this.ak = (TextView) a.findViewById(R.id.details_text);
        this.al = (TextView) a.findViewById(R.id.help_text);
        this.am = (TextView) a.findViewById(R.id.cancel_button);
        this.am.setOnClickListener(new aliz(this));
        this.an = (TextView) a.findViewById(R.id.sign_in_or_connect_button);
        this.an.setOnClickListener(new aliy(this));
        this.ao = (ImageButton) a.findViewById(R.id.connect_button);
        this.ao.setOnClickListener(new aljb(this));
        a.findViewById(R.id.retry_button).setOnClickListener(new alja(this));
        return a;
    }

    /* Access modifiers changed, original: protected|final */
    public final aleg a(alpo alpo, alel alel) {
        return new aleq(alpo, alel, this.ad);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(alei alei) {
        if (Y() != null) {
            this.ap = Y();
            alei.a(this.ap);
        } else if (X() != null) {
            aarh aarh = this.ac;
            String X = X();
            afsw aljd = new aljd(alei);
            aarh.a(asgt.d, aarh.g, aarz.a, aary.a).a(new aatk(aarh.c, aarh.d.c(), X), aljd);
        } else {
            this.K.post(new aljc(this));
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.ar != configuration.orientation) {
            dismiss();
            aliw.a(this.aq).a(this.v, this.B);
        }
    }

    public final void J_() {
        super.J_();
        this.aa.b(this);
    }

    public final void aa() {
        f();
    }

    private static boolean a(TextView textView, aphg aphg) {
        if (aphg != null) {
            arml arml;
            arml arml2 = null;
            if ((aphg.a & 128) != 0) {
                arml = aphg.g;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            if (!TextUtils.isEmpty(ajqy.a(arml))) {
                textView.setVisibility(0);
                if ((aphg.a & 128) != 0) {
                    arml2 = aphg.g;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                }
                textView.setText(ajqy.a(arml2));
                return true;
            }
        }
        textView.setVisibility(8);
        return false;
    }

    private final String X() {
        apxu apxu = this.aq;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(AddConnectionEndpointOuterClass$AddConnectionEndpoint.addConnectionEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            if ((((AddConnectionEndpointOuterClass$AddConnectionEndpoint) b).a & 2) != 0) {
                apxu = this.aq;
                access$000 = anxl.checkIsLite(AddConnectionEndpointOuterClass$AddConnectionEndpoint.addConnectionEndpoint);
                apxu.a(access$000);
                b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                return ((AddConnectionEndpointOuterClass$AddConnectionEndpoint) b).c;
            }
        }
        return null;
    }

    private final aomb Y() {
        apxu apxu = this.aq;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(AddConnectionEndpointOuterClass$AddConnectionEndpoint.addConnectionEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            aomd aomd = ((AddConnectionEndpointOuterClass$AddConnectionEndpoint) b).b;
            if (aomd == null) {
                aomd = aomd.c;
            }
            if ((aomd.a & 1) != 0) {
                apxu = this.aq;
                access$000 = anxl.checkIsLite(AddConnectionEndpointOuterClass$AddConnectionEndpoint.addConnectionEndpoint);
                apxu.a(access$000);
                b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                aomd = ((AddConnectionEndpointOuterClass$AddConnectionEndpoint) b).b;
                if (aomd == null) {
                    aomd = aomd.c;
                }
                aomb aomb = aomd.b;
                if (aomb == null) {
                    aomb = aomb.k;
                }
                return aomb;
            }
        }
        return null;
    }
}
