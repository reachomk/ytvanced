package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: anny */
public final class anny {
    public final Object a;
    public final anoa b;

    public anny(Object obj, anoa anoa) {
        this.a = obj;
        this.b = anoa;
    }

    public static List a(List list) {
        String str = "Could not instantiate %s.";
        String str2 = "ComponentDiscovery";
        ArrayList arrayList = new ArrayList();
        for (String cls : list) {
            try {
                Class cls2 = Class.forName(cls);
                if (anns.class.isAssignableFrom(cls2)) {
                    arrayList.add((anns) cls2.newInstance());
                } else {
                    Log.w(str2, String.format("Class %s is not an instance of %s", new Object[]{cls, "com.google.firebase.components.ComponentRegistrar"}));
                }
            } catch (ClassNotFoundException e) {
                Log.w(str2, String.format("Class %s is not an found.", new Object[]{cls}), e);
            } catch (IllegalAccessException e2) {
                Log.w(str2, String.format(str, new Object[]{cls}), e2);
            } catch (InstantiationException e3) {
                Log.w(str2, String.format(str, new Object[]{cls}), e3);
            }
        }
        return arrayList;
    }
}
