package defpackage;

import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Field;

/* renamed from: amu */
public final class amu {
    public static final Rect a = new Rect();
    private static final int[] b = new int[]{16842912};
    private static final int[] c = new int[0];
    private static Class d;

    public static Rect a(Drawable drawable) {
        if (d != null) {
            try {
                drawable = st.e(drawable);
                Object invoke = drawable.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(drawable, new Object[0]);
                if (invoke != null) {
                    Rect rect = new Rect();
                    for (Field field : d.getFields()) {
                        String name = field.getName();
                        int i = -1;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (!name.equals("bottom")) {
                                    break;
                                }
                                i = 3;
                                break;
                            case 115029:
                                if (!name.equals("top")) {
                                    break;
                                }
                                i = 1;
                                break;
                            case 3317767:
                                if (!name.equals("left")) {
                                    break;
                                }
                                i = 0;
                                break;
                            case 108511772:
                                if (!name.equals("right")) {
                                    break;
                                }
                                i = 2;
                                break;
                            default:
                                break;
                        }
                        if (i == 0) {
                            rect.left = field.getInt(invoke);
                        } else if (i == 1) {
                            rect.top = field.getInt(invoke);
                        } else if (i == 2) {
                            rect.right = field.getInt(invoke);
                        } else if (i == 3) {
                            rect.bottom = field.getInt(invoke);
                        }
                    }
                    return rect;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return a;
    }

    static void b(Drawable drawable) {
        if (VERSION.SDK_INT == 21) {
            if ("android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
                int[] state = drawable.getState();
                if (state == null || state.length == 0) {
                    drawable.setState(b);
                } else {
                    drawable.setState(c);
                }
                drawable.setState(state);
            }
        }
    }

    public static boolean c(Drawable drawable) {
        if (drawable instanceof DrawableContainer) {
            ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainerState) {
                for (Drawable c : ((DrawableContainerState) constantState).getChildren()) {
                    if (!amu.c(c)) {
                        return false;
                    }
                }
            }
        } else if (drawable instanceof sz) {
            return amu.c(((sz) drawable).a());
        } else {
            if (drawable instanceof agm) {
                return amu.c(((agm) drawable).a);
            }
            if (drawable instanceof ScaleDrawable) {
                return amu.c(((ScaleDrawable) drawable).getDrawable());
            }
        }
        return true;
    }

    public static Mode a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    static {
        try {
            d = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }
}
