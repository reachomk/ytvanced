package com.google.android.libraries.youtube.ads.ui.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.wce;
import defpackage.wcg;

public class AdsWebView extends WebView {
    public wcg a;
    private WebViewClient b;

    public AdsWebView(Context context) {
        super(context);
        a();
    }

    public AdsWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public AdsWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    public AdsWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a();
    }

    public AdsWebView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i, z);
        a();
    }

    public final void destroy() {
        super.destroy();
        this.a = null;
    }

    public final WebViewClient getWebViewClient() {
        return this.b;
    }

    private final void a() {
        this.b = new wce(this);
        setWebViewClient(this.b);
        setScrollBarStyle(33554432);
        setScrollbarFadingEnabled(false);
        getSettings().setJavaScriptEnabled(true);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        performClick();
        return super.onTouchEvent(motionEvent);
    }

    public final boolean performClick() {
        wcg wcg = this.a;
        if (wcg != null) {
            wcg.e();
        }
        return super.performClick();
    }
}
