package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: bnl */
public final class bnl implements bnc {
    public final String a;
    public final List b;
    public final boolean c;

    public bnl(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    public final bku a(bju bju, bnr bnr) {
        return new bkt(bju, bnr, this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ShapeGroup{name='");
        stringBuilder.append(this.a);
        stringBuilder.append("' Shapes: ");
        stringBuilder.append(Arrays.toString(this.b.toArray()));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
