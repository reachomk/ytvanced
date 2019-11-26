package com.google.vr.ndk.base;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;

class FadeOverlayView extends View {
    public final boolean autoFadeEnabled;
    public final Handler autoFadeHandler = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message message) {
            if (message.what == 77337733) {
                FadeOverlayView.this.startFade(1, 350, -16777216);
            } else {
                super.handleMessage(message);
            }
        }
    };
    public long fadeDurationMillis;
    public float fadeStartOpacity;
    public long fadeStartTimeMillis;
    public int fadeType = 0;
    public final Runnable fadeUpdateRunnable = new Runnable() {
        public void run() {
            FadeOverlayView.this.updateFade();
        }
    };
    public boolean flushAutoFadeOnVisible;
    public boolean visible;

    public FadeOverlayView(Context context, boolean z) {
        super(context);
        setBackgroundColor(-16777216);
        this.autoFadeEnabled = z;
    }

    public void startFade(int i, long j, int i2) {
        String str = "FadeOverlayView";
        if (!isEnabled()) {
            Log.w(str, "Ignoring fade request while disabled.");
        } else if (this.visible) {
            setBackgroundColor(i2);
            removeFadeCallbacks();
            this.fadeType = i;
            this.fadeDurationMillis = j;
            this.fadeStartTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.fadeStartOpacity = getAlpha();
            updateFade();
        } else {
            Log.w(str, "Ignoring fade request while invisible.");
        }
    }

    public void onInvisible() {
        if (this.visible) {
            this.visible = false;
            if (isEnabled() && this.autoFadeEnabled) {
                removeFadeCallbacks();
                this.fadeType = 2;
                endFade();
            }
        }
    }

    public void onVisible() {
        if (!this.visible || getAlpha() != 0.0f) {
            this.visible = true;
            if (isEnabled() && this.autoFadeEnabled) {
                removeFadeCallbacks();
                this.autoFadeHandler.sendEmptyMessageDelayed(77337733, !this.flushAutoFadeOnVisible ? 1000 : 200);
                return;
            }
            this.fadeType = 1;
            endFade();
        }
    }

    public void flushAutoFade() {
        if (!this.autoFadeEnabled) {
            return;
        }
        if (this.autoFadeHandler.hasMessages(77337733)) {
            this.autoFadeHandler.removeMessages(77337733);
            this.autoFadeHandler.sendEmptyMessageDelayed(77337733, 200);
        } else if (!this.visible) {
            this.flushAutoFadeOnVisible = true;
        }
    }

    public void setEnabled(boolean z) {
        if (isEnabled() != z) {
            super.setEnabled(z);
            if (!z) {
                removeFadeCallbacks();
                this.fadeType = 1;
                endFade();
            }
        }
    }

    private void removeFadeCallbacks() {
        this.autoFadeHandler.removeMessages(77337733);
        removeCallbacks(this.fadeUpdateRunnable);
    }

    private void endFade() {
        int i = this.fadeType;
        if (i != 0) {
            setVisibility(i == 2 ? 0 : 8);
            setAlpha(this.fadeType == 2 ? 1.0f : 0.0f);
            removeCallbacks(this.fadeUpdateRunnable);
            this.fadeType = 0;
            this.flushAutoFadeOnVisible = false;
        }
    }

    private void updateFade() {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.fadeStartTimeMillis;
        float f = ((float) currentAnimationTimeMillis) / ((float) this.fadeDurationMillis);
        if (this.fadeType == 1) {
            f = -f;
        }
        float min = Math.min(Math.max(this.fadeStartOpacity + f, 0.0f), 1.0f);
        setAlpha(min);
        if (currentAnimationTimeMillis < this.fadeDurationMillis && getVisibility() != 0) {
            setVisibility(0);
        }
        if (currentAnimationTimeMillis < this.fadeDurationMillis) {
            int i = this.fadeType;
            if (i != 1 ? i != 2 || min < 1.0f : min > 0.0f) {
                postOnAnimation(this.fadeUpdateRunnable);
                return;
            }
        }
        endFade();
    }
}
