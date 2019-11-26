package defpackage;

/* renamed from: bnf */
public final class bnf implements bnc {
    public final String a;
    public final boolean b;
    public final int c;

    public final bku a(bju bju, bnr bnr) {
        if (bju.k) {
            return new blb(this);
        }
        bpb.a("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MergePaths{mode=");
        int i = this.c;
        Object obj = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE";
        stringBuilder.append(obj);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public bnf(String str, int i, boolean z) {
        this.a = str;
        this.c = i;
        this.b = z;
    }
}
