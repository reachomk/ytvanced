package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* renamed from: annn */
public final class annn {
    public final Set a;
    public final Set b;
    public final int c;
    public final annq d;
    public final Set e;

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Component<");
        stringBuilder.append(Arrays.toString(this.a.toArray()));
        stringBuilder.append(">{");
        stringBuilder.append(this.c);
        stringBuilder.append(", deps=");
        stringBuilder.append(Arrays.toString(this.b.toArray()));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static annm a(Class cls) {
        return new annm(cls, new Class[0]);
    }

    @SafeVarargs
    public static annn a(Object obj, Class cls, Class... clsArr) {
        annm annm = new annm(cls, clsArr);
        annm.a(new annv(obj));
        return annm.a();
    }

    /* synthetic */ annn(Set set, Set set2, int i, annq annq, Set set3) {
        this.a = Collections.unmodifiableSet(set);
        this.b = Collections.unmodifiableSet(set2);
        this.c = i;
        this.d = annq;
        this.e = Collections.unmodifiableSet(set3);
    }
}
