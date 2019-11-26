package defpackage;

import java.util.logging.Level;

/* renamed from: amzi */
final class amzi implements amys {
    private final String a;
    private final amys b;

    public final Level d() {
        return this.b.d().intValue() > Level.WARNING.intValue() ? this.b.d() : Level.WARNING;
    }

    public final amzg g() {
        return null;
    }

    public final boolean j() {
        return false;
    }

    public final long e() {
        return this.b.e();
    }

    public final amyc f() {
        return this.b.f();
    }

    public final amyt k() {
        return amyw.a;
    }

    public final Object[] h() {
        throw new IllegalStateException();
    }

    public final Object i() {
        return this.a;
    }

    /* synthetic */ amzi(RuntimeException runtimeException, amys amys) {
        StringBuilder stringBuilder = new StringBuilder("LOGGING ERROR: ");
        stringBuilder.append(runtimeException.getMessage());
        stringBuilder.append("\n  original message: ");
        String str = "\n    ";
        if (amys.g() == null) {
            stringBuilder.append(amys.i());
        } else {
            stringBuilder.append(amys.g().b);
            stringBuilder.append("\n  original arguments:");
            for (Object obj : amys.h()) {
                stringBuilder.append(str);
                stringBuilder.append(amyz.a(obj));
            }
        }
        amyt k = amys.k();
        if (k.a() > 0) {
            stringBuilder.append("\n  metadata:");
            for (int i = 0; i < k.a(); i++) {
                stringBuilder.append(str);
                stringBuilder.append(k.a(i));
                stringBuilder.append(": ");
                stringBuilder.append(k.b(i));
            }
        }
        stringBuilder.append("\n  level: ");
        stringBuilder.append(amys.d());
        stringBuilder.append("\n  timestamp (nanos): ");
        stringBuilder.append(amys.e());
        stringBuilder.append("\n  class: ");
        stringBuilder.append(amys.f().a());
        stringBuilder.append("\n  method: ");
        stringBuilder.append(amys.f().b());
        stringBuilder.append("\n  line number: ");
        stringBuilder.append(amys.f().c());
        this.a = stringBuilder.toString();
        this.b = amys;
    }
}
