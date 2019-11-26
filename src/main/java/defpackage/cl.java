package defpackage;

/* renamed from: cl */
public final class cl {
    public final int a;
    public final char b;
    public short c;
    public int d;
    public final int e;

    public final int a() {
        return this.a + this.b;
    }

    public final String toString() {
        Object a;
        String str;
        int i = this.e;
        if (i == 6 || i == 7) {
            i = b();
            a = cm.a(i);
            if (i == 0) {
                throw null;
            }
        }
        a = Integer.toString(this.c);
        i = this.e;
        switch (i) {
            case 1:
                str = "MSG_START";
                break;
            case 2:
                str = "MSG_LIMIT";
                break;
            case 3:
                str = "SKIP_SYNTAX";
                break;
            case 4:
                str = "INSERT_CHAR";
                break;
            case 5:
                str = "REPLACE_NUMBER";
                break;
            case 6:
                str = "ARG_START";
                break;
            case 7:
                str = "ARG_LIMIT";
                break;
            case 8:
                str = "ARG_NUMBER";
                break;
            case 9:
                str = "ARG_NAME";
                break;
            case 10:
                str = "ARG_TYPE";
                break;
            case 11:
                str = "ARG_STYLE";
                break;
            case 12:
                str = "ARG_SELECTOR";
                break;
            case 13:
                str = "ARG_INT";
                break;
            case 14:
                str = "ARG_DOUBLE";
                break;
            default:
                str = "null";
                break;
        }
        if (i != 0) {
            i = this.a;
            StringBuilder stringBuilder = new StringBuilder((str.length() + 14) + String.valueOf(a).length());
            stringBuilder.append(str);
            stringBuilder.append("(");
            stringBuilder.append(a);
            stringBuilder.append(")@");
            stringBuilder.append(i);
            return stringBuilder.toString();
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cl clVar = (cl) obj;
        int i = this.e;
        int i2 = clVar.e;
        if (i != 0) {
            return i == i2 && this.a == clVar.a && this.b == clVar.b && this.c == clVar.c && this.d == clVar.d;
        } else {
            throw null;
        }
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return (((((i * 37) + this.a) * 37) + this.b) * 37) + this.c;
        }
        throw null;
    }

    public final int b() {
        int i = this.e;
        if (i == 6 || i == 7) {
            return ck.f[this.c];
        }
        return 1;
    }

    /* synthetic */ cl(int i, int i2, int i3, int i4) {
        this.e = i;
        this.a = i2;
        this.b = (char) i3;
        this.c = (short) i4;
    }
}
