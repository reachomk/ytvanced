package defpackage;

import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: bgu */
public final class bgu {
    public final ViewGroup a;
    public final Runnable b;

    public static bgu a(ViewGroup viewGroup) {
        return (bgu) viewGroup.getTag(R.id.transition_current_scene);
    }
}
