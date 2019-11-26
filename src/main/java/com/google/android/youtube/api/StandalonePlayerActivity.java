package com.google.android.youtube.api;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import defpackage.afjw;
import defpackage.aiqq;
import defpackage.aiqs;
import defpackage.airl;
import defpackage.amka;
import defpackage.amkb;
import defpackage.amla;
import defpackage.ammj;
import defpackage.ammk;
import defpackage.mlp;
import defpackage.mlx;
import defpackage.mrd;
import defpackage.mrl;
import defpackage.ngh;
import defpackage.nkv;
import java.util.List;

public class StandalonePlayerActivity extends Activity implements mlx {
    private static StandalonePlayerActivity a;
    private airl b;
    private aiqq c;
    private boolean d;
    private boolean e;
    private boolean f;
    private mlp g;
    private ngh h;
    private mrl i;
    private String j;
    private String k;

    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        StandalonePlayerActivity standalonePlayerActivity = a;
        if (standalonePlayerActivity != null) {
            standalonePlayerActivity.finish();
        }
        a = this;
        Intent intent = getIntent();
        String str = "watch";
        boolean z = false;
        aiqq aiqq;
        if (intent.hasExtra(str)) {
            this.b = (airl) intent.getParcelableExtra(str);
            aiqq = this.b.a;
            if (!TextUtils.isEmpty(aiqq.b())) {
                aiqq = mrd.a(aiqq.b(), aiqq.g());
            } else if (TextUtils.isEmpty(aiqq.c())) {
                List f = aiqq.f();
                if (f == null) {
                    ammj.a("Invalid PlaybackStartDescriptor. Returning the instance itself.", new Object[0]);
                } else if (f.size() == 1) {
                    aiqq = mrd.a((String) f.get(0), aiqq.g());
                } else {
                    aiqq = mrd.a(f, aiqq.d(), aiqq.g());
                }
            } else {
                aiqq = mrd.a(aiqq.c(), aiqq.d(), aiqq.g());
            }
            this.c = aiqq;
        } else {
            str = intent.getStringExtra("video_id");
            String stringExtra = intent.getStringExtra("playlist_id");
            List stringArrayListExtra = intent.getStringArrayListExtra("video_ids");
            int intExtra = intent.getIntExtra("current_index", 0);
            int intExtra2 = intent.getIntExtra("start_time_millis", 0);
            boolean booleanExtra = intent.getBooleanExtra("autoplay", false);
            if (stringArrayListExtra != null) {
                aiqq = mrd.a(stringArrayListExtra, intExtra, (long) intExtra2);
            } else if (stringExtra != null) {
                aiqq = mrd.a(stringExtra, intExtra, (long) intExtra2);
            } else if (str != null) {
                aiqq = mrd.a(str, (long) intExtra2);
            } else {
                aiqq = aiqq.a().b();
            }
            aiqs s = aiqq.s();
            s.c = booleanExtra;
            s.a(booleanExtra ^ 1);
            this.b = new airl(s.b());
            this.c = this.b.a;
        }
        this.d = intent.getBooleanExtra("lightbox_mode", false);
        this.e = intent.getBooleanExtra("window_has_status_bar", false);
        if (VERSION.SDK_INT >= 24 && isInMultiWindowMode()) {
            z = true;
        }
        this.f = z;
        super.onCreate(bundle);
        if (!(this.d || this.f)) {
            setRequestedOrientation(6);
        }
        String stringExtra2 = intent.getStringExtra("developer_key");
        String stringExtra3 = intent.getStringExtra("app_version");
        String stringExtra4 = intent.getStringExtra("client_library_version");
        if (stringExtra4 == null) {
            stringExtra4 = "1.0.0";
        }
        String str2 = stringExtra4;
        if (str2.matches("^(\\d+\\.){2}(\\d+)(\\w?)$")) {
            stringExtra4 = getCallingPackage();
            CharSequence stringExtra5 = stringExtra4 == null ? intent.getStringExtra("app_package") : stringExtra4;
            str = (TextUtils.isEmpty(stringExtra5) || TextUtils.equals(stringExtra5, "com.google.android.youtube")) ? intent.getStringExtra("referring_app_package") : stringExtra5;
            this.k = str;
            this.j = "com.google.android.music".equals(stringExtra4) ? intent.getStringExtra("google_account_name") : null;
            mlp.a(true, this, new Handler(getMainLooper()), this, stringExtra2, stringExtra5, stringExtra3, str2, TextUtils.isEmpty(this.j) ^ 1);
            return;
        }
        a(new IllegalStateException("Invalid client version"));
    }

    public final void a(mlp mlp) {
        this.g = mlp;
        if (TextUtils.isEmpty(this.j)) {
            a();
        } else {
            mlp.a(this.j, new amkb(this));
        }
    }

    public final void a() {
        if (!isFinishing()) {
            mlp mlp = this.g;
            mlp.i = this.k;
            this.h = new ngh(this, mlp, new afjw(this, mlp.f.a()));
            this.h.b(true);
            if (((nkv) this.b.b.instance).c) {
                this.h.a(new amka(this));
            }
            this.i = new mrl(this, (View) ammk.a(this.h.j()), this.h, this.c, this.d, this.e, this.f);
            this.i.show();
            this.h.b(8);
            ngh ngh = this.h;
            boolean z = false;
            if (!(this.d || this.f)) {
                z = true;
            }
            ngh.d(z);
            Intent intent = new Intent();
            intent.putExtra("initialization_result", amla.a(1));
            setResult(-1, intent);
        }
    }

    public final void a(Exception exception) {
        Intent intent = new Intent();
        int a = mlp.a(exception);
        String a2 = amla.a(a);
        if (a != 0) {
            intent.putExtra("initialization_result", a2);
            setResult(1, intent);
            finish();
            return;
        }
        throw null;
    }

    public final void onResume() {
        super.onResume();
        ngh ngh = this.h;
        if (ngh != null) {
            ngh.f();
        }
    }

    public final void onPause() {
        ngh ngh = this.h;
        if (ngh != null) {
            ngh.g();
        }
        super.onPause();
    }

    public final void onStart() {
        super.onStart();
        ngh ngh = this.h;
        if (ngh != null) {
            ngh.e();
        }
    }

    public final void onStop() {
        if (a == this) {
            a = null;
        }
        ngh ngh = this.h;
        if (ngh != null) {
            ngh.h();
        }
        super.onStop();
    }

    public final void onDestroy() {
        ngh ngh = this.h;
        if (ngh != null) {
            ngh.c(isFinishing());
        }
        mlp mlp = this.g;
        if (mlp != null) {
            mlp.a(isFinishing() ^ 1);
        }
        mrl mrl = this.i;
        if (mrl != null && mrl.isShowing()) {
            this.i.dismiss();
        }
        super.onDestroy();
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        ngh ngh = this.h;
        return (ngh != null && ngh.b(i, keyEvent)) || super.onKeyUp(i, keyEvent);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ngh ngh = this.h;
        return (ngh != null && ngh.a(i, keyEvent)) || super.onKeyUp(i, keyEvent);
    }
}
