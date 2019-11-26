package com.google.android.apps.youtube.app.application.upgrade;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Spanned;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import defpackage.aaas;
import defpackage.aabb;
import defpackage.acvs;
import defpackage.acvx;
import defpackage.acwc;
import defpackage.acwl;
import defpackage.aej;
import defpackage.ajqy;
import defpackage.anxl;
import defpackage.anxr;
import defpackage.apxu;
import defpackage.arml;
import defpackage.aumm;
import defpackage.aysl;
import defpackage.ayvl;
import defpackage.duy;
import defpackage.duz;
import defpackage.dva;
import defpackage.fmu;
import defpackage.wxk;
import defpackage.xev;
import defpackage.xse;
import defpackage.xsg;
import defpackage.xul;
import defpackage.zzf;
import java.util.concurrent.TimeUnit;

public class NewVersionAvailableActivity extends aej implements OnClickListener {
    public TextView g;
    public TextView h;
    public ProgressBar i;
    public View j;
    public acvx k;
    public zzf l;
    public SharedPreferences m;
    private TextView n;
    private TextView o;
    private TextView p;
    private View q;
    private TextView r;
    private CountDownTimer s;
    private int t = 8;
    private Intent u;
    private int v;
    private final aaas w = new duz(this);

    public final void onCreate(Bundle bundle) {
        fmu.a(this);
        super.onCreate(bundle);
        ((dva) xse.a(xsg.a(getApplicationContext()))).e(new xev(this)).a(this);
        setContentView((int) R.layout.new_version_available_activity);
        Intent intent = getIntent();
        this.u = (Intent) intent.getParcelableExtra("forward_intent");
        this.v = intent.getIntExtra("upgrade_enforcement_type", 0);
        this.n = (TextView) findViewById(R.id.install_button);
        this.n.setOnClickListener(this);
        this.q = findViewById(R.id.install_button_background);
        this.p = (TextView) findViewById(R.id.upgrade_details);
        this.o = (TextView) findViewById(R.id.title);
        this.g = (TextView) findViewById(R.id.later_button);
        this.i = (ProgressBar) findViewById(R.id.skip_timer_progress_bar);
        this.j = findViewById(R.id.skip_timer);
        this.h = (TextView) findViewById(R.id.progress_counter_text);
        this.r = (TextView) findViewById(R.id.timer_text);
        m();
        int i = this.v;
        if (i == 3) {
            this.k.a(acwl.W, null, null);
            this.k.b(acwc.NEW_VERSION_AVAILABLE_UPGRADE_BUTTON, null);
            this.g.setVisibility(8);
            this.j.setVisibility(8);
        } else if (i == 2) {
            this.k.a(acwl.Y, null, null);
            this.k.b(acwc.NEW_VERSION_AVAILABLE_UPGRADE_BUTTON, null);
            this.k.b(acwc.NEW_VERSION_AVAILABLE_LATER_BUTTON, null);
            this.g.setVisibility(8);
            this.j.setVisibility(0);
            this.g.setOnClickListener(this);
        } else {
            this.k.a(acwl.X, null, null);
            this.k.b(acwc.NEW_VERSION_AVAILABLE_UPGRADE_BUTTON, null);
            this.k.b(acwc.NEW_VERSION_AVAILABLE_LATER_BUTTON, null);
            this.g.setOnClickListener(this);
            this.j.setVisibility(8);
        }
    }

    private final void m() {
        aysl n = this.l.n();
        if ((n.a & 64) != 0) {
            aumm aumm = n.e;
            if (aumm == null) {
                aumm = aumm.j;
            }
            arml arml = aumm.f;
            if (arml == null) {
                arml = arml.f;
            }
            Spanned a = ajqy.a(arml);
            if (a != null) {
                this.g.setText(a);
            }
            arml = aumm.e;
            if (arml == null) {
                arml = arml.f;
            }
            a = ajqy.a(arml);
            if (a != null) {
                this.n.setText(a);
            }
            arml = aumm.d;
            if (arml == null) {
                arml = arml.f;
            }
            a = aabb.a(arml, this.w, false);
            if (a != null) {
                this.p.setText(a);
            }
            arml = aumm.g;
            if (arml == null) {
                arml = arml.f;
            }
            a = ajqy.a(arml);
            if (a != null) {
                this.r.setText(a);
            }
            int max = (int) Math.max(aumm.c, 8);
            this.t = max;
            this.h.setText(String.valueOf(max));
            arml = aumm.h;
            if (arml == null) {
                arml = arml.f;
            }
            a = ajqy.a(arml);
            if (a != null && a.length() > 0) {
                this.o.setText(a);
            }
            if (aumm.i) {
                this.n.setVisibility(8);
                this.q.setVisibility(8);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStart() {
        super.onStart();
        if (this.v == 2 && this.j.getVisibility() == 0) {
            this.s = new duy(this, TimeUnit.SECONDS.toMillis((long) this.t));
            this.i.setMax(this.t);
            this.s.start();
        }
        m();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStop() {
        super.onStop();
        CountDownTimer countDownTimer = this.s;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (this.v != 2) {
            l();
        }
    }

    public final void l() {
        this.m.edit().putLong("upgrade_prompt_shown_millis", System.currentTimeMillis()).apply();
    }

    public final void onBackPressed() {
        if (this.g.getVisibility() == 0) {
            l();
            n();
            return;
        }
        finish();
    }

    public final void onClick(View view) {
        if (view != this.n) {
            if (view == this.g) {
                l();
                n();
            }
            return;
        }
        this.k.a(3, new acvs(acwc.NEW_VERSION_AVAILABLE_UPGRADE_BUTTON), null);
        int i = this.v;
        String str = i != 1 ? i != 2 ? i != 3 ? "unknown" : "force" : "timer" : "suggest";
        wxk.a(this, "app", "prompt", str, xul.b(this));
        finish();
    }

    private final void n() {
        if (this.u != null) {
            this.k.a(3, new acvs(acwc.NEW_VERSION_AVAILABLE_LATER_BUTTON), null);
            startActivity(this.u);
        }
        finish();
    }

    public final /* synthetic */ void a(apxu apxu) {
        anxr access$000 = anxl.checkIsLite(UrlEndpointOuterClass.urlEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(UrlEndpointOuterClass.urlEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            wxk.b((Context) this, Uri.parse(((ayvl) b).b));
        }
    }
}
