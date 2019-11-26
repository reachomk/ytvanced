package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: amdj */
public final class amdj {
    public static final UUID a = UUID.fromString("ffcc8263-f855-4a93-8814-587a02521fdd");
    private final cil b;

    private amdj(cil cil) {
        this.b = cil;
    }

    public static amdj a(Context context, Uri uri) {
        bakq a = ujn.a(context, uri);
        try {
            return new amdj(new cil(a, ukc.a));
        } catch (IOException e) {
            a.close();
            throw e;
        }
    }

    public final cjl a() {
        try {
            ByteBuffer a = this.b.a(4, 4);
            if (a.get() == (byte) 102 && a.get() == (byte) 116 && a.get() == (byte) 121 && a.get() == (byte) 112) {
                return this.b.a();
            }
            return null;
        } catch (IOException | BufferUnderflowException unused) {
            return null;
        }
    }
}
