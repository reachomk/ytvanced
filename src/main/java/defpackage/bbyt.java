package defpackage;

/* renamed from: bbyt */
public final class bbyt {
    public static void a(Class cls) {
        String name = cls.getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("It is not allowed to subscribe with a(n) ");
        stringBuilder.append(name);
        stringBuilder.append(" multiple times. Please create a fresh instance of ");
        stringBuilder.append(name);
        stringBuilder.append(" and subscribe that to the target source instead.");
        bbzf.a(new bbnn(stringBuilder.toString()));
    }
}
