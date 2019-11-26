package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: mts */
public final class mts extends Dialog {
    private final mtv a;
    private final View b;
    private final ViewGroup c;
    private ViewGroup d;

    public mts(Context context, mtv mtv, View view) {
        super((Context) amqw.a((Object) context, (Object) "context cannot be null"), 16973834);
        this.a = (mtv) amqw.a((Object) mtv, (Object) "listener cannot be null");
        this.b = (View) amqw.a((Object) view, (Object) "playerView cannot be null");
        this.c = new FrameLayout(context);
        setContentView(this.c);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStart() {
        super.onStart();
        this.d = (ViewGroup) this.b.getParent();
        this.d.removeView(this.b);
        this.c.addView(this.b, -1, -1);
        this.a.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onStop() {
        this.c.removeView(this.b);
        this.d.addView(this.b);
        this.a.a();
        super.onStop();
    }

    public final void onBackPressed() {
        this.a.b();
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.a.b(i, keyEvent) || super.onKeyUp(i, keyEvent);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.a.a(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }
}
