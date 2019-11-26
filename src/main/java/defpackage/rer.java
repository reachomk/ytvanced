package defpackage;

/* renamed from: rer */
final class rer implements rgf {
    public static final rer a = new rer();

    private rer() {
    }

    public final boolean a(Class cls) {
        return reu.class.isAssignableFrom(cls);
    }

    public final rgg b(Class cls) {
        String name;
        if (reu.class.isAssignableFrom(cls)) {
            String str;
            try {
                Class asSubclass = cls.asSubclass(reu.class);
                reu reu = (reu) reu.zzuht.get(asSubclass);
                if (reu == null) {
                    Class.forName(asSubclass.getName(), true, asSubclass.getClassLoader());
                    reu = (reu) reu.zzuht.get(asSubclass);
                }
                if (reu != null) {
                    return (rgg) reu.a(3);
                }
                str = "Unable to get default instance for: ";
                String name2 = asSubclass.getName();
                if (name2.length() == 0) {
                    name2 = new String(str);
                } else {
                    name2 = str.concat(name2);
                }
                throw new IllegalStateException(name2);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            } catch (Exception e2) {
                name = cls.getName();
                str = "Unable to get message info for ";
                if (name.length() == 0) {
                    name = new String(str);
                } else {
                    name = str.concat(name);
                }
                throw new RuntimeException(name, e2);
            }
        }
        name = cls.getName();
        String str2 = "Unsupported message type: ";
        if (name.length() == 0) {
            name = new String(str2);
        } else {
            name = str2.concat(name);
        }
        throw new IllegalArgumentException(name);
    }
}
