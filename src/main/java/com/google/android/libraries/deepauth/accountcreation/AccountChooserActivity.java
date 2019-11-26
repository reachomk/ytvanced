package com.google.android.libraries.deepauth.accountcreation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.aej;
import defpackage.anbp;
import defpackage.aodi;
import defpackage.bqy;
import defpackage.brl;
import defpackage.cgg;
import defpackage.nn;
import defpackage.ses;
import defpackage.sfe;
import defpackage.sfq;
import defpackage.sfz;
import defpackage.sga;
import defpackage.sge;
import defpackage.sgo;
import defpackage.sgp;
import defpackage.sgr;
import defpackage.sgu;
import defpackage.sgz;
import defpackage.sjq;
import defpackage.sjt;
import defpackage.tpn;
import defpackage.tpp;
import defpackage.trs;
import defpackage.tru;
import java.util.Map;

public class AccountChooserActivity extends aej implements sgu {
    public static final sfz g = sfz.a(4);
    public sfe h;
    public sgr i;
    private ses j;
    private sgz k;
    private brl l;
    private tpn m;
    private TextView n;
    private boolean o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t = null;

    public static Intent a(Context context, ses ses) {
        return new Intent(context, AccountChooserActivity.class).putExtra("COMPLETION_STATE", ses);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.j = (ses) getIntent().getExtras().getParcelable("COMPLETION_STATE");
        this.k = this.j.a();
        if (!sjq.a((Activity) this, this.k)) {
            this.h = new sfe(getApplication(), this.k, sga.b.a());
            this.l = bqy.a((nn) this).b((cgg) new cgg().h());
            this.m = new tpn();
            setContentView((int) R.layout.gdi_account_chooser);
            if (k() != null) {
                this.i = (sgr) k();
            } else if (this.i == null) {
                this.i = new sgr(this.j.a(getApplication()), this.k);
            }
            this.n = (TextView) findViewById(R.id.credential_chooser_heading);
            Map map = this.k.l;
            this.q = (String) map.get(a("google_account_chip_accessibility_hint"));
            this.r = (String) map.get(a("use_another_account_chip_text"));
            this.s = (String) map.get(a("use_another_account_accessibility_hint"));
            this.p = (String) map.get(a("title"));
            this.t = (String) map.get(a("subtitle"));
            this.n.setMovementMethod(LinkMovementMethod.getInstance());
            if (TextUtils.isEmpty(this.p)) {
                this.n.setText(getResources().getString(R.string.gdi_choose_account_title, new Object[]{this.k.b}));
            } else {
                this.n.setText(sjt.a(this.p, this));
                this.n.setMovementMethod(new LinkMovementMethod());
            }
            TextView textView = (TextView) findViewById(R.id.credential_chooser_subtitle);
            if (TextUtils.isEmpty(this.t)) {
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            textView.setText(sjt.a(this.t, this));
            textView.setMovementMethod(new LinkMovementMethod());
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
            this.h.a(g, aodi.EVENT_ACCOUNT_SELECTION_CANCEL);
        }
        return onTouchEvent;
    }

    public final void onBackPressed() {
        this.h.a(g, aodi.EVENT_ACCOUNT_SELECTION_CANCEL);
        setResult(4000);
        finish();
    }

    public final void a(sge sge) {
        sge sge2 = sge;
        if (!this.o) {
            this.o = true;
            if (sge2 != null) {
                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.credential_chooser_credential_holder);
                View inflate = LayoutInflater.from(this).inflate(R.layout.gdi_single_credential_list_item, viewGroup, false);
                TextView textView = (TextView) inflate.findViewById(R.id.credential_primary_label);
                TextView textView2 = (TextView) inflate.findViewById(R.id.credential_secondary_label);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.credential_info_profile_picture);
                if (TextUtils.isEmpty(sge2.b)) {
                    textView.setText(sge2.a);
                    textView2.setVisibility(8);
                } else {
                    textView.setText(sge2.b);
                    textView2.setText(sge2.a);
                    textView2.setVisibility(0);
                }
                inflate.setOnClickListener(new sgp(this));
                if (TextUtils.isEmpty(sge2.c)) {
                    this.l.a(Integer.valueOf(R.drawable.product_logo_avatar_anonymous_color_48)).a(imageView);
                } else {
                    try {
                        this.l.a(this.m.a(getResources().getDimensionPixelSize(R.dimen.gdi_credential_avatar_size), Uri.parse(sge2.c))).a(imageView);
                    } catch (tpp e) {
                        Log.e("AccountChooserActivity", "Invalid avatar image url", e);
                        this.l.a(Integer.valueOf(R.drawable.product_logo_avatar_anonymous_color_48)).a(imageView);
                    }
                }
                if (!TextUtils.isEmpty(this.q)) {
                    inflate.setContentDescription(this.q);
                }
                trs trs = new trs(anbp.b.a);
                trs.a();
                tru.a(inflate, trs);
                this.h.a(inflate, g);
                viewGroup.addView(inflate);
            }
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.credential_chooser_credential_holder);
            View inflate2 = LayoutInflater.from(this).inflate(R.layout.gdi_single_credential_list_item, viewGroup2, false);
            TextView textView3 = (TextView) inflate2.findViewById(R.id.credential_primary_label);
            TextView textView4 = (TextView) inflate2.findViewById(R.id.credential_secondary_label);
            ImageView imageView2 = (ImageView) inflate2.findViewById(R.id.credential_info_profile_picture);
            CharSequence string = getResources().getString(R.string.gdi_use_another_account, new Object[]{this.k.b});
            if (!TextUtils.isEmpty(this.r)) {
                string = this.r;
            }
            if (!TextUtils.isEmpty(this.s)) {
                inflate2.setContentDescription(this.s);
            }
            this.l.a(Integer.valueOf(R.drawable.product_logo_avatar_anonymous_color_48)).a(imageView2);
            textView3.setText(string);
            textView4.setVisibility(8);
            inflate2.setOnClickListener(new sgo(this));
            trs trs2 = new trs(anbp.c.a);
            trs2.a();
            tru.a(inflate2, trs2);
            this.h.a(inflate2, g);
            viewGroup2.addView(inflate2);
        }
    }

    public final void a(sfq sfq) {
        setResult(8000, new Intent().putExtra("TOKEN_RESPONSE", sfq));
        finish();
    }

    private static String a(String str) {
        str = String.valueOf(str);
        String str2 = "select_account.";
        return str.length() == 0 ? new String(str2) : str2.concat(str);
    }
}
