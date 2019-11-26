package defpackage;

import java.io.FileDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: bcis */
public final class bcis {
    private static final Method a;

    public static FileDescriptor a(int i) {
        String str = "FileDescriptor.setInt$() failed";
        try {
            FileDescriptor fileDescriptor = new FileDescriptor();
            a.invoke(fileDescriptor, new Object[]{Integer.valueOf(i)});
            return fileDescriptor;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(str, e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(str, e2);
        }
    }

    static {
        try {
            a = FileDescriptor.class.getMethod("setInt$", new Class[]{Integer.TYPE});
        } catch (NoSuchMethodException | SecurityException e) {
            throw new RuntimeException("Unable to get FileDescriptor.setInt$", e);
        }
    }
}
