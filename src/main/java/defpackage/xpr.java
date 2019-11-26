package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.youtube.R;

/* renamed from: xpr */
public final class xpr {
    public static xph a;

    public static int a(float f) {
        return f > 0.0f ? f < 1.0f ? (int) (f * 255.0f) : 255 : 0;
    }

    public static void a(Context context, int i, int i2) {
        if (context != null) {
            Toast.makeText(context.getApplicationContext(), i, i2).show();
        }
    }

    public static void a(Context context, CharSequence charSequence, int i) {
        if (context != null) {
            Toast.makeText(context.getApplicationContext(), charSequence, i).show();
        }
    }

    public static void a(View view, boolean z) {
        view.setVisibility(!z ? 8 : 0);
    }

    public static void a(TextView textView, CharSequence charSequence) {
        xpr.a(textView, charSequence, 0);
    }

    public static void a(TextView textView, CharSequence charSequence, int i) {
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(i);
        textView.setText(charSequence);
    }

    public static Drawable a(Context context, int i) {
        int[] iArr = (i == 1 && VERSION.SDK_INT >= 21) ? new int[]{R.attr.selectableItemBackgroundBorderless} : new int[]{R.attr.selectableItemBackground};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public static void a(View view, Drawable drawable, int i) {
        boolean z = drawable instanceof xpq;
        if (z && ((xpq) drawable).b == i) {
            view.setBackground(drawable);
            return;
        }
        Drawable a = xpr.a(view.getContext(), i);
        if (a == null) {
            xpv.a(view, drawable);
        } else if (drawable != null) {
            if (z) {
                drawable = ((xpq) drawable).a;
            }
            xpv.a(view, new xpq(drawable, a, i));
        } else {
            xpv.a(view, a);
        }
    }

    public static void a(View view, Drawable drawable) {
        xpr.a(view, drawable, 0);
    }

    public static void a(View view) {
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void a(Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = activity.getWindow().getDecorView();
        }
        if (currentFocus != null) {
            xpr.a(currentFocus);
        }
    }

    public static void b(View view) {
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
        }
    }

    public static boolean a(View view, View view2) {
        if (view instanceof ViewParent) {
            return xpr.a((ViewParent) view, view2);
        }
        return view2 == view;
    }

    public static boolean a(ViewParent viewParent, View view) {
        while (view != null) {
            if (view == viewParent) {
                return true;
            }
            if (view.getParent() instanceof View) {
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return false;
            }
        }
        return false;
    }

    public static int a(Context context, ListAdapter listAdapter, ViewGroup viewGroup) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(xss.f(context), aocf.UNSET_ENUM_VALUE);
        int i = 0;
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        while (i < count) {
            int itemViewType = listAdapter.getItemViewType(i);
            int i4 = itemViewType == i3 ? i3 : itemViewType;
            if (itemViewType != i3) {
                view = null;
            }
            view = listAdapter.getView(i, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = view.getMeasuredWidth();
            if (i3 > i2) {
                i2 = i3;
            }
            i++;
            i3 = i4;
        }
        return i2;
    }

    public static float a(Context context, float f, float f2) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        f2 = xss.b(displayMetrics, f2);
        f = ((float) Math.ceil((double) (xss.b(displayMetrics, f) / f2))) * f2;
        amqw.a((Object) context);
        if (f > ((float) xss.b(context.getResources().getDisplayMetrics(), xss.f(context)))) {
            f -= f2;
        }
        double d = (double) f;
        double d2 = (double) f2;
        Double.isNaN(d2);
        if (d < d2 * 1.5d) {
            f = f2 * 1.5f;
        }
        return xss.a(displayMetrics, f);
    }

    public static View a(View view, int i, int i2) {
        View findViewById = view.findViewById(i);
        if (findViewById == null || !(findViewById instanceof ViewStub)) {
            return view.findViewById(i2);
        }
        return ((ViewStub) findViewById).inflate();
    }

    public static float a(Resources resources, int i) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, true);
        return typedValue.getFloat();
    }
}
