package defpackage;

import android.app.Activity;
import android.content.Intent;
import java.util.Map;

/* renamed from: lxw */
final /* synthetic */ class lxw implements aaap {
    private final lye a;
    private final Activity b;

    lxw(lye lye, Activity activity) {
        this.a = lye;
        this.b = activity;
    }

    public final void a(apxu apxu, Map map) {
        lye lye = this.a;
        Activity activity = this.b;
        Intent a = lye.a(apxu);
        if (a != null) {
            activity.startActivity(a);
        }
    }
}
