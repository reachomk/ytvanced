package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.youtube.R;

/* renamed from: zio */
public final class zio implements OnClickListener {
    private final Context a;
    private final CameraView b;
    private final ImageView c;
    private final acvx d;
    private final atst e;

    public zio(Context context, CameraView cameraView, ImageView imageView, acvx acvx, atst atst) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (CameraView) amqw.a((Object) cameraView);
        this.c = (ImageView) amqw.a((Object) imageView);
        this.c.setOnClickListener(this);
        b();
        this.d = (acvx) amqw.a((Object) acvx);
        this.e = atst;
    }

    public final void onClick(View view) {
        if (view == this.c) {
            this.d.a(3, new acvs(acwc.UPLOAD_VIDEO_CAMERA_SWITCH_BUTTON), this.e);
            a();
        }
    }

    public final void a() {
        if (this.b.f()) {
            Drawable drawable = this.c.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).start();
            } else {
                this.c.animate().rotationBy(180.0f).start();
            }
            CameraView cameraView = this.b;
            int g = cameraView.g();
            int i = 0;
            int i2 = g == 1 ? 0 : 1;
            if (g == 1) {
                i2 = 0;
            }
            amqw.a(true, "cameraDirection must be one of @CameraDirection values; was %s.", i2);
            if (cameraView.f() && (i2 == 0 ? cameraView.k == cameraView.l : cameraView.k == cameraView.m)) {
                cameraView.f.c();
                g = cameraView.f.g;
                i2 = cameraView.l;
                g = g == i2 ? cameraView.m : i2;
                cameraView.k = g;
                zgs zgs = cameraView.r;
                if (g != i2) {
                    i = 1;
                }
                zgs.a(i);
                cameraView.i();
            }
            b();
        }
    }

    private final void b() {
        if (this.b.g() == 0) {
            this.c.setContentDescription(this.a.getString(R.string.upload_edit_camera_switch_to_front_button));
        } else {
            this.c.setContentDescription(this.a.getString(R.string.upload_edit_camera_switch_to_back_button));
        }
    }
}
