package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: agb */
public final class agb {
    private static final ThreadLocal a = new ThreadLocal();
    private static final WeakHashMap b = new WeakHashMap(0);
    private static final Object c = new Object();

    public static ColorStateList a(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        SparseArray sparseArray;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        synchronized (c) {
            sparseArray = (SparseArray) b.get(context);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0) {
                aga aga = (aga) sparseArray.get(i);
                if (aga != null) {
                    if (aga.b.equals(context.getResources().getConfiguration())) {
                        colorStateList2 = aga.a;
                    } else {
                        sparseArray.remove(i);
                    }
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        Resources resources = context.getResources();
        TypedValue typedValue = (TypedValue) a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            a.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        if (typedValue.type < 28 || typedValue.type > 31) {
            resources = context.getResources();
            try {
                colorStateList = rp.a(resources, resources.getXml(i), context.getTheme());
            } catch (Exception e) {
                Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList == null) {
            return ra.b(context, i);
        }
        synchronized (c) {
            sparseArray = (SparseArray) b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                b.put(context, sparseArray);
            }
            sparseArray.append(i, new aga(colorStateList, context.getResources().getConfiguration()));
        }
        return colorStateList;
    }

    public static Drawable b(Context context, int i) {
        return aqk.a().a(context, i);
    }
}
