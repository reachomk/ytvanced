package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: gbm */
final /* synthetic */ class gbm implements Runnable {
    private final gbi a;

    gbm(gbi gbi) {
        this.a = gbi;
    }

    public final void run() {
        gbi gbi = this.a;
        if (gbi.a) {
            ImageView imageView = gbi.i;
            if (imageView != null) {
                imageView.setImageDrawable(imageView.getResources().getDrawable(!gbi.t ? R.drawable.reel_face_filter_unselected_white_icon_v2 : R.drawable.reel_face_filter_selected_white_icon_v2));
                if (gbi.t) {
                    gbi.b.a(3, new acvs(acwc.UPLOAD_VIDEO_EDITING_VIDEO_EFFECTS_BUTTON), null);
                }
            }
            if (gbi.j != null) {
                zmn a = gbi.k.a();
                Object obj = (a == null || a.b != ayza.EFFECT_SUBPACKAGE_ID_PRESET) ? null : 1;
                ImageView imageView2 = gbi.j;
                imageView2.setImageDrawable(imageView2.getResources().getDrawable(obj == null ? R.drawable.ic_presets_disabled : R.drawable.ic_presets_enabled));
                gbp gbp = gbi.r;
                ArrayList arrayList = new ArrayList();
                arrayList.add(gbp);
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(((gfy) arrayList.get(i)).a(), View.ROTATION, new float[]{((gfy) arrayList.get(i)).b(), ((gfy) arrayList.get(i)).c()});
                    ofFloat.setDuration(250);
                    arrayList2.add(ofFloat);
                }
                animatorSet.playTogether(arrayList2);
                animatorSet.start();
                if (gbi.u) {
                    gbi.b.a(3, new acvs(acwc.REELS_CAMERA_PRESETS_BUTTON), null);
                }
            }
            gfu.a(gbi.o);
            if (!gbi.s) {
                gfu.a(gbi.q);
                gfu.a(gbi.p);
            }
        }
    }
}
