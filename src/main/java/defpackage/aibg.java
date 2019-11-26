package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener;

/* renamed from: aibg */
public final class aibg implements AccessibilityStateChangeListener {
    public final Context a;
    public final /* synthetic */ aibd b;

    public final void onAccessibilityStateChanged(boolean z) {
        this.b.c();
    }

    /* synthetic */ aibg(aibd aibd, Context context) {
        this.b = aibd;
        this.a = context;
    }
}
