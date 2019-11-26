package defpackage;

import android.app.Activity;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: acqy */
public final class acqy implements OnClickListener, OnCheckedChangeListener {
    private final TextView A;
    private final SwitchCompat B;
    private final View C;
    private final TextView D;
    private final SwitchCompat E;
    private final View F;
    private final TextView G;
    private final SwitchCompat H;
    private final View I;
    private final TextView J;
    private final SwitchCompat K;
    public final acvx a;
    public final Spinner b;
    public final Spinner c;
    public acqz d;
    public acqz e;
    public acqz f;
    public acqz g;
    public acqz h;
    public acqz i;
    public acqz j;
    private final Activity k;
    private final akvp l;
    private final aaas m;
    private final acqx n;
    private final ImageButton o;
    private final TextView p;
    private final View q;
    private final TextView r;
    private final SwitchCompat s;
    private final View t;
    private final TextView u;
    private final SwitchCompat v;
    private final View w;
    private final TextView x;
    private final SwitchCompat y;
    private final View z;

    public acqy(Activity activity, View view, auyi auyi, akvp akvp, aaas aaas, acvx acvx, acqx acqx) {
        auyc auyc;
        atqt atqt;
        Activity activity2;
        akvp akvp2;
        aaas aaas2;
        View view2;
        TextView textView;
        SwitchCompat switchCompat;
        this.k = (Activity) amqw.a((Object) activity);
        amqw.a((Object) view);
        amqw.a((Object) auyi);
        this.l = (akvp) amqw.a((Object) akvp);
        this.m = (aaas) amqw.a((Object) aaas);
        this.a = (acvx) amqw.a((Object) acvx);
        this.n = (acqx) amqw.a((Object) acqx);
        this.o = (ImageButton) view.findViewById(R.id.back_to_basic_settings_button);
        this.p = (TextView) view.findViewById(R.id.back_to_basic_settings_text);
        this.w = view.findViewById(R.id.age_restriction_setting);
        this.x = (TextView) view.findViewById(R.id.age_restriction_setting_text);
        this.y = (SwitchCompat) view.findViewById(R.id.age_restriction_setting_toggle);
        this.q = view.findViewById(R.id.enable_chat_setting);
        this.r = (TextView) view.findViewById(R.id.enable_chat_setting_text);
        this.s = (SwitchCompat) view.findViewById(R.id.enable_chat_setting_toggle);
        this.C = view.findViewById(R.id.paid_placement_setting);
        this.D = (TextView) view.findViewById(R.id.paid_placement_setting_text);
        this.E = (SwitchCompat) view.findViewById(R.id.paid_placement_setting_toggle);
        this.F = view.findViewById(R.id.show_paid_placement_overlay);
        this.G = (TextView) view.findViewById(R.id.show_paid_placement_overlay_text);
        this.H = (SwitchCompat) view.findViewById(R.id.show_paid_placement_overlay_toggle);
        this.I = view.findViewById(R.id.enable_sponsor_only_setting);
        this.J = (TextView) view.findViewById(R.id.enable_sponsor_only_setting_text);
        this.K = (SwitchCompat) view.findViewById(R.id.enable_sponsor_only_setting_toggle);
        this.z = view.findViewById(R.id.enable_default_usage_policy);
        this.A = (TextView) view.findViewById(R.id.enable_default_usage_policy_text);
        this.B = (SwitchCompat) view.findViewById(R.id.enable_default_usage_policy_toggle);
        this.b = (Spinner) view.findViewById(R.id.usage_policy_spinner);
        this.t = view.findViewById(R.id.enable_content_id);
        this.u = (TextView) view.findViewById(R.id.enable_content_id_text);
        this.v = (SwitchCompat) view.findViewById(R.id.enable_content_id_toggle);
        this.c = (Spinner) view.findViewById(R.id.match_policy_spinner);
        view.setOnClickListener(this);
        this.o.setOnClickListener(this);
        if ((auyi.a & 128) != 0) {
            TextView textView2 = this.p;
            arml arml = auyi.i;
            if (arml == null) {
                arml = arml.f;
            }
            textView2.setText(ajqy.a(arml));
        }
        int i = 0;
        if ((auyi.a & 2) != 0) {
            auyc = auyi.c;
            if (auyc == null) {
                auyc = auyc.c;
            }
            atqt = auyc.b;
            if (atqt == null) {
                atqt = atqt.h;
            }
            this.e = new acqz(this.k, this.l, this.m, this.q, this.r, this.s, atqt);
            this.q.setVisibility(0);
        }
        if ((auyi.a & 256) != 0) {
            auyc = auyi.j;
            if (auyc == null) {
                auyc = auyc.c;
            }
            atqt = auyc.b;
            if (atqt == null) {
                atqt = atqt.h;
            }
            this.j = new acqz(this.k, this.l, this.m, this.I, this.J, this.K, atqt);
            this.I.setVisibility(!this.e.a() ? 4 : 0);
            this.e.a(this);
        }
        auyc = auyi.d;
        if (auyc == null) {
            auyc = auyc.c;
        }
        if ((auyc.a & 1) != 0) {
            auyc = auyi.d;
            if (auyc == null) {
                auyc = auyc.c;
            }
            atqt = auyc.b;
            if (atqt == null) {
                atqt = atqt.h;
            }
            this.d = new acqz(this.k, this.l, this.m, this.w, this.x, this.y, atqt);
            this.w.setVisibility(0);
        }
        auyc = auyi.e;
        if (auyc == null) {
            auyc = auyc.c;
        }
        if ((auyc.a & 1) != 0) {
            activity2 = this.k;
            akvp2 = this.l;
            aaas2 = this.m;
            view2 = this.C;
            textView = this.D;
            switchCompat = this.E;
            auyc auyc2 = auyi.e;
            if (auyc2 == null) {
                auyc2 = auyc.c;
            }
            atqt atqt2 = auyc2.b;
            if (atqt2 == null) {
                atqt2 = atqt.h;
            }
            this.f = new acqz(activity2, akvp2, aaas2, view2, textView, switchCompat, atqt2);
            this.C.setVisibility(0);
            auyc = auyi.g;
            if (auyc == null) {
                auyc = auyc.c;
            }
            if ((auyc.a & 1) != 0) {
                activity2 = this.k;
                akvp2 = this.l;
                aaas2 = this.m;
                view2 = this.F;
                textView = this.G;
                switchCompat = this.H;
                auyc2 = auyi.g;
                if (auyc2 == null) {
                    auyc2 = auyc.c;
                }
                atqt2 = auyc2.b;
                if (atqt2 == null) {
                    atqt2 = atqt.h;
                }
                this.g = new acqz(activity2, akvp2, aaas2, view2, textView, switchCompat, atqt2);
                this.F.setVisibility(!this.f.a() ? 8 : 0);
                this.f.a(this);
            }
        }
        auym auym = auyi.f;
        if (auym == null) {
            auym = auym.c;
        }
        if ((auym.a & 1) != 0) {
            atqt atqt3;
            auym = auyi.f;
            if (auym == null) {
                auym = auym.c;
            }
            auyk auyk = auym.b;
            if (auyk == null) {
                auyk = auyk.f;
            }
            auyc auyc3 = auyk.b;
            if (auyc3 == null) {
                auyc3 = auyc.c;
            }
            if ((auyc3.a & 1) != 0) {
                activity2 = this.k;
                akvp2 = this.l;
                aaas2 = this.m;
                view2 = this.z;
                textView = this.A;
                switchCompat = this.B;
                atqt3 = auyc3.b;
                if (atqt3 == null) {
                    atqt3 = atqt.h;
                }
                this.h = new acqz(activity2, akvp2, aaas2, view2, textView, switchCompat, atqt3);
                this.z.setVisibility(0);
            }
            auye auye = auyk.c;
            if (auye == null) {
                auye = auye.c;
            }
            if ((auye.a & 1) != 0) {
                Spinner spinner = this.b;
                atqy atqy = auye.b;
                if (atqy == null) {
                    atqy = atqy.e;
                }
                a(spinner, atqy);
                this.b.setVisibility(0);
            }
            auyc3 = auyk.d;
            if (auyc3 == null) {
                auyc3 = auyc.c;
            }
            if ((auyc3.a & 1) != 0) {
                activity2 = this.k;
                akvp2 = this.l;
                aaas2 = this.m;
                view2 = this.t;
                textView = this.u;
                switchCompat = this.v;
                atqt3 = auyc3.b;
                if (atqt3 == null) {
                    atqt3 = atqt.h;
                }
                this.i = new acqz(activity2, akvp2, aaas2, view2, textView, switchCompat, atqt3);
                this.t.setVisibility(0);
                auye auye2 = auyk.e;
                if (auye2 == null) {
                    auye2 = auye.c;
                }
                if ((auye2.a & 1) != 0) {
                    Spinner spinner2 = this.c;
                    atqy atqy2 = auye2.b;
                    if (atqy2 == null) {
                        atqy2 = atqy.e;
                    }
                    a(spinner2, atqy2);
                    Spinner spinner3 = this.c;
                    if (!this.i.a()) {
                        i = 8;
                    }
                    spinner3.setVisibility(i);
                    this.i.a(this);
                }
            }
        }
    }

    private final void a(Spinner spinner, atqy atqy) {
        if (spinner != null && atqy != null) {
            acrb acrb = new acrb(this.k, this.l, atqy);
            spinner.setAdapter(acrb);
            aodx aodx = atqy.d;
            if (aodx == null) {
                aodx = aodx.c;
            }
            if ((aodx.a & 1) != 0) {
                aodx aodx2 = atqy.d;
                if (aodx2 == null) {
                    aodx2 = aodx.c;
                }
                aodv aodv = aodx2.b;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                spinner.setContentDescription(aodv.b);
            }
            for (int i = 0; i < acrb.getCount(); i++) {
                if (((atra) acrb.getItem(i)).g) {
                    spinner.setSelection(i, false);
                    return;
                }
            }
        }
    }

    public final void onClick(View view) {
        if (view == this.o) {
            this.n.ab();
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = 8;
        View view;
        if (compoundButton == this.E) {
            view = this.F;
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
        } else if (compoundButton == this.v) {
            Spinner spinner = this.c;
            if (z) {
                i = 0;
            }
            spinner.setVisibility(i);
        } else if (compoundButton == this.s) {
            view = this.I;
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }
}
