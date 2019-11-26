package defpackage;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.Display;
import java.lang.reflect.Field;

/* renamed from: bafa */
public final class bafa {
    public static boolean a() {
        return VERSION.SDK_INT >= 28;
    }

    public static baez a(Display display) {
        if (bafa.a()) {
            try {
                Class cls = Class.forName("android.view.DisplayInfo");
                Object newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                Display.class.getDeclaredMethod("getDisplayInfo", new Class[]{cls}).invoke(display, new Object[]{newInstance});
                Field declaredField = cls.getDeclaredField("displayCutout");
                declaredField.setAccessible(true);
                return baez.a(declaredField.get(newInstance));
            } catch (Exception e) {
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 44);
                stringBuilder.append("Failed to fetch DisplayCutout from Display: ");
                stringBuilder.append(valueOf);
                Log.e("AndroidPCompat", stringBuilder.toString());
            }
        }
        return null;
    }
}
