package defpackage;

/* renamed from: anve */
public class anve {
    public final anvd a = new anvd();

    private static String d() {
        return "";
    }

    private static boolean e() {
        return true;
    }

    private static String f() {
        return "";
    }

    private static boolean g() {
        return true;
    }

    private static String h() {
        return "";
    }

    private static boolean i() {
        return true;
    }

    private static String j() {
        return "";
    }

    private static boolean k() {
        return true;
    }

    private final int a() {
        anvd anvd = this.a;
        return (anvd.a == null || !anvd.a().a()) ? -1 : ((Integer) this.a.a().b()).intValue();
    }

    private final boolean b() {
        return a() == -1;
    }

    public final anve a(int i) {
        anvd anvd = this.a;
        amqp b = amqp.b(Integer.valueOf(i));
        if (!b.a()) {
            anvd.a = ampo.a;
        } else if (((Integer) b.b()).intValue() >= 0) {
            anvd.a = b;
        } else {
            anvd.a = ampo.a;
            anvd.b = false;
        }
        this.a.b = false;
        return this;
    }

    private final boolean c() {
        anvd anvd = this.a;
        int i = 0;
        if (anvd.c != null && anvd.b().a()) {
            i = ((Boolean) this.a.b().b()).booleanValue();
        }
        return i ^ 1;
    }

    public final String a(String str) {
        Object obj;
        String str2;
        String valueOf;
        StringBuilder stringBuilder = new StringBuilder();
        if (b()) {
            obj = null;
        } else {
            stringBuilder.append(str);
            str2 = "s";
            valueOf = String.valueOf(Integer.toString(a()));
            stringBuilder.append(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
            obj = 1;
        }
        String str3 = "-";
        if (!c()) {
            stringBuilder.append(obj != null ? str3 : str);
            valueOf = "d";
            str2 = "";
            stringBuilder.append(str2.length() == 0 ? new String(valueOf) : valueOf.concat(str2));
            obj = 1;
        }
        if (!anve.e()) {
            stringBuilder.append(obj != null ? str3 : str);
            str2 = "f";
            valueOf = String.valueOf(anve.d().replace(';', ':'));
            stringBuilder.append(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
            obj = 1;
        }
        if (!anve.g()) {
            stringBuilder.append(obj != null ? str3 : str);
            str2 = "q";
            valueOf = String.valueOf(anve.f().replace(';', ':'));
            stringBuilder.append(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
            obj = 1;
        }
        if (!anve.i()) {
            stringBuilder.append(obj != null ? str3 : str);
            str2 = "nt0";
            valueOf = String.valueOf(anve.h().replace(';', ':'));
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            stringBuilder.append(valueOf);
            obj = 1;
        }
        if (!anve.k()) {
            if (obj != null) {
                str = str3;
            }
            stringBuilder.append(str);
            valueOf = "mm";
            str = String.valueOf(anve.j().replace(';', ':'));
            if (str.length() == 0) {
                str = new String(valueOf);
            } else {
                str = valueOf.concat(str);
            }
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }
}
