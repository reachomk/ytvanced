package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.widget.FrameLayout;

/* renamed from: bahc */
final class bahc extends FrameLayout {
    private Configuration a;
    private final /* synthetic */ bagn b;

    bahc(bagn bagn, Context context) {
        this.b = bagn;
        super(context);
        this.a = new Configuration(context.getResources().getConfiguration());
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(this.b.a.getResources().getConfiguration());
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(configuration);
    }

    private final void a(Configuration configuration) {
        int diff = configuration.diff(this.a);
        if ((diff & 4096) != 0 || (diff & 128) != 0) {
            this.a = new Configuration(configuration);
            bagn bagn = this.b;
            bagn.a(bagn.p);
        }
    }
}
