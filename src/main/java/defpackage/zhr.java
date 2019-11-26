package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.widget.ImageView;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.youtube.R;

/* renamed from: zhr */
public final class zhr extends zhq {
    private final CameraView e;
    private final ImageView f;
    private final Context g;

    public zhr(Context context, CameraView cameraView, ImageView imageView, acvx acvx, atst atst) {
        super(cameraView, imageView, acvx, atst);
        this.e = cameraView;
        this.f = imageView;
        this.g = context;
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        if (this.e.a(z)) {
            int i = VERSION.SDK_INT;
            int i2 = R.drawable.camera_flash_disabled;
            if (i < 23 || !z2) {
                ImageView imageView = this.f;
                Resources resources = this.g.getResources();
                if (z) {
                    i2 = R.drawable.camera_flash_enabled;
                }
                imageView.setImageDrawable(resources.getDrawable(i2));
            } else if (z) {
                a(R.drawable.camera_flash_enable, R.drawable.camera_flash_enabled);
            } else {
                a(R.drawable.camera_flash_disable, R.drawable.camera_flash_disabled);
            }
            if (z3) {
                a(z);
            }
            this.f.setContentDescription(this.g.getString(!z ? R.string.accessibility_turn_flashlight_on_button : R.string.accessibility_turn_flashlight_off_button));
        }
    }
}
