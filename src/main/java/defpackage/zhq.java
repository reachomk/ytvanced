package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.youtube.R;

/* renamed from: zhq */
public abstract class zhq implements zhm {
    public final CameraView a;
    public final ImageView b;
    public final acvx c;
    public final atst d;

    public zhq(CameraView cameraView, ImageView imageView, acvx acvx, atst atst) {
        this.a = (CameraView) amqw.a((Object) cameraView);
        this.a.a((zhm) this);
        this.b = (ImageView) amqw.a((Object) imageView);
        this.b.setOnClickListener(new zhs(this));
        this.c = (acvx) amqw.a((Object) acvx);
        this.d = atst;
    }

    public final void Z() {
    }

    public abstract void a(boolean z, boolean z2, boolean z3);

    public final void ah() {
    }

    public final void ai() {
    }

    public final void aj() {
    }

    public final void a() {
        this.a.s.remove(this);
    }

    public final void X() {
        if (this.a.e()) {
            this.b.setEnabled(true);
            a(this.a.d, false, false);
            return;
        }
        b();
    }

    public final void Y() {
        b();
    }

    private final void b() {
        this.b.setEnabled(false);
    }

    public final void a(int i, int i2) {
        ImageView imageView = this.b;
        imageView.setImageDrawable(imageView.getResources().getDrawable(i));
        Drawable drawable = this.b.getDrawable();
        if (drawable instanceof Animatable2) {
            Animatable2 animatable2 = (Animatable2) drawable;
            animatable2.registerAnimationCallback(new zhp(this, i2));
            animatable2.start();
        }
    }

    public final void a(boolean z) {
        amqw.a(this.b);
        if (xrn.c(this.b.getContext())) {
            xrn.a(this.b.getContext(), this.b, this.b.getContext().getString(!z ? R.string.accessibility_flashlight_turned_off : R.string.accessibility_flashlight_turned_on));
        }
    }
}
