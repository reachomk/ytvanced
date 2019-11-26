package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: uix */
public final class uix {
    public static String a(Context context, long j, boolean z) {
        return uix.a(context, !z ? R.string.time_minutes_seconds : R.string.time_minutes_seconds_millis, j);
    }

    public static String a(Context context, int i, long j) {
        int i2 = (int) (j % 1000);
        return context.getResources().getString(i, new Object[]{Integer.valueOf((int) (j / 60000)), Integer.valueOf(((int) (j / 1000)) % 60), Integer.valueOf(i2), Integer.valueOf(i2 / 100)});
    }

    public static String a(Context context, long j) {
        int i = (int) (j / 60000);
        int i2 = ((int) (j / 1000)) % 60;
        String quantityString = context.getResources().getQuantityString(R.plurals.duration_seconds, i2, new Object[]{Integer.valueOf(i2)});
        if (i == 0) {
            return quantityString;
        }
        String quantityString2 = context.getResources().getQuantityString(R.plurals.duration_minutes, i, new Object[]{Integer.valueOf(i)});
        return context.getResources().getString(R.string.duration_content_description, new Object[]{quantityString2, quantityString});
    }
}
