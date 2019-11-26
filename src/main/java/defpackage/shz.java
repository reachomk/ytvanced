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

/* renamed from: shz */
public final class shz extends aej implements sha {
    public static final Pattern g = Pattern.compile("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|ico))$)", 2);
    public static final long h = TimeUnit.SECONDS.toMillis(1);
    public sgz i;
    public sfe j;
    public sfz k;
    public sgy l;
    public ConsentWebView m;
    public MaterialProgressBar n;
    public boolean o;
    public boolean p;
    public Handler q;
    private Button r;
    private View s;
    private String t;
    private String u;

    public static Intent a(Context context, ses ses) {
        return new Intent(context, shz.class).putExtra("COMPLETION_STATE", ses);
    }

    private static String a(String str) {
        str = String.valueOf(str);
        String str2 = "create_account.";
        return str.length() == 0 ? new String(str2) : str2.concat(str);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        shi shi = (shi) bg.a(this).a(shi.class);
        shi.a.a(this, new sic(this));
        ses ses = (ses) getIntent().getParcelableExtra("COMPLETION_STATE");
        this.i = ses.a();
        if (!sjq.a((Activity) this, this.i)) {
            this.j = new sfe(getApplication(), this.i, sga.b.a());
            setContentView((int) R.layout.gdi_gm2_create_account_activity);
            findViewById(R.id.top_gradient);
            this.s = findViewById(R.id.bottom_gradient);
            this.n = (MaterialProgressBar) findViewById(R.id.spinner);
            this.m = (ConsentWebView) findViewById(R.id.webView);
            sjv.a(getWindow());
            this.k = sfz.c();
            if (k() != null) {
                this.l = (sgy) k();
            } else if (this.l == null) {
                this.l = new sgy(ses.c(getApplication()));
            }
            Map map = this.i.l;
            this.t = (String) map.get(shz.a("action_button_text"));
            this.u = (String) map.get(shz.a("cancel_button_text"));
            this.r = (Button) findViewById(R.id.gm2_create_account_button);
            Button button = (Button) findViewById(R.id.gm2_create_cancel_button);
            if (bundle != null) {
                this.o = bundle.getBoolean("consent-read", false);
                this.p = bundle.getBoolean("failed-to-load", false);
            }
            this.r.setOnClickListener(new sib(this));
            float a = sjv.a(getResources());
            a = Math.min(a - ((float) getResources().getDimensionPixelSize(R.dimen.gdi_dialog_min_leftover_vertical_screen_space)), a * 0.8f);
            View findViewById = findViewById(R.id.dialog_container);
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new sih(this, findViewById, (int) a));
            this.m.setWebViewClient(new sif(this, this, this.i.h.e));
            this.m.setWebChromeClient(new WebChromeClient());
            this.m.setFocusable(true);
            this.m.setFocusableInTouchMode(true);
            this.m.setMapTrackballToArrowKeys(false);
            this.m.a = new sig(this);
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
            if (this.o) {
                a(true);
            }
            if (!TextUtils.isEmpty(this.t)) {
                this.r.setText(this.t);
            }
            if (this.p) {
                a(null, null);
            }
            this.j.a(this.r, this.k);
            button.setOnClickListener(new sie(this));
            if (!TextUtils.isEmpty(this.u)) {
                button.setText(this.u);
            }
            sgz sgz = this.i;
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
        Log.e("Gm2CreateAccount", String.format("Error encountered while loading page: %s, %s", objArr));
        this.p = true;
        this.r.setEnabled(false);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStart() {
        super.onStart();
        this.l.a(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStop() {
        this.l.a(null);
        super.onStop();
    }

    public final Object x_() {
        return this.l;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.j.a(this.k, aodi.EVENT_ACCOUNT_CREATION_CANCEL);
        }
        return onTouchEvent;
    }

    public final void onBackPressed() {
        this.j.a(this.k, aodi.EVENT_ACCOUNT_CREATION_CANCEL);
        setResult(0);
        finish();
    }

    public final void a(sfq sfq) {
        setResult(8000, new Intent().putExtra("TOKEN_RESPONSE", sfq));
        finish();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("consent-read", this.o);
        bundle.putBoolean("failed-to-load", this.p);
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        int i = 0;
        if (z && !this.p) {
            this.o = true;
            this.r.setEnabled(true);
        } else {
            this.r.setEnabled(false);
        }
        View view = this.s;
        if (this.m.a()) {
            i = 8;
        }
        view.setVisibility(i);
    }
}
