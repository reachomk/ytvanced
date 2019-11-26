package defpackage;

import android.content.Context;
import android.view.View.MeasureSpec;
import com.google.android.youtube.R;

/* renamed from: zge */
public final class zge extends zga {
    public zge(Context context, zfi zfi, akkl akkl) {
        super(context, zfi, akkl, R.layout.audio_swap_track_tile);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        super.onMeasure(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredWidth() + (getRootView().findViewById(R.id.audio_swap_track_track_info).getMeasuredHeight() / 2)) + getContext().getResources().getDimensionPixelSize(R.dimen.audio_swap_track_tile_bottom_bar_offset), 1073741824));
    }
}
