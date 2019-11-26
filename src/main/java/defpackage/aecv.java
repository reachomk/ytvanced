package defpackage;

import java.io.File;
import java.io.IOException;

/* renamed from: aecv */
public final class aecv {
    public static final aede a = new aede();

    public static amro a(aecx aecx, zzl zzl) {
        return new aecy(zzl, aecx);
    }

    public static File a(aefg aefg, File file) {
        if (!aefg.a) {
            file = null;
        }
        if (file != null) {
            try {
                file.mkdirs();
                File.createTempFile("cache", "probe", file).delete();
            } catch (IOException unused) {
                afpc.a(1, afpf.media, "Cannot write to the cache dir.", 0.1d);
                return null;
            }
        }
        return file;
    }
}
