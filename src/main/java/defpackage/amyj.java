package defpackage;

/* renamed from: amyj */
public final class amyj {
    public final String a;
    private final Class b;

    public static amyj a(String str, Class cls) {
        return new amyj(str, cls);
    }

    private amyj(String str, Class cls) {
        String str2;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("identifier must not be empty");
        } else if (anad.a(str.charAt(0))) {
            for (int i = 1; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!anad.a(charAt) && ((charAt < '0' || charAt > '9') && charAt != '_')) {
                    str2 = "identifier must contain only ASCII letters, digits or underscore: ";
                    if (str.length() == 0) {
                        str = new String(str2);
                    } else {
                        str = str2.concat(str);
                    }
                    throw new IllegalArgumentException(str);
                }
            }
            this.a = str;
            this.b = (Class) anad.a(cls, "class");
        } else {
            str2 = "identifier must start with an ASCII letter: ";
            if (str.length() == 0) {
                str = new String(str2);
            } else {
                str = str2.concat(str);
            }
            throw new IllegalArgumentException(str);
        }
    }

    public final Object a(Object obj) {
        return this.b.cast(obj);
    }

    public final String toString() {
        String name = getClass().getName();
        String str = this.a;
        String name2 = this.b.getName();
        int length = name.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 3) + String.valueOf(str).length()) + name2.length());
        stringBuilder.append(name);
        stringBuilder.append("/");
        stringBuilder.append(str);
        stringBuilder.append("[");
        stringBuilder.append(name2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
