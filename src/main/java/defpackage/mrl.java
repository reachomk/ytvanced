package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.youtube.R;

/* renamed from: mrl */
public final class mrl extends Dialog {
    private final Activity a;

    public mrl(Activity activity, View view, ngh ngh, aiqq aiqq, boolean z, boolean z2, boolean z3) {
        int i = !z ? !z3 ? R.style.DialogFullscreenTheme : R.style.DialogTheme : !z2 ? R.style.LightboxDialogTheme : R.style.LightboxDialogWithStatusBarTheme;
        super(activity, i);
        amqw.a((Object) aiqq);
        this.a = (Activity) amqw.a((Object) activity);
        amqw.a((Object) view);
        amqw.a((Object) ngh);
        int i2 = -2;
        if (z) {
            View frameLayout = new FrameLayout(getContext());
            frameLayout.setBackgroundResource(17301521);
            frameLayout.addView(view, new LayoutParams(-1, -2, 17));
            activity.getWindow().setBackgroundDrawableResource(R.color.darker_transparent);
            view = frameLayout;
        } else {
            if (VERSION.SDK_INT >= 21) {
                getWindow().setNavigationBarColor(0);
            }
            view.setBackgroundColor(-16777216);
        }
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        if (!z) {
            i2 = -1;
        }
        frameLayout2.addView(view, new LayoutParams(-1, i2, 17));
        setContentView(frameLayout2);
        ngh.C.a(ngh.D, mrd.a(aiqq), true);
        ngh.B.a(aiqq, ngh.D);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStop() {
        if (!this.a.isFinishing()) {
            this.a.finish();
        }
        super.onStop();
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.a.onKeyUp(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.a.onKeyDown(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
