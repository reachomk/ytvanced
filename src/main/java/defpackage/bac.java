package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import com.google.android.youtube.R;
import java.util.List;
import java.util.Set;

/* renamed from: bac */
final class bac extends ArrayAdapter {
    private final float a;
    private final /* synthetic */ azl b;

    public bac(azl azl, Context context, List list) {
        this.b = azl;
        super(context, 0, list);
        this.a = bai.b(context);
    }

    public final boolean isEnabled(int i) {
        return false;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = 0;
        if (view != null) {
            azl azl = this.b;
            azl.b((LinearLayout) view.findViewById(R.id.volume_item_container), azl.w);
            View findViewById = view.findViewById(R.id.mr_volume_item_icon);
            LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.width = azl.v;
            layoutParams.height = azl.v;
            findViewById.setLayoutParams(layoutParams);
        } else {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
        }
        bbs bbs = (bbs) getItem(i);
        if (bbs != null) {
            boolean z = bbs.g;
            TextView textView = (TextView) view.findViewById(R.id.mr_name);
            textView.setEnabled(z);
            textView.setText(bbs.d);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
            bai.a(viewGroup.getContext(), mediaRouteVolumeSlider, this.b.m);
            mediaRouteVolumeSlider.setTag(bbs);
            this.b.z.put(bbs, mediaRouteVolumeSlider);
            mediaRouteVolumeSlider.a(z ^ 1);
            mediaRouteVolumeSlider.setEnabled(z);
            if (z) {
                if (this.b.a(bbs)) {
                    mediaRouteVolumeSlider.setMax(bbs.p);
                    mediaRouteVolumeSlider.setProgress(bbs.o);
                    mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.b.t);
                } else {
                    mediaRouteVolumeSlider.setMax(100);
                    mediaRouteVolumeSlider.setProgress(100);
                    mediaRouteVolumeSlider.setEnabled(false);
                }
            }
            ((ImageView) view.findViewById(R.id.mr_volume_item_icon)).setAlpha(!z ? (int) (this.a * 255.0f) : 255);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.volume_item_container);
            if (this.b.r.contains(bbs)) {
                i2 = 4;
            }
            linearLayout.setVisibility(i2);
            Set set = this.b.p;
            if (set != null && set.contains(bbs)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(0);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                view.clearAnimation();
                view.startAnimation(alphaAnimation);
            }
        }
        return view;
    }
}
