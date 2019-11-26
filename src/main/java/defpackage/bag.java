package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: bag */
final class bag {
    public static int a(Context context) {
        float dimension;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(i >= i2 ? R.dimen.mr_dialog_fixed_width_major : R.dimen.mr_dialog_fixed_width_minor, typedValue, true);
        if (typedValue.type == 5) {
            dimension = typedValue.getDimension(displayMetrics);
        } else if (typedValue.type != 6) {
            return -2;
        } else {
            dimension = typedValue.getFraction((float) displayMetrics.widthPixels, (float) displayMetrics.widthPixels);
        }
        return (int) dimension;
    }

    public static Set a(List list, List list2) {
        HashSet hashSet = new HashSet(list);
        hashSet.removeAll(list2);
        return hashSet;
    }
}
