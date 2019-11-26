package com.google.vr.ndk.base;

import android.app.PendingIntent;
import android.view.View;
import com.google.vr.vrcore.library.api.ObjectWrapper;
import defpackage.bajt;
import defpackage.bajv;
import defpackage.baka;

class GvrLayoutImplWrapper extends bajt {
    public final GvrLayoutImpl impl;

    public GvrLayoutImplWrapper(GvrLayoutImpl gvrLayoutImpl) {
        this.impl = gvrLayoutImpl;
    }

    public long getNativeGvrContext() {
        return this.impl.getGvrApi().getNativeGvrContext();
    }

    public baka getRootView() {
        return ObjectWrapper.a(this.impl);
    }

    public bajv getUiLayout() {
        return this.impl.getUiLayoutImpl();
    }

    public void onPause() {
        this.impl.onPause();
    }

    public void onResume() {
        this.impl.onResume();
    }

    public void onBackPressed() {
        this.impl.onBackPressed();
    }

    public void shutdown() {
        this.impl.shutdown();
    }

    public void setPresentationView(baka baka) {
        this.impl.setPresentationView((View) ObjectWrapper.a(baka, View.class));
    }

    public boolean enableAsyncReprojection(int i) {
        return this.impl.enableAsyncReprojection(i);
    }

    public boolean enableCardboardTriggerEmulation(baka baka) {
        return this.impl.enableCardboardTriggerEmulation((Runnable) ObjectWrapper.a(baka, Runnable.class));
    }

    public void setStereoModeEnabled(boolean z) {
        this.impl.setStereoModeEnabled(z);
    }

    public void setReentryIntent(baka baka) {
        this.impl.setReentryIntent((PendingIntent) ObjectWrapper.a(baka, PendingIntent.class));
    }

    public boolean setOnDonNotNeededListener(baka baka) {
        return this.impl.setOnDonNotNeededListener((Runnable) ObjectWrapper.a(baka, Runnable.class));
    }
}
