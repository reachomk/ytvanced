package com.google.android.libraries.deepauth.accountcreation.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.aej;
import defpackage.anbp;
import defpackage.aodi;
import defpackage.ses;
import defpackage.sfe;
import defpackage.sfq;
import defpackage.sfz;
import defpackage.sga;
import defpackage.sgc;
import defpackage.sgy;
import defpackage.sgz;
import defpackage.sha;
import defpackage.shg;
import defpackage.shh;
import defpackage.shj;
import defpackage.sjq;
import defpackage.sjt;
import defpackage.sjv;
import defpackage.trs;
import defpackage.tru;
import java.util.Map;

public class BbbCreateAccountActivity extends aej implements sha {
    public sfe g;
    public sfz h;
    public sgy i;
    public Button j;
    private ses k;
    private sgz l;
    private TextView m;
    private TextView n;
    private TextView o;
    private Button p;
    private Button q;
    private String r;
    private String s;
    private String t;
    private String u;
    private String v;
    private String w;
    private final OnClickListener x = new shh(this);

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k = (ses) getIntent().getParcelableExtra("COMPLETION_STATE");
        this.l = this.k.a();
        if (!sjq.a((Activity) this, this.l)) {
            this.g = new sfe(getApplication(), this.l, sga.b.a());
            setContentView((int) R.layout.gdi_bbb_create_account);
            this.h = sfz.c();
            if (k() != null) {
                this.i = (sgy) k();
            } else if (this.i == null) {
                this.i = new sgy(this.k.c(getApplication()));
            }
            Map map = this.l.l;
            this.r = (String) map.get(a("title"));
            this.s = (String) map.get(a("action_button_text"));
            this.u = (String) map.get(a("cancel_button_text"));
            this.t = (String) map.get(a("use_another_button_text"));
            this.v = (String) map.get(a("subtitle"));
            this.w = (String) map.get(a("fine_print"));
            if (TextUtils.isEmpty(this.w)) {
                this.w = (String) map.get(a("fine_print.pre_claims_collection"));
            }
            this.m = (TextView) findViewById(R.id.bbb_create_account_heading);
            this.n = (TextView) findViewById(R.id.bbb_create_account_subtitle);
            this.o = (TextView) findViewById(R.id.bbb_fine_print);
            this.p = (Button) findViewById(R.id.bbb_create_account_button);
            this.j = (Button) findViewById(R.id.bbb_already_have_account_button);
            this.q = (Button) findViewById(R.id.bbb_create_cancel_button);
            String string = getResources().getString(R.string.gdi_bbb_create_account_title, new Object[]{this.l.b});
            if (TextUtils.isEmpty(this.r)) {
                this.m.setText(string);
            } else {
                this.m.setText(sjt.a(this.r, this));
                this.m.setMovementMethod(new LinkMovementMethod());
            }
            this.p.setOnClickListener(new shj(this));
            this.p.setText(getString(R.string.gdi_create));
            this.j.setOnClickListener(new shg(this));
            Button button = this.j;
            trs trs = new trs(anbp.c.a);
            trs.a();
            tru.a(button, trs);
            this.g.a(this.j, this.h);
            if (TextUtils.isEmpty(this.t)) {
                this.j.setText(getString(R.string.gdi_bbb_already_have_account, new Object[]{this.l.b}));
            } else {
                this.j.setText(this.t);
            }
            sgz sgz = this.l;
            String str = sgz.b;
            String str2 = sgz.d;
            String str3 = sgz.c;
            sgc sgc = sgz.h;
            if (!TextUtils.isEmpty(this.w)) {
                this.o.setText(sjt.a(this.w, this));
                this.o.setMovementMethod(new LinkMovementMethod());
            } else if (sgc == null || TextUtils.isEmpty(sgc.b)) {
                string = getResources().getString(R.string.gdi_bbb_create_account_fine_print);
                String string2 = getResources().getString(R.string.gdi_bbb_fine_print_terms);
                String string3 = getResources().getString(R.string.gdi_privacy_policy);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                sjt.a(this, spannableStringBuilder, string2, str2);
                sjt.a(this, spannableStringBuilder2, string3, str3);
                this.o.setMovementMethod(new LinkMovementMethod());
                this.o.setText(TextUtils.expandTemplate(string, new CharSequence[]{str, spannableStringBuilder, spannableStringBuilder2, str}));
            } else {
                SpannableStringBuilder a = sjt.a(sgc.b, str2, str3, sgc.a, this);
                this.o.setMovementMethod(new LinkMovementMethod());
                this.o.setText(a);
            }
            if (!TextUtils.isEmpty(this.s)) {
                this.p.setText(this.s);
            }
            this.g.a(this.p, this.h);
            this.q.setOnClickListener(this.x);
            if (!TextUtils.isEmpty(this.u)) {
                this.q.setText(this.u);
            }
            if (!TextUtils.isEmpty(this.v)) {
                this.n.setText(sjt.a(this.v, this));
                this.n.setMovementMethod(new LinkMovementMethod());
                this.n.setVisibility(0);
            }
            sjv.a(this.m);
            sjv.a(this.p);
            sjv.a(this.j);
            sjv.a(this.q);
            sjv.b(this.n);
            sjv.b(this.o);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStart() {
        super.onStart();
        this.i.a(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStop() {
        this.i.a(null);
        super.onStop();
    }

    public final Object x_() {
        return this.i;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.g.a(this.h, aodi.EVENT_ACCOUNT_CREATION_CANCEL);
        }
        return onTouchEvent;
    }

    public final void onBackPressed() {
        this.g.a(this.h, aodi.EVENT_ACCOUNT_CREATION_CANCEL);
        setResult(0);
        finish();
    }

    public final void a(sfq sfq) {
        setResult(8000, new Intent().putExtra("TOKEN_RESPONSE", sfq));
        finish();
    }

    private static String a(String str) {
        str = String.valueOf(str);
        String str2 = "create_account.";
        return str.length() == 0 ? new String(str2) : str2.concat(str);
    }
}
