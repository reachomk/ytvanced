package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.youtube.R;

/* renamed from: afe */
public class afe extends Dialog implements aei {
    private ael a;
    private final aar b = new afh(this);

    public afe(Context context, int i) {
        super(context, afe.a(context, i));
        ael b = b();
        b.c(afe.a(context, i));
        b.b();
    }

    public final void b_() {
    }

    public final void c_() {
    }

    public final ahv d_() {
        return null;
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        b().p();
        super.onCreate(bundle);
        b().b();
    }

    public void setContentView(int i) {
        b().b(i);
    }

    public void setContentView(View view) {
        b().a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        b().a(view, layoutParams);
    }

    public final View findViewById(int i) {
        return b().a(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        b().a(charSequence);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        b().a(getContext().getString(i));
    }

    public final void addContentView(View view, LayoutParams layoutParams) {
        b().b(view, layoutParams);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStop() {
        super.onStop();
        b().i();
    }

    public final boolean a() {
        return b().d(1);
    }

    public final void invalidateOptionsMenu() {
        b().m();
    }

    private final ael b() {
        if (this.a == null) {
            this.a = ael.a((Dialog) this, (aei) this);
        }
        return this.a;
    }

    private static int a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return aao.a(this.b, getWindow().getDecorView(), this, keyEvent);
    }
}
