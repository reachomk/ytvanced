package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: buq */
public final class buq {
    public final ceh a;
    public final zy b;
    private final Class c;
    private final List d;
    private final String e;

    public buq(Class cls, Class cls2, Class cls3, List list, ceh ceh, zy zyVar) {
        this.c = cls;
        this.d = list;
        this.a = ceh;
        this.b = zyVar;
        String simpleName = cls.getSimpleName();
        String simpleName2 = cls2.getSimpleName();
        String simpleName3 = cls3.getSimpleName();
        int length = simpleName.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 23) + simpleName2.length()) + simpleName3.length());
        stringBuilder.append("Failed DecodePath{");
        stringBuilder.append(simpleName);
        simpleName = "->";
        stringBuilder.append(simpleName);
        stringBuilder.append(simpleName2);
        stringBuilder.append(simpleName);
        stringBuilder.append(simpleName3);
        stringBuilder.append("}");
        this.e = stringBuilder.toString();
    }

    public final bvw a(bsx bsx, int i, int i2, bsq bsq, List list) {
        int size = this.d.size();
        bvw bvw = null;
        for (int i3 = 0; i3 < size; i3++) {
            bsp bsp = (bsp) this.d.get(i3);
            try {
                if (bsp.a(bsx.a(), bsq)) {
                    bvw = bsp.a(bsx.a(), i, i2, bsq);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                list.add(e);
            }
            if (bvw != null) {
                break;
            }
        }
        if (bvw != null) {
            return bvw;
        }
        throw new bvn(this.e, new ArrayList(list));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.a);
        int length = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 47) + valueOf2.length()) + valueOf3.length());
        stringBuilder.append("DecodePath{ dataClass=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", decoders=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", transcoder=");
        stringBuilder.append(valueOf3);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
