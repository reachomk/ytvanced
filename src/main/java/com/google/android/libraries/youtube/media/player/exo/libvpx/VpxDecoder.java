package com.google.android.libraries.youtube.media.player.exo.libvpx;

import android.view.Surface;
import defpackage.aewx;
import defpackage.aewy;
import defpackage.nnb;
import defpackage.nxj;
import defpackage.nxk;
import defpackage.nxm;
import java.nio.ByteBuffer;

public final class VpxDecoder extends nxm {
    public static final boolean a;
    public final long b;
    private volatile int c;

    public VpxDecoder(int i, int i2, boolean z, int i3, boolean z2, int i4) {
        super(new aewx[i], new VpxOutputBuffer[i2]);
        this.c = i3;
        boolean z3 = true;
        if (!(i3 == 2 || i3 == 3)) {
            z3 = false;
        }
        long vpxInit = vpxInit(z, z3, z2, i4);
        this.b = vpxInit;
        if (vpxInit != 0) {
            a(786432);
            return;
        }
        throw new aewy("Failed to initialize decoder");
    }

    public static native String getLibvpxConfig();

    public static native String getLibvpxVersion();

    private final native long vpxClose(long j);

    private final native long vpxDecode(long j, ByteBuffer byteBuffer, int i);

    private final native String vpxGetErrorMessage(long j);

    private final native int vpxGetFrame(long j, VpxOutputBuffer vpxOutputBuffer);

    private final native long vpxInit(boolean z, boolean z2, boolean z3, int i);

    private final native int vpxReleaseFrame(long j, VpxOutputBuffer vpxOutputBuffer);

    public final native int vpxRenderFrame(long j, Surface surface, VpxOutputBuffer vpxOutputBuffer);

    /* Access modifiers changed, original: protected|final */
    public final void a(VpxOutputBuffer vpxOutputBuffer) {
        if ((this.c == 2 || this.c == 3) && !vpxOutputBuffer.getFlag(2)) {
            vpxReleaseFrame(this.b, vpxOutputBuffer);
        }
        super.a((nxj) vpxOutputBuffer);
    }

    public final void b() {
        super.b();
        vpxClose(this.b);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Exception a(nxk nxk, nxj nxj, boolean z) {
        aewx aewx = (aewx) nxk;
        VpxOutputBuffer vpxOutputBuffer = (VpxOutputBuffer) nxj;
        nnb nnb = aewx.a;
        vpxOutputBuffer.timestampUs = nnb.e;
        ByteBuffer byteBuffer = nnb.b;
        byteBuffer.position(byteBuffer.position() - nnb.c);
        if (vpxDecode(this.b, nnb.b, nnb.c) != 0) {
            String valueOf = String.valueOf(vpxGetErrorMessage(this.b));
            String str = "Decode error: ";
            return new aewy(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        } else if (aewx.getFlag(2)) {
            return null;
        } else {
            vpxOutputBuffer.mode = this.c;
            int vpxGetFrame = vpxGetFrame(this.b, vpxOutputBuffer);
            if (vpxGetFrame == 1) {
                vpxOutputBuffer.setFlag(2);
            } else if (vpxGetFrame == -1) {
                return new aewy("Buffer initialization failed.");
            }
            vpxOutputBuffer.colorInfo = aewx.d;
            return null;
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ nxj c() {
        return new VpxOutputBuffer(this);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ nxk a() {
        return new aewx();
    }

    static {
        boolean z;
        try {
            System.loadLibrary("vpx");
            System.loadLibrary("vpxYTJNI");
            z = true;
        } catch (UnsatisfiedLinkError unused) {
            z = false;
        }
        a = z;
    }
}
