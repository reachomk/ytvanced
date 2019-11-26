package defpackage;

/* renamed from: nrk */
public final class nrk extends nnc {
    public nrk(nrc[] nrcArr) {
        String a = nxf.a((Object[]) nrcArr);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(a).length() + 58);
        stringBuilder.append("None of the available extractors (");
        stringBuilder.append(a);
        stringBuilder.append(") could read the stream.");
        super(stringBuilder.toString());
    }
}
