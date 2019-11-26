package com.google.android.libraries.youtube.player.playability;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.WebView;
import com.google.android.youtube.R;
import defpackage.afpc;
import defpackage.afpf;
import defpackage.afpo;
import defpackage.afpu;
import defpackage.aiul;
import defpackage.aium;
import defpackage.aiun;
import defpackage.aiuo;
import defpackage.aiup;
import defpackage.aiva;
import defpackage.aivb;
import defpackage.amqw;
import defpackage.awdy;
import defpackage.tbg;
import defpackage.wxi;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

public final class AgeVerificationDialog implements aivb {
    public final WeakReference a;
    public final tbg b;
    public aiva c;
    public Dialog d;
    public CustomWebView e;
    public wxi f;
    private final Executor g;
    private final afpu h;
    private final afpo i;

    public class CustomWebView extends WebView {
        public CustomWebView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (editorInfo != null) {
                editorInfo.imeOptions &= -3;
                editorInfo.imeOptions |= 5;
            }
            return onCreateInputConnection;
        }
    }

    public AgeVerificationDialog(Activity activity, Executor executor, afpu afpu, tbg tbg, afpo afpo) {
        this.a = new WeakReference((Activity) amqw.a((Object) activity));
        this.g = (Executor) amqw.a((Object) executor);
        this.h = (afpu) amqw.a((Object) afpu);
        this.b = (tbg) amqw.a((Object) tbg);
        this.i = (afpo) amqw.a((Object) afpo);
    }

    public final void a(awdy awdy, aiva aiva) {
        amqw.a((Object) awdy);
        amqw.b(this.h.a());
        this.c = aiva;
        Activity activity = (Activity) this.a.get();
        if (activity == null || activity.isFinishing()) {
            afpc.a(1, afpf.player, "Attempted to start AgeVerificationDialog when the activity is destroyed");
        } else {
            this.d = new Dialog(activity, 16973834);
        }
        this.d.setContentView(R.layout.age_verification_dialog);
        this.d.setOnCancelListener(new aiul(this));
        View findViewById = this.d.findViewById(R.id.close);
        findViewById.setClickable(true);
        findViewById.setOnClickListener(new aiuo(this));
        this.e = (CustomWebView) this.d.findViewById(R.id.webview);
        this.e.getSettings().setJavaScriptEnabled(true);
        this.e.setVisibility(0);
        this.e.getSettings().setSaveFormData(false);
        String str = awdy.b;
        String str2 = this.i.a(this.h.c()).name;
        this.e.setWebViewClient(new aiun(this, str));
        this.f = wxi.a(new aiup(this));
        Activity activity2 = (Activity) this.a.get();
        if (activity2 == null || activity2.isFinishing()) {
            afpc.a(1, afpf.player, "Attempted to loadVideoView for AgeVerificationDialog when the activity is destroyed");
        } else {
            this.g.execute(new aium(this, str, str2, activity2));
        }
    }

    public final void a() {
        wxi wxi = this.f;
        if (wxi != null) {
            wxi.a();
        }
        this.d.dismiss();
        this.e.loadUrl("about:blank");
    }

    public final void b() {
        a();
        this.c.c();
    }

    public final void c() {
        a();
        this.c.b();
    }
}
