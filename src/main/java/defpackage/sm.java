package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: sm */
class sm {
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    sm() {
    }

    private static Object a(Object[] objArr, int i, sr srVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        Object obj = null;
        int i3 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = Math.abs(srVar.b(obj2) - i2);
            abs = (abs + abs) + (srVar.a(obj2) == z ? 0 : 1);
            if (obj == null || i3 > abs) {
                obj = obj2;
                i3 = abs;
            }
        }
        return obj;
    }

    public static long a(Typeface typeface) {
        String str = "Could not retrieve font from family.";
        String str2 = "TypefaceCompatBaseImpl";
        if (typeface != null) {
            try {
                Field declaredField = Typeface.class.getDeclaredField("native_instance");
                declaredField.setAccessible(true);
                str = ((Number) declaredField.get(typeface)).longValue();
                return str;
            } catch (NoSuchFieldException e) {
                Log.e(str2, str, e);
            } catch (IllegalAccessException e2) {
                Log.e(str2, str, e2);
                return 0;
            }
        }
        return 0;
    }

    protected static yp a(yp[] ypVarArr, int i) {
        return (yp) sm.a(ypVarArr, i, new sp());
    }

    protected static Typeface a(Context context, InputStream inputStream) {
        File a = sq.a(context);
        if (a != null) {
            try {
                if (sq.a(a, inputStream)) {
                    Typeface inputStream2 = Typeface.createFromFile(a.getPath());
                    return inputStream2;
                }
                a.delete();
                return null;
            } catch (RuntimeException unused) {
            } finally {
                a.delete();
            }
        }
        return null;
    }

    public Typeface a(Context context, CancellationSignal cancellationSignal, yp[] ypVarArr, int i) {
        Throwable th;
        if (ypVarArr.length > 0) {
            Closeable openInputStream;
            try {
                openInputStream = context.getContentResolver().openInputStream(sm.a(ypVarArr, i).a);
                try {
                    Typeface a = sm.a(context, (InputStream) openInputStream);
                    sq.a(openInputStream);
                    return a;
                } catch (IOException unused) {
                    sq.a(openInputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    sq.a(openInputStream);
                    throw th;
                }
            } catch (IOException unused2) {
                openInputStream = null;
                sq.a(openInputStream);
                return null;
            } catch (Throwable th3) {
                th = th3;
                openInputStream = null;
                sq.a(openInputStream);
                throw th;
            }
        }
        return null;
    }

    public Typeface a(Context context, rt rtVar, Resources resources, int i) {
        rs rsVar = (rs) sm.a(rtVar.a, i, new so());
        if (rsVar == null) {
            return null;
        }
        Typeface a = sj.a(context, resources, rsVar.f, rsVar.a, i);
        long a2 = sm.a(a);
        if (a2 != 0) {
            this.c.put(Long.valueOf(a2), rtVar);
        }
        return a;
    }

    public Typeface a(Context context, Resources resources, int i, String str, int i2) {
        File a = sq.a(context);
        if (a != null) {
            try {
                if (sq.a(a, resources, i)) {
                    Typeface resources2 = Typeface.createFromFile(a.getPath());
                    return resources2;
                }
                a.delete();
                return null;
            } catch (RuntimeException unused) {
            } finally {
                a.delete();
            }
        }
        return null;
    }
}
