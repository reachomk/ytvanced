package defpackage;

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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Map;

/* renamed from: shn */
public final class shn extends aej implements sgu {
    public static final sfz g = sfz.a(4);
    public sfe h;
    public sgr i;
    private ses j;
    private sgz k;
    private brl l;
    private tpn m;
    private TextView n;
    private Button o;
    private boolean p = false;
    private String q;
    private String r;
    private String s;

    public static Intent a(Context context, ses ses) {
        return new Intent(context, shn.class).putExtra("COMPLETION_STATE", ses);
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
            setContentView((int) R.layout.gdi_gm2_account_chooser_activity);
            if (k() != null) {
                this.i = (sgr) k();
            } else if (this.i == null) {
                this.i = new sgr(this.j.a(getApplication()), this.k);
            }
            this.n = (TextView) findViewById(R.id.gm2_credential_chooser_heading);
            this.o = (Button) findViewById(R.id.gm2_check_link_button);
            Map map = this.k.l;
            this.s = (String) map.get(shn.a("google_account_chip_accessibility_hint"));
            this.q = (String) map.get(shn.a("title"));
            this.r = (String) map.get(shn.a("subtitle"));
            if (TextUtils.isEmpty(this.q)) {
                this.n.setText(getResources().getString(R.string.gdi_gm2_choose_account_title, new Object[]{this.k.b}));
            } else {
                this.n.setText(sjt.a(this.q, this));
            }
            TextView textView = (TextView) findViewById(R.id.gm2_credential_chooser_subtitle);
            if (TextUtils.isEmpty(this.r)) {
                textView.setText(getString(R.string.gdi_gm2_choose_account_subtitle, new Object[]{this.k.b}));
            } else {
                textView.setText(sjt.a(this.r, this));
                textView.setMovementMethod(new LinkMovementMethod());
            }
            sjv.b(textView);
            textView = (TextView) findViewById(R.id.why_to_share);
            sjv.a(textView);
            textView.setOnClickListener(new shq(this));
            ((Button) findViewById(R.id.gm2_use_another_account)).setOnClickListener(new shp(this));
            sjv.a(getWindow());
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
        if (!this.p) {
            this.p = true;
            if (sge != null) {
                ViewGroup viewGroup = (ViewGroup) findViewById(R.id.gm2_credential_chooser_credential_holder);
                View inflate = LayoutInflater.from(this).inflate(R.layout.gdi_gm2_single_credential_list_item, viewGroup, false);
                TextView textView = (TextView) inflate.findViewById(R.id.gm2_credential_primary_label);
                TextView textView2 = (TextView) inflate.findViewById(R.id.gm2_credential_secondary_label);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.gm2_credential_info_profile_picture);
                sjv.b(textView2);
                if (TextUtils.isEmpty(sge.b)) {
                    textView.setText(sge.a);
                    textView2.setVisibility(8);
                } else {
                    textView.setText(sge.b);
                    textView2.setText(sge.a);
                    textView2.setVisibility(0);
                }
                if (TextUtils.isEmpty(sge.c)) {
                    this.l.a(Integer.valueOf(R.drawable.product_logo_avatar_anonymous_color_48)).a(imageView);
                } else {
                    try {
                        this.l.a(this.m.a(getResources().getDimensionPixelSize(R.dimen.gdi_gm2_credential_avatar_size), Uri.parse(sge.c))).a(imageView);
                    } catch (tpp e) {
                        Log.e("GM2AccountChooser", "Invalid avatar image url", e);
                        this.l.a(Integer.valueOf(R.drawable.product_logo_avatar_anonymous_color_48)).a(imageView);
                    }
                }
                if (!TextUtils.isEmpty(this.s)) {
                    inflate.setContentDescription(this.s);
                }
                viewGroup.addView(inflate);
            }
            Button button = this.o;
            trs trs = new trs(anbp.b.a);
            trs.a();
            tru.a(button, trs);
            this.h.a(this.o, g);
            this.o.setOnClickListener(new shs(this));
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
