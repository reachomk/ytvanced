package defpackage;

/* renamed from: hnn */
public abstract class hnn implements hnt {
    private final Class a;
    private final Class b;

    protected hnn(Class cls, Class cls2) {
        this.a = (Class) amqw.a((Object) cls);
        this.b = (Class) amqw.a((Object) cls2);
    }

    public final Class b() {
        return this.a;
    }

    public final Class c() {
        return this.b;
    }

    protected static boolean a(amur amur, String str) {
        StringBuilder stringBuilder;
        if (amur == null) {
            stringBuilder = new StringBuilder(String.valueOf(str).length() + 26);
            stringBuilder.append("Args not specified for `");
            stringBuilder.append(str);
            stringBuilder.append("`.");
            xtl.c(stringBuilder.toString());
            return false;
        } else if (amur.containsKey(str)) {
            return true;
        } else {
            stringBuilder = new StringBuilder(String.valueOf(str).length() + 17);
            stringBuilder.append("`");
            stringBuilder.append(str);
            stringBuilder.append("` not specified.");
            xtl.c(stringBuilder.toString());
            return false;
        }
    }
}
