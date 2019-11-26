package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: trg */
public final class trg {
    public static boolean a(View view) {
        Context context = view.getContext();
        if (context instanceof Activity) {
            List arrayList;
            view = view.getRootView();
            Activity activity = (Activity) context;
            try {
                arrayList = new ArrayList();
                Object a = trg.a("mGlobal", activity.getWindowManager());
                Object a2 = trg.a("mRoots", a);
                List list = (List) trg.a("mParams", a);
                LayoutParams[] layoutParamsArr = (LayoutParams[]) list.toArray(new LayoutParams[list.size()]);
                Object[] toArray = a2 instanceof List ? ((List) a2).toArray() : (Object[]) a2;
                for (int i = 0; i < toArray.length; i++) {
                    Object obj = toArray[i];
                    Object a3 = trg.a("mAttachInfo", obj);
                    int intValue = ((Integer) trg.a("mWindowTop", a3)).intValue();
                    int intValue2 = ((Integer) trg.a("mWindowLeft", a3)).intValue();
                    Rect rect = (Rect) trg.a("mWinFrame", obj);
                    Rect rect2 = new Rect(intValue2, intValue, rect.width() + intValue2, rect.height() + intValue);
                    arrayList.add(new trj((View) trg.a("mView", obj), layoutParamsArr[i]));
                }
            } catch (IllegalAccessException e) {
                Log.e("OcclusionHelper", "Field value was not able to be found", e);
                arrayList = new ArrayList();
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                trj trj = (trj) arrayList.get(i2);
                if (trj.a != view && (trj.b.flags & 2) == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    private static Object a(String str, Object obj) {
        loop0:
        for (Class cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    break loop0;
                }
            }
        }
        Field field2 = null;
        field2.setAccessible(true);
        return field2.get(obj);
    }
}
