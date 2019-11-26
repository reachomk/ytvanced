package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.List;

/* renamed from: sl */
final class sl extends sm {
    public static final Method a;
    private static final Class b;
    private static final Constructor d;
    private static final Method e;

    sl() {
    }

    private static Object a() {
        try {
            return d.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static boolean a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) a.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface a(Object obj) {
        try {
            Array.set(Array.newInstance(b, 1), 0, obj);
            return (Typeface) e.invoke(null, new Object[]{r1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final Typeface a(Context context, CancellationSignal cancellationSignal, yp[] ypVarArr, int i) {
        Object a = sl.a();
        if (a != null) {
            aac aac = new aac();
            for (yp ypVar : ypVarArr) {
                Uri uri = ypVar.a;
                ByteBuffer byteBuffer = (ByteBuffer) aac.get(uri);
                if (byteBuffer == null) {
                    byteBuffer = sq.a(context, cancellationSignal, uri);
                    aac.put(uri, byteBuffer);
                }
                if (byteBuffer == null || !sl.a(a, byteBuffer, ypVar.b, ypVar.c, ypVar.d)) {
                    return null;
                }
            }
            Typeface a2 = sl.a(a);
            if (a2 != null) {
                return Typeface.create(a2, i);
            }
        }
        return null;
    }

    public final Typeface a(Context context, rt rtVar, Resources resources, int i) {
        Throwable th;
        Object a = sl.a();
        if (a == null) {
            return null;
        }
        rs[] rsVarArr = rtVar.a;
        int length = rsVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            ByteBuffer map;
            rs rsVar = rsVarArr[i2];
            int i3 = rsVar.f;
            File a2 = sq.a(context);
            if (a2 != null) {
                try {
                    if (sq.a(a2, resources, i3)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(a2);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                map = channel.map(MapMode.READ_ONLY, 0, channel.size());
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                fileInputStream.close();
                            }
                        } catch (IOException unused) {
                            map = null;
                        } catch (Throwable th22) {
                            ankx.a(th, th22);
                        }
                        a2.delete();
                        if (map != null || !sl.a(a, map, rsVar.e, rsVar.b, rsVar.c)) {
                            return null;
                        }
                        i2++;
                    }
                } finally {
                    a2.delete();
                }
            } else {
                Resources resources2 = resources;
            }
            map = null;
            if (map != null) {
            }
            return null;
        }
        return sl.a(a);
    }

    static {
        Class cls;
        Method method;
        Method method2;
        Constructor constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            constructor = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            method2 = constructor;
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = constructor;
            method2 = cls;
            method = method2;
        }
        d = constructor;
        b = cls;
        a = method;
        e = method2;
    }
}
