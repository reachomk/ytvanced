package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: bvr */
public final class bvr {
    public final zy a;
    public final List b;
    public final String c;

    public bvr(Class cls, Class cls2, Class cls3, List list, zy zyVar) {
        this.a = zyVar;
        this.b = (List) chw.a((Collection) list);
        String simpleName = cls.getSimpleName();
        String simpleName2 = cls2.getSimpleName();
        String simpleName3 = cls3.getSimpleName();
        int length = simpleName.length();
        StringBuilder stringBuilder = new StringBuilder(((length + 21) + simpleName2.length()) + simpleName3.length());
        stringBuilder.append("Failed LoadPath{");
        stringBuilder.append(simpleName);
        simpleName = "->";
        stringBuilder.append(simpleName);
        stringBuilder.append(simpleName2);
        stringBuilder.append(simpleName);
        stringBuilder.append(simpleName3);
        stringBuilder.append("}");
        this.c = stringBuilder.toString();
    }

    public final String toString() {
        String arrays = Arrays.toString(this.b.toArray());
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arrays).length() + 22);
        stringBuilder.append("LoadPath{decodePaths=");
        stringBuilder.append(arrays);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
