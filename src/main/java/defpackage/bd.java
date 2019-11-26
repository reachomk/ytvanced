package defpackage;

/* renamed from: bd */
public class bd implements be {
    public az a(Class cls) {
        StringBuilder stringBuilder;
        String str = "Cannot create an instance of ";
        try {
            return (az) cls.newInstance();
        } catch (InstantiationException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(cls);
            throw new RuntimeException(stringBuilder.toString(), e);
        } catch (IllegalAccessException e2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(cls);
            throw new RuntimeException(stringBuilder.toString(), e2);
        }
    }
}
