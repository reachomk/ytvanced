package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import com.google.android.apps.youtube.app.common.ui.navigationbar.NavigationBarDividerLayout;
import com.google.android.youtube.R;

/* renamed from: fjn */
public final class fjn {
    public static final boolean a = (VERSION.SDK_INT >= 27);
    public NavigationBarDividerLayout b;
    private final Activity c;

    public fjn(Activity activity) {
        this.c = activity;
    }

    public final void a(Context context) {
        if (a) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, fjp.d, R.attr.navigationBarStyle, R.style.NavigationBar);
            a(obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }
    }

    public final void a(TypedArray typedArray) {
        if (a && typedArray != null) {
            int color;
            if (typedArray.hasValue(fjp.e)) {
                color = typedArray.getColor(fjp.e, 0);
                if (a) {
                    Window window = this.c.getWindow();
                    if (window.getNavigationBarColor() != color) {
                        window.setNavigationBarColor(color);
                    }
                }
            }
            if (typedArray.hasValue(fjp.f)) {
                View decorView;
                int systemUiVisibility;
                if (typedArray.getInt(fjp.f, 0) != 1) {
                    if (a) {
                        decorView = this.c.getWindow().getDecorView();
                        systemUiVisibility = decorView.getSystemUiVisibility();
                        if ((systemUiVisibility & 16) != 0) {
                            decorView.setSystemUiVisibility(systemUiVisibility & -17);
                        }
                    }
                } else if (a) {
                    decorView = this.c.getWindow().getDecorView();
                    systemUiVisibility = decorView.getSystemUiVisibility();
                    if ((systemUiVisibility & 16) != 16) {
                        decorView.setSystemUiVisibility(systemUiVisibility | 16);
                    }
                }
            }
            if (typedArray.hasValue(fjp.g)) {
                color = typedArray.getColor(fjp.g, 0);
                NavigationBarDividerLayout navigationBarDividerLayout = this.b;
                if (!(navigationBarDividerLayout == null || color == navigationBarDividerLayout.c)) {
                    navigationBarDividerLayout.c = color;
                    navigationBarDividerLayout.a.setColor(color);
                    if (navigationBarDividerLayout.b > 0) {
                        navigationBarDividerLayout.invalidate();
                    }
                }
            }
            if (typedArray.hasValue(fjp.h)) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(fjp.h, 0);
                NavigationBarDividerLayout navigationBarDividerLayout2 = this.b;
                if (navigationBarDividerLayout2 != null && dimensionPixelSize != navigationBarDividerLayout2.b) {
                    navigationBarDividerLayout2.b = Math.max(0, dimensionPixelSize);
                    navigationBarDividerLayout2.requestLayout();
                    navigationBarDividerLayout2.invalidate();
                }
            }
        }
    }
}
