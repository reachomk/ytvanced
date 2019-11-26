package defpackage;

import android.content.res.Resources;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: afl */
final class afl {
    private static Field a;
    private static boolean b;
    private static Class c;
    private static boolean d;
    private static Field e;
    private static boolean f;
    private static Field g;
    private static boolean h;

    public static void a(Resources resources) {
        String str = "ResourcesFlusher";
        if (!b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(str, "Could not retrieve Resources#mDrawableCache field", e);
            }
            b = true;
        }
        Field field = a;
        if (field != null) {
            Map map;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(str, "Could not retrieve value from Resources#mDrawableCache", e2);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    public static void b(Resources resources) {
        String str = "ResourcesFlusher";
        if (!b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(str, "Could not retrieve Resources#mDrawableCache field", e);
            }
            b = true;
        }
        Field field = a;
        Object obj = null;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(str, "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj != null) {
            afl.a(obj);
        }
    }

    public static void c(Resources resources) {
        Field declaredField;
        String str = "ResourcesFlusher";
        if (!h) {
            try {
                declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(str, "Could not retrieve Resources#mResourcesImpl field", e);
            }
            h = true;
        }
        declaredField = g;
        if (declaredField != null) {
            Object obj;
            Object obj2 = null;
            try {
                obj = declaredField.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(str, "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!b) {
                    try {
                        declaredField = obj.getClass().getDeclaredField("mDrawableCache");
                        a = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e(str, "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    b = true;
                }
                declaredField = a;
                if (declaredField != null) {
                    try {
                        obj2 = declaredField.get(obj);
                    } catch (IllegalAccessException e22) {
                        Log.e(str, "Could not retrieve value from ResourcesImpl#mDrawableCache", e22);
                    }
                }
                if (obj2 != null) {
                    afl.a(obj2);
                }
            }
        }
    }

    private static void a(Object obj) {
        String str = "ResourcesFlusher";
        if (!d) {
            try {
                c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e(str, "Could not find ThemedResourceCache class", e);
            }
            d = true;
        }
        Class cls = c;
        if (cls != null) {
            Field declaredField;
            if (!f) {
                try {
                    declaredField = cls.getDeclaredField("mUnthemedEntries");
                    e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e(str, "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f = true;
            }
            declaredField = e;
            if (declaredField != null) {
                LongSparseArray longSparseArray;
                try {
                    longSparseArray = (LongSparseArray) declaredField.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e(str, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
