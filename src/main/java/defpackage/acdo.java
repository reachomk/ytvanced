package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.util.Map;

/* renamed from: acdo */
public final class acdo implements aaap {
    private final Activity a;
    private final abpm b;

    public acdo(Activity activity, abpm abpm) {
        this.a = activity;
        this.b = abpm;
    }

    public final void a(apxu apxu, Map map) {
        nt f = ((nn) this.a).f();
        abpm abpm = this.b;
        absf absf = new absf();
        Bundle bundle = new Bundle();
        bundle.putByteArray("navigation_endpoint", apxu.toByteArray());
        absf.f(bundle);
        absf.ab = abpm;
        absf.a(f, "live_chat_item_context_menu_dialog");
    }
}
