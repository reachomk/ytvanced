package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: du */
public final class du {
    private final aac a = new aac();
    private final aac b = new aac();

    public final dw a(String str) {
        if (this.a.get(str) != null) {
            return (dw) this.a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static du a(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                return du.a(context, resourceId);
            }
        }
        return null;
    }

    public static du a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return du.a(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            List arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return du.a(arrayList);
        } catch (Exception e) {
            String valueOf = String.valueOf(Integer.toHexString(i));
            String str = "Can't load animation resource ID #0x";
            Log.w("MotionSpec", valueOf.length() == 0 ? new String(str) : str.concat(valueOf), e);
            return null;
        }
    }

    private static du a(List list) {
        du duVar = new du();
        int size = list.size();
        int i = 0;
        while (i < size) {
            Animator animator = (Animator) list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                duVar.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = dq.b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = dq.c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = dq.d;
                }
                dw dwVar = new dw(startDelay, duration, interpolator);
                dwVar.a = objectAnimator.getRepeatCount();
                dwVar.b = objectAnimator.getRepeatMode();
                duVar.a.put(propertyName, dwVar);
                i++;
            } else {
                String valueOf = String.valueOf(animator);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 36);
                stringBuilder.append("Animator must be an ObjectAnimator: ");
                stringBuilder.append(valueOf);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return duVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du)) {
            return false;
        }
        return this.a.equals(((du) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(10);
        stringBuilder.append(getClass().getName());
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" timings: ");
        stringBuilder.append(this.a);
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}
