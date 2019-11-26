package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.youtube.edit.camera.GalleryCameraRecordButtonView;

/* renamed from: zih */
final class zih extends AnimatorListenerAdapter {
    private final /* synthetic */ GalleryCameraRecordButtonView a;

    zih(GalleryCameraRecordButtonView galleryCameraRecordButtonView) {
        this.a = galleryCameraRecordButtonView;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.b.setVisibility(0);
    }
}
