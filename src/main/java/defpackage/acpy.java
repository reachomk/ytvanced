package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.youtube.livecreation.ui.view.NetworkOperationView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: acpy */
public final class acpy extends nf implements acfi, acfj, acfk, acrt, OnClickListener {
    public aclh Z;
    public acfe a;
    public aaas aa;
    public akpe ab;
    public abzv ac;
    public Executor ad;
    private acru ae;
    private ImageButton af;
    private TextView ag;
    private RecyclerView ah;
    private anm ai;
    private ViewGroup aj;
    private NetworkOperationView ak;
    private auzi al;
    public acqb b;
    public akkq c;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((acqc) xse.a(p())).a(this);
        this.ae = new acru(M_(), this.c, this.Z, this.ac, this.aa, this.ad, this.ab, this);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            String str = "STATE_SCHEDULE_SCREEN_RENDERER";
            if (bundle.containsKey(str)) {
                ajrb ajrb = (ajrb) bundle.getParcelable(str);
                if (ajrb != null) {
                    this.al = (auzi) ajrb.a(auzi.f);
                }
            }
        }
        View inflate = layoutInflater.inflate(R.layout.lc_scheduled_events_fragment, viewGroup, false);
        this.af = (ImageButton) inflate.findViewById(R.id.close_button);
        this.ag = (TextView) inflate.findViewById(R.id.scheduled_events_title);
        this.ak = (NetworkOperationView) inflate.findViewById(R.id.scheduled_events_network_operation);
        this.ak.b(new acpx(this));
        this.ak.a(new acqa(this));
        this.ah = (RecyclerView) inflate.findViewById(R.id.scheduled_events);
        this.aj = (ViewGroup) inflate.findViewById(R.id.scheduled_events_container);
        this.ai = new anm(p(), q().getInteger(R.integer.lc_scheduled_events_columns));
        this.ah.a(new acpz(this));
        this.ah.a(this.ai);
        this.ah.a(this.ae.c);
        Y();
        return inflate;
    }

    private final void Y() {
        auzi auzi = this.al;
        if (auzi != null) {
            anxp anxp = auzi.b;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp = this.al.b;
                if (anxp == null) {
                    anxp = axak.a;
                }
                access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                anxp.a(access$000);
                Object b = anxp.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                aphg aphg = (aphg) b;
                if ((aphg.a & 16) != 0) {
                    aclh aclh = this.Z;
                    arwf arwf = aphg.e;
                    if (arwf == null) {
                        arwf = arwf.c;
                    }
                    arwh a = arwh.a(arwf.b);
                    if (a == null) {
                        a = arwh.UNKNOWN;
                    }
                    int a2 = aclh.a(a);
                    if (a2 != 0) {
                        this.af.setImageResource(a2);
                        this.af.setOnClickListener(this);
                    }
                    if ((aphg.a & 16384) != 0) {
                        ImageButton imageButton = this.af;
                        aodv aodv = aphg.p;
                        if (aodv == null) {
                            aodv = aodv.c;
                        }
                        imageButton.setContentDescription(aodv.b);
                    }
                }
            }
            auzi = this.al;
            if ((auzi.a & 2) != 0) {
                TextView textView = this.ag;
                arml arml = auzi.c;
                if (arml == null) {
                    arml = arml.f;
                }
                textView.setText(ajqy.a(arml));
            }
            this.ae.a(this.al.d);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int p = this.ai.p();
        this.ai.a(q().getInteger(R.integer.lc_scheduled_events_columns));
        this.ah.p();
        this.ai.e(p);
    }

    public final void W_() {
        super.W_();
        int i = this.ak.a;
        if (i == 1) {
            a();
        } else if (i != 2) {
            W();
        } else {
            a(this.al);
        }
    }

    public final void f() {
        this.b.x();
    }

    public final void W() {
        this.ak.a(0);
        this.ak.setVisibility(0);
        this.aj.setVisibility(8);
        this.a.a(this);
    }

    public final void e(Bundle bundle) {
        anze anze = this.al;
        if (anze != null) {
            bundle.putParcelable("STATE_SCHEDULE_SCREEN_RENDERER", new ajrb(anze));
        }
    }

    public final void onClick(View view) {
        if (view == this.af) {
            f();
        }
    }

    public final Map X() {
        return amur.a("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
    }

    public final void a(String str) {
        acru acru = this.ae;
        auyq auyq = (auyq) acru.b.get(str);
        if (auyq != null) {
            acru.a.remove(auyq);
        }
        this.ak.a(0);
        if (this.ae.a.size() == 0) {
            f();
        }
    }

    public final void b() {
        Toast.makeText(p(), R.string.lc_error_delete_broadcast, 0).show();
    }

    public final void a(auzi auzi) {
        if (auzi != null) {
            this.al = auzi;
            Y();
            this.ak.a(2);
            this.aj.setVisibility(0);
            this.ak.setVisibility(8);
            return;
        }
        a();
    }

    public final void a() {
        this.ak.a(1);
        this.ak.setVisibility(0);
        this.aj.setVisibility(8);
    }

    public final void a(asqt asqt) {
        if (aclo.a((nf) this)) {
            asqp asqp = asqt.c;
            if (asqp == null) {
                asqp = asqp.c;
            }
            if (asqp.a == 126007832) {
                auyw auyw;
                acqb acqb = this.b;
                asqp asqp2 = asqt.c;
                if (asqp2 == null) {
                    asqp2 = asqp.c;
                }
                if (asqp2.a == 126007832) {
                    auyw = (auyw) asqp2.b;
                } else {
                    auyw = auyw.y;
                }
                acqb.a(auyw);
                this.ak.a(2);
                return;
            }
            c();
        }
    }

    public final void c() {
        xtl.d("Get confirm broadcast for scheduled broadcast failed");
        Toast.makeText(p(), R.string.lc_error_load_scheduled_broadcast, 0).show();
    }
}
