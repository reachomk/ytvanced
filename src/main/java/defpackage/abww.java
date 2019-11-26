package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* renamed from: abww */
public final class abww extends View {
    public abwy a;
    private final Runnable b = new abwz(this);

    public abww(Context context) {
        super(context);
        setImportantForAccessibility(2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        post(this.b);
    }
}
