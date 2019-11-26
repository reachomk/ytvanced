package defpackage;

/* renamed from: zjf */
public final class zjf {
    public static String a(Throwable th) {
        if (th == null) {
            return "<null>";
        }
        Object message = th.getMessage();
        int i = 0;
        while (th.getCause() != null && i < 10) {
            th = th.getCause();
            String name = th.getClass() != null ? th.getClass().getName() : "<unknownClass>";
            Object replaceAll = th.getMessage() != null ? th.getMessage().replaceAll("\\d+", "#") : "<unknownMessage>";
            String valueOf = String.valueOf(message);
            StringBuilder stringBuilder = new StringBuilder(((valueOf.length() + 16) + name.length()) + String.valueOf(replaceAll).length());
            stringBuilder.append(valueOf);
            stringBuilder.append(" ::Caused by: ");
            stringBuilder.append(name);
            stringBuilder.append(": ");
            stringBuilder.append(replaceAll);
            message = stringBuilder.toString();
            i++;
        }
        return message;
    }
}
