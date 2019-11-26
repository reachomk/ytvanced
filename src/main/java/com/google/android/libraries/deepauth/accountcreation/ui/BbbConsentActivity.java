package com.google.android.libraries.deepauth.accountcreation.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.aej;
import defpackage.aodi;
import defpackage.ses;
import defpackage.sex;
import defpackage.sez;
import defpackage.sfe;
import defpackage.sfq;
import defpackage.sfz;
import defpackage.sga;
import defpackage.sgc;
import defpackage.sgz;
import defpackage.she;
import defpackage.shf;
import defpackage.sjq;
import defpackage.sjt;
import defpackage.sjv;
import java.util.Map;

public class BbbConsentActivity extends aej implements sez {
    public static final sfz g = sfz.a(5);
    public sex h;
    public sfe i;
    private TextView j;
    private TextView k;
    private TextView l;
    private Button m;
    private Button n;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ses ses = (ses) getIntent().getParcelableExtra("COMPLETION_STATE");
        sgz a = ses.a();
        if (!sjq.a((Activity) this, a)) {
            this.i = new sfe(getApplication(), a, sga.b.a());
            if (k() != null) {
                this.h = (sex) k();
            } else if (this.h == null) {
                this.h = new sex(ses.b(getApplication()));
            }
            setContentView((int) R.layout.gdi_bbb_consent);
            this.j = (TextView) findViewById(R.id.bbb_consent_text);
            this.l = (TextView) findViewById(R.id.bbb_consent_learn_more);
            this.k = (TextView) findViewById(R.id.bbb_consent_subheading);
            this.m = (Button) findViewById(R.id.bbb_consent_confirm_button);
            this.m.setOnClickListener(new she(this));
            this.n = (Button) findViewById(R.id.bbb_consent_deny_button);
            this.n.setOnClickListener(new shf(this));
            this.i.a(this.m, g);
            Map map = a.l;
            String str = (String) map.get("consent.title");
            String str2 = a.b;
            sgc sgc = a.h;
            CharSequence spannableStringBuilder = new SpannableStringBuilder();
            if (TextUtils.isEmpty(str)) {
                spannableStringBuilder.append(getString(R.string.gdi_bbb_consent_title, new Object[]{str2}));
                this.l.setText(sjt.a(this, new SpannableStringBuilder(), getString(R.string.gdi_learn_more_link), sgc.a));
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.j.getLayoutParams();
                marginLayoutParams.bottomMargin = 0;
                this.j.setLayoutParams(marginLayoutParams);
                this.l.setVisibility(0);
                this.l.setMovementMethod(new LinkMovementMethod());
            } else {
                spannableStringBuilder = sjt.a(str, this);
            }
            this.j.setMovementMethod(new LinkMovementMethod());
            this.j.setText(spannableStringBuilder);
            String str3 = (String) map.get("consent.subtitle");
            if (!TextUtils.isEmpty(str3)) {
                this.k.setText(sjt.a(str3, this));
                this.k.setVisibility(0);
                this.k.setMovementMethod(new LinkMovementMethod());
            }
            str3 = (String) map.get("consent.action_button_text");
            if (!TextUtils.isEmpty(str3)) {
                this.m.setText(str3);
            }
            String str4 = (String) map.get("consent.cancel_button_text");
            if (!TextUtils.isEmpty(str4)) {
                this.n.setText(str4);
            }
            sjv.a(this.j);
            sjv.a(this.m);
            sjv.a(this.n);
            sjv.b(this.l);
            sjv.b(this.k);
        }
    }

    public final Object x_() {
        return this.h;
    }

    public final void onStart() {
        this.h.a(this);
        super.onStart();
    }

    public final void onStop() {
        this.h.a(null);
        super.onStop();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.i.a(g, aodi.EVENT_PROVIDER_CONSENT_CANCEL);
        }
        return onTouchEvent;
    }

    public final void onBackPressed() {
        this.i.a(g, aodi.EVENT_PROVIDER_CONSENT_CANCEL);
        setResult(4000);
        finish();
    }

    public static Intent a(Context context, ses ses) {
        return new Intent(context, BbbConsentActivity.class).putExtra("COMPLETION_STATE", ses);
    }

    public final void a(sfq sfq) {
        setResult(8000, new Intent().putExtra("TOKEN_RESPONSE", sfq));
        finish();
    }
}
