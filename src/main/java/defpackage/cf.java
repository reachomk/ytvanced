package defpackage;

import java.io.Serializable;

/* renamed from: cf */
final class cf implements Serializable {
    public static final long serialVersionUID = 1;
    public final String a;
    public final bx b;
    public final cb c;
    public final cb d;

    public cf(String str, bx bxVar, cb cbVar, cb cbVar2) {
        this.a = str;
        this.b = bxVar;
        this.c = cbVar;
        this.d = cbVar2;
    }

    public final String toString() {
        Object str;
        String str2 = this.a;
        String obj = this.b.toString();
        cb cbVar = this.c;
        String str3 = " ";
        Object obj2 = "";
        if (cbVar != null) {
            String valueOf = String.valueOf(cbVar.toString());
            str = valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf);
        } else {
            str = obj2;
        }
        cb cbVar2 = this.d;
        if (cbVar2 != null) {
            String valueOf2 = String.valueOf(cbVar2.toString());
            obj2 = valueOf2.length() == 0 ? new String(str3) : str3.concat(valueOf2);
        }
        StringBuilder stringBuilder = new StringBuilder((((String.valueOf(str2).length() + 2) + String.valueOf(obj).length()) + String.valueOf(str).length()) + String.valueOf(obj2).length());
        stringBuilder.append(str2);
        stringBuilder.append(": ");
        stringBuilder.append(obj);
        stringBuilder.append(str);
        stringBuilder.append(obj2);
        return stringBuilder.toString();
    }

    @Deprecated
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
