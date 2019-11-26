package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: mk */
public final class mk {
    public static final Set a = new HashSet();
    public static final boolean b;

    public static Field a(Object obj, String str) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Field ");
        stringBuilder.append(str);
        stringBuilder.append(" not found in ");
        stringBuilder.append(obj.getClass());
        throw new NoSuchFieldException(stringBuilder.toString());
    }

    public static Method a(Object obj, String str, Class... clsArr) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Method ");
        stringBuilder.append(str);
        stringBuilder.append(" with parameters ");
        stringBuilder.append(Arrays.asList(clsArr));
        stringBuilder.append(" not found in ");
        stringBuilder.append(obj.getClass());
        throw new NoSuchMethodException(stringBuilder.toString());
    }

    public static void a(Object obj, String str, Object[] objArr) {
        Field a = mk.a(obj, str);
        Object[] objArr2 = (Object[]) a.get(obj);
        Class componentType = objArr2.getClass().getComponentType();
        int length = objArr2.length;
        int length2 = objArr.length;
        Object[] objArr3 = (Object[]) Array.newInstance(componentType, length + length2);
        System.arraycopy(objArr2, 0, objArr3, 0, length);
        System.arraycopy(objArr, 0, objArr3, length, length2);
        a.set(obj, objArr3);
    }

    public static void a(File file) {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            String str = "MultiDex";
            String str2 = "Failed to create dir ";
            if (parentFile == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str2);
                stringBuilder.append(file.getPath());
                stringBuilder.append(". Parent file is null.");
                Log.e(str, stringBuilder.toString());
            } else {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(str2);
                stringBuilder2.append(file.getPath());
                stringBuilder2.append(". parent file is a dir ");
                stringBuilder2.append(parentFile.isDirectory());
                stringBuilder2.append(", a file ");
                stringBuilder2.append(parentFile.isFile());
                stringBuilder2.append(", exists ");
                stringBuilder2.append(parentFile.exists());
                stringBuilder2.append(", readable ");
                stringBuilder2.append(parentFile.canRead());
                stringBuilder2.append(", writable ");
                stringBuilder2.append(parentFile.canWrite());
                Log.e(str, stringBuilder2.toString());
            }
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Failed to create directory ");
            stringBuilder3.append(file.getPath());
            throw new IOException(stringBuilder3.toString());
        }
    }

    static {
        String property = System.getProperty("java.vm.version");
        boolean z = false;
        if (property != null) {
            Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(property);
            if (matcher.matches()) {
                try {
                    int parseInt = Integer.parseInt(matcher.group(1));
                    int parseInt2 = Integer.parseInt(matcher.group(2));
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 > 0)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        b = z;
    }
}
