package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jmb */
final /* synthetic */ class jmb implements OnClickListener {
    private final jma a;

    jmb(jma jma) {
        this.a = jma;
    }

    public final void onClick(View view) {
        Activity activity = this.a.a;
        activity.startActivity(ebl.d(activity));
    }
}
