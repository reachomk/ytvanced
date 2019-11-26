package org.chromium.base;

public class JNIUtils {
    private static Boolean a;

    public static Object getClassLoader() {
        return JNIUtils.class.getClassLoader();
    }

    public static boolean isSelectiveJniRegistrationEnabled() {
        if (a == null) {
            a = Boolean.valueOf(false);
        }
        return a.booleanValue();
    }
}
