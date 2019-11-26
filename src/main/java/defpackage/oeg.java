package defpackage;

import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.util.UUID;

/* renamed from: oeg */
public final class oeg implements ExoMediaCrypto {
    public final UUID a;
    public final byte[] b;
    public final boolean c;

    public oeg(UUID uuid, byte[] bArr, boolean z) {
        this.a = uuid;
        this.b = bArr;
        this.c = z;
    }
}
