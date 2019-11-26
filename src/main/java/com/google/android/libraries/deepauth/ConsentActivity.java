package com.google.android.libraries.deepauth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.aej;
import defpackage.aodi;
import defpackage.ses;
import defpackage.sew;
import defpackage.sex;
import defpackage.sez;
import defpackage.sfe;
import defpackage.sfq;
import defpackage.sfz;
import defpackage.sga;
import defpackage.sgc;
import defpackage.sgz;
import defpackage.sjq;
import defpackage.sjt;
import java.util.Map;

public class ConsentActivity extends aej implements sez {
    public static final sfz g = sfz.a(5);
    public sex h;
    public sfe i;
    private sgz j;
    private TextView k;
    private TextView l;
    private Button m;

    public static Intent a(Context context, ses ses) {
        return new Intent(context, ConsentActivity.class).putExtra("COMPLETION_STATE", ses);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ses ses = (ses) getIntent().getParcelableExtra("COMPLETION_STATE");
        this.j = ses.a();
        if (!sjq.a((Activity) this, this.j)) {
            this.i = new sfe(getApplication(), this.j, sga.b.a());
            setContentView((int) R.layout.gdi_consent);
            if (k() != null) {
                this.h = (sex) k();
            } else if (this.h == null) {
                this.h = new sex(ses.b(getApplication()));
            }
            this.k = (TextView) findViewById(R.id.consent_text);
            this.l = (TextView) findViewById(R.id.consent_subheading);
            this.m = (Button) findViewById(R.id.consent_ok_button);
            this.m.setOnClickListener(new sew(this));
            this.i.a(this.m, g);
            Map map = this.j.l;
            String str = (String) map.get("consent.title");
            SpannableStringBuilder a;
            if (TextUtils.isEmpty(str)) {
                sgz sgz = this.j;
                sgc sgc = sgz.h;
                if (sgc == null) {
                    Log.e("ConsentActivity", "neither consent.title nor consent info provided");
                    setResult(5000);
                    finish();
                } else {
                    a = sjt.a(sgc.b, sgz.d, sgz.c, sgc.a, this);
                    this.k.setMovementMethod(new LinkMovementMethod());
                    this.k.setText(a);
                }
            } else {
                a = sjt.a(str, this);
                this.k.setMovementMethod(new LinkMovementMethod());
                this.k.setText(a);
            }
            str = (String) map.get("consent.subtitle");
            if (!TextUtils.isEmpty(str)) {
                this.l.setText(sjt.a(str, this));
                this.l.setVisibility(0);
                this.l.setMovementMethod(new LinkMovementMethod());
            }
            String str2 = (String) map.get("consent.action_button_text");
            if (!TextUtils.isEmpty(str2)) {
                this.m.setText(str2);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStart() {
        super.onStart();
        this.h.a(this);
    }

    /* Access modifiers changed, original: protected|final */
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

    public final void a(sfq sfq) {
        setResult(8000, new Intent().putExtra("TOKEN_RESPONSE", sfq));
        finish();
    }
}
