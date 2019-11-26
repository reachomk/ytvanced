package com.google.android.apps.youtube.app.settings.developer;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import com.google.android.youtube.R;
import defpackage.dvg;
import defpackage.dvk;
import defpackage.jcg;
import defpackage.jcv;
import defpackage.jcw;
import defpackage.jcx;
import defpackage.jcy;
import defpackage.jdd;
import defpackage.voe;
import defpackage.voi;
import defpackage.voj;
import defpackage.xfc;
import java.util.List;

public class DebugOnlineAdActivity extends dvg {
    public voe l;
    public final Context m = this;
    public boolean n;
    public CheckBox o;
    public CheckBox p;
    public List q;
    public jcx r;
    private Button s;
    private LinearLayout t;
    private Spinner u;
    private EditText v;
    private Spinner w;
    private EditText x;
    private Spinner y;
    private EditText z;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        finish();
        super.onCreate(bundle);
        setContentView((int) R.layout.debug_online_ads);
        this.q = this.l.c();
        this.p = (CheckBox) findViewById(R.id.disable_freq_cap);
        this.s = (Button) findViewById(R.id.add_ad_break);
        this.r = new jcx(this);
        this.r.setNotifyOnChange(true);
        this.t = (LinearLayout) findViewById(R.id.list_view);
        n();
        this.o = (CheckBox) findViewById(R.id.enable_debug_ad);
        this.n = this.l.a();
        this.v = (EditText) findViewById(R.id.homepage_entry);
        this.u = (Spinner) findViewById(R.id.homepage_spinner);
        this.u.setAdapter(new ArrayAdapter(this.m, R.layout.spinner_item, voi.a()));
        this.u.setOnItemSelectedListener(new jdd(this, this.v, voj.BROWSE));
        this.u.setSelection(voi.a(this.l.a(voj.BROWSE), true));
        this.u.setEnabled(this.n);
        this.x = (EditText) findViewById(R.id.search_entry);
        this.w = (Spinner) findViewById(R.id.search_spinner);
        this.w.setAdapter(new ArrayAdapter(this.m, R.layout.spinner_item, voi.b()));
        this.w.setOnItemSelectedListener(new jdd(this, this.x, voj.SEARCH));
        this.w.setSelection(voi.a(this.l.a(voj.SEARCH), false));
        this.w.setEnabled(this.n);
        this.z = (EditText) findViewById(R.id.watch_entry);
        this.y = (Spinner) findViewById(R.id.watch_spinner);
        this.y.setAdapter(new ArrayAdapter(this.m, R.layout.spinner_item, voi.c()));
        this.y.setOnItemSelectedListener(new jdd(this, this.z, voj.WATCH_NEXT));
        this.y.setSelection(voi.a(this.l.a(voj.WATCH_NEXT), false));
        this.y.setEnabled(this.n);
        this.p.setOnClickListener(new jcw(this));
        this.s.setOnClickListener(new jcv(this));
        this.o.setOnClickListener(new jcy(this));
    }

    /* Access modifiers changed, original: protected|final */
    public final void l() {
        ((jcg) ((xfc) getApplication()).n()).a(new dvk(this)).a(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onResume() {
        super.onResume();
        this.o.setChecked(this.l.a());
        this.r.notifyDataSetChanged();
        u();
    }

    public final void n() {
        LinearLayout linearLayout = this.t;
        if (linearLayout != null && this.r != null) {
            linearLayout.removeAllViews();
            for (int i = 0; i < this.r.getCount(); i++) {
                LinearLayout linearLayout2 = this.t;
                linearLayout2.addView(this.r.getView(i, null, linearLayout2));
            }
        }
    }

    public final void u() {
        boolean isChecked = this.o.isChecked();
        this.r.a(isChecked);
        this.s.setEnabled(isChecked);
        this.u.setEnabled(isChecked);
        this.w.setEnabled(isChecked);
        this.y.setEnabled(isChecked);
    }

    public final String a(voi voi, voj voj) {
        int ordinal = voi.ordinal();
        if (ordinal == 12) {
            this.l.c(voj);
        } else if (ordinal == 13) {
            this.l.b(voj);
        } else if (ordinal == 15) {
            this.l.a.getString(voj.h, null);
        }
        return null;
    }
}
