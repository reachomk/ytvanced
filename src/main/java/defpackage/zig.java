package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.edit.camera.GalleryCameraRecordButtonView;

/* renamed from: zig */
final class zig extends AnimatorListenerAdapter {
    private final /* synthetic */ GalleryCameraRecordButtonView a;

    zig(GalleryCameraRecordButtonView galleryCameraRecordButtonView) {
        this.a = galleryCameraRecordButtonView;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.b.setVisibility(8);
    }
}
