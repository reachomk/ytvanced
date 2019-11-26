package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: ivj */
final class ivj implements OnTouchListener {
    private final /* synthetic */ akby a;
    private final /* synthetic */ akor b;

    ivj(akby akby, akor akor) {
        this.a = akby;
        this.b = akor;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            byte[] bArr = this.a.c;
            if (bArr != null) {
                this.b.a.a(3, new acvs(bArr), null);
            }
        }
        return false;
    }
}
