package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.google.android.libraries.youtube.edit.camera.CameraView;

/* renamed from: gfh */
public final class gfh extends ziq {
    private final Context a;
    private final zip b;
    private final zgp c;
    private ScaleGestureDetector d;
    private final CameraView e;
    private boolean f;
    private boolean g;

    gfh(Context context, zip zip, CameraView cameraView) {
        super(context, zip);
        this.a = (Context) amqw.a((Object) context);
        this.b = (zip) amqw.a((Object) zip);
        this.c = new zgp(context, new zir(this, zip));
        this.e = cameraView;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.c.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean a = ziq.a(this.f, view, action, motionEvent);
        this.f = a;
        if (a) {
            this.g = true;
        }
        if (action == 1) {
            this.d = null;
            if (!(a || this.g || !this.e.a())) {
                this.b.a(motionEvent.getX(), motionEvent.getY());
            }
        } else if (action == 0) {
            this.g = false;
        }
        if (!this.f || action != 2) {
            return true;
        }
        if (this.d == null) {
            this.d = new ScaleGestureDetector(this.a, new zis(this.b));
        }
        return this.d.onTouchEvent(motionEvent);
    }

    public final boolean a() {
        return this.e.a() ^ 1;
    }
}
