package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: byj */
public final class byj implements bsh {
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, bsq bsq) {
        try {
            chh.a((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
