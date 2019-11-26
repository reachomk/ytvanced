package defpackage;

import android.content.res.Resources;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.quickseek.overlay.CircularClipTapBloomView;
import com.google.android.libraries.youtube.player.features.quickseek.overlay.TapBloomView;
import com.google.android.youtube.R;

/* renamed from: aila */
public final class aila {
    public final aile a;
    public final Handler b;
    public boolean c;
    public final Runnable d = new aikz(this);
    private final acvx e;
    private final ajko f;
    private aild g;

    public aila(bcaa bcaa, aile aile, Handler handler, ajko ajko) {
        this.e = (acvx) bcaa.get();
        this.a = aile;
        this.b = handler;
        this.f = ajko;
    }

    public final void a(aild aild) {
        this.g = aild;
        aild.g.addOnAttachStateChangeListener(new ailc(this));
    }

    public final void a(MotionEvent motionEvent, View view) {
        Object ailb = new ailb(motionEvent, ailb.a((int) motionEvent.getX(), view.getWidth()));
        int i = ailb.b;
        if (i != 0 && this.g != null) {
            acwc acwc;
            int a;
            if (i == 1) {
                acwc = acwc.DOUBLE_TAP_TO_SEEK_FAST_FORWARD;
            } else {
                acwc = acwc.DOUBLE_TAP_TO_SEEK_REWIND;
            }
            this.e.a(3, new acvs(acwc), null);
            ajko ajko = this.f;
            if (ailb.b == 1) {
                a = this.a.a();
            } else {
                a = -this.a.a();
            }
            ajko.a(a);
            aile aile = this.a;
            amqw.a(ailb);
            aile.b = aile.c;
            aile.c = ailb;
            ailb ailb2 = aile.b;
            if (!(ailb2 == null || ailb2.b == aile.c.b)) {
                aile.b();
            }
            aile.d++;
            this.b.removeCallbacks(this.d);
            this.b.postDelayed(this.d, 650);
            this.c = true;
            aild aild = this.g;
            aile aile2 = this.a;
            int a2 = aile2.d * aile.a(aile2.a());
            Resources resources = aile2.a;
            Object[] objArr = new Object[1];
            int i2 = 0;
            objArr[0] = Integer.valueOf(a2);
            String quantityString = resources.getQuantityString(R.plurals.quick_seek_x_second, a2, objArr);
            a2 = ailb.b;
            if (a2 == 1) {
                i2 = 1;
            }
            ((CircularClipTapBloomView) aild.d.d()).invalidate();
            ((TextView) aild.b.d()).setText(quantityString);
            float width = ((float) aild.g.getWidth()) * 0.25f;
            TextView textView = (TextView) aild.b.d();
            if (i2 == 0) {
                width = -width;
            }
            textView.setTranslationX(width);
            aild.f.setTranslationX(width);
            aild.f.setScaleX(a2 == 1 ? 1.0f : -1.0f);
            ailk ailk = aild.c;
            if (aild.i == null) {
                aild.i = new ailg(aild);
            }
            ailk.a().addListener(aild.i);
            CircularClipTapBloomView circularClipTapBloomView = (CircularClipTapBloomView) aild.d.d();
            circularClipTapBloomView.a = i2;
            circularClipTapBloomView.a();
            aild.h.k();
            aild.a.a(true);
            ailk = aild.c;
            float x = ailb.a.getX();
            float y = ailb.a.getY();
            TapBloomView tapBloomView = ailk.a;
            tapBloomView.b = (int) x;
            tapBloomView.c = (int) y;
            ailk.a().start();
            aild.e.d();
            aild.d.a(true);
            aild.b.a(true);
        }
    }
}
