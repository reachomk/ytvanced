package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cka */
public final class cka {
    public long a;
    public final List b = new ArrayList();

    public final String toString() {
        long j = this.a;
        int size = this.b.size();
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 92);
        stringBuilder.append("SampleEntry{sampleDelta=");
        stringBuilder.append(j);
        stringBuilder.append(", subsampleCount=");
        stringBuilder.append(size);
        stringBuilder.append(", subsampleEntries=");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
