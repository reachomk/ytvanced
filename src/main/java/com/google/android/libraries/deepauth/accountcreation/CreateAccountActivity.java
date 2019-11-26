package com.google.android.libraries.deepauth.accountcreation;

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
import defpackage.aodi;
import defpackage.ses;
import defpackage.sfe;
import defpackage.sfq;
import defpackage.sfz;
import defpackage.sga;
import defpackage.sgc;
import defpackage.sgv;
import defpackage.sgw;
import defpackage.sgy;
import defpackage.sgz;
import defpackage.sha;
import defpackage.sjq;
import defpackage.sjt;
import java.util.Map;

public class CreateAccountActivity extends aej implements sha {
    public sfe g;
    public sfz h;
    public sgy i;
    private ses j;
    private sgz k;
    private TextView l;
    private TextView m;
    private Button n;
    private Button o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private final OnClickListener u = new sgw(this);
    private final OnClickListener v = new sgv(this);

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.j = (ses) getIntent().getParcelableExtra("COMPLETION_STATE");
        this.k = this.j.a();
        if (!sjq.a((Activity) this, this.k)) {
            this.g = new sfe(getApplication(), this.k, sga.b.a());
            setContentView((int) R.layout.gdi_create_account);
            this.h = sfz.c();
            if (k() != null) {
                this.i = (sgy) k();
            } else if (this.i == null) {
                this.i = new sgy(this.j.c(getApplication()));
            }
            Map map = this.k.l;
            this.p = (String) map.get(a("title"));
            this.q = (String) map.get(a("action_button_text"));
            this.r = (String) map.get(a("cancel_button_text"));
            this.s = (String) map.get(a("subtitle"));
            this.t = (String) map.get(a("fine_print"));
            this.l = (TextView) findViewById(R.id.create_account_heading);
            this.m = (TextView) findViewById(R.id.fine_print);
            this.n = (Button) findViewById(R.id.allow_button);
            this.n.setOnClickListener(this.u);
            if (!TextUtils.isEmpty(this.q)) {
                this.n.setText(this.q);
            }
            this.g.a(this.n, this.h);
            this.o = (Button) findViewById(R.id.cancel_button);
            this.o.setOnClickListener(this.v);
            if (!TextUtils.isEmpty(this.r)) {
                this.o.setText(this.r);
            }
            TextView textView = (TextView) findViewById(R.id.create_account_subtitle);
            if (!TextUtils.isEmpty(this.s)) {
                textView.setText(sjt.a(this.s, this));
                textView.setMovementMethod(new LinkMovementMethod());
                textView.setVisibility(0);
            }
            String str = this.k.b;
            if (TextUtils.isEmpty(this.p)) {
                this.l.setText(getResources().getString(R.string.gdi_create_account_heading, new Object[]{str}));
            } else {
                this.l.setText(sjt.a(this.p, this));
                this.l.setMovementMethod(new LinkMovementMethod());
            }
            sgz sgz = this.k;
            String str2 = sgz.b;
            String str3 = sgz.d;
            String str4 = sgz.c;
            sgc sgc = sgz.h;
            if (TextUtils.isEmpty(this.t)) {
                CharSequence spannableStringBuilder;
                if (sgc == null || TextUtils.isEmpty(sgc.b)) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(String.format(getResources().getString(R.string.gdi_fine_print_preamble), new Object[]{str2}));
                    String string = getResources().getString(R.string.gdi_app_terms);
                    String string2 = getResources().getString(R.string.gdi_privacy_policy);
                    sjt.a(this, spannableStringBuilder, string, str3);
                    spannableStringBuilder.append(getResources().getString(R.string.gdi_and_spaced));
                    sjt.a(this, spannableStringBuilder, string2, str4);
                    spannableStringBuilder.append(getResources().getString(R.string.gdi_fine_print_middle, new Object[]{str2}));
                } else {
                    spannableStringBuilder = sjt.a(sgc.b, str3, str4, sgc.a, this);
                }
                this.m.setMovementMethod(new LinkMovementMethod());
                this.m.setText(spannableStringBuilder);
            } else {
                this.m.setText(sjt.a(this.t, this));
                this.m.setMovementMethod(new LinkMovementMethod());
            }
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
        setResult(4000);
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
