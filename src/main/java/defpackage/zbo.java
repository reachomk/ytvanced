package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.Color;

/* renamed from: zbo */
public final class zbo implements TypeEvaluator {
    private zbo() {
    }

    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        int alpha = Color.alpha(num.intValue());
        int red = Color.red(num.intValue());
        int green = Color.green(num.intValue());
        int blue = Color.blue(num.intValue());
        return Integer.valueOf(Color.argb(alpha + ((int) (((float) (Color.alpha(num2.intValue()) - alpha)) * f)), red + ((int) (((float) (Color.red(num2.intValue()) - red)) * f)), green + ((int) (((float) (Color.green(num2.intValue()) - green)) * f)), blue + ((int) (((float) (Color.blue(num2.intValue()) - blue)) * f))));
    }

    public /* synthetic */ zbo(byte b) {
    }
}
