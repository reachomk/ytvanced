package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: xro */
public final class xro {
    public static ViewGroup a(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().findViewById(R.id.interstitials_container);
        return viewGroup == null ? (ViewGroup) activity.getWindow().getDecorView() : viewGroup;
    }
}
