package defpackage;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.view.Window;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: sjv */
public final class sjv {
    private static final Typeface a = Typeface.create("sans-serif-medium", 0);
    private static final Typeface b = Typeface.create("sans-serif", 0);

    public static void a(TextView textView) {
        if (sjv.a()) {
            textView.setTypeface(a);
        } else {
            textView.setTypeface(Typeface.SANS_SERIF, 1);
        }
    }

    public static void b(TextView textView) {
        if (sjv.a()) {
            textView.setTypeface(b);
        } else {
            textView.setTypeface(Typeface.SANS_SERIF, 0);
        }
    }

    public static void a(Window window) {
        if (VERSION.SDK_INT >= 23) {
            window.setBackgroundDrawableResource(R.drawable.gdi_rounded_background);
        }
    }

    public static float a(Resources resources) {
        return (float) resources.getDisplayMetrics().heightPixels;
    }

    private static boolean a() {
        return VERSION.SDK_INT >= 21;
    }
}
