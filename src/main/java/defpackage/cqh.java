package defpackage;

import com.facebook.yoga.YogaConfig;

/* renamed from: cqh */
public final class cqh {
    public static final YogaConfig a = new YogaConfig();
    private static volatile cqj b;
    private static volatile cqg c;

    static {
        Object obj = new Object();
        YogaConfig yogaConfig = a;
        yogaConfig.jni_YGConfigSetUseWebDefaults(yogaConfig.a, true);
    }
}
