package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* renamed from: ku */
final class ku extends AnimatorListenerAdapter {
    private final /* synthetic */ int a;
    private final /* synthetic */ TextView b;
    private final /* synthetic */ int c;
    private final /* synthetic */ TextView d;
    private final /* synthetic */ kv e;

    ku(kv kvVar, int i, TextView textView, int i2, TextView textView2) {
        this.e = kvVar;
        this.a = i;
        this.b = textView;
        this.c = i2;
        this.d = textView2;
    }

    public final void onAnimationEnd(Animator animator) {
        kv kvVar = this.e;
        kvVar.d = this.a;
        kvVar.c = null;
        TextView textView = this.b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.c == 1) {
                textView = this.e.h;
                if (textView != null) {
                    textView.setText(null);
                }
            }
            textView = this.d;
            if (textView != null) {
                textView.setTranslationY(0.0f);
                this.d.setAlpha(1.0f);
            }
        }
    }

    public final void onAnimationStart(Animator animator) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }
}
