package defpackage;

import java.io.InputStream;

/* renamed from: btj */
public final class btj implements bta {
    private final bwb a;

    public btj(bwb bwb) {
        this.a = bwb;
    }

    public final Class a() {
        return InputStream.class;
    }

    public final /* synthetic */ bsx a(Object obj) {
        return new btk((InputStream) obj, this.a);
    }
}
