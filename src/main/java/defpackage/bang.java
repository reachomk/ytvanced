package defpackage;

/* renamed from: bang */
public abstract class bang {
    public abstract void a(String str);

    public static bang a(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new banb(cls.getSimpleName());
        }
        return new banf(cls.getSimpleName());
    }
}
