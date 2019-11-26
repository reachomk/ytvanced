package defpackage;

import android.app.Activity;

/* renamed from: wxc */
public final class wxc extends wxs {
    private final Activity b;

    private wxc(Activity activity, wxg wxg) {
        super(wxg);
        this.b = (Activity) amqw.a((Object) activity);
    }

    public static wxc a(Activity activity, wxg wxg) {
        return new wxc(activity, wxg);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Runnable runnable) {
        this.b.runOnUiThread(runnable);
    }
}
