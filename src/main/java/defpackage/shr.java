package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.widget.Button;
import com.google.android.libraries.deepauth.accountcreation.ui.ConsentWebView;
import com.google.android.libraries.material.progress.MaterialProgressBar;
import com.google.android.youtube.R;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: shr */
public final class shr extends aej implements sez {
    public static final sfz g = sfz.a(5);
    public static final Pattern h = Pattern.compile("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|ico))$)", 2);
    public static final long i = TimeUnit.SECONDS.toMillis(1);
    public sex j;
    public sfe k;
    public MaterialProgressBar l;
    public ConsentWebView m;
    public boolean n;
    public sgz o;
    public boolean p;
    public Handler q;
    private View r;
    private Button s;
    private Button t;

    public static Intent a(Context context, ses ses) {
        return new Intent(context, shr.class).putExtra("COMPLETION_STATE", ses);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        shi shi = (shi) bg.a(this).a(shi.class);
        shi.a.a(this, new shu(this));
        ses ses = (ses) getIntent().getParcelableExtra("COMPLETION_STATE");
        this.o = ses.a();
        if (!sjq.a((Activity) this, this.o)) {
            this.k = new sfe(getApplication(), this.o, sga.b.a());
            if (k() != null) {
                this.j = (sex) k();
            } else if (this.j == null) {
                this.j = new sex(ses.b(getApplication()));
            }
            setContentView((int) R.layout.gdi_gm2_consent_activity);
            findViewById(R.id.top_gradient);
            this.r = findViewById(R.id.bottom_gradient);
            this.l = (MaterialProgressBar) findViewById(R.id.spinner);
            sjv.a(getWindow());
            this.m = (ConsentWebView) findViewById(R.id.webView);
            this.s = (Button) findViewById(R.id.gm2_consent_confirm_button);
            this.s.setOnClickListener(new sht(this));
            this.t = (Button) findViewById(R.id.gm2_consent_deny_button);
            this.t.setOnClickListener(new shw(this));
            if (bundle != null) {
                this.n = bundle.getBoolean("consent_read", false);
                this.p = bundle.getBoolean("failed_to_load", false);
            }
            if (this.p) {
                a(null, null);
            }
            float a = sjv.a(getResources());
            a = Math.min(a - ((float) getResources().getDimensionPixelSize(R.dimen.gdi_dialog_min_leftover_vertical_screen_space)), a * 0.8f);
            View findViewById = findViewById(R.id.dialog_container);
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new sia(this, findViewById, (int) a));
            this.m.setWebViewClient(new shx(this, this, this.o.h.e));
            this.m.setWebChromeClient(new WebChromeClient());
            this.m.setFocusable(true);
            this.m.setFocusableInTouchMode(true);
            this.m.setMapTrackballToArrowKeys(false);
            this.m.a = new shy(this);
            WebSettings settings = this.m.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setSupportMultipleWindows(false);
            settings.setSaveFormData(false);
            settings.setSavePassword(false);
            settings.setAllowFileAccess(false);
            settings.setDatabaseEnabled(false);
            settings.setJavaScriptCanOpenWindowsAutomatically(false);
            settings.setLoadsImagesAutomatically(true);
            settings.setNeedInitialFocus(false);
            settings.setSupportZoom(false);
            settings.setUseWideViewPort(false);
            if (VERSION.SDK_INT >= 24) {
                settings.setDisabledActionModeMenuItems(7);
            }
            if (this.n) {
                a(true);
            }
            this.k.a(this.s, g);
            Map map = this.o.l;
            String str = (String) map.get("consent.action_button_text");
            if (!TextUtils.isEmpty(str)) {
                this.s.setText(str);
            }
            String str2 = (String) map.get("consent.cancel_button_text");
            if (!TextUtils.isEmpty(str2)) {
                this.t.setText(str2);
            }
            sgz sgz = this.o;
            shi.a(sgz.i, sgz.h.d);
        }
    }

    public final void l() {
        Handler handler = this.q;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.q = null;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onPause() {
        super.onPause();
        l();
    }

    /* Access modifiers changed, original: final */
    public final void a(CharSequence charSequence, Integer num) {
        Object[] objArr = new Object[1];
        String str = "n/a";
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = str;
        }
        objArr[0] = charSequence;
        String format = String.format("description = %s", objArr);
        objArr = new Object[1];
        if (num != null) {
            str = num.toString();
        }
        objArr[0] = str;
        String format2 = String.format("error code = %s", objArr);
        objArr = new Object[]{format2, format};
        Log.e("Gm2ConsentActivity", String.format("Error encountered while loading page: %s, %s", objArr));
        this.p = true;
        this.s.setEnabled(false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("consent_read", this.n);
        bundle.putBoolean("failed_to_load", this.p);
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        int i = 0;
        if (z && !this.p) {
            this.n = true;
            this.s.setEnabled(true);
        } else {
            this.s.setEnabled(false);
        }
        View view = this.r;
        if (this.m.a()) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public final Object x_() {
        return this.j;
    }

    public final void onStart() {
        this.j.a(this);
        super.onStart();
    }

    public final void onStop() {
        this.j.a(null);
        super.onStop();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.k.a(g, aodi.EVENT_PROVIDER_CONSENT_CANCEL);
        }
        return onTouchEvent;
    }

    public final void onBackPressed() {
        this.k.a(g, aodi.EVENT_PROVIDER_CONSENT_CANCEL);
        setResult(4000);
        finish();
    }

    public final void a(sfq sfq) {
        setResult(8000, new Intent().putExtra("TOKEN_RESPONSE", sfq));
        finish();
    }
}
