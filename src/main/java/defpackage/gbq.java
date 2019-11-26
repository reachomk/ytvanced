package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.youtube.R;

/* renamed from: gbq */
public final class gbq extends zhq {
    private final CameraView e;
    private final ImageView f;
    private final Context g;

    public gbq(Context context, CameraView cameraView, ImageView imageView, acvx acvx) {
        super(cameraView, imageView, acvx, null);
        this.e = cameraView;
        this.f = imageView;
        this.g = context;
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        if (this.e.a(z)) {
            this.f.setImageDrawable(this.g.getResources().getDrawable(!z ? R.drawable.reel_flash_off_icon_v2 : R.drawable.reel_flash_on_icon_v2));
            if (z3) {
                a(z);
            }
            this.f.setContentDescription(this.g.getString(!z ? R.string.accessibility_turn_flashlight_on_button : R.string.accessibility_turn_flashlight_off_button));
        }
    }
}
