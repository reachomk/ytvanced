package defpackage;

/* renamed from: anxm */
final class anxm implements anzb {
    public static final anxm a = new anxm();

    private anxm() {
    }

    public final boolean a(Class cls) {
        return anxl.class.isAssignableFrom(cls);
    }

    public final anzc b(Class cls) {
        String name;
        if (anxl.class.isAssignableFrom(cls)) {
            try {
                return (anzc) anxl.getDefaultInstance(cls.asSubclass(anxl.class)).buildMessageInfo();
            } catch (Exception e) {
                name = cls.getName();
                String str = "Unable to get message info for ";
                throw new RuntimeException(name.length() == 0 ? new String(str) : str.concat(name), e);
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
