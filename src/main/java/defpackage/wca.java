package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wca */
final /* synthetic */ class wca implements OnClickListener {
    private final wby a;

    wca(wby wby) {
        this.a = wby;
    }

    public final void onClick(View view) {
        wby wby = this.a;
        MotionEvent motionEvent = wby.e;
        if (motionEvent != null) {
            wby.b.a(motionEvent, amul.a(wby.d));
        }
        wby.a();
    }
}
