package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ci */
final class ci implements Serializable {
    public static final long serialVersionUID = 1;
    public boolean a = false;
    public final List b = new ArrayList();

    private ci() {
    }

    public final ci a(cf cfVar) {
        String str = cfVar.a;
        for (cf cfVar2 : this.b) {
            if (str.equals(cfVar2.a)) {
                String str2 = "Duplicate keyword: ";
                if (str.length() == 0) {
                    str = new String(str2);
                } else {
                    str = str2.concat(str);
                }
                throw new IllegalArgumentException(str);
            }
        }
        this.b.add(cfVar);
        return this;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (cf cfVar : this.b) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(";  ");
            }
            stringBuilder.append(cfVar);
        }
        return stringBuilder.toString();
    }

    /* synthetic */ ci(byte b) {
    }
}
