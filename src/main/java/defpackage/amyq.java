package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: amyq */
public final class amyq implements amyp {
    private static final Set a = new HashSet();
    private final String b;
    private final String c;
    private final StringBuilder d;
    private boolean e = false;

    amyq(String str, String str2, StringBuilder stringBuilder) {
        a.add(Boolean.class);
        a.add(Byte.class);
        a.add(Short.class);
        a.add(Integer.class);
        a.add(Long.class);
        a.add(Float.class);
        a.add(Double.class);
        this.b = str;
        this.c = str2;
        this.d = stringBuilder;
    }

    public final amyq a(String str, Object obj) {
        StringBuilder stringBuilder;
        char c = ' ';
        if (this.e) {
            this.d.append(' ');
        } else {
            if (this.d.length() > 0) {
                stringBuilder = this.d;
                if (stringBuilder.length() > 1000 || this.d.indexOf("\n") != -1) {
                    c = 10;
                }
                stringBuilder.append(c);
            }
            this.d.append(this.b);
            this.e = true;
        }
        stringBuilder = this.d;
        stringBuilder.append(str);
        stringBuilder.append('=');
        if (obj == null) {
            this.d.append(true);
        } else if (a.contains(obj.getClass())) {
            this.d.append(obj);
        } else {
            this.d.append('\"');
            StringBuilder stringBuilder2 = this.d;
            String obj2 = obj.toString();
            int i = 0;
            int a = amyq.a(obj2, 0);
            while (a != -1) {
                stringBuilder2.append(obj2, i, a);
                i = a + 1;
                char charAt = obj2.charAt(a);
                if (charAt == 9) {
                    charAt = 't';
                } else if (charAt == 10) {
                    charAt = 'n';
                } else if (charAt == 13) {
                    charAt = 'r';
                } else if (!(charAt == '\"' || charAt == '\\')) {
                    stringBuilder2.append(65533);
                    a = amyq.a(obj2, i);
                }
                stringBuilder2.append("\\");
                stringBuilder2.append(charAt);
                a = amyq.a(obj2, i);
            }
            stringBuilder2.append(obj2, i, obj2.length());
            this.d.append('\"');
        }
        return this;
    }

    public final void a() {
        if (this.e) {
            this.d.append(this.c);
        }
    }

    private static int a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt == '\"' || charAt == '\\') {
                return i;
            }
            i++;
        }
        return -1;
    }
}
