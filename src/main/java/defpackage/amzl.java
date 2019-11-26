package defpackage;

import dalvik.system.VMStack;

/* renamed from: amzl */
class amzl extends amyx {
    amzl() {
    }

    public String a(Class cls) {
        if (amzm.e) {
            try {
                Class l = amzm.l();
                if (cls.equals(l)) {
                    return VMStack.getStackClass2().getName();
                }
                String valueOf = String.valueOf(cls);
                String valueOf2 = String.valueOf(l);
                StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 43) + valueOf2.length());
                stringBuilder.append("Unexpected stack depth, expected: ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" but was ");
                stringBuilder.append(valueOf2);
                throw new IllegalStateException(stringBuilder.toString());
            } catch (Throwable unused) {
            }
        }
        if (amzm.f) {
            StackTraceElement a = anae.a(cls, new Throwable());
            if (a != null) {
                return a.getClassName();
            }
        }
        return null;
    }

    public amyc a(Class cls, int i) {
        return amyc.a;
    }
}
