package com.google.android.libraries.youtube.offline.developer;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.afpt;
import defpackage.afpu;
import defpackage.agjb;
import defpackage.agjd;
import defpackage.agje;
import defpackage.agjf;
import defpackage.agjg;
import defpackage.agjh;
import defpackage.agji;
import defpackage.agjk;
import defpackage.agjm;
import defpackage.agjq;
import defpackage.agjs;
import defpackage.agvz;
import defpackage.agwc;
import defpackage.aknw;
import defpackage.akoc;
import defpackage.akoe;
import defpackage.akpk;
import defpackage.bcaa;
import defpackage.vfn;
import defpackage.vnx;
import defpackage.voe;
import defpackage.xfc;
import defpackage.xsc;
import java.util.concurrent.TimeUnit;

public class DebugOfflineAdActivity extends Activity {
    public ListView a;
    public TextView b;
    public akpk c;
    public agvz d;
    public vnx e;
    public xsc f;
    public afpu g;
    public bcaa h;
    public akoe i;
    public SharedPreferences j;
    public voe k;
    public vfn l;
    private TextView m;
    private TextView n;
    private Button o;
    private Button p;
    private Button q;
    private Button r;
    private TextView s;
    private Button t;
    private Button u;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        finish();
        super.onCreate(bundle);
        ((agjb) ((xfc) getApplication()).n()).pm().a(this);
        setContentView(R.layout.debug_offline_ad_layout);
        this.m = (TextView) findViewById(R.id.account_header);
        this.n = (TextView) findViewById(R.id.not_signed_in_error_view);
        this.c = new akpk();
        aknw aknw = new aknw();
        aknw.a(agjq.class, new agjs(this, this.i));
        akoc a = this.i.a(aknw);
        a.a(this.c);
        this.a = (ListView) findViewById(R.id.list);
        this.b = (TextView) findViewById(16908292);
        this.a.setAdapter(a);
        this.o = (Button) findViewById(R.id.increment_playback_count_button);
        this.o.setOnClickListener(new agje(this));
        this.p = (Button) findViewById(R.id.reset_playback_count_button);
        this.p.setOnClickListener(new agjd(this));
        this.q = (Button) findViewById(R.id.expire_now_button);
        this.q.setOnClickListener(new agjg(this));
        this.r = (Button) findViewById(R.id.expire_6hr_button);
        this.r.setOnClickListener(new agjf(this));
        this.s = (TextView) findViewById(R.id.last_ad_complete_time);
        this.t = (Button) findViewById(R.id.last_ad_complete_now_button);
        this.t.setOnClickListener(new agji(this));
        this.u = (Button) findViewById(R.id.last_ad_complete_past_button);
        this.u.setOnClickListener(new agjh(this));
        CheckBox checkBox = (CheckBox) findViewById(R.id.force_enable_ads_checkbox);
        checkBox.setChecked(this.j.getBoolean("debug_offline_force_ads", false));
        checkBox.setOnCheckedChangeListener(new agjk(this, checkBox));
        if (this.g.a()) {
            CharSequence str;
            afpt c = this.g.c();
            TextView textView = this.m;
            String valueOf = String.valueOf(c.toString());
            String str2 = "Signed in as ";
            if (valueOf.length() == 0) {
                str = new String(str2);
            } else {
                str = str2.concat(valueOf);
            }
            textView.setText(str);
            this.d = ((agwc) this.h.get()).b();
        } else {
            this.n.setVisibility(0);
            this.o.setEnabled(false);
            this.p.setEnabled(false);
            this.q.setEnabled(false);
            this.r.setEnabled(false);
        }
        a();
    }

    private final void a() {
        long j = this.e.f;
        j = Math.min(9, (this.f.a() - j) / TimeUnit.MINUTES.toMillis(1));
        TextView textView = this.s;
        String l = Long.toString(j);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(l).length() + 5);
        stringBuilder.append(">=");
        stringBuilder.append(l);
        stringBuilder.append("min");
        textView.setText(stringBuilder.toString());
    }

    public final void a(long j) {
        this.e.a(j);
        a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onResume() {
        super.onResume();
        new agjm(this).execute(new Void[]{null});
        this.b.setVisibility(0);
        this.b.setText("Loading...");
    }
}
